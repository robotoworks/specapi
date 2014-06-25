package org.specapi.plugins.dotnet.generator

import org.specapi.plugins.dotnet.generator.DotNetTypeGenerator
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api
import static extension org.specapi.util.SpecApiStringExtensions.*
import static extension org.specapi.plugins.dotnet.generator.DotNetUtil.*
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.ResponseBlock
import org.specapi.specapiLang.HttpMethodType
import com.google.inject.Inject
import org.specapi.SpecApiModelUtils

class ApiClientGenerator extends DotNetTypeGenerator {
    
    @Inject extension SpecApiModelUtils modelUtil
    
    override getNamespace() {
        return doc.packageName.pascalizePackageName
    }
    
    override generateBody(SpecApiDocument doc, Api api)  '''
    «addImport("System")»
    «addImport("System.Net")»
    «addImport("System.Runtime.Serialization.Json")»
    public partial class «api.name.pascalize»
    {
        public static String DefaultBaseUrl { get { return "«api.baseUrl»"; }}
        
        public String BaseUrl { get; set; }
        
        public «api.name.pascalize»() {
            BaseUrl = DefaultBaseUrl;
        }
        
        protected HttpWebRequest CreateRequest(Uri uri)
        {
            var request = WebRequest.CreateHttp (uri);
            ConfigureRequest(request);
            return request;

        }

        partial void ConfigureRequest(HttpWebRequest request);
    
        «FOR method : api.blocks.filter(typeof(HttpMethod))»
        public void «method.name.pascalize»(«method.name.pascalize»Request request)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = CreateRequest (uri);
                webRequest.Method = "«method.type.literal.toUpperCase»";
                webRequest.UserAgent = "DotNet-«api.name.pascalize»";
                «IF method.type == HttpMethodType.PUT || 
                method.type == HttpMethodType.POST ||
                method.type == HttpMethodType.PATCH»
                
                var payload = request.Entity;
                var requestStream = webRequest.GetRequestStream();
                var serializer = new DataContractJsonSerializer (typeof(«method.request.generateRequestType(method)»));
                serializer.WriteObject(requestStream, payload);
                «ENDIF»

                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                Handle«method.name.pascalize»Response(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                Handle«method.name.pascalize»Response(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        protected void Handle«method.name.pascalize»Response («method.name.pascalize»Request request, HttpWebResponse webResponse)
        {
            int status = (int) webResponse.StatusCode;
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            «FOR response: method.blocks.filter(typeof(ResponseBlock)) SEPARATOR 'else'»
            if (status == «response.resolveCode» && request.On«response.resolveCode» != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(«response.generateResponseType(method)»));
                «response.generateResponseType(method)» result = («response.generateResponseType(method)») serializer.ReadObject (responseStream);
                request.On«response.resolveCode»(result);
            }
            «ENDFOR»
            else if(request.OnOther != null) 
            {
                request.OnOther(webResponse);
            }
        }       
        «ENDFOR»
    }
    '''
    
}