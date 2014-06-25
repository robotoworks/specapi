package org.specapi.plugins.dotnet.generator

import org.specapi.plugins.dotnet.generator.DotNetTypeGenerator
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api
import static extension org.specapi.util.SpecApiStringExtensions.*
import static extension org.specapi.plugins.dotnet.generator.DotNetUtil.*
import com.google.inject.Inject
import org.specapi.SpecApiModelUtils
import org.specapi.specapiLang.ComplexTypeLiteral

class EntityForLiteralGenerator extends DotNetTypeGenerator {
    
    @Inject extension SpecApiModelUtils modelUtil
    
    ComplexTypeLiteral literal
    
    String name
    
    
    override getNamespace() {
        return doc.packageName.pascalizePackageName
    }
    
    def generate(SpecApiDocument doc, Api api, String name, ComplexTypeLiteral literal) {
        this.literal = literal
        this.name = name;
        super.generate(doc, api)
    }
    
    override generateBody(SpecApiDocument doc, Api api)  '''
    «addImport("System")»
    «addImport("System.Runtime.Serialization")»
    [DataContract]
    public partial class «name.pascalize»
    {
        «FOR member: literal.members»
        [DataMember(Name = "«member.name»")]
        public «member.type.dotNetTypeString» «member.name.pascalize» { get; set; }
        «ENDFOR»
    }
    '''
}