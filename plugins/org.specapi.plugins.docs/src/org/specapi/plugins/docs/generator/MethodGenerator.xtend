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
    
    @Inject JsonGenerator jsonGenerator
    
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
    <div id="testConsole" class="console container-fluid collapse">
    <div id="consoleHeading" class="clearfix">
    <button type="button" class="close" data-toggle="collapse" data-target="#testConsole">&times;</button>
    <p class="pull-left"><span class="label «method.cssLabelClass»">«method.type.literal.toUpperCase»</span> <b>«api.baseUrl + method.pathAsString»</b></p>
    </div>
    <form role="form">
    «IF hasParams»
    «generateParamFormFields(api, model, method, comments)»
    «ENDIF»
    «IF body != null»
    <div class="form-group">
    <label for="f_request">Request</label>
    <pre id="f_request" class="container-fluid">«jsonGenerator.generateForBodyBlock(body, 3)»</pre>
    </div>
    «ENDIF»
    <div class="form-group">
    <label for="f_response pull-left">Response</label> [<a id="clearResponseButton" href="javascript:void()">clear</a>] <label id="response_status"></label>
    <pre id="f_response" class="container-fluid clearfix"></pre>
    </div>
    <div class="form-group">
    <button type="button" id="go_button" data-loading-text="Loading..." class="btn btn-primary">
      Go
    </button>
    </div>
    </form>
    </div>
    <div class="content-heading clearfix">
    <button id="console_button" type="button" class="btn btn-secondary pull-right btn-pull-down-handle" data-toggle="collapse" data-target="#testConsole">
      API Console
    </button>
    <h1 class="pull-left">«method.name.humanize.toTitleCase»</h1>
    </div>
    <p><span class="label «method.cssLabelClass»">«method.type.literal.toUpperCase»</span> <b>«api.baseUrl + method.pathAsString»</b></p>
    <p>«comments?.content»</p>
    «IF hasParams»
    <div class="panel panel-default">
    <div class="panel-heading" data-toggle="collapse" data-target="#params">
    <h4 class="panel-title"">Parameters</h4>
    </div>
    <div id="params" class="panel-collapse collapse in">
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
    <div class="panel-heading" data-toggle="collapse" data-target="#requestBody">
    <h4 class="panel-title"">Request</h4>
    </div>
    <div id="requestBody" class="panel-collapse collapse">
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
    <div class="panel-heading" data-toggle="collapse" data-target="#response«response.code»">
    <h4 class="panel-title"">«response.responseLine»</h4>
    </div>
    <div id="response«response.code»" class="panel-collapse collapse">
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
	
    override generateFoot() '''
    «super.generateFoot()»
    <script src="ace/ace.js" type="text/javascript" charset="utf-8"></script>
    <script>
    «IF body != null»
        var requestEditor = ace.edit("f_request");
        requestEditor.setTheme("ace/theme/twilight");
        requestEditor.setOptions({ maxLines: Infinity });
        requestEditor.getSession().setMode("ace/mode/javascript");
    «ENDIF»
        var responseEditor = ace.edit("f_response");
        responseEditor.setTheme("ace/theme/twilight");
        responseEditor.setOptions({ maxLines: Infinity });
        responseEditor.getSession().setMode("ace/mode/javascript");
        responseEditor.getSession().setUseWorker(false);
        
        var responseStatusLabel = $("#response_status");

      $('#go_button').click(function () {
        var btn = $(this);
        var baseUrl = "«api.baseUrl»";
        var url = baseUrl + "«method.pathAsString»";
        var params = {};
        var paramsSet = false;
        «FOR p:method.path?.params»
        url = url.replace(/\:«p.name»/, $('#f_param_«p.name»').val());
        «ENDFOR»

        «IF hasQueryParams»
        «FOR p:method.paramsBlock.params»
        if($('#f_param_«p.name»').val()) {
            paramsSet = true;
            params["«p.name»"] = $('#f_param_«p.name»').val()
        }
        «ENDFOR»
        
        if(paramsSet) {
            url  = url + "?" + $.param(params);
        }
        «ENDIF»
             
        console.log(url);

        btn.button('loading');
        $.ajax(url)
        .done(function(data, textStatus, jqXHR ) {
          btn.button('reset');
          responseStatusLabel.text(jqXHR.status + " " + jqXHR.statusText);
          responseStatusLabel.css("color", "green");
          responseEditor.getSession().setValue(jqXHR.responseText);
        })
        .fail(function(jqXHR, textStatus, errorThrown ) {
          btn.button('reset');
          if(jqXHR.status == 0 ) {
            responseStatusLabel.text("No Connection");
          } else {
            responseStatusLabel.text(jqXHR.status + " " + jqXHR.statusText);
          }
          responseStatusLabel.css("color", "red");
          responseEditor.getSession().setValue(jqXHR.responseText);
        });
      });
      
      $('#clearResponseButton').on('click', function (e) {
        responseEditor.getSession().setValue("");
        responseStatusLabel.text("");
      });
    </script>
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
	«IF hasQueryParams»
	«FOR p:method.paramsBlock.params»
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
    
    def hasQueryParams() {
        var urlParams = method.paramsBlock?.params
        
        return (urlParams != null && urlParams.length > 0)
    }
    
    def hasPathParams() {
        var pathParams = method.path?.params
        
        return (pathParams != null && pathParams.length > 0)
    }
    
    def generateParamFormFields(Api api, SpecApiDocument model, HttpMethod method, DocComments comments) '''
    «FOR p:method.path?.params»
    <div class="form-group">
    <label for="f_param_«p.name»">«p.name»</label>
    <input type="text" class="form-control" id="f_param_«p.name»" placeholder="">
    <p class="help-block">«comments?.params?.get(p.name)?.content»</p>
    </div>
    «ENDFOR»
    «IF method.paramsBlock != null»
    «FOR p:method.paramsBlock?.params»
    <div class="form-group">
    <label for="f_param_«p.name»">«p.name»</label>
    <input type="text" class="form-control" id="f_param_«p.name»" placeholder="">
    <p class="help-block">«comments?.params?.get(p.name)?.content»</p>
    </div>
    «ENDFOR»
    «ENDIF»
    '''
    
}