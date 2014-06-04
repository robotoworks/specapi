package org.specapi.plugins.swagger.generator

import javax.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.specapi.SpecApiModelUtils
import org.specapi.generator.DocCommentParser
import org.specapi.plugins.swagger.Plugin
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.ComplexTypeLiteral
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.ArrayType
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.IntrinsicType
import org.specapi.specapiLang.Member
import org.specapi.specapiLang.Type
import org.specapi.specapiLang.UserType
import org.specapi.specapiLang.UserTypeDeclaration

import static extension org.specapi.util.SpecApiStringExtensions.*
import org.specapi.specapiLang.SpecApiDocument

class Generator implements IGenerator {
    
    @Inject DocCommentParser commentParser
    @Inject extension SpecApiModelUtils model
    
    override doGenerate(Resource input, IFileSystemAccess fsa) {
        
        val model = input.contents.head as SpecApiDocument
        val api = model.declarations.filter(typeof(Api)).head
        
        if(api != null) {
            
            fsa.generateFile("src/main/webapp/index.html", Plugin::OUTPUT_CONFIG,
                generateIndex(api)
            )
        
            // Generate Swagger Resource Listing
            fsa.generateFile("src/main/webapp/api-docs", Plugin::OUTPUT_CONFIG, 
                generateResourceListing(api, model)
            )
            
            api.getResourcePaths.forEach[path|
                var group = api.blocks
                    .filter(typeof(HttpMethod))
                    .filter[m|m.pathAsString.startsWith(path)]
                    
                fsa.generateFile("src/main/webapp" + path, Plugin::OUTPUT_CONFIG, 
                    api.generateOperationListing(model, group, path))
            ]
            
        }
        
      //  fsa.generateFile("hello.txt", Plugin::OUTPUT_CONFIG, "hi")
    }
    
    def generateResourceListing(Api api, SpecApiDocument model) '''
    «var docs = commentParser.parseDocComments(api, #{"@swaglist"->1})»
    {
      "swaggerVersion": "1.2",
      "apis": [
      «FOR path : api.resourcePaths SEPARATOR ","»
        {
          "path": "http://localhost:8000«path»",
          "description": "«docs?.getTagByArgument("@swaglist", 0, path)?.content»"
        }
      «ENDFOR»
      ]
    }
    '''
    
    def generateOperationListing(Api api, SpecApiDocument model, Iterable<HttpMethod> methods, String path) '''
    {
      "swaggerVersion": "1.2",
      "basePath": "«api.baseUrl»",
      "apis": [
        «FOR method : methods SEPARATOR ","»
        {
          «var comments = commentParser.parseDocComments(method)»
          "path": "«method.getPathAsFormatString("{", "}")»",
          "operations": [
            {
              "method": "«method.type.getName»",
              "summary": "«comments?.content»",
              "type": "«method.swaggerResponseTypeName»",
              "nickname": "«method.name»",
              "parameters": [
                «FOR param : method.path.params SEPARATOR ","»
                {
                  "name": "«param.name»",
                  "description": "«comments?.params.get(param.name)?.content»",
                  "required": true,
                  "type": "«param.type.boxedTypeSignature.toLowerCase»",
                  "paramType": "path"
                }
                «ENDFOR»
                «IF method.paramsBlock != null»
                «IF method.path.params.size > 0»,«ENDIF»
                «FOR param : method.paramsBlock.params SEPARATOR ","»
                {
                  "name": "«param.name»",
                  "description": "«comments?.params.get(param.name)?.content»",
                  "required": false,
                  "type": "«param.type.boxedTypeSignature.toLowerCase»",
                  "paramType": "query"
                }
                «ENDFOR»
                «ENDIF»
                «IF method.body != null»
                «IF method.path.params.size > 0 || 
                (method.paramsBlock != null && method.paramsBlock.params.length > 0)»,«ENDIF»
                {
                  "name": "body",
                  "paramType": "body",
                  "type": "«method.getSwaggerBodyTypeName»",
                  "required": true
                }
                «ENDIF»
              ]
            }
          ]
        }
        «ENDFOR»
      ],
      "models": {
          «methods.generateModelForMethodResponseLiterals»«IF methods.hasComplexTypeLiteralResponses && model.hasUserTypes»,«ENDIF»
          «model.generateModelForEntities»«IF model.hasUserTypes && methods.hasComplexTypeLiteralBodies»,«ENDIF»
          «methods.generateModelForMethodBodyLiterals»
          
      }
    }
    '''
    
