package org.specapi.plugins.android.generator

import org.eclipse.emf.common.util.EList
import org.eclipse.xtend.lib.annotations.Accessors
import javax.inject.Inject
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.ComplexTypeLiteral
import org.specapi.specapiLang.Member
import org.specapi.specapiLang.IntrinsicType
import org.specapi.specapiLang.UserType
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.ArrayType
import org.specapi.specapiLang.BooleanType
import static extension org.specapi.util.SpecApiStringExtensions.*

class JsonReaderStatementGenerator {
	@Inject extension AndroidSpecApiModelUtils utils
	@Accessors ImportHelper imports
	
	/*
	 * The identifier of the JSONReader instance
	 */
	@Accessors String readerIdentifier = "source"
	
	/*
	 * The identifier of the reader subject (the entity the reader is
	 * setting data to)
	 */
	@Accessors String subjectIdentifier = "entity"
	
	@Accessors String providerIdentifier = "provider"
	
	def genReadComplexType(ComplexTypeDeclaration decl) {
		genReadComplexTypeLiteral(decl.literal)
	}
	
	def genReadComplexTypeLiteral(ComplexTypeLiteral literal) '''
		«imports.addImport("org.specapi.android.internal.util.JsonToken")»
		«readerIdentifier».beginObject();
		
		while(«readerIdentifier».hasNext()) {
			String name = «readerIdentifier».nextName();
			
			if(«readerIdentifier».peek() == JsonToken.NULL) {
				«readerIdentifier».skipValue();
				continue;
			}
			
			«var COUNTER = 0»
			«FOR member : literal.members»
			«genBlock(member, COUNTER = COUNTER + 1)»
			«ENDFOR»
			«IF COUNTER > 0»
			else {
				«readerIdentifier».skipValue();
			}
			«ENDIF»
		}
		
		«readerIdentifier».endObject();
	'''
	
	def genReadComplexTypeLiteralForMembers(EList<Member> members) '''
		«imports.addImport("org.specapi.android.internal.util.JsonToken")»
		«readerIdentifier».beginObject();
		
		while(«readerIdentifier».hasNext()) {
			String name = «readerIdentifier».nextName();

			if(«readerIdentifier».peek() == JsonToken.NULL) {
				«readerIdentifier».skipValue();
				continue;
			}
						
			«var COUNTER = 0»
			«FOR member : members»
			«genBlock(member, COUNTER = COUNTER + 1)»
			«ENDFOR»
			«IF COUNTER > 0»
			else {
				«readerIdentifier».skipValue();
			}
			«ENDIF»
		}
		
		«readerIdentifier».endObject();
	'''

	
	def genBlock(Member member, int blockNumber) '''
		«IF blockNumber > 1»else «ENDIF»if(name.equals("«member.name»")) {
			«genStatement(member)»
		}
	''' 
	
	def genStatement(Member member) {
		genStatementForType(member, member.type)
	}
	
	def dispatch genStatementForType(Member member, IntrinsicType type) '''
		«IF type instanceof BooleanType»
		«imports.addImport("org.specapi.android.net.JsonReaderUtil")»
		«member.toSetMethodName.memberize(subjectIdentifier)»(JsonReaderUtil.coerceNextBoolean(«readerIdentifier»));
		«ELSE»
		«member.toSetMethodName.memberize(subjectIdentifier)»(«readerIdentifier».next«type.signature.pascalize»());
		«ENDIF»
	'''
	
	def dispatch genStatementForType(Member member, UserType type) {
		genStatementForType(member, type, type.declaration)
	}
	
	def dispatch genStatementForType(Member member, UserType type, ComplexTypeDeclaration decl) '''
		«type.signature» entityMember = new «type.signature»();
		«providerIdentifier».get(«type.innerSignature».class).read(«readerIdentifier», entityMember);
		«member.toSetMethodName.memberize(subjectIdentifier)»(entityMember);
	'''
	
	def dispatch genStatementForType(Member member, UserType type, EnumTypeDeclaration decl) '''
		«type.signature» entityMember = «type.signature».fromValue(«readerIdentifier».«decl.resolveJsonReaderMethodName»());
		«member.toSetMethodName.memberize(subjectIdentifier)»(entityMember);
	'''
	
	def dispatch genStatementForType(Member member, ArrayType type) {
		genStatementForGenericListType(member, type, type.elementType)
	}
	
	def dispatch genStatementForGenericListType(Member member, ArrayType type, IntrinsicType itemType) '''
		«imports.addImport("java.util.List")»
		«imports.addImport("org.specapi.android.internal.util.JsonUtil")»
		List<«itemType.boxedTypeSignature»> entityMember = JsonUtil.read«itemType.boxedTypeSignature»List(«readerIdentifier»);
		«member.toSetMethodName.memberize(subjectIdentifier)»(entityMember);
	'''
	
	def dispatch genStatementForGenericListType(Member member, ArrayType type, UserType itemType) { 
		genStatementForUserTypeGenericList(member, type, itemType, itemType.declaration)
	}
	
	def dispatch genStatementForUserTypeGenericList(Member member, ArrayType type, UserType itemType, ComplexTypeDeclaration decl) '''
		«imports.addImport("java.util.List")»
		«imports.addImport("java.util.ArrayList")»
		«type.signature» entityMember = new ArrayList<«type.innerSignature»>();
		«providerIdentifier».get(«type.innerSignature».class).readList(«readerIdentifier», entityMember);
		«member.toSetMethodName.memberize(subjectIdentifier)»(entityMember);
	'''
	
	def dispatch genStatementForUserTypeGenericList(Member member, ArrayType type, UserType itemType, EnumTypeDeclaration decl) '''
		«imports.addImport("java.util.List")»
		«imports.addImport("java.util.ArrayList")»
		«imports.addImport("org.specapi.android.internal.util.JsonToken")»
		«type.signature» entityMember = new ArrayList«type.signature»();
		
		«readerIdentifier».beginArray();
		
		while(«readerIdentifier».hasNext()) {
			«type.innerSignature» element = «type.innerSignature».fromValue(«readerIdentifier».«decl.resolveJsonReaderMethodName»());
			targetMember.add(element);
		}
		
		«readerIdentifier».endArray();
		
		«member.toSetMethodName.memberize(subjectIdentifier)»(entityMember);
	'''
}