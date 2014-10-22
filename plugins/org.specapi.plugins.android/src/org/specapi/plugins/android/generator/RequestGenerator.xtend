package org.specapi.plugins.android.generator

import com.google.inject.Inject
import java.util.ArrayList
import java.util.List
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.ArrayType
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.ComplexTypeLiteral
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.IntrinsicType
import org.specapi.specapiLang.Member
import org.specapi.specapiLang.Path
import org.specapi.specapiLang.RequestBlock
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.StringType
import org.specapi.specapiLang.UserType

import static extension org.specapi.util.SpecApiStringExtensions.*

class RequestGenerator {
	@Inject ImportHelper imports
	@Inject JsonWriterStatementGenerator jsonWriterGenerator
	@Inject extension AndroidSpecApiModelUtils utils

	def generate(HttpMethod method, SpecApiDocument module, Api client) {
		jsonWriterGenerator.imports = imports
		jsonWriterGenerator.setWriterIdentifier("writer")
		doGenerate(method, module, client)
	} 
	
	def doGenerate(HttpMethod method, SpecApiDocument module, Api client) '''
	package «module.packageName»;

	«var classDecl = generateRequestClass(method, module, client)»
	
	import android.net.Uri;
	«IF(method.hasBody)»
	import org.specapi.android.net.JsonEntityWriterProvider;
	import org.specapi.android.net.EntityEnclosedServiceRequest;
	«ELSE»
	import org.specapi.android.net.ServiceRequest;
	«ENDIF»
	«imports.printAndClear»
	
	«classDecl»
	'''	
	
