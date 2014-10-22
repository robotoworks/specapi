package org.specapi.plugins.android.generator

import com.google.inject.Inject
import java.util.HashMap
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList

import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.ComplexTypeLiteral
import org.specapi.specapiLang.Member
import org.specapi.specapiLang.IntrinsicType
import org.specapi.specapiLang.UserType
import org.specapi.specapiLang.ArrayType
import org.specapi.specapiLang.ResponseBlock
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.EnumTypeDeclaration
import static extension org.specapi.util.SpecApiStringExtensions.*
import org.specapi.specapiLang.Type

class ResultGenerator {
	@Inject ImportHelper imports
	@Inject JsonReaderStatementGenerator jsonReaderGenerator
	@Inject extension AndroidSpecApiModelUtils utils
	
	def generate(HttpMethod method, SpecApiDocument model, Api client) {
		jsonReaderGenerator.imports = imports
		jsonReaderGenerator.setReaderIdentifier("reader")
		jsonReaderGenerator.setSubjectIdentifier("subject")
				
		doGenerate(method, model, client)
	}
	
	def doGenerate(HttpMethod method, SpecApiDocument model, Api client) '''
	package «model.packageName»;

	«var classDecl = generateResponseClass(method, model, client)»
	
	import org.specapi.android.net.JsonEntityReaderProvider;
	import java.io.IOException;
	import org.specapi.android.net.ServiceResult;
	import java.io.InputStream;
	import org.specapi.android.util.Closeables;
	«imports.printAndClear»
	
	«classDecl»
	'''	
			
	def dispatch generateFieldForType(ComplexTypeLiteral type) '''
		«FOR member:type.members»
		«generateFieldForMember(member)»
		«ENDFOR»	
	'''
	
	def generateFieldsForMemberList(EList<Member> members) '''
		«FOR member:members»
		«generateFieldForMember(member)»
		«ENDFOR»			
	'''
	
	def dispatch generateFieldForType(IntrinsicType type) '''
		private «type.signature» value;	
	'''
	
	def dispatch generateFieldForType(ArrayType type) '''
		«IF(type.elementType instanceof IntrinsicType)»
			private «type.signature» values;
		«ELSE»
			private «type.signature» «type.innerSignature.camelize.pluralize»;
		«ENDIF»
	'''
	
	def dispatch generateFieldForType(UserType type) '''
		private «type.signature» «type.signature.camelize.escapeReserved»;
	'''
	
	def generateFieldForMember(Member member) '''
	private «member.type.signature» «member.toIdentifier»;
	'''
		
	def dispatch generateGetterForType(ComplexTypeLiteral type) '''
		«generateGettersForMemberList(type.members)»
	'''
	
	def generateGettersForMemberList(EList<Member> members) '''
		«FOR member:members»
		«generateGetter(member)»
		«ENDFOR»	
	'''
	
	def dispatch generateGetterForType(IntrinsicType type) '''
		public «type.signature» getValue(){
			return this.value;
		}
	'''
	
	def dispatch generateGetterForType(ArrayType type) '''
	«IF(type.elementType instanceof IntrinsicType)»
		public «type.signature» getValues(){
			return this.values;
		}
	«ELSE»
		public «type.signature» get«type.innerSignature.pascalize.pluralize»(){
			return this.«type.innerSignature.camelize.pluralize»;
		}
	«ENDIF»
	'''
	
	def dispatch generateGetterForType(UserType type) '''
	public «type.signature» get«type.signature.pascalize»(){
		return this.«type.signature.camelize.escapeReserved»;
	}
	'''
	
	def generateGetter(Member member) '''
	public «member.type.signature» «member.toGetMethodName»(){
		return this.«member.toIdentifier»;
	}
	public void «member.toSetMethodName»(«member.type.signature» value){
		this.«member.toIdentifier» = value;
	}
	'''
	
	def generateBaseAccessors(Iterable<Member> members) '''
		«FOR member:members»
		«generateBaseAccessor(member)»
		«ENDFOR»	
	'''
	
	def generateBaseAccessor(Member member) '''
		«IF member.type instanceof ArrayType»«imports.addImport("java.util.List")»«ENDIF»
		public «member.type.signature» «member.toGetMethodName»(){
			return base.«member.toGetMethodName»();
		}
		public void «member.toSetMethodName»(«member.type.signature» value){
			base.«member.toSetMethodName»(value);
		}
	'''
		
	def generateResponseClass(HttpMethod method, SpecApiDocument module, Api client) '''
	«val responseBlock = method.responseBlock»
	public class «method.name.pascalize»Result extends ServiceResult {
		«IF (responseBlock?.type != null)»
			«generateFieldForType(responseBlock.type)»	
			«generateGetterForType(responseBlock.type)»	
		«ENDIF»
		
		public «method.name.pascalize»Result(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {
		«IF (responseBlock != null)»
			«IF(responseBlock.type instanceof ComplexTypeLiteral)»
				«generateDeserializationStatementHeader(true)»
					«IF responseBlock.type instanceof ComplexTypeLiteral»
					«method.name.pascalize»Result subject = this;
					«jsonReaderGenerator.genReadComplexTypeLiteralForMembers(
						(responseBlock.type as ComplexTypeLiteral).members
					)»
					«ENDIF»
				«generateDeserializationStatementFooter(true)»
			«ELSE»
				«generateDeserializationStatementForType(responseBlock, responseBlock.type as Type)»
			«ENDIF»
		«ELSE»
		Closeables.closeSilently(inStream);
		«ENDIF»
		}
	}
	'''
	
