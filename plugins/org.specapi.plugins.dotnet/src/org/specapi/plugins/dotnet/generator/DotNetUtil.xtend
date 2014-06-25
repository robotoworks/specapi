package org.specapi.plugins.dotnet.generator

import static extension org.specapi.util.SpecApiStringExtensions.*
import org.specapi.specapiLang.Type
import org.specapi.specapiLang.IntrinsicType
import org.specapi.specapiLang.UserType
import org.specapi.specapiLang.ArrayType
import org.specapi.specapiLang.BooleanType
import org.specapi.specapiLang.IntegerType
import org.specapi.specapiLang.DoubleType
import org.specapi.specapiLang.StringType
import org.specapi.specapiLang.LongType
import org.specapi.specapiLang.ResponseBlock
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.ComplexTypeLiteral
import org.specapi.specapiLang.BlockType
import org.specapi.specapiLang.RequestBlock

class DotNetUtil {
    def static String pascalizePackageName(String packageName) {
        return packageName.split("\\.").join(".", [it.pascalize])
    }
    
    def static String dotNetTypeString(Type type){
        switch(type) {
            IntrinsicType: type.dotNetIntrinsicTypeString
            UserType: type.declaration.name
            ArrayType: 
                if(type.elementType instanceof UserType)
                    (type.elementType as UserType).declaration.name + "[]"
                else
                    (type.elementType as IntrinsicType).dotNetIntrinsicTypeString + "[]"
                    
            default: "!!!Unsupported!!!"
        }
    }
    
    def static String dotNetIntrinsicTypeString(IntrinsicType type) {
        switch(type) {
            BooleanType: "bool"
            IntegerType: "int"
            DoubleType: "double"
            StringType: "string"
            LongType: "long"
        }
    }
    
    def static resolveCode(ResponseBlock response) {
        if(response.code == 0) "200"
        else response.code
    }
    
    def static boolean hasPathParams(HttpMethod method) {
        if(method.path == null) {
            return false;
        }
        
        return method.path.params.length > 0
    }
    def static generateResponseType(ResponseBlock response, HttpMethod method) {
        if(response.type instanceof ComplexTypeLiteral) {
            method.name.pascalize + response.resolveCode + "Result"
        } else {
            (response.type as Type).dotNetTypeString
        }
    }     
    
     def static generateRequestType(RequestBlock block, HttpMethod method) {
        if(block.type instanceof ComplexTypeLiteral) {
            method.name.pascalize + "Input"
        } else {
            (block.type as Type).dotNetTypeString
        }
    }   
}