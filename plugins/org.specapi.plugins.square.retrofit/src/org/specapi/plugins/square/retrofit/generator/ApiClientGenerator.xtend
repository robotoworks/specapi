package org.specapi.plugins.square.retrofit.generator

import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api
import static extension org.specapi.util.SpecApiStringExtensions.*
import org.specapi.specapiLang.HttpMethod
import com.google.inject.Inject
import org.specapi.ModelUtil
import org.specapi.specapiLang.ComplexTypeLiteral
import org.specapi.specapiLang.Type
import com.google.common.collect.Sets
import java.util.HashSet
import java.util.ArrayList
import com.google.common.collect.Lists

class ApiClientGenerator {

    @Inject extension ModelUtil modelUtil
    
    var HashSet<String> imports = Sets.newHashSet()
    	 
	def generate(SpecApiDocument doc, Api api) '''
    package «doc.packageName»;
    
    «val body = generateBody(doc, api)»
    «imports.generateImports»
    import retrofit.http.Path;
    
    «body»
	'''
    
    def generateBody(SpecApiDocument doc, Api api) '''
    public interface «api.name.pascalize» {
        public static final String API_URL = "«api.baseUrl»";
        
        «FOR method : api.blocks.filter(typeof(HttpMethod))»
        «addImport("retrofit.http." + method.type.literal.toUpperCase)»
        @«method.type.literal.toUpperCase»("«method.getPathAsFormatString("{", "}")»")
        «method.generateResponseType(doc, api, method.responseBlock?.type)» «method.name»(«method.generateArguments»);
        
        «ENDFOR»
    }
    '''
    
    def generateArguments(HttpMethod method) {
        var ArrayList<String> params = Lists.newArrayList();
        
        for(param : method.path.params) {
            params.add("@Path(\"" + param.name + "\") " + Generator.toJavaTypeSignature(param.type) + " " + param.name)
        }
        
        var query = method.paramsBlock
        
        if(query != null) {
            imports.add("retrofit.http.QueryMap")
            imports.add("java.util.Map")
            params.add("@QueryMap Map<String, String> options");
        }
        
        return params.join(", ")
        
    }
    
    def dispatch generateResponseType(HttpMethod method, SpecApiDocument document, Api api, ComplexTypeLiteral type) 
        '''«method.name.pascalize»Result'''
    def dispatch generateResponseType(HttpMethod method, SpecApiDocument document, Api api, Type type) 
        '''«Generator.toJavaTypeSignature(type)»'''
        
    
    def generateImports(HashSet<String> imports) '''
    «FOR _import : imports»
        import «_import»;
    «ENDFOR»
    '''
    
    def void addImport(String str) {
        imports.add(str)
    }
}