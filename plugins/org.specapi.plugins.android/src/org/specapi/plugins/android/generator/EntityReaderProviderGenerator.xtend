package org.specapi.plugins.android.generator

import com.google.inject.Inject
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.ComplexTypeDeclaration

class EntityReaderProviderGenerator {
	@Inject ImportHelper imports
	
	def generate(Api client, SpecApiDocument model) '''
	package «model.packageName»;
	
	import org.specapi.android.net.JsonEntityReaderProvider;
	import org.specapi.android.net.JsonEntityReader;
	import java.util.HashMap;
	«var classDecl = generateType(client, model)»
	«imports.printAndClear»
	
	«classDecl»
	'''
	
	def generateType(Api client, SpecApiDocument model) '''
	public class Default«client.name»ReaderProvider implements JsonEntityReaderProvider {

		private HashMap<Class<?>, JsonEntityReader<?>> mMap = new HashMap<Class<?>, JsonEntityReader<?>>();
		
		public Default«client.name»ReaderProvider(){
			registerReaders(mMap);
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public <T, R extends JsonEntityReader<T>> R get(Class<T> entityType) {
			return (R) mMap.get(entityType);
		}
		
		protected void registerReaders(HashMap<Class<?>, JsonEntityReader<?>> map) {
			«FOR entity:model.declarations.filter(typeof(ComplexTypeDeclaration))»
			map.put(«entity.name».class, new «entity.name»Reader(this));
			«ENDFOR»
		}
	}
	'''
}