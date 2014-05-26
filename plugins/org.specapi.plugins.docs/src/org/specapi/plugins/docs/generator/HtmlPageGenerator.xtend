package org.specapi.plugins.docs.generator

import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.Model
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.UserTypeDeclaration
import static extension org.specapi.util.SpecApiStringExtensions.*
abstract class HtmlPageGenerator {
	
    @Property Api api
    @Property Model model
    
    new (Api api, Model model) {
        this.api = api
        this.model = model
    }
    
    def generate()'''
    «generateHead»
    «generateTopNav»
    <div class="container-fluid">
      <div class="row-fluid">
        <div class="span3">
    «generateSideNav»
        </div><!--/span-->
        <div class="span9">
    «generateContent»
        </div><!--/span-->
      </div><!--/row-->
    
      <hr>
    
      <footer>
        <p>&copy; Company 2013</p>
      </footer>
    
    </div><!--/.fluid-container-->
    «generateFoot»
    '''
    
    abstract def String generateTitle()

	def generateHead() '''

    <!DOCTYPE html>
    <html lang="en">
    <head>
    	<meta charset="utf-8">
    	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
    	
    	<title>«generateTitle»</title>
    	
    	<link href="css/bootstrap.min.css" rel="stylesheet">
    	<link href="specapi.css" rel="stylesheet">
    	<style type="text/css">
    	body {
    	    padding-top: 60px;
    	    padding-bottom: 40px;
    	}
    	
    	.sidebar-nav {
    	    padding: 9px 0;
    	}
    	
        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
            float: none;
            padding-left: 5px;
            padding-right: 5px;
            }
        }
        .prettyprint ol.linenums > li { list-style-type: decimal; }
    	</style>
    	<link href="css/bootstrap.responsive.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="prettify/prettify.css" />
    </head>
    <body>
	'''
	
	def generateTopNav() '''
        <div class="navbar navbar-inverse navbar-fixed-top">
          <div class="navbar-inner">
            <div class="container-fluid">
              <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </button>
              <a class="brand" href="index.html">«api.name»</a>
              <div class="nav-collapse collapse">
                <p class="navbar-text pull-right">
                </p>
                <ul class="nav">
                </ul>
              </div><!--/.nav-collapse -->
            </div>
          </div>
        </div>
	'''
	
    def generateSideNav() '''
          <div class="well sidebar">
            <ul class="nav nav-list">
              <li class="nav-header">Methods</li>
              «FOR method : api.blocks.filter(typeof(HttpMethod))»
              <li «IF method.isMethodLinkActive»class="active"«ENDIF»><a href="method_«method.name».html">«method.name.humanize.toTitleCase»</a></li>
              «ENDFOR»
              <li class="nav-header">Entities</li>
              «FOR type : model.declarations.filter(typeof(ComplexTypeDeclaration))»
              <li «IF type.isUserTypeDeclarationActive»class="active"«ENDIF»><a href="«type.toFileName».html">«type.name»</a></li>
              «ENDFOR»
              <li class="nav-header">Enums</li>
              «FOR type : model.declarations.filter(typeof(EnumTypeDeclaration))»
              <li «IF type.isUserTypeDeclarationActive»class="active"«ENDIF»><a href="«type.toFileName».html">«type.name»</a></li>
              «ENDFOR»
            </ul>
          </div><!--/.well -->
    '''
    
    abstract def boolean isUserTypeDeclarationActive(UserTypeDeclaration decleration)
    abstract def boolean isMethodLinkActive(HttpMethod method)
    
    abstract def CharSequence generateContent()

    def generateFoot() '''
        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="prettify/prettify.js"></script>
        <script type="text/javascript">
            
        (function(jQuery){
            
          jQuery( document ).ready( function() {
                
            prettyPrint();
                
          } );
         
        }(jQuery))
            
        </script>
    </body>
    </html>
    '''	
    
	def toFileName(UserTypeDeclaration type) {
		return type.name
	}
	
    def getCssLabelClass(HttpMethod method) {
        switch(method.type) {
            case GET:
            "label-info"
            case DELETE:
            "label-important"
            default:
            "label-warning"
        }
    }
}