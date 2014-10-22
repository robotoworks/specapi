package org.specapi.plugins.android.generator

import com.google.inject.Inject


import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.ArrayType
import org.specapi.specapiLang.Member

class EntityGenerator {
	@Inject ImportHelper imports
	@Inject extension AndroidSpecApiModelUtils util
	def generate(ComplexTypeDeclaration type, SpecApiDocument module) '''
	package «module.packageName»;
	
	import android.content.ContentValues;
	import org.specapi.android.db.ContentValuesUtil;
	import java.util.Map;
	
	«var classDecl = generateType(type, module)»
	«imports.printAndClear»
	«classDecl»
	'''
	
	def generateType(ComplexTypeDeclaration type, SpecApiDocument module) '''
	public class «type.name» {
	    
		«FOR member:type.literal.members»
		«generateKeyConstant(member)»
		«ENDFOR»

		«FOR member:type.literal.members»
		«generateField(member)»
		«ENDFOR»
		
		«FOR member:type.literal.members»
		«generateGetterAndSetter(member)»
		«ENDFOR»
		
		public ContentValues toContentValues() {
		    return toContentValues(null);
		}
		
		public ContentValues toContentValues(Map<String, String> map) {
		    ContentValues values = new ContentValues();

			«FOR member:type.literal.members»
			«generatePutValuesStatement(member)»
			«ENDFOR»
	
	        return values;
		}
	}
	'''
	
	def generateField(Member member) '''
		private «member.type.signature» «member.toIdentifier»;
		«IF(member.type instanceof ArrayType)»«imports.addImport("java.util.List")»«ENDIF»	
	'''
	
	def generatePutValuesStatement(Member member) '''
	ContentValuesUtil.putMapped(KEY_«member.name.toUpperCase», map, values, «member.toIdentifier»);
	'''
	
	def generateGetterAndSetter(Member member) '''
		public «member.type.signature» «member.toGetMethodName»(){
			return «member.toIdentifier»;
		}
		public void «member.toSetMethodName»(«member.type.signature» value){
			this.«member.toIdentifier» = value;
		}
	'''
	
	def generateKeyConstant(Member member) '''
        public static final String KEY_«member.name.toUpperCase» = "«member.name»";
    '''

}