	def generateRequestClass(HttpMethod method, SpecApiDocument module, Api client) '''
	public class «method.name.pascalize»Request extends «IF(method.hasBody)»EntityEnclosed«ENDIF»ServiceRequest {
		
		private static final String PATH = "«method.getPathAsFormatString(null, null)»";
		
		«IF(method.path?.params?.size > 0)»
		«FOR slug:method.path.params»
		private final «slug.type.signature» «slug.name.camelize»Segment;
		«ENDFOR»
		
		«ENDIF»
		«var methodParams = method.paramsBlock»
		«var clientParams = client.paramsBlock»
		«IF(methodParams != null)»
		«FOR param:methodParams.params»
		private «param.type.signature» «param.name.camelize»Param«IF param.defaultValue != null» = «param.defaultValue.convertToJavaLiteral»«ENDIF»;
		private boolean «param.name.camelize»ParamSet«IF param.defaultValue != null» = true«ENDIF»;
		«ENDFOR»
			
		«ENDIF»
		«IF(clientParams != null)»
		«FOR param:clientParams.params»
		private «param.type.signature» «param.name.camelize»Param«IF param.defaultValue != null» = «param.defaultValue.convertToJavaLiteral»«ENDIF»;
		private boolean «param.name.camelize»ParamSet«IF param.defaultValue != null» = true«ENDIF»;
		«ENDFOR»
			
		«ENDIF»
		«IF(method.hasBody)»
			«generateFieldForType(method.body.type)»
			
			«generateGetterSetterForType(method.body.type)»
		«ENDIF»
		«IF(methodParams != null)»
		«FOR param:methodParams.params»
		public «method.name.pascalize»Request set«param.name.pascalize»Param(«param.type.signature» value) {
			this.«param.name.camelize»Param = value;
			this.«param.name.camelize»ParamSet = true;
			return this;
		}
		
		public boolean is«param.name.pascalize»ParamSet() {
			return «param.name.camelize»ParamSet;
		}
		«ENDFOR»
			
		«ENDIF»
		«IF(clientParams != null)»
		«FOR param:clientParams.params»
		public «method.name.pascalize»Request set«param.name.pascalize»Param(«param.type.signature» value) {
			this.«param.name.camelize»Param = value;
			this.«param.name.camelize»ParamSet = true;
			return this;
		}
		
		public boolean is«param.name.pascalize»ParamSet() {
			return «param.name.camelize»ParamSet;
		}
		«ENDFOR»
				
		«ENDIF»
		public «method.name.pascalize»Request(«generateRequestConstructorArgs(method.path, method.body)»){
			«var methodHeaders = method.headerBlock»
			«IF methodHeaders != null»
			«FOR header : methodHeaders.headers»
			setHeader("«header.name»","«header.defaultValue»");
			«ENDFOR»
			
			«ENDIF»
			«IF(method.path?.params?.size > 0)»
				«FOR slug:method.path.params»
				this.«slug.name.camelize»Segment = «slug.name.camelize»Segment;
				«ENDFOR»	
			«ENDIF»
			«IF(method.hasBody)»
				«generateConstructorAssignmentForType(method.body.type)»
			«ENDIF»
		}
		
		«IF(method.hasBody)»
		«imports.addImport("org.specapi.android.util.Closeables")»
		«imports.addImport("java.io.OutputStream")»
		«imports.addImport("java.io.IOException")»
		@Override
		public void writeBody(JsonEntityWriterProvider provider, OutputStream stream) throws IOException {
			«generateSerializationStatementForType(method, method.body, method.body.type)»
		}

		«ENDIF»
		@Override
		public String createUrl(String baseUrl){
			«IF(method.path?.params?.size > 0)»
				Uri.Builder uriBuilder = Uri.parse(baseUrl + String.format(PATH, «FOR slug:method.path.params SEPARATOR ", "»«slug.name.camelize»Segment«ENDFOR»)).buildUpon();
			«ELSE»
				Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			«ENDIF»		
				
			«IF(methodParams != null)»
				«FOR param:methodParams.params»
					if(«param.name.camelize»ParamSet){
						«IF param.type instanceof StringType»
						uriBuilder.appendQueryParameter("«param.name»", «param.name.camelize»Param);
						«ELSE»
						uriBuilder.appendQueryParameter("«param.name»", String.valueOf(«param.name.camelize»Param));
						«ENDIF»
					}
				«ENDFOR»
				
			«ENDIF»
			«IF(clientParams != null)»
			«FOR param:clientParams.params»
				if(«param.name.camelize»ParamSet){
					«IF param.type instanceof StringType»
					uriBuilder.appendQueryParameter("«param.name»", «param.name.camelize»Param);
					«ELSE»
					uriBuilder.appendQueryParameter("«param.name»", String.valueOf(«param.name.camelize»Param));
					«ENDIF»
				}
			«ENDFOR»
			
			«ENDIF»
			return uriBuilder.toString();			
		}
	}
	'''
	
	def generateSerializationStatementHeader(boolean withReader)'''
		«IF withReader»
		«imports.addImport("org.specapi.android.internal.util.JsonWriter")»
		«imports.addImport("java.io.OutputStreamWriter")»
		«imports.addImport("java.nio.charset.Charset")»
		JsonWriter writer = null;
		«ENDIF»
		try {
			if(stream != null) {
				«IF withReader»
				writer = new JsonWriter(new OutputStreamWriter(stream, Charset.defaultCharset()));
				«ENDIF»
				
	'''
	
	def generateSerializationStatementFooter(boolean withReader)'''
				
			}
		} finally {
			«IF withReader»
			Closeables.closeSilently(writer);
			«ELSE»
			Closeables.closeSilently(stream);
			«ENDIF»
		}
	'''
	
	def dispatch generateFieldForType(ComplexTypeLiteral type) '''
		«FOR member:type.members»
		«generateFieldForMember(member)»
		«ENDFOR»
	'''
	def dispatch generateFieldForType(IntrinsicType type) '''
		private final «type.signature» value;
	'''
	
	def dispatch generateFieldForType(ArrayType type) '''
		«IF(type.elementType instanceof IntrinsicType)»
			private final «type.signature» values;
		«ELSE»
			private final «type.signature» «type.innerSignature.camelize.pluralize»;
		«ENDIF»
	'''
	
