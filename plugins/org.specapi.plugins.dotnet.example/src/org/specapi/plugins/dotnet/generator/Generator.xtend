package org.specapi.plugins.dotnet.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api
import org.specapi.plugins.dotnet.Plugin
import static extension org.specapi.util.SpecApiStringExtensions.*
import com.google.inject.Inject
import static extension org.specapi.plugins.dotnet.generator.DotNetUtil.*
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.UserTypeDeclaration

class Generator implements IGenerator {
    
    @Inject ApiClientGenerator mApiClientGenerator
    @Inject EntityGenerator mEntityGenerator
    @Inject RequestGenerator mRequestGenerator
    @Inject ResponseHandlerGenerator mResponseHandlerGenerator
    
    override doGenerate(Resource input, IFileSystemAccess fsa) {
        val doc = input.contents.head as SpecApiDocument
        val api = doc.declarations.filter(typeof(Api)).head
        
        fsa.generateFile(doc.packageName.pascalizePackageName + "/" + api.name.pascalize + ".cs", Plugin::OUTPUT_CONFIG, mApiClientGenerator.generate(doc, api));
    
        api.blocks.filter(typeof(HttpMethod)).forEach[
            fsa.generateFile(
                doc.packageName.pascalizePackageName + "/" + it.name.pascalize + "Request.cs",
                Plugin::OUTPUT_CONFIG,
                mRequestGenerator.generate(doc, api, it)
            )
        ]
        
        api.blocks.filter(typeof(HttpMethod)).forEach[
            fsa.generateFile(
                doc.packageName.pascalizePackageName + "/" + it.name.pascalize + "Responder.cs",
                Plugin::OUTPUT_CONFIG,
                mResponseHandlerGenerator.generate(doc, api, it)
            )
        ]
        
        doc.declarations.filter(typeof(UserTypeDeclaration)).forEach[
            fsa.generateFile(
                doc.packageName.pascalizePackageName + "/" + it.name.pascalize + ".cs",
                Plugin::OUTPUT_CONFIG,
                mEntityGenerator.generate(doc, api, it)
            )
        ]
    }
}