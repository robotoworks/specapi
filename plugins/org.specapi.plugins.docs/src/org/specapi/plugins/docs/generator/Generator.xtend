package org.specapi.plugins.docs.generator

import com.google.inject.Inject
import com.google.inject.Injector
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.specapi.ModelUtil
import org.specapi.plugins.docs.Plugin
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.SpecApiDocument

class Generator implements IGenerator {
	
	@Inject extension ModelUtil modelUtil
	@Inject Injector injector;
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		val model = resource.contents.head as SpecApiDocument
		
		model.declarations.forEach[generate(model, fsa)]
	}
	
	def dispatch generate(Api api, SpecApiDocument model, IFileSystemAccess fsa) {
	    var generator = new DocIndexGenerator(api, model)
	    injector.injectMembers(generator)
		fsa.generateFile("index.html", Plugin.OUTPUT_CONFIG, generator.generate);

		api.blocks.filter(typeof(HttpMethod)).forEach[method|generate(api, model, fsa, method)]
	}
	
	def dispatch generate(ComplexTypeDeclaration complexType, SpecApiDocument model, IFileSystemAccess fsa) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")

	}
	
	def dispatch generate(EnumTypeDeclaration enumType, SpecApiDocument model, IFileSystemAccess fsa) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}	
	
	def generate(Api api, SpecApiDocument model, IFileSystemAccess fsa, HttpMethod method) {
	    var generator = new MethodGenerator(api, model, method)
	    injector.injectMembers(generator)
		fsa.generateFile("method_" + method.name + ".html", Plugin.OUTPUT_CONFIG, generator.generate);		
	}
}