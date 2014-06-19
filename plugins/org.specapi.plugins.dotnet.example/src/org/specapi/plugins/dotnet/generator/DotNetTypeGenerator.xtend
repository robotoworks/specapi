package org.specapi.plugins.dotnet.generator

import org.specapi.SpecApiModelUtils
import com.google.inject.Inject
import java.util.HashSet
import com.google.common.collect.Sets
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api

abstract class DotNetTypeGenerator {
    @Inject extension SpecApiModelUtils modelUtil
     
    var HashSet<String> imports = Sets.newHashSet()
    
    public SpecApiDocument doc
    public Api api
     
    def generate(SpecApiDocument doc, Api api) {
        this.doc = doc;
        this.api = api
        return doGenerate();
    }
    
    def protected doGenerate() '''    
    «val body = generateBody(doc, api)»
    «imports.generateImports»
    namespace «getNamespace»
    {
        «body»
    }
    '''
    
    def abstract String getNamespace()
    
    def abstract String generateBody(SpecApiDocument doc, Api api)

    def generateImports(HashSet<String> imports) '''
    «FOR _import : imports»
    using «_import»;
    «ENDFOR»
    '''
    
    def void addImport(String str) {
        imports.add(str)
    }
     
}