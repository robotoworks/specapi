package org.specapi.plugins.android.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject
import com.google.inject.Provider
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.plugins.android.Plugin
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.EnumTypeDeclaration
import static extension org.specapi.util.SpecApiStringExtensions.*
import org.specapi.specapiLang.HttpMethod

class Generator implements IGenerator {
	@Inject Provider<ClientGenerator> mClientGenerator
	@Inject Provider<RequestGenerator> mRequestGenerator
	@Inject Provider<ResultGenerator> mResultGenerator	
	@Inject Provider<EntityReaderGenerator> mEntityReaderGenerator
	@Inject Provider<EntityWriterGenerator> mEntityWriterGenerator
	@Inject Provider<EntityGenerator> mEntityGenerator
	@Inject Provider<IntegerEnumTypeGenerator> mIntEnumGenerator
	@Inject Provider<StringEnumTypeGenerator> mStringEnumGenerator
	@Inject Provider<EntityReaderProviderGenerator> mEntityReaderProviderGenerator
	@Inject Provider<EntityWriterProviderGenerator> mEntityWriterProviderGenerator
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		val model = resource.contents.head as SpecApiDocument
		
		model.declarations.forEach[generate(model, fsa)]
	}
	
	def dispatch generate(Api client, SpecApiDocument model, IFileSystemAccess fsa) {
		fsa.generateFile(
			model.packageName.resolveFileName("Abstract" + client.name), 
			Plugin::OUTPUT_CONFIG,
			mClientGenerator.get.generate(client, model)
		)
		
		fsa.generateFile(
			model.packageName.resolveFileName(client.name), 
			Plugin::OUTPUT_CONFIG_STUBS,
			mClientGenerator.get.generateStub(client, model)
		);
		
		fsa.generateFile(
			model.packageName.resolveFileName("Default" + client.name.pascalize.concat("ReaderProvider")), 
			Plugin::OUTPUT_CONFIG,
			mEntityReaderProviderGenerator.get.generate(client, model)
		)
		
		fsa.generateFile(
			model.packageName.resolveFileName("Default" + client.name.pascalize.concat("WriterProvider")), 
			Plugin::OUTPUT_CONFIG,
			mEntityWriterProviderGenerator.get.generate(client, model)
		)
		
		client.blocks.filter(typeof(HttpMethod)).forEach[method|
			fsa.generateFile(
				model.packageName.resolveFileName(method.name.pascalize.concat("Request")),
				Plugin::OUTPUT_CONFIG, 
				mRequestGenerator.get.generate(method, model, client)
			)
			fsa.generateFile(
				model.packageName.resolveFileName(method.name.pascalize.concat("Result")), 
				Plugin::OUTPUT_CONFIG,
				mResultGenerator.get.generate(method, model, client)
			)
		]		
	}
	
	def dispatch generate(ComplexTypeDeclaration entity, SpecApiDocument model, IFileSystemAccess fsa) {
		fsa.generateFile(
			model.packageName.resolveFileName(entity.name.pascalize.concat("Reader")), 
			Plugin::OUTPUT_CONFIG,
			mEntityReaderGenerator.get.generate(entity, model)
		)		
		
		fsa.generateFile(
			model.packageName.resolveFileName(entity.name.pascalize.concat("Writer")), 
			Plugin::OUTPUT_CONFIG,
			mEntityWriterGenerator.get.generate(entity, model)
		)	
 
		fsa.generateFile(
			model.packageName.resolveFileName(entity.name.pascalize), 
			Plugin::OUTPUT_CONFIG,
			mEntityGenerator.get.generate(entity, model)
		)		
	}
	
	def dispatch generate(EnumTypeDeclaration type, SpecApiDocument model, IFileSystemAccess fsa) {
		if(type.superType != null) {
			fsa.generateFile(
				model.packageName.resolveFileName(type.name.pascalize), 
				Plugin::OUTPUT_CONFIG,
				mIntEnumGenerator.get.generate(type, model)
			)					
		} else {
			fsa.generateFile(
				model.packageName.resolveFileName(type.name.pascalize), 
				Plugin::OUTPUT_CONFIG,
				mStringEnumGenerator.get.generate(type, model)
			)					
		}
	}
	
	def String resolveFileName(String packageName, String name) {
		return packageName.replace(".", "/") + "/" + name + ".java";
	}  
}