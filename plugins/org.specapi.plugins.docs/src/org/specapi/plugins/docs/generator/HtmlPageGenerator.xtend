package org.specapi.plugins.docs.generator

import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.UserTypeDeclaration
import static extension org.specapi.util.SpecApiStringExtensions.*
import org.specapi.specapiLang.SpecApiDocument

abstract class HtmlPageGenerator {
	
    @Property Api api
    @Property SpecApiDocument model
    
    new (Api api, SpecApiDocument model) {
        this.api = api
        this.model = model
    }
    
    def generate()'''
    «generateHead»
    <div class="off-canvas-wrap" data-offcanvas>
      <div class="inner-wrap">
        «generateTopNav»
        «generateSideNav»
        <section class="main-section">
          <div class="row">
            <div class="large-12 columns">
            «generateContent»
            </div>
          </div>
        </section>
        <a class="exit-off-canvas"></a>
      </div>
    </div>
    «generateFoot»
    '''
    
    abstract def String generateTitle()

	def generateHead() '''
    <!DOCTYPE html>
    <!--[if IE 9]><html class="lt-ie10" lang="en" > <![endif]-->
    <html class="no-js" lang="en" >
    
    <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>«generateTitle»</title>
    
      <!-- If you are using CSS version, only link these 2 files, you may add app.css to use for your overrides if you like. -->
      <link rel="stylesheet" href="css/normalize.css">
      <link rel="stylesheet" href="css/foundation.css">
    
      <!-- If you are using the gem version, you need this only -->
      <link rel="stylesheet" href="css/app.css">
    
      <script src="js/vendor/modernizr.js"></script>
    
    </head>
    <body>
	'''
	
	def generateTopNav() '''
    <nav class="tab-bar">
      <section class="left-small">
        <a class="left-off-canvas-toggle menu-icon"><span></span></a>
      </section>

      <section class="middle tab-bar-section">
        <h1 class="title">«api.name»</h1>
      </section>
    </nav>
	'''
	
    def generateSideNav() '''
    <aside class="left-off-canvas-menu show-for-small-only">
      <ul class="off-canvas-list">
        <li><label>Methods</label></li>
        «FOR method : api.blocks.filter(typeof(HttpMethod))»
        <li «IF method.isMethodLinkActive»class="active"«ENDIF»><a href="method_«method.name».html">«method.name.humanize.toTitleCase»</a></li>
        «ENDFOR»
        <li><label>Entities</label></li>
        «FOR type : model.declarations.filter(typeof(ComplexTypeDeclaration))»
        <li «IF type.isUserTypeDeclarationActive»class="active"«ENDIF»><a href="«type.toFileName».html">«type.name»</a></li>
        «ENDFOR»
        <li><label>Enums</label></li>
        «FOR type : model.declarations.filter(typeof(EnumTypeDeclaration))»
        <li «IF type.isUserTypeDeclarationActive»class="active"«ENDIF»><a href="«type.toFileName».html">«type.name»</a></li>
        «ENDFOR»
     </ul>
    </aside>
    '''
    
    abstract def boolean isUserTypeDeclarationActive(UserTypeDeclaration decleration)
    abstract def boolean isMethodLinkActive(HttpMethod method)
    
    abstract def CharSequence generateContent()

    def generateFoot() '''
    <script src="js/vendor/jquery.js"></script>
    <script src="js/foundation.min.js"></script>
    <script>
        $(document).foundation();
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