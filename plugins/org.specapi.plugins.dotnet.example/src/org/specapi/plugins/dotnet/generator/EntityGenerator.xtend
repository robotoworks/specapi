package org.specapi.plugins.dotnet.generator

import org.specapi.plugins.dotnet.generator.DotNetTypeGenerator
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api
import static extension org.specapi.util.SpecApiStringExtensions.*
import static extension org.specapi.plugins.dotnet.generator.DotNetUtil.*
import org.specapi.specapiLang.UserTypeDeclaration
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.ComplexTypeDeclaration
import com.google.inject.Inject
import org.specapi.SpecApiModelUtils

class EntityGenerator extends DotNetTypeGenerator {
    
    @Inject extension SpecApiModelUtils modelUtil
    
    UserTypeDeclaration userType
    
    override getNamespace() {
        return doc.packageName.pascalizePackageName
    }
    
    def generate(SpecApiDocument doc, Api api, UserTypeDeclaration userType) {
        this.userType = userType;
        super.generate(doc, api)
    }
    
    override generateBody(SpecApiDocument doc, Api api)  '''
    «addImport("System")»
    «addImport("System.Runtime.Serialization")»
    «IF userType instanceof EnumTypeDeclaration»
    «generateEnumType(userType as EnumTypeDeclaration)»
    «ELSE»
    «generateComplexType(userType as ComplexTypeDeclaration)»
    «ENDIF»
    '''
    
    def generateComplexType(ComplexTypeDeclaration declaration) '''
    [DataContract]
    public partial class «userType.name.pascalize»
    {
        «FOR member: declaration.literal.members»
        [DataMember(Name = "«member.name»")]
        public «member.type.dotNetTypeString» «member.name.pascalize» { get; set; }
        «ENDFOR»
    }
    '''
    
    def generateEnumType(EnumTypeDeclaration enumType) '''
    [DataContract]
    public enum «userType.name.pascalize»«IF(enumType.superType != null)»: int«ENDIF»
    {
        «FOR member: enumType.literal.members SEPARATOR ","»
        [DataMember(Name = "«member.name»")]
        «member.name.pascalize»«IF(enumType.superType != null && member.value != null)» = «member.value»«ENDIF»
        «ENDFOR»
    }    
    '''
    
}