package org.specapi.plugins.docs.generator

import org.specapi.plugins.docs.generator.HtmlPageGenerator
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.UserTypeDeclaration
import org.specapi.specapiLang.HttpMethod

class EnumTypeGenerator extends HtmlPageGenerator {
    
    EnumTypeDeclaration type
    
    new(Api api, SpecApiDocument model, EnumTypeDeclaration type) {
        super(api, model)
        this.type = type
    }
    
    override generateTitle() {
        type.name
    }
    
    override isUserTypeDeclarationActive(UserTypeDeclaration declaration) {
        declaration == type
    }
    
    override isMethodLinkActive(HttpMethod method) {
        false
    }
    
    override generateContent() '''
    <h1>«type.name»</h1>
    <pre><code class="javascript">«type.generateUserTypeSignature»</code></pre>
    '''
    
}