    def boolean hasComplexTypeLiteralResponses(Iterable<HttpMethod> methods) {
        return methods.exists[it.responseBlock != null && it.responseBlock.type instanceof ComplexTypeLiteral]
    }
    
    def boolean hasComplexTypeLiteralBodies(Iterable<HttpMethod> methods) {
        return methods.exists[it.body != null && it.body.type instanceof ComplexTypeLiteral]
    }
    
    def boolean hasUserTypes(SpecApiDocument model) {
        return model.declarations.exists[it instanceof UserTypeDeclaration]
    }
    
    
    def generateIndex(Api api) '''
    <!DOCTYPE html>
    <html>
    <head>
      <title>Swagger UI</title>
      <link href='https://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'/>
      <link href='css/reset.css' media='screen' rel='stylesheet' type='text/css'/>
      <link href='css/screen.css' media='screen' rel='stylesheet' type='text/css'/>
      <script type="text/javascript" src="lib/shred.bundle.js"></script>
      <script src='lib/jquery-1.8.0.min.js' type='text/javascript'></script>
      <script src='lib/jquery.slideto.min.js' type='text/javascript'></script>
      <script src='lib/jquery.wiggle.min.js' type='text/javascript'></script>
      <script src='lib/jquery.ba-bbq.min.js' type='text/javascript'></script>
      <script src='lib/handlebars-1.0.0.js' type='text/javascript'></script>
      <script src='lib/underscore-min.js' type='text/javascript'></script>
      <script src='lib/backbone-min.js' type='text/javascript'></script>
      <script src='lib/swagger.js' type='text/javascript'></script>
      <script src='swagger-ui.js' type='text/javascript'></script>
      <script src='lib/highlight.7.3.pack.js' type='text/javascript'></script>
    
      <!-- enabling this will enable oauth2 implicit scope support -->
      <script src='lib/swagger-oauth.js' type='text/javascript'></script>
      <script type="text/javascript">
        $(function () {
          window.swaggerUi = new SwaggerUi({
          url: "http://localhost:8000/api-docs",
          supportedSubmitMethods: ['get', 'post', 'put', 'delete'],
          supportHeaderParams:false,
          dom_id: "swagger-ui-container",
          onComplete: function(swaggerApi, swaggerUi){
            if(console) {
              console.log("Loaded SwaggerUI")
            }
            $('pre code').each(function(i, e) {hljs.highlightBlock(e)});
          },
          onFailure: function(data) {
            if(console) {
              console.log("Unable to Load SwaggerUI");
              console.log(data);
            }
          },
          docExpansion: "none",
          booleanValues: new Array(0,1)
        });
    
        
        $('#input_apiKey').change(function() {
          var key = $('#input_apiKey')[0].value;
          console.log("key: " + key);
          if(key && key.trim() != "") {
            console.log("added key " + key);
            window.authorizations.add("key", new ApiKeyAuthorization("access_token", key, "query"));
          }
        })
        
        window.swaggerUi.load();
      });
      
    «IF api.headerBlock != null»
    «FOR header : api.headerBlock.headers.filter[it.defaultValue != null]»
    window.authorizations.add("«header.name»", new ApiKeyAuthorization("«header.name»", "«header.defaultValue»", "header"));
    «ENDFOR»
    «ENDIF»
      
      </script>
    </head>
    
    <body class="swagger-section">
    <div id='header'>
      <div class="swagger-ui-wrap">
        <a id="logo" href="http://swagger.wordnik.com">swagger</a>
        <form id='api_selector'>
          <div class='input icon-btn'>
            <img id="show-pet-store-icon" src="images/pet_store_api.png" title="Show Swagger Petstore Example Apis">
          </div>
          <div class='input icon-btn'>
            <img id="show-wordnik-dev-icon" src="images/wordnik_api.png" title="Show Wordnik Developer Apis">
          </div>
          <div class='input'><input placeholder="http://example.com/api" id="input_baseUrl" name="baseUrl" type="text"/></div>
          <div class='input'><input placeholder="api_key" id="input_apiKey" name="apiKey" type="text"/></div>
          <div class='input'><a id="explore" href="#">Explore</a></div>
        </form>
      </div>
    </div>
    <div id="message-bar" class="swagger-ui-wrap">&nbsp;</div>
    <div id="swagger-ui-container" class="swagger-ui-wrap"></div>
    </body>
    </html>
    '''
    
