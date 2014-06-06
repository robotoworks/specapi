package org.specapi.plugins.docs.generator

import com.google.inject.Inject
import java.util.List
import org.specapi.SpecApiModelUtils
import org.specapi.generator.DocCommentParser
import org.specapi.generator.DocComments
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.BodyBlock
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.ResponseBlock
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.UserTypeDeclaration

import static extension org.specapi.util.SpecApiStringExtensions.*

class MethodGenerator extends HtmlPageGenerator {
	
	@Extension @Inject SpecApiModelUtils modelUtil
    @Inject DocCommentParser commentParser
    
    @Property HttpMethod method
    
    @Property DocComments comments
    
    @Property List<ResponseBlock> responses
    
    @Property BodyBlock body
    
    new(Api api, SpecApiDocument model, HttpMethod method) {
        super(api, model)
        this.method = method
    }
    
	override generate() {
        this.responses = method.responseBlocks
        this.body = method.body
		super.generate()
	}
    
    override generateTitle() {
        return api.name + " " + modelUtil.getPathAsString(method)
    }
    
    override isMethodLinkActive(HttpMethod method) {
        return this.method.equals(method)
    }
    
    override generateContent() {
        this.comments = commentParser.parseDocComments(method)
    	return doGenerate()
    }
    
    def doGenerate() '''
    <h1>«method.name.humanize.toTitleCase»</h1>
    <p><span class="label «method.cssLabelClass»">«method.type.literal.toUpperCase»</span> <b>«api.baseUrl + method.pathAsString»</b></p>
    <p>«comments?.content»</p>
    «IF hasParams»
    <div class="panel panel-default">
    <div class="panel-heading" data-toggle="collapse" data-target="#collapseParams">
    <h4 class="panel-title"">Parameters</h4>
    </div>
    <div id="collapseParams" class="panel-collapse collapse in">
    <table class="table">
    <thead>
    <tr>
    <th class="col-sm-3">Name</th>
    <th class="col-sm-9">Comments</th>
    </tr>
    </thead>
    <tbody>
    «generateParams(api, model, method, comments)»
    </tbody>
    </table>
    </div>
    </div>
    «ENDIF»
    «IF body != null»
    <p>«comments?.body?.content»</p>
    <div class="panel panel-default">
    <div class="panel-heading" data-toggle="collapse" data-target="#collapseRequestBody">
    <h4 class="panel-title"">Request</h4>
    </div>
    <div id="collapseRequestBody" class="panel-collapse collapse">
    <div class="panel-body">
    <pre><code class="javascript">«generateBody(api, model, body)»</code></pre>
    </div>
    </div>
    </div>
    «ENDIF»
    «IF responses.size > 0»
    <div class="panel-group" id="accordion">
    «FOR response : responses»
    <div class="panel panel-«response.getPanelCssClass»">
    <div class="panel-heading" data-toggle="collapse" data-target="#collapseResponse«response.code»">
    <h4 class="panel-title"">«response.responseLine»</h4>
    </div>
    <div id="collapseResponse«response.code»" class="panel-collapse collapse">
    «IF (response.code == 0 || response.code == 200) && commentsHaveContentForResponse(comments)»
    <div class="panel-body-heading">«comments?.response?.content»</div>
    «ENDIF»
    <div class="panel-body">
    <pre><code class="javascript">«generateResponse(api, model, response)»</code></pre>
    </div>
    </div>
    </div>
    «ENDFOR»
    </div>
    «ENDIF»
	'''
    
    def commentsHaveContentForResponse(DocComments comments) {
        return comments != null && 
        comments.response != null &&
        comments.response.content != null &&
        comments.response.content.length > 0
    }
    
    def getPanelCssClass(ResponseBlock block) {
        switch(block.code) {
            case 0:"success"
            case 200:"success"
            case block.code>=400 && block.code <=500: "danger"
            default:"default"
        }
    }

    def generateBody(Api api, SpecApiDocument model, BodyBlock body) '''
    «body.type.generateSignature»
    '''
    
    	
	def generateResponse(Api api, SpecApiDocument model, ResponseBlock response) '''
    «response.type.generateSignature»
	'''
	
	def generateParams(Api api, SpecApiDocument model, HttpMethod method, DocComments comments) '''
	«FOR p:method.path?.params»
	<tr>
	<td>«p.name»</td>
	<td>«comments?.params?.get(p.name)?.content»</td>
	</tr>
	«ENDFOR»
	«IF method.paramsBlock != null»
	«FOR p:method.paramsBlock?.params»
	<tr>
	<td>«p.name»</td>
	<td>«comments?.params?.get(p.name)?.content»</td>
	</tr>
	«ENDFOR»
	«ENDIF»
	'''
    
    override isUserTypeDeclarationActive(UserTypeDeclaration decleration) {
        return false
    }
    
    def hasParams() {
        var pathParams = method.path?.params
        var urlParams = method.paramsBlock?.params
        
        return 
            ((pathParams != null && pathParams.length > 0) || 
            (urlParams != null && urlParams.length > 0)
        )
    }
    
}