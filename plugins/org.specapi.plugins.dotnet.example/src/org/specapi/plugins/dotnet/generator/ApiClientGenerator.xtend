package org.specapi.plugins.dotnet.generator

import org.specapi.plugins.dotnet.generator.DotNetTypeGenerator
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api
import static extension org.specapi.util.SpecApiStringExtensions.*
import static extension org.specapi.plugins.dotnet.generator.DotNetUtil.*
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.ResponseBlock

class ApiClientGenerator extends DotNetTypeGenerator {
    
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
        
        «FOR method : api.blocks.filter(typeof(HttpMethod))»
        public void «method.name.pascalize»(«method.name.pascalize»Request request)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "«method.type.literal.toUpperCase»";
                webRequest.UserAgent = "DotNet-«api.name.pascalize»";

                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handle«method.name.pascalize»Response(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handle«method.name.pascalize»Response(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handle«method.name.pascalize»Response («method.name.pascalize»Request request, HttpWebResponse webResponse)
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