    def String getSwaggerResponseTypeName(HttpMethod method) {
        var response = method.responseBlock
        
        if(response == null) {
            return "void"
        } else {
            var type = response.type
            
            if(type instanceof ComplexTypeLiteral) {
                return method.name.pascalize + "Response"
            } else {
                return (type as Type).signature
            }
        }
    }
    
    def String getSwaggerBodyTypeName(HttpMethod method) {
        var body = method.body
        
        if(body == null) {
            return "void"
        } else {
            var type = body.type
            
            if(type instanceof ComplexTypeLiteral) {
                return method.name.pascalize + "Body"
            } else {
                return (type as Type).signature
            }
        }
    }
    
    def generateModelForMethodResponseLiterals(Iterable<HttpMethod> methods) '''
    «FOR method : methods.filter[it.responseBlock != null && it.responseBlock.type instanceof ComplexTypeLiteral] SEPARATOR ","»
        «var type = method.responseBlock.type as ComplexTypeLiteral»
        "«method.swaggerResponseTypeName»": {
            "id": "«method.swaggerResponseTypeName»",
            "properties": {
                «FOR mem : type.members SEPARATOR ","»
                «mem.generateSwaggerModelMember»
                «ENDFOR»
            }
        }
    «ENDFOR»
    '''
    
    def generateModelForMethodBodyLiterals(Iterable<HttpMethod> methods) '''
    «FOR method : methods.filter[it.body != null && it.body.type instanceof ComplexTypeLiteral] SEPARATOR ","»
        «var type = method.body.type as ComplexTypeLiteral»
        "«method.getSwaggerBodyTypeName»": {
            "id": "«method.getSwaggerBodyTypeName»",
            "properties": {
                «FOR mem : type.members SEPARATOR ","»
                «mem.generateSwaggerModelMember»
                «ENDFOR»
            }
        }
    «ENDFOR»
    '''
    
    def generateModelForEntities(SpecApiDocument model) '''
    «FOR entity : model.declarations.filter(typeof(ComplexTypeDeclaration)) SEPARATOR ","»
        "«entity.name»": {
            "id": "«entity.name»",
            "properties": {
                «FOR mem : entity.literal.members SEPARATOR ","»
                «mem.generateSwaggerModelMember»
                «ENDFOR»
            }
        }
    «ENDFOR»
    '''
    
    def generateSwaggerModelMember(Member member) {
        generateSwaggerModelMemberForType(member.type, member)
    }
    
    def dispatch generateSwaggerModelMemberForType(IntrinsicType type, Member member) '''
        "«member.name»": {
            "type": "«member.type.signature»"
        }
    '''

    def dispatch generateSwaggerModelMemberForType(ArrayType type, Member member) '''
        "«member.name»": {
            "type": "array",
            "items": {
                «IF type.elementType instanceof IntrinsicType»
                "type": "«type.signature»"
                «ELSE»
                "$ref": "«type.innerSignature»"
                «ENDIF»
            }
        }
    '''

    def dispatch generateSwaggerModelMemberForType(UserType type, Member member) {
        generateSwaggerModelMemberForUserType(type.declaration, member)
    }
    
    
    def dispatch generateSwaggerModelMemberForUserType(ComplexTypeDeclaration type, Member member) '''
        "«member.name»": {
            "$ref": "«member.type.signature»"
        }    
    '''
    
    def dispatch generateSwaggerModelMemberForUserType(EnumTypeDeclaration type, Member member) '''
        "«member.name»": {
            "type": "string",
            "enum": [
                «FOR mem : type.literal.members SEPARATOR ","»
                "«mem.name»"
                «ENDFOR»
            ]
        }
    '''
    
    def getResourcePaths(Api api) {
        return api.blocks
            .filter(typeof(HttpMethod))
            .toMap["/" + it.pathAsString.split("/").get(1)]
            .keySet
    }   
}