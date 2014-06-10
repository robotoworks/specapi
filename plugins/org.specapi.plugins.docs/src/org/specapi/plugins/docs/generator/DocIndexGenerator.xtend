package org.specapi.plugins.docs.generator

import com.google.inject.Inject
import org.specapi.SpecApiModelUtils
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.UserTypeDeclaration
import org.specapi.generator.DocCommentParser

class DocIndexGenerator extends HtmlPageGenerator {
	@Inject extension SpecApiModelUtils modelUtil
    @Inject DocCommentParser commentParser
    
    new(Api api, SpecApiDocument model) {
        super(api, model)
    }
    
    override generateTitle() {
        return api.name
    }
    
    override generateContent() '''
    «var serviceComments = commentParser.parseDocComments(api)»
    <p>«serviceComments?.content»</p>
    <div class="page-header">
    <h1>Resources</h1>
    </div>          
    <div class="table-responsive">
    <table class="table">
    <thead>
    <tr>
    <th class="col-sm-4">Resource</th>
    <th class="col-sm-6">Comments</th>
    </tr>
    </thead>
    <tbody>
    «generateMethods(api, model)»
    </tbody>
    </table>
    </div>
    '''
	
	def generateMethods(Api api, SpecApiDocument model) '''
	«FOR method:api.blocks.filter(typeof(HttpMethod))»
	<tr>
	<td><span class="label «method.cssLabelClass»">«method.type.literal.toUpperCase»</span> <a href="method_«method.name».html">«method.pathAsString»</a></td>
	«var comments = commentParser.parseDocComments(method)»
	<td>«comments?.content»</td>
	</tr>
	«ENDFOR»
	'''
    
    override isMethodLinkActive(HttpMethod method) {
        return false
    }
    
    override isUserTypeDeclarationActive(UserTypeDeclaration decleration) {
        return false
    }
    
}