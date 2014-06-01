package org.specapi.plugins.square.retrofit.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api
import com.google.inject.Inject
import static extension org.specapi.util.SpecApiStringExtensions.*
import org.specapi.plugins.square.retrofit.Plugin
import org.specapi.specapiLang.Type
import org.specapi.specapiLang.StringType
import org.specapi.specapiLang.BooleanType
import org.specapi.specapiLang.IntegerType
import org.specapi.specapiLang.LongType
import org.specapi.specapiLang.DoubleType
import org.specapi.specapiLang.ArrayType
import org.specapi.specapiLang.UserType
import org.specapi.specapiLang.UserTypeDeclaration

class Generator implements IGenerator {
	
	@Inject ApiClientGenerator apiClientGenerator
	@Inject ApiEntityGenerator entityGenerator
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val doc = input.contents.head as SpecApiDocument
		
		doc.declarations.filter(typeof(Api)).forEach[api|
			fsa.generateFile(
				doc.packageName.patherize + "/" + api.name + ".java", 
				Plugin::OUTPUT_CONFIG, apiClientGenerator.generate(doc, api)
				)
		]
		
		doc.declarations.filter(typeof(UserTypeDeclaration)).forEach[entity|
            fsa.generateFile(
                doc.packageName.patherize + "/" + entity.name + ".java", 
                Plugin::OUTPUT_CONFIG, entityGenerator.generate(doc, entity)
                )
		]
	}
	
    def static String toJavaTypeSignature(Type type) {
        toJavaTypeSignature(type, true)
    }
    
    def static String toJavaTypeSignature(Type type, boolean boxTypes) {
        switch(type) {
            StringType: "String"
            BooleanType: if(boxTypes) "Boolean" else "boolean"
            IntegerType: if(boxTypes) "Integer" else "int"
            LongType: if(boxTypes) "Long" else "long"
            DoubleType: if(boxTypes) "Double" else "double"
            ArrayType: "List<" + type.elementType.toJavaTypeSignature(true) + ">" 
            UserType: type.declaration.name
        }
    }
}