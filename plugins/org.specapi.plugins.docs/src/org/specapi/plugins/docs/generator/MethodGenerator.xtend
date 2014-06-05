package org.specapi.plugins.docs.generator

import com.google.inject.Inject
import org.specapi.SpecApiModelUtils
import org.specapi.generator.DocCommentParser
import org.specapi.generator.DocComments
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.BodyBlock
import org.specapi.specapiLang.ComplexTypeLiteral
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.Member
import org.specapi.specapiLang.ResponseBlock
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Type
import org.specapi.specapiLang.UserTypeDeclaration

import static extension org.specapi.util.SpecApiStringExtensions.*
import java.util.List
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.UserType
import org.specapi.specapiLang.IntrinsicType
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.ArrayType

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
    <table class="table">
    <thead>
    <tr>
    <th class="col-sm-3">Parameter</th>
    <th class="col-sm-9">Comments</th>
    </tr>
    </thead>
    <tbody>
    «generateParams(api, model, method, comments)»
    </tbody>
    </table>
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
    <p>«comments?.response?.content»</p>
    <div class="panel-group" id="accordion">
    «var panelIndex=0»
    «FOR response : responses»
    <div class="panel panel-«response.getPanelCssClass»">
    <div class="panel-heading" data-toggle="collapse" data-target="#collapse«panelIndex = panelIndex + 1»">
    <h4 class="panel-title"">«response.responseLine»</h4>
    </div>
    <div id="collapse«panelIndex»" class="panel-collapse collapse">
    <div class="panel-body">
    <pre><code class="javascript">«generateResponse(api, model, response)»</code></pre>
    </div>
    </div>
    </div>
    «ENDFOR»
    </div>
    «ENDIF»
	'''
    
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
	
	def dispatch generateSignature(ComplexTypeLiteral type) '''
    {
        «FOR member:type.members»
        "«member.name»" : «member.generateMemberSignature»
        «ENDFOR»
    }
	'''
	
	def generateMemberSignature(Member member) '''
    «IF member.type instanceof UserType || member.type instanceof ArrayType»
    <a href="#">«member.type.signature»</a>
    «ELSE»
    «member.type.signature»
    «ENDIF»
	'''
	
	def dispatch generateSignature(IntrinsicType type) '''
    <a href="#">«type.signature»</a>
	'''
	
	def dispatch generateSignature(UserType type) {
	    type.declaration.generateUserTypeSignature
	}
	
    
    def dispatch generateSignature(ArrayType type) '''
    
    '''
    
    def dispatch generateUserTypeSignature(ComplexTypeDeclaration type) '''
    {
        «FOR member:type.literal.members»
        "«member.name»" : «member.generateMemberSignature»
        «ENDFOR»       
    }
    '''
    
    def dispatch generateUserTypeSignature(EnumTypeDeclaration type) '''
    
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