	def generateDeserializationStatementHeader(boolean withReader)'''
		«IF withReader»
		«imports.addImport("org.specapi.android.internal.util.JsonReader")»
		«imports.addImport("java.io.InputStreamReader")»
		«imports.addImport("java.io.BufferedReader")»
		«imports.addImport("java.nio.charset.Charset")»
			JsonReader reader = null;
			«ENDIF»
			try {
				if(inStream != null) {
					«IF withReader»
					reader = new JsonReader(new BufferedReader(new InputStreamReader(inStream, Charset.defaultCharset())));
					«ENDIF»
	'''
	
	def generateDeserializationStatementFooter(boolean withReader)'''
				}
			} finally {
				«IF withReader»
				Closeables.closeSilently(reader);
				«ELSE»
				Closeables.closeSilently(inStream);
				«ENDIF»
			}
	'''
	
	def EList<Member> mergeMembers(ComplexTypeLiteral a, ComplexTypeLiteral b) { 
		var members = new HashMap<String, Member>()
		
		if(a != null) {
			for(m : a.members) {
				members.put(m.name, m)
			}
		}
		
		if(b != null) {
			for(m : b.members) {
				if(!members.containsKey(m.name)) {
					members.put(m.name, m)
				}
			}
		}

		return new BasicEList<Member>(members.values);
	}
	
	def dispatch generateDeserializationStatementForType(ResponseBlock response, IntrinsicType type) '''
		«imports.addImport("org.specapi.android.util.Streams")»
		«generateDeserializationStatementHeader(false)»
				String source = Streams.readAllText(inStream);
				
				this.value = «type.boxedTypeSignature».valueOf(source);
		«generateDeserializationStatementFooter(false)»
	'''
	
	def dispatch generateDeserializationStatementForType(ResponseBlock response, UserType type) {
		generateDeserializationStatementForUserType(response, type, type.declaration);
	}
	
	def dispatch generateDeserializationStatementForUserType(ResponseBlock response, UserType type, ComplexTypeDeclaration declaration) '''
		«generateDeserializationStatementHeader(true)»
				this.«type.signature.camelize» = new «type.signature»();
				provider.get(«type.signature».class).read(reader, this.«type.signature.camelize»);
		«generateDeserializationStatementFooter(true)»
	'''
	
	def dispatch generateDeserializationStatementForUserType(ResponseBlock response, UserType type, EnumTypeDeclaration declaration) '''
		«imports.addImport("org.specapi.android.util.Streams")»
		«generateDeserializationStatementHeader(false)»
				String source = Streams.readAllText(inStream);
				this.«type.signature.camelize» = «type.signature».fromValue(source);
		«generateDeserializationStatementFooter(false)»
	'''

	def dispatch generateDeserializationStatementForType(ResponseBlock response, ArrayType type) {
		generateDeserializationStatementForGenericListType(response, type, type.elementType);
	}
	
	def dispatch generateDeserializationStatementForGenericListType(ResponseBlock response, ArrayType type, IntrinsicType genericType) '''
		«imports.addImport("org.specapi.android.internal.util.JsonUtil")»
		«imports.addImport("java.util.List")»
		«generateDeserializationStatementHeader(true)»
				this.values = JsonUtil.read«genericType.boxedTypeSignature»List(reader);
		«generateDeserializationStatementFooter(true)»
	'''
	
	def dispatch generateDeserializationStatementForGenericListType(ResponseBlock response, ArrayType type, UserType genericType) {
		generateDeserializationStatementForUserTypeGenericList(response, type, genericType, genericType.declaration);
	}
	
	def dispatch generateDeserializationStatementForUserTypeGenericList(
		ResponseBlock response, 
		ArrayType type, 
		UserType genericType,
		ComplexTypeDeclaration declaration
	) '''
		«imports.addImport("java.util.List")»
		«imports.addImport("java.util.ArrayList")»
		«generateDeserializationStatementHeader(true)»
				this.«type.innerSignature.camelize.pluralize» = new ArrayList<«type.innerSignature»>();
				provider.get(«type.innerSignature».class).readList(reader, this.«type.innerSignature.camelize.pluralize»);
		«generateDeserializationStatementFooter(true)»
	'''
	
	def dispatch generateDeserializationStatementForUserTypeGenericList(
		ResponseBlock response, 
		ArrayType type, 
		UserType genericType,
		EnumTypeDeclaration declaration
	) '''
		«imports.addImport("org.specapi.android.internal.util.JsonToken")»
		«imports.addImport("java.util.ArrayList")»
		«imports.addImport("java.util.List")»
		«generateDeserializationStatementHeader(true)»
				this.«type.innerSignature.camelize.pluralize» = new Array«type.signature»();
				
				if(reader.peek() != JsonToken.NULL) {
					
					reader.beginArray();
					
					while(reader.hasNext()) {
						«type.innerSignature» element = «type.innerSignature».fromValue(reader.«declaration.resolveJsonReaderMethodName»());
						this.«type.innerSignature.camelize.pluralize».add(element);
					}
					
					reader.endArray();
				}
		«generateDeserializationStatementFooter(true)»
	'''
}