	def dispatch generateFieldForType(UserType type) '''
		private final «type.signature» «type.signature.camelize»;
	'''
	
	def generateFieldForMember(Member member) '''
		private final «member.type.signature» «member.toIdentifier»;
	'''
	
	def dispatch generateGetterSetterForType(ComplexTypeLiteral type) '''
		«FOR member:type.members»
		«generateGetterSetterForMember(member)»
		«ENDFOR»
	'''
	def dispatch generateGetterSetterForType(IntrinsicType type) '''
		public «type.signature» getValue() {
			return value;
		}
	'''
	
	def dispatch generateGetterSetterForType(ArrayType type) '''
		«IF(type.elementType instanceof IntrinsicType)»
			public «type.signature» getValues() {
				return values;
			}
		«ELSE»
			public «type.signature» get«type.innerSignature.pascalize.pluralize»() {
				return «type.innerSignature.camelize.pluralize»;
			}
		«ENDIF»
	'''
	
	def dispatch generateGetterSetterForType(UserType type) '''
		public «type.signature» get«type.signature.pascalize»() {
			return «type.signature.camelize»;
		}
	'''
	
	def generateGetterSetterForMember(Member member) '''
		public «member.type.signature» «member.toGetMethodName»() {
			return «member.toIdentifier»;
		}
	'''
	
	def dispatch generateConstructorAssignmentForType(ComplexTypeLiteral type) '''
		«FOR member:type.members»
		«generateConstructorAssignmentForMember(member)»
		«ENDFOR»
	'''
	def dispatch generateConstructorAssignmentForType(IntrinsicType type) '''
		this.value = value;
	'''

	def dispatch generateConstructorAssignmentForType(ArrayType type) '''
		«IF(type.elementType instanceof IntrinsicType)»
			this.values = values;
		«ELSE»
			this.«type.innerSignature.camelize.pluralize» = «type.innerSignature.camelize.pluralize»;
		«ENDIF»
	'''
	def dispatch generateConstructorAssignmentForType(UserType type) '''
		this.«type.signature.camelize» = «type.signature.camelize»;
	'''
	
	def generateConstructorAssignmentForMember(Member member) '''
		this.«member.toIdentifier» = «member.toIdentifier»;
	'''
	
	def dispatch generateSerializationStatementForType(HttpMethod method, RequestBlock body, IntrinsicType type) '''
		«imports.addImport("java.io.PrintStream")»
		«generateSerializationStatementHeader(false)»
			PrintStream ps = new PrintStream(stream);
			ps.print(value);
			«IF type instanceof StringType»
			Streams.writeText(stream, value);
			«ELSE»
			Streams.writeText(stream, «type.boxedTypeSignature».toString(value));
			«ENDIF»
		«generateSerializationStatementFooter(false)»
	'''
	
	def dispatch generateSerializationStatementForType(HttpMethod method, RequestBlock body, ComplexTypeLiteral type) '''
		«generateSerializationStatementHeader(true)»
		
		«method.name.pascalize»Request subject = this;
		
		«jsonWriterGenerator.genWriteComplexTypeLiteral(type)»
		
		«generateSerializationStatementFooter(true)»
	'''
	
	def dispatch generateSerializationStatementForType(HttpMethod method, RequestBlock body, UserType type) {
		generateSerializationStatementForUserType(body, type, type.declaration);
	}
	
	def dispatch generateSerializationStatementForUserType(
		RequestBlock body,
		UserType type,
		ComplexTypeDeclaration declaration) '''
			«generateSerializationStatementHeader(true)»
			provider.get(«type.signature».class).write(writer, «type.signature.camelize»);
			«generateSerializationStatementFooter(true)»
		'''
	
