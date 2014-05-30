package org.specapi.plugins.docs.generator

import com.google.inject.Inject
import org.specapi.ModelUtil
import org.specapi.generator.DocCommentParser
import org.specapi.generator.DocComments
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.BodyBlock
import org.specapi.specapiLang.ComplexTypeLiteral
import org.specapi.specapiLang.ArrayType
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.Member
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.ResponseBlock
import org.specapi.specapiLang.Type
import org.specapi.specapiLang.UserTypeDeclaration

import static extension org.specapi.util.SpecApiStringExtensions.*

class MethodGenerator extends HtmlPageGenerator {
	
	@Extension @Inject ModelUtil modelUtil
    @Inject DocCommentParser commentParser
    
    @Property HttpMethod method
    
    @Property DocComments comments
    
    @Property ResponseBlock response
    
    @Property BodyBlock body
    
    new(Api api, SpecApiDocument model, HttpMethod method) {
        super(api, model)
        this.method = method
    }
    
	override generate() {
        this.response = method.responseBlock
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
    <h2>«method.name.humanize.toTitleCase»</h2>
    <p><span class="label «method.cssLabelClass»">«method.type.literal.toUpperCase»</span> <b>«modelUtil.getPathAsString(method)»</b></p>
    <p>«comments?.content»</p>
    <p><b>Resource URL</b><p>
    <p>«api.baseUrl + method.pathAsString»</p>
    «IF hasParams»
    <div class="table-responsive">
      <table class="table table-striped">
        <thead>
          <tr>
            <th>Parameter</th>
            <th>Comments</th>
          </tr>
        </thead>
        <tbody>
        «generateParams(api, model, method, comments)»
        </tbody>
      </table>
    </div>
    «ENDIF»
    «IF response != null»
    <h3>Response</h3>
    <p>«comments?.response?.content»</p>
    <h4>Signature</h4>
    <pre class="prettyprint lang-js">
«generateResponse(api, model, response)»
    </pre>
    «ENDIF»
    «IF body != null»
    <h3>Body</h3>
    <h4>Signature</h4>
    <p>«comments?.body?.content»</p>
    <pre class="prettyprint lang-js">
«generateBody(api, model, body)»
    </pre>
    «ENDIF»
	'''

    def generateBody(Api api, SpecApiDocument model, BodyBlock body) '''
    «body.type.generateResponse»
    '''
    
    	
	def generateResponse(Api api, SpecApiDocument model, ResponseBlock response) '''
    «response.type.generateResponse»
	'''
	
	def dispatch generateResponse(ComplexTypeLiteral type) '''
	{
     «FOR member:type.members»
     "«member.name»" : «member.generateResponseMember»
     «ENDFOR»
	}
	'''
	
	def generateResponseMember(Member member) '''
    <a href="#">«member.type.innerSignature»</a>«IF member.type instanceof ArrayType»[]«ENDIF»
	'''
	
	def dispatch generateResponse(Type type) '''
    <a href="#">«type.signature»</a>
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