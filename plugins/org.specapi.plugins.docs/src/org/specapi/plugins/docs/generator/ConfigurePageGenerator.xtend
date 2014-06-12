package org.specapi.plugins.docs.generator

import org.specapi.plugins.docs.generator.HtmlPageGenerator
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.UserTypeDeclaration
import org.specapi.specapiLang.HttpMethod

class ConfigurePageGenerator extends HtmlPageGenerator {
    
    new(Api api, SpecApiDocument model) {
        super(api, model)
    }
    
    override generateTitle() {
        return api.name
    }
    
    override isUserTypeDeclarationActive(UserTypeDeclaration decleration) {
        false
    }
    
    override isMethodLinkActive(HttpMethod method) {
        false
    }
    
    override generateContent() '''
    <form role="form" class="form-configure">
    <div class="form-group form-actions">
    <button type="button" id="btn_save_config" class="btn btn-primary">Save</button>
    <!--<button type="button" id="btn_export_config" class="btn btn-secondary"><span class="glyphicon glyphicon-save"></span> Export</button> -->
    <button type="button" id="btn_add_config" class="btn btn-secondary"><span class="glyphicon glyphicon-plus"></span> Add</button>
    </div>
    </form>
    '''    
    
    override generateFoot() '''
    «super.generateFoot»
    <script>
    $(function() {
      specApiConfig.restore();
    });
    </script>
    '''
}