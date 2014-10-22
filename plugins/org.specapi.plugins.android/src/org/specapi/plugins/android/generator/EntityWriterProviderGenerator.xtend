package org.specapi.plugins.android.generator

import com.google.inject.Inject
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.ComplexTypeDeclaration

class EntityWriterProviderGenerator {
	@Inject ImportHelper imports
	
	def generate(Api client, SpecApiDocument model) '''
	package «model.packageName»;
	
	import org.specapi.android.net.JsonEntityWriterProvider;
	import org.specapi.android.net.JsonEntityWriter;
	import java.util.HashMap;
	«var classDecl = generateType(client, model)»
	«imports.printAndClear»
	
	«classDecl»
	'''
	
	def generateType(Api client, SpecApiDocument model) '''
	public class Default«client.name»WriterProvider implements JsonEntityWriterProvider {

		private HashMap<Class<?>, JsonEntityWriter<?>> mMap = new HashMap<Class<?>, JsonEntityWriter<?>>();
		
		public Default«client.name»WriterProvider(){
			registerWriters(mMap);
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public <T, R extends JsonEntityWriter<T>> R get(Class<T> entityType) {
			return (R) mMap.get(entityType);
		}
		
		protected void registerWriters(HashMap<Class<?>, JsonEntityWriter<?>> map) {
			«FOR entity:model.declarations.filter(typeof(ComplexTypeDeclaration))»
			map.put(«entity.name».class, new «entity.name»Writer(this));
			«ENDFOR»
		}
	}
	'''
}