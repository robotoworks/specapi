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

class ResponseHandlerGenerator extends DotNetTypeGenerator {
    
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
    public partial class «method.name.pascalize»Responder
    {
        «generateResponseDelegates»
        «generateResponseDelegateProperties»
    }
    '''
    
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