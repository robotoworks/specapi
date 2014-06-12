package org.specapi.plugins.docs.generator

import com.google.inject.Inject
import com.google.inject.Injector
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.specapi.plugins.docs.Plugin
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.SpecApiModelUtils
import org.specapi.specapiLang.UserTypeDeclaration

class Generator implements IGenerator {
	
	@Inject extension SpecApiModelUtils modelUtil
	@Inject Injector injector;
	
	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		val model = resource.contents.head as SpecApiDocument
		val api = model.declarations.filter(typeof(Api)).head
		api.generate(model, fsa)
		model.declarations.filter(typeof(UserTypeDeclaration)).forEach[generateUserType(api, model, fsa)]
		
		fsa.generateFile("configure.html", Plugin.OUTPUT_CONFIG , new ConfigurePageGenerator(api, model).generate)
	}
	
	def generate(Api api, SpecApiDocument model, IFileSystemAccess fsa) {
	    var generator = new DocIndexGenerator(api, model)
	    injector.injectMembers(generator)
		fsa.generateFile("index.html", Plugin.OUTPUT_CONFIG, generator.generate);

		api.blocks.filter(typeof(HttpMethod)).forEach[method|generate(api, model, fsa, method)]
	}
	
	def dispatch generateUserType(ComplexTypeDeclaration complexType, Api api, SpecApiDocument model, IFileSystemAccess fsa) {
	    var generator = new TypeGenerator(api, model, complexType)
	    injector.injectMembers(generator)
        fsa.generateFile(complexType.name + ".html", Plugin.OUTPUT_CONFIG, generator.generate);
	}
	
	def dispatch generateUserType(EnumTypeDeclaration enumType, Api api, SpecApiDocument model, IFileSystemAccess fsa) {
        var generator = new EnumTypeGenerator(api, model, enumType)
        injector.injectMembers(generator)
        fsa.generateFile(enumType.name + ".html", Plugin.OUTPUT_CONFIG, generator.generate);
	}	
	
	def generate(Api api, SpecApiDocument model, IFileSystemAccess fsa, HttpMethod method) {
	    var generator = new MethodGenerator(api, model, method)
	    injector.injectMembers(generator)
		fsa.generateFile("method_" + method.name + ".html", Plugin.OUTPUT_CONFIG, generator.generate);		
	}
}