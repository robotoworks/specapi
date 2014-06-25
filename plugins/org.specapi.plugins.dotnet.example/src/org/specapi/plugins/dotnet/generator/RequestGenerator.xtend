package org.specapi.plugins.dotnet.generator

import org.specapi.plugins.dotnet.generator.DotNetTypeGenerator
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api
import static extension org.specapi.util.SpecApiStringExtensions.*
import static extension org.specapi.plugins.dotnet.generator.DotNetUtil.*
import org.specapi.specapiLang.HttpMethod
import java.util.ArrayList
import com.google.inject.Inject
import org.specapi.SpecApiModelUtils
import org.specapi.specapiLang.ResponseBlock
import org.specapi.specapiLang.ComplexTypeLiteral
import org.specapi.specapiLang.Type
import org.specapi.specapiLang.HttpMethodType

class RequestGenerator extends DotNetTypeGenerator {
    
    @Inject extension SpecApiModelUtils modelUtil
    
    HttpMethod method
    
    override getNamespace() {
        return doc.packageName.pascalizePackageName
    }
    
    def generate(SpecApiDocument doc, Api api, HttpMethod method) {
        this.method = method;
        super.generate(doc, api)
    }
    
    override generateBody(SpecApiDocument doc, Api api)  '''
    «addImport("System")»
    «addImport("System.Net")»
    «addImport("System.Linq")»
    «addImport("System.Collections.Specialized")»
    public partial class «method.name.pascalize»Request
    {
        «generatePropertiesForPathParameters»
        «generateMembersForQueryParameters»
        «generateResponseDelegates»
        «generateResponseDelegateProperties»
        «IF method.type == HttpMethodType.PUT || 
        method.type == HttpMethodType.POST ||
        method.type == HttpMethodType.PATCH»
        
        public «method.request.generateRequestType(method)» Entity { get; set; }
        «ENDIF»

        public «method.name.pascalize»Request(«createConstructorArgs») {
            «generateConstructorArgAssignments»
        }
        
        public Uri CreateUri (string baseUrl)
        {
            «generateUriCreationStatements»
            
            «IF method.paramsBlock != null»
            var uriBuilder = new UriBuilder(url);
            NameValueCollection query = new NameValueCollection ();
            «FOR param:method.paramsBlock.params»
            if(_«param.name.camelize»ParamSet) {
                query ["«param.name»"] = _«param.name.camelize»Param;
            }
            «ENDFOR»
            uriBuilder.Query = string.Join("&", query.AllKeys.Select(key => string.Format("{0}={1}", WebUtility.UrlEncode(key), WebUtility.UrlEncode(query[key]))));
            return uriBuilder.Uri;
            «ELSE»
            return new Uri(url);
            «ENDIF»
        }
    }
    '''
    
    def generateUriCreationStatements() '''
    «IF method.path != null»
    «IF method.hasPathParams»
    String path = String.Format ("«method.getPathAsIndexedFormatString("{","}")»", «createFormatStringFromQueryArgs»);
    String url = baseUrl + path;
    «ELSE»
    String url = baseUrl + "«method.pathAsString»";
    «ENDIF»
    «ELSE»
    String url = baseUrl;
    «ENDIF»
    '''
    
    def generateConstructorArgAssignments() '''
    «FOR param:method.path?.params»
    «param.name.pascalize» = «param.name»;
    «ENDFOR»
    '''
    
    def generatePropertiesForPathParameters() '''
    «FOR param:method.path?.params»
    public «param.type.dotNetTypeString» «param.name.pascalize» { get; set; }
    «ENDFOR»
    '''
 
    def generateMembersForQueryParameters() '''
    «IF method.paramsBlock != null»
    «FOR param: method.paramsBlock.params»
    bool _«param.name.camelize»ParamSet = false;
    «param.type.dotNetTypeString» _«param.name.camelize»Param;
    public «param.type.dotNetTypeString» «param.name.pascalize» 
    { 
        get 
        {
            return _«param.name.camelize»Param;
        } 
        set 
        {
            _«param.name.camelize»ParamSet = true;
            _«param.name.camelize»Param = value;
        }
    }

    «ENDFOR»
    «ENDIF»
    '''
    def createFormatStringFromQueryArgs() {
        var args = new ArrayList<String>();
        var path = method.path
        if(path != null) {
            for(param : path.params) {
                args.add(param.name.pascalize)
            }
        }
        
        return args.join(", ")
    }
    
    def createConstructorArgs() {
        var args = new ArrayList<String>();
        var path = method.path
        if(path != null) {
            for(param : path.params) {
                args.add(param.type.dotNetTypeString + " " + param.name)
            }
        }
        
        return args.join(", ")
    }
    
    def generateResponseDelegates() '''
    «FOR response:method.blocks.filter(typeof(ResponseBlock))»
    public delegate void Status«response.resolveCode»Handler(«response.generateResponseType(method)» result);
    «ENDFOR»
    public delegate void StatusUnexpectedHandler(HttpWebResponse result);
    '''
    
    def generateResponseDelegateProperties() '''
    «FOR response:method.blocks.filter(typeof(ResponseBlock))»
    public Status«response.resolveCode»Handler On«response.resolveCode» { get; set; }
    «ENDFOR»
    public StatusUnexpectedHandler OnOther { get; set; }
    '''   
}