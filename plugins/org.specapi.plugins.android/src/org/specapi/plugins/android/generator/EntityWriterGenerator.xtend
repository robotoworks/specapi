package org.specapi.plugins.android.generator


import com.google.inject.Inject
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.SpecApiDocument

class EntityWriterGenerator {
	@Inject ImportHelper imports
	@Inject JsonWriterStatementGenerator jsonWriterGenerator
	
	
	def generate(ComplexTypeDeclaration decl, SpecApiDocument model) {
		jsonWriterGenerator.imports = imports
		jsonWriterGenerator.setWriterIdentifier("writer")
		jsonWriterGenerator.setSubjectIdentifier("entity")
		jsonWriterGenerator.setProviderIdentifier("getProvider()")
		doGenerate(decl, model)
	}
	
	def doGenerate(ComplexTypeDeclaration decl, SpecApiDocument model) '''
	package «model.packageName»;
	
	«var classDecl = generateOutputTransformerGeneratorClass(decl, model)»
	import org.specapi.android.net.JsonEntityWriter;
	import org.specapi.android.net.JsonEntityWriterProvider;
	import java.io.IOException;
	import org.specapi.android.internal.util.JsonWriter;
	«imports.printAndClear»
	
	«classDecl»
	'''	
	
	def generateOutputTransformerGeneratorClass(ComplexTypeDeclaration decl, SpecApiDocument module) '''
		«imports.addImport("java.util.List")»

		public class «decl.name»Writer extends JsonEntityWriter<«decl.name»> {

			public «decl.name»Writer(JsonEntityWriterProvider provider) {
				super(provider);
			}
			
			public void write(JsonWriter writer, «decl.name» entity) throws IOException {
				«jsonWriterGenerator.genWriteComplexType(decl)»
			}
			
			public void writeList(JsonWriter writer, List<«decl.name»> entities) throws IOException {
				writer.beginArray();
				
				for(«decl.name» item:entities) {
					write(writer, item);
				}
				
				writer.endArray();
			}
		}
	'''
}