package org.specapi.plugins.docs.generator

import org.specapi.specapiLang.ComplexTypeLiteral
import org.specapi.specapiLang.Type
import org.specapi.specapiLang.Member
import org.specapi.specapiLang.UserType
import org.specapi.specapiLang.ArrayType
import org.specapi.SpecApiModelUtils
import com.google.inject.Inject
import org.specapi.specapiLang.IntrinsicType
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.BodyBlock

class JsonGenerator {
    
    @Extension @Inject SpecApiModelUtils modelUtil
    
    int recurseCount
    int recursions
    
    def generateForBodyBlock(BodyBlock block, int recurseCount) {
        this.recurseCount = recurseCount
        this.recursions = 0
        
        if(block.type instanceof Type) {
            generate(block.type as Type)
        } else {
            generate(block.type as ComplexTypeLiteral)
        }
    }
    def dispatch generate(ComplexTypeLiteral type) '''
    {
      «FOR member:type.members SEPARATOR ", "»
      "«member.name»" : «member.type.generate»
      «ENDFOR»
    }
    '''
    
    def dispatch generate(IntrinsicType type) '''
    "«type.signature»"
    '''
    
    def dispatch generate(UserType type) {
        type.declaration.generate
    }
    
    
    def dispatch generate(ArrayType type) '''
    «IF type.elementType instanceof UserType»
    [
      «(type.elementType as UserType).declaration.generate»
    ]
    «ELSE»
    «type.signature»
    «ENDIF»
    '''
    
    def dispatch generate(ComplexTypeDeclaration type) '''
    {
      «FOR member:type.literal.members SEPARATOR ", "»
      "«member.name»" : «member.type.generate»
      «ENDFOR»       
    }
    '''
    
    def dispatch generate(EnumTypeDeclaration type) '''
    
    '''    
}