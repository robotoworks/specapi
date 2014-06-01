package org.specapi.tests

import com.google.inject.Inject
import org.specapi.SpecApiLangInjectorProvider
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Api
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import static org.junit.Assert.*
import org.junit.runner.RunWith
import org.specapi.specapiLang.HttpMethod

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SpecApiLangInjectorProvider))
public class GrammarTests {
    
    @Inject ParseHelper<SpecApiDocument> parseHelper
    
    @Test
    def parsingGeneral() {
    	
        // arrange
        var model = parseHelper.parse('''
         package org.specapi.tests
         
         api qux {
         	get /path/to/some:string/resource/with:string/args {
         		response String
         	}
         }
        ''');
       
       // act
       var method = model.declarations.filter(typeof(Api)).head.blocks.filter(typeof(HttpMethod)).head
       
       for(param : method.path.params) {
       	System.out.println(param.name)
       }
       
       // assert
       assertEquals(2, method.path.params.length)
    }

}
