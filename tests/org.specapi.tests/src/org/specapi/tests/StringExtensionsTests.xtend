package org.specapi.tests

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.specapi.SpecApiLangInjectorProvider
import static org.junit.Assert.*
import org.junit.Test
import static extension org.specapi.util.SpecApiStringExtensions.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SpecApiLangInjectorProvider))
class StringExtensionsTests {
	@Test
	def camelize() {
		assertEquals("camelizeThisStringPlease", 
			"Camelize This String Please".camelize
		)
		
		assertEquals("camelizeThisStringPlease", 
			"Camelize_This_String_Please".camelize
		)
		assertEquals("camelizeThisStringPlease", 
			"Camelize-This-String-Please".camelize
		)
		
		assertEquals("camelizeThisStringPlease", 
			"CamelizeThisStringPlease".camelize
		)
		assertEquals("camelizeThisStringPlease", 
			"Camelize This_StringPlease".camelize
		)
		assertEquals("cAMELIZETHISPLEASE", 
			"CAMELIZETHISPLEASE".camelize
		)
		assertEquals("camelizeThisPlease", 
			"camelize this please".camelize
		)
		assertEquals("", 
			"".camelize
		)
	}
	
	@Test
	def dasherize() {
		assertEquals("Dasherize-This-String-Please", 
			"Dasherize This String Please".dasherize
		)
		
		assertEquals("Dasherize-This-String-Please", 
			"Dasherize_This_String_Please".dasherize
		)
		assertEquals("Dasherize-This-String-Please", 
			"Dasherize-This-String-Please".dasherize
		)
		
		assertEquals("Dasherize-This-String-Please", 
			"DasherizeThisStringPlease".dasherize
		)
		assertEquals("Dasherize-This-String-Please", 
			"Dasherize This_StringPlease".dasherize
		)
		assertEquals("DASHERIZETHISSTRINGPLEASE", 
			"DASHERIZETHISSTRINGPLEASE".dasherize
		)
		assertEquals("dasherize-this-please", 
			"dasherize this please".dasherize
		)
		assertEquals("", 
			"".dasherize
		)
	}
	
	@Test
	def underscorize() {
		assertEquals("Underscorize_This_String_Please", 
			"Underscorize This String Please".underscorize
		)
		
		assertEquals("Underscorize_This_String_Please", 
			"Underscorize_This_String_Please".underscorize
		)
		assertEquals("Underscorize_This_String_Please", 
			"Underscorize-This-String-Please".underscorize
		)
		
		assertEquals("Underscorize_This_String_Please", 
			"UnderscorizeThisStringPlease".underscorize
		)
		
		assertEquals("Underscorize_This_String_Please", 
			"Underscorize This_StringPlease".underscorize
		)
		
		assertEquals("UNDESCORIZETHISSTRINGPLEASE", 
			"UNDESCORIZETHISSTRINGPLEASE".underscorize
		)
		assertEquals("underscorize_this_please", 
			"underscorize this please".underscorize
		)
		assertEquals("", 
			"".underscorize
		)
	}
	
	@Test
	def pascalize() {
		assertEquals("PascalizeThisStringPlease", 
			"Pascalize This String Please".pascalize
		)
		
		assertEquals("PascalizeThisStringPlease", 
			"Pascalize_This_String_Please".pascalize
		)
		assertEquals("PascalizeThisStringPlease", 
			"Pascalize-This-String-Please".pascalize
		)
		
		assertEquals("PascalizeThisStringPlease", 
			"PascalizeThisStringPlease".pascalize
		)
		assertEquals("PascalizeThisStringPlease", 
			"Pascalize This_StringPlease".pascalize
		)
		assertEquals("PASCALIZETHISPLEASE", 
			"PASCALIZETHISPLEASE".pascalize
		)
		assertEquals("PascalizeThisPlease", 
			"pascalize this please".pascalize
		)
		assertEquals("", 
			"".pascalize
		)
	}
	
	@Test
	def humanize() {
		assertEquals("Humanize This String Please", 
			"Humanize This String Please".humanize
		)
		
		assertEquals("Humanize This String Please", 
			"Humanize_This_String_Please".humanize
		)
		assertEquals("Humanize This String Please", 
			"Humanize-This-String-Please".humanize
		)
		
		assertEquals("Humanize This String Please", 
			"HumanizeThisStringPlease".humanize
		)
		
		assertEquals("humanize This String Please", 
			"humanizeThisStringPlease".humanize
		)
		
		assertEquals("Humanize This String Please", 
			"Humanize This_StringPlease".humanize
		)
		assertEquals("HUMANIZETHISPLEASE", 
			"HUMANIZETHISPLEASE".humanize
		)

		assertEquals("", 
			"".humanize
		)
	}
	
	@Test
	def packagerize() {
		assertEquals("packagerize.this.please", 
			"packagerize/this/please".packagerize
		)		
	}
	
	@Test
	def patherize() {
		assertEquals("patherize/this/please", 
			"patherize.this.please".patherize
		)		
	}
	
	@Test
	def toSentenceCase() {
		assertEquals("Sentence case me please", 
			"sentence Case me please".toSentenceCase
		)		
		
		assertEquals("Sentence case me please", 
			"sentence Case me Please".toSentenceCase
		)		
		
		assertEquals("Sentence case-me please", 
			"sentence case-me Please".toSentenceCase
		)		
	}
	
	@Test
	def toTitleCase() {
		assertEquals("Title Case Me Please", 
			"title Case me please".toTitleCase
		)		
		
		assertEquals("Title Case Me Please", 
			"title case me Please".toTitleCase
		)		
		
		assertEquals("Title Case-Me Please", 
			"title case-me please".toTitleCase
		)		
	}
	
}