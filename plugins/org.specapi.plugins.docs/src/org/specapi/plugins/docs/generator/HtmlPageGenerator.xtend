package org.specapi.plugins.docs.generator

import com.google.inject.Inject
import org.specapi.SpecApiModelUtils
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.ArrayType
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.ComplexTypeLiteral
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.IntrinsicType
import org.specapi.specapiLang.Member
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.UserType
import org.specapi.specapiLang.UserTypeDeclaration

import static org.specapi.specapiLang.HttpMethodType.*

import static extension org.specapi.util.SpecApiStringExtensions.*

abstract class HtmlPageGenerator {
	
    @Property Api api
    @Property SpecApiDocument model
    @Extension @Inject SpecApiModelUtils modelUtil
    
    new (Api api, SpecApiDocument model) {
        this.api = api
        this.model = model
    }
    
    def generate()'''
    <!DOCTYPE html>
    <html lang="en">
    <head>
    «generateHead»
    </head>
    <body>
    «generateTopNav»
    <div class="container-fluid">
    <div class="row row-offcanvas row-offcanvas-left">
    <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar" role="navigation">
    <div class="sidebar-nav">
    «generateSideNav»
    </div>
    </div>
    <div class="col-xs-12 col-sm-9">
    «generateContent»
    </div>
    </div>
    </div>
    «generateFoot»
    </body>
    </html>
    '''
    
    abstract def String generateTitle()

	def generateHead() '''
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>«api.name»</title>
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="specapi.css" rel="stylesheet">
    <link rel="stylesheet" href="highlight/styles/tomorrow.css">
    <script src="highlight/highlight.pack.js"></script>
    <script src="js/json2.js"></script>
	'''
	
	def generateTopNav() '''
    <div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
    <div class="container-fluid">
    <div class="navbar-header">
    <a class="navbar-brand pull-right" href="index.html">«api.name»</a>
    <button type="button" class="navbar-toggle pull-left" data-toggle="offcanvas">
    <span class="sr-only">Toggle navigation</span>
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
    </button>
    </div>
    </div>
    </div>
	'''
	
    def generateSideNav() '''
    <ul class="nav nav-list">
    <li«IF isConfigurePageActive» class="active"«ENDIF»><a href="configure.html"><span class="glyphicon glyphicon-cog inverse"></span> Configure</a></li>
    <li class="nav-header">Methods</li>
    «FOR method : api.blocks.filter(typeof(HttpMethod))»
    <li«IF method.isMethodLinkActive» class="active"«ENDIF»><a href="method_«method.name».html">«method.name.humanize.toTitleCase»</a></li>
    «ENDFOR»
    <li class="nav-header">Entities</li>
    «FOR type : model.declarations.filter(typeof(ComplexTypeDeclaration))»
    <li«IF type.isUserTypeDeclarationActive» class="active"«ENDIF»><a href="«type.toFileName».html">«type.name»</a></li>
    «ENDFOR»
    <li class="nav-header">Enums</li>
    «FOR type : model.declarations.filter(typeof(EnumTypeDeclaration))»
    <li«IF type.isUserTypeDeclarationActive» class="active"«ENDIF»><a href="«type.toFileName».html">«type.name»</a></li>
    «ENDFOR»
    </ul>
    '''
    
    def boolean isConfigurePageActive() {
        return this instanceof ConfigurePageGenerator
    }
    
    abstract def boolean isUserTypeDeclarationActive(UserTypeDeclaration decleration)
    abstract def boolean isMethodLinkActive(HttpMethod method)
    
    abstract def CharSequence generateContent()

    def generateFoot() '''
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.storageapi.min.js"></script>
    <script src="js/specapi.config.js"></script>
    <script src="«api.name.toLowerCase».js"></script>
    <script>
    $(document).ready(function () {
      $('[data-toggle=offcanvas]').click(function () {
        $('.row-offcanvas').toggleClass('active')
      });
    });
    </script>
    <script>
    hljs.configure({tabReplace: '<span class="indent"> </span>'});
    hljs.initHighlightingOnLoad();</script>
    '''	
	
    def getCssLabelClass(HttpMethod method) {
        switch(method.type) {
            case GET:
            "label-info"
            case DELETE:
            "label-danger"
            default:
            "label-warning"
        }
    }

	def toFileName(UserTypeDeclaration type) {
		return type.name
	}
    
    def dispatch generateSignature(ComplexTypeLiteral type) '''
    {
        «FOR member:type.members»
        "«member.name»" : «member.generateMemberSignature»
        «ENDFOR»
    }
    '''
    
    def generateMemberSignature(Member member) '''
    «IF member.type instanceof UserType»
    <a href="«(member.type as UserType).declaration.name».html">«member.type.signature»</a>
    «ELSEIF member.type instanceof ArrayType && (member.type as ArrayType).elementType instanceof UserType»
    <a href="«((member.type as ArrayType).elementType as UserType).declaration.name».html">«member.type.signature»</a>
    «ELSE»
    «member.type.signature»
    «ENDIF»
    '''
    
    def dispatch generateSignature(IntrinsicType type) '''
    «type.signature»
    '''
    
    def dispatch generateSignature(UserType type) {
        type.declaration.generateUserTypeSignature
    }
    
    
    def dispatch generateSignature(ArrayType type) '''
    «IF type.elementType instanceof UserType»
    [
        «(type.elementType as UserType).declaration.generateUserTypeSignature»
    ]
    «ELSE»
    «type.signature»
    «ENDIF»
    '''
    
    def dispatch generateUserTypeSignature(ComplexTypeDeclaration type) '''
    <a href="«type.name».html">«type.name»</a> {
        «FOR member:type.literal.members»
        "«member.name»" : «member.generateMemberSignature»
        «ENDFOR»       
    }
    '''
    
    def dispatch generateUserTypeSignature(EnumTypeDeclaration type) '''
    «type.name» {
        «FOR member : type.literal.members»
        «member.name»
        «ENDFOR»
    }
    '''
}