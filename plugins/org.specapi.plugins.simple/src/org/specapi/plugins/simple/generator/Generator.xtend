package org.specapi.plugins.simple.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.HttpMethod
import org.specapi.plugins.simple.Plugin
import org.specapi.specapiLang.Model

class Generator implements IGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		
        val model = input.contents.head as Model
        val api = model.declarations.filter(typeof(Api)).head
		
		fsa.generateFile("methods.txt", Plugin::OUTPUT_CONFIG, generateMethodList(api))
	}
	
	def generateMethodList(Api api) '''
		«FOR method : api.blocks.filter(typeof(HttpMethod))»
		«method.name»
		«ENDFOR»
	'''	
}