package org.specapi.plugins.jquery.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api
import static extension org.specapi.util.SpecApiStringExtensions.*
import org.specapi.plugins.jquery.Plugin
import org.specapi.specapiLang.HttpMethod
import com.google.inject.Inject
import org.specapi.SpecApiModelUtils
import java.util.ArrayList

class Generator implements IGenerator {
    
    @Extension @Inject SpecApiModelUtils modelUtil  
     
    override doGenerate(Resource input, IFileSystemAccess fsa) {
        
        val doc = input.contents.head as SpecApiDocument
        val api = doc.declarations.filter(typeof(Api)).head
        
        fsa.generateFile(api.name.toLowerCase + ".js", Plugin::OUTPUT_CONFIG, api.generate(doc));
    }
    
    def CharSequence generate(Api api, SpecApiDocument document) '''
    if (typeof jQuery === 'undefined') { throw new Error('«api.name» requires jQuery') }
    
    +function (window, $) {
        'use strict';
        
        var client = window.«api.name» = function (options) {
            this.options = $.extend({}, «api.name».DEFAULTS, options)
        }
        
        «api.name».DEFAULTS = {
            baseUrl: '«api.baseUrl»'
        }
        
        «FOR method:api.blocks.filter(typeof(HttpMethod))»
        client.prototype.«method.name» = function(«method.generateMethodArgs») {
            var opts = $.extend(true, {query:{}}, options)
            var query = $.param(opts.query);
            var path = "«method.pathAsString»";
            «FOR param:method.path.params»
            path = path.replace(/\:«param.name»/, «param.name»);
            «ENDFOR»
            var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
            
            return $.ajax(url, {
                type:"«method.type.literal.toUpperCase»"
                «IF method.hasBody»
                ,contentType:"application/json"
                ,data:data
                «ENDIF»
            });
        }

        «ENDFOR»
    
    }(window, jQuery);
    '''
    
    def getGenerateMethodArgs(HttpMethod method) {
        var args = new ArrayList<String>
        
        for(arg : method.path.params) {
            args.add(arg.name)
        }
        
        if(method.hasBody) {
            args.add("data")
        }
        
        args.add("options")
        
        return args.join(", ")
    }
    
}