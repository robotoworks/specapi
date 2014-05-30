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
import org.specapi.generator.DocCommentParser

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SpecApiLangInjectorProvider))
public class CommentParserTests {
    
    @Inject ParseHelper<SpecApiDocument> parseHelper
    @Inject DocCommentParser commentParser
    
    @Test
    def parsingGeneral() {
    	
        // arrange
        var model = parseHelper.parse('''
        package qux
        /*
         * This is a multiline comment, is it not something else awesome!?
         * @param foo this is a parameter
         * @param bar the bar parameter is cool
         * @param bat this one is batty
         * @response ohhhh response, goes onto more than 
         * one line
         *
         * @body this is a body thingy
         * one
         * more lines
         * @param this is another parameter than someone`
         * decided to stick right at the bottom
         * @see Restaurant its awesome
         * 
         * @param &&what about th!s crazy�$@&^$&�@* STUFF!?!!?!?
         * @param html can we do <b>that</b> too? <a href="qux.html">Really?</a>
         * @param
         * @example 
         */
          
         api qux {
             
         }
        ''');
       
       // act
       var svc = model.declarations.filter(typeof(Api)).head
       var doc = commentParser.parseDocComments(svc)
       
       // assert
       assertEquals("This is a multiline comment, is it not something else awesome!?", doc.content)
       assertEquals("this is a parameter", doc.params.get("foo").content)
       assertEquals("the bar parameter is cool", doc.params.get("bar").content)
       assertEquals("this one is batty", doc.params.get("bat").content)
    }
    
    @Test
    def parsingMultilineOnOneLine() {
        
        // arrange
        var model = parseHelper.parse('''
        package qux
        /* @param qux a a a a a a */
         api qux {
             
         }
        ''');
       
       // act
       var api = model.declarations.filter(typeof(Api)).head
       var doc = commentParser.parseDocComments(api)
       
       // assert
       assertEquals("a a a a a a", doc.params.get("qux").content)
    }
    
    @Test
    def parsingAgain() {
        
        // arrange
        var model = parseHelper.parse('''
        package qux
        /*
         * <b>Get a list of reviews for a given restaurant</b>
         * 
         * @param restaurant_id the unique id of the restaurant
         * 
         * @response an entity containing a list of review entities
         */
         api qux {
             
         }
        ''');
       
       // act
       var api = model.declarations.filter(typeof(Api)).head
       var doc = commentParser.parseDocComments(api)
       
       // assert
       assertEquals("<b>Get a list of reviews for a given restaurant</b>", doc.content)
       assertEquals("the unique id of the restaurant", doc.params.get("restaurant_id").content)
       assertEquals("an entity containing a list of review entities", doc.response.content)
    }
    
    @Test
    def parsingNothing() {
        
        // arrange
        var model = parseHelper.parse('''
        package qux
        /*
         */
         api qux {
             
         }
        ''');
       
       // act
       var api = model.declarations.filter(typeof(Api)).head
       var doc = commentParser.parseDocComments(api)
       
       // assert
       assertEquals(null,doc.content);
       assertEquals(0,doc.params.size);
    }

    @Test
    def reallyParseNothing() {
        
        // arrange
        var model = parseHelper.parse('''
        package qux

         api qux {
             
         }
        ''');
       
       // act
       var api = model.declarations.filter(typeof(Api)).head
       var doc = commentParser.parseDocComments(api)
     
       // assert
       assertEquals(null,doc.content);
       assertEquals(0,doc.params.size);
    }
    
    @Test
    def parsingCustomTags() {
        
        // arrange
        var model = parseHelper.parse('''
        package qux
        /*
         * Get a list of reviews for a given restaurant
         * 
         * @param awesome parameters
         * for the win
         * @qux qux tag is cool
         * @param hey what about me I am also nice
         * @qux param tag is also cool
         *
         * @response an entity containing a list of review entities
         */
         api qux {
             
         }
        ''');
       
       // act
       var api = model.declarations.filter(typeof(Api)).head
       var doc = commentParser.parseDocComments(api, #{"@qux"->1})
       
       // assert
       assertEquals("Get a list of reviews for a given restaurant", doc.content);
       assertEquals("tag is cool", doc.getTagByArgument("@qux", 0, "qux").content);
       assertEquals("tag is also cool", doc.getTagByArgument("@qux", 0, "param").content);
       assertEquals("an entity containing a list of review entities", doc.response.content);
    }
}
