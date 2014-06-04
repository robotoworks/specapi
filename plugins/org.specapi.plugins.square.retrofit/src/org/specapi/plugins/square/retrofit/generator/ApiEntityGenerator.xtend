package org.specapi.plugins.square.retrofit.generator

import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.UserTypeDeclaration
import com.google.inject.Inject
import org.specapi.SpecApiModelUtils
import java.util.HashSet
import com.google.common.collect.Sets
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.ArrayType

class ApiEntityGenerator {
    
     @Inject extension SpecApiModelUtils modelUtil
    
    var HashSet<String> imports = Sets.newHashSet()
       
    def generate(SpecApiDocument doc, UserTypeDeclaration decl) '''
    package «doc.packageName»;
    
    «val body = generateBody(doc, decl)»
    «imports.generateImports»
    
    «body»
    «imports.clear»
    '''
    
    def dispatch generateBody(SpecApiDocument document, ComplexTypeDeclaration decl) '''
    public class «decl.name» {
        «FOR member:decl.literal.members»
        «if(member.type instanceof ArrayType) {addImport("java.util.List")}»
        public «Generator.toJavaTypeSignature(member.type, false)» «member.name»;
        «ENDFOR»
    }
    
    '''
    def dispatch generateBody(SpecApiDocument document, EnumTypeDeclaration decl) '''
    public class «decl.name» {
       
    }
    '''
    
    def generateImports(HashSet<String> imports) '''
    «FOR _import : imports»
        import «_import»;
    «ENDFOR»
    '''
    
    def void addImport(String str) {
        imports.add(str)
    }
}