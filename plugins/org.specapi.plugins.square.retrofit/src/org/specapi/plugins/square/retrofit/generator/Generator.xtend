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

class Generator implements IGenerator {
	
	@Inject ApiClientGenerator apiClientGenerator
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val doc = input.contents.head as SpecApiDocument
		
		doc.declarations.filter(typeof(Api)).forEach[api|
			fsa.generateFile(
				doc.packageName.patherize + "/" + api.name.pascalize + ".java", 
				Plugin::OUTPUT_CONFIG, apiClientGenerator.generate(doc, api)
				)
		]
	}
	
    def static String toJavaTypeSignature(Type type) {
        switch(type) {
            StringType: "String"
            BooleanType: "Boolean"
            IntegerType: "Integer"
            LongType: "Long"
            DoubleType: "Double"
            ArrayType: "List<" + type.elementType.toJavaTypeSignature + ">" 
            UserType: type.declaration.name
        }
    }
}