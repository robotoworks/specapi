package org.specapi.plugins.simple.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.HttpMethod
import org.specapi.plugins.simple.Plugin
import org.specapi.specapiLang.SpecApiDocument

class Generator implements IGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		
        val model = input.contents.head as SpecApiDocument
        val api = model.declarations.filter(typeof(Api)).head
		
		fsa.generateFile("methods.html", Plugin::OUTPUT_CONFIG, generateMethodList(api))
	}
	
	def generateMethodList(Api api) '''
		<html>
		<head>«api.name» «api.baseUrl»</head>
		<body>
			<ul>
			«FOR method : api.blocks.filter(typeof(HttpMethod))»
			<li>«method.type.getName().toUpperCase» «method.name»</li>
			«ENDFOR»
			</ul>
		<body>
		<html>
	'''	
}