	def dispatch generateSerializationStatementForUserType(
		RequestBlock body,
		UserType type,
		EnumTypeDeclaration declaration) '''
			«imports.addImport("java.io.PrintStream")»
			«generateSerializationStatementHeader(false)»
				PrintStream ps = new PrintStream(stream);
				ps.print(«type.signature.camelize».getValue());
				Streams.writeText(stream, «type.signature.camelize».getValue());
			«generateSerializationStatementFooter(false)»
		'''
	
	def dispatch generateSerializationStatementForType(HttpMethod method, RequestBlock body, ArrayType type) {
		generateSerializationStatementForGenericListType(body, type, type.elementType);
	}
	
	def dispatch generateSerializationStatementForGenericListType(
		RequestBlock body, 
		ArrayType type,
		IntrinsicType elementType
	) '''
		«imports.addImport("org.specapi.android.internal.util.JsonUtil")»
		«imports.addImport("java.util.List")»
		«generateSerializationStatementHeader(true)»
		JsonUtil.write«elementType.boxedTypeSignature»List(writer, values);
		«generateSerializationStatementFooter(true)»
	'''

	def dispatch generateSerializationStatementForGenericListType(
		RequestBlock body, 
		ArrayType type,
		UserType elementType
	) {
		generateSerializationStatementForUserTypeGenericList(body, type, elementType, elementType.declaration);
	}

	def dispatch generateSerializationStatementForUserTypeGenericList(
		RequestBlock body, 
		ArrayType type,
		UserType elementType,
		ComplexTypeDeclaration declaration
	) '''
		«imports.addImport("java.util.List")»
		«generateSerializationStatementHeader(true)»
		provider.get(«type.innerSignature».class).writeList(writer, «type.innerSignature.camelize.pluralize»);
		«generateSerializationStatementFooter(true)»
	'''

	def dispatch generateSerializationStatementForUserTypeGenericList(
		RequestBlock body, 
		ArrayType type,
		UserType elementType,
		EnumTypeDeclaration declaration
	) '''
		«generateSerializationStatementHeader(true)»
		
			writer.beginArray();
			
			for(«type.innerSignature» element:«type.innerSignature.camelize.pluralize») {
				writer.put(element.getValue());
			}
			
			writer.endArray();
		
		«generateSerializationStatementFooter(true)»
	'''
			
	/*
	 * Converts a path (eg:- /qux/:fooparam/:quxparam/bar
	 * into constructor arguments
	 */
	def generateRequestConstructorArgs(Path path, RequestBlock body){
		var args = new ArrayList<String>()
		if(path?.params?.size > 0) {
			for(slug:path.params){
				args.add(slug.type.signature + " " + slug.name.camelize + "Segment")
			}
		}
		
		if(body != null) {
			buildConstructorArgsForType(body.type, args)
		}
		
		return args.join(",\n")
	}
	
	def dispatch void buildConstructorArgsForType(ComplexTypeLiteral type, List<String> args) {
		for(member:type.members) {
			args.add(member.type.signature + " " + member.toIdentifier)
		}		
	}
	
	def dispatch void buildConstructorArgsForType(IntrinsicType type, List<String> args) {
		args.add(type.signature + " value");
	}
	
	def dispatch void buildConstructorArgsForType(ArrayType type, List<String> args) {
		if(type.elementType instanceof IntrinsicType){
			args.add(type.signature + " values")
		} else {
			args.add(type.signature + " " + type.innerSignature.camelize.pluralize)
		}	
	}
	
	def dispatch void buildConstructorArgsForType(UserType type, List<String> args) {
		args.add(type.signature + " " + type.signature.camelize)
	}
	
	def pathToStringFormatArgs(String path){		
		", " + path.split("/|\\.")
		.filter(seg|seg.startsWith(":"))
		.join(", ", [String arg|arg.substring(1).camelize + "Segment"])	
	}
	
	def hasArgs(String path){
		path != null && path.contains(":")
	}
}
