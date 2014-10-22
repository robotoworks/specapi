package org.specapi.plugins.android.generator

import com.google.inject.Inject
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.SpecApiDocument

class EntityReaderGenerator {
	@Inject ImportHelper imports
	@Inject JsonReaderStatementGenerator jsonReaderGenerator
	
	
	def generate(ComplexTypeDeclaration decl, SpecApiDocument model) {
		jsonReaderGenerator.imports = imports
		jsonReaderGenerator.setReaderIdentifier("reader")
		jsonReaderGenerator.setSubjectIdentifier("entity")
		jsonReaderGenerator.setProviderIdentifier("getProvider()")
		doGenerate(decl, model)
	}
	
	def doGenerate(ComplexTypeDeclaration decl, SpecApiDocument model) '''
	package «model.packageName»;
	
	«var classDecl = generateOutputTransformerGeneratorClass(decl, model)»
	import org.specapi.android.net.JsonEntityReader;
	import org.specapi.android.net.JsonEntityReaderProvider;
	import java.io.IOException;
	import org.specapi.android.internal.util.JsonReader;
	«imports.printAndClear»
	
	«classDecl»
	'''	
	
	def generateOutputTransformerGeneratorClass(ComplexTypeDeclaration decl, SpecApiDocument module) '''
		«imports.addImport("java.util.List")»
		public class «decl.name»Reader extends JsonEntityReader<«decl.name»> {			
			
			public «decl.name»Reader(JsonEntityReaderProvider provider) {
				super(provider);
			}
			
			public void read(JsonReader reader, «decl.name» entity) throws IOException {
				«jsonReaderGenerator.genReadComplexType(decl)»
			}
			
			public void readList(JsonReader reader, List<«decl.name»> entities) throws IOException {
				reader.beginArray();
				
				while(reader.hasNext()) {
					«decl.name» item = new «decl.name»();
					read(reader, item);
					entities.add(item);
					
				}
				
				reader.endArray();
			}
		}
	'''
}