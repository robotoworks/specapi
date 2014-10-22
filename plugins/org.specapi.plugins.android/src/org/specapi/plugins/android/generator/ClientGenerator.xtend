package org.specapi.plugins.android.generator

import com.google.inject.Inject

import static extension org.specapi.util.SpecApiStringExtensions.*;
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.HttpMethodType

class ClientGenerator {
	@Inject ImportHelper imports
    @Inject extension AndroidSpecApiModelUtils utils;
	
	def generate(Api client, SpecApiDocument module) '''
	package «module.packageName»;

	«var classDecl = generateClientClass(client, module)»
	
	import org.specapi.android.net.Parser;
	import java.io.IOException;
	import org.specapi.android.net.Response;
	import org.specapi.android.net.ServiceException;
	import java.io.InputStream;
	import org.specapi.android.net.ServiceClient;
	import org.specapi.android.net.JsonEntityWriterProvider;
	import org.specapi.android.net.JsonEntityReaderProvider;
	«imports.printAndClear»
	
	«classDecl»
	'''
	
	def generateClientClass(Api client, SpecApiDocument module) '''
		public abstract class Abstract«client.name» extends ServiceClient {
			private static final String LOG_TAG = "«client.name»";
			
			«IF client.baseUrl != null»
			protected static final String DEFAULT_BASE_URL = "«client.baseUrl»";
			
			«ENDIF»
			«var params = client.paramsBlock»
			«IF(params != null)»
			«FOR param:params.params»
			private «param.type.signature» «param.name.camelize»Param«IF param.defaultValue != null» = «param.defaultValue.convertToJavaLiteral»«ENDIF»;
			private boolean «param.name.camelize»ParamSet«IF param.defaultValue != null» = true«ENDIF»;
			«ENDFOR»
			
			«ENDIF»
			«IF(params != null)»
			«FOR param:params.params»
			public void set«param.name.pascalize»Param(«param.type.signature» value) {
				this.«param.name.camelize»Param = value;
				this.«param.name.camelize»ParamSet = true;
			}
			«ENDFOR»
			
			«ENDIF»
			@Override
			protected String getLogTag() {
				return LOG_TAG;
			}
			
			@Override
			protected JsonEntityWriterProvider createWriterProvider() {
				return new Default«client.name»WriterProvider();
			}
			
			@Override
			protected JsonEntityReaderProvider createReaderProvider() {
				return new Default«client.name»ReaderProvider();
			}
			
			public Abstract«client.name»(String baseUrl, boolean debug){
				super(baseUrl, debug);
				
				«var headers = client.headerBlock»
				«IF headers != null»
				«FOR header : headers.headers»
				setHeader("«header.name»","«header.defaultValue»");
				«ENDFOR»
				«ENDIF»
			}
			
			«generateClientMethods(client, module)»
		}
	'''
	
	def generateClientMethods(Api client, SpecApiDocument module) '''
		«FOR method:client.blocks.filter(typeof(HttpMethod))»
		«IF !method.hasRequest && (method.path == null || method.path.params.size == 0)»
		public Response<«method.name.pascalize»Result> «method.name.camelize»()
		  throws ServiceException {
		  	return «method.name.camelize»(new «method.name.pascalize»Request());
		}
		
		«ENDIF»
		public Response<«method.name.pascalize»Result> «method.name.camelize»(«method.name.pascalize»Request request)
		  throws ServiceException {
		  	«var params = client.paramsBlock»
			«IF(params != null)»
			«FOR param:params.params»
			if(this.«param.name.camelize»ParamSet && !request.is«param.name.pascalize»ParamSet()){
				request.set«param.name.pascalize»Param(this.«param.name.camelize»Param);
			}
			«ENDFOR»
			
			«ENDIF»	
			
			Parser<«method.name.pascalize»Result> parser = new Parser<«method.name.pascalize»Result>() {
				public «method.name.pascalize»Result parse(InputStream inStream) throws IOException {
					return new «method.name.pascalize»Result(getReaderProvider(), inStream);
				}
			};
			
			«generateServiceMethod(method)»
		}
		
		«ENDFOR»
	'''
	def generateServiceMethod(HttpMethod method) { 
		switch(method.type) {
			case HttpMethodType::GET:
				generateServiceGetMethod(method)
			case HttpMethodType::PUT:
				generateServicePutMethod(method)
			case HttpMethodType::POST:
				generateServicePostMethod(method)
			case HttpMethodType::DELETE:
				generateServiceDeleteMethod(method)
			case HttpMethodType::PATCH:
				generateServiceDeleteMethod(method)
				
		}
	}

	
	def printSetHeadersStatements() '''
		for(String key : headers.keySet()) {
			conn.setRequestProperty(key, headers.get(key));
		}
		
		for(String key : request.getHeaderKeys()) {
			conn.setRequestProperty(key, request.getHeaderValue(key));
		}
	'''

	def generateServiceGetMethod(HttpMethod method) '''
		return get(request, parser);
	'''
	def generateServicePutMethod(HttpMethod method) '''
		return put(request, parser);
	'''
	
	def generateServicePostMethod(HttpMethod method) '''
		return post(request, parser);
	'''
	def generateServiceDeleteMethod(HttpMethod method) '''
		return delete(request, parser);
	'''
	def generateServicePatchMethod(HttpMethod method) '''
		return patch(request, parser);
	'''

	def generateStub(Api client, SpecApiDocument module) '''
	package «module.packageName»;
	
	public class «client.name» extends Abstract«client.name» {
		«IF client.baseUrl != null»
		public «client.name»(){
			super(DEFAULT_BASE_URL, false);
		}

		public «client.name»(boolean debug){
			super(DEFAULT_BASE_URL, debug);
		}
		«ENDIF»
		
		public «client.name»(String baseUrl){
			super(baseUrl, false);
		}
		
		public «client.name»(String baseUrl, boolean debug){
			super(baseUrl, debug);
		}
	}
	'''
}