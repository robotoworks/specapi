/*
* generated by Xtext
*/
package org.specapi.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.specapi.services.SpecApiLangGrammarAccess;

public class SpecApiLangParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SpecApiLangGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "RULE_ML_COMMENT");
	}
	
	@Override
	protected org.specapi.parser.antlr.internal.InternalSpecApiLangParser createParser(XtextTokenStream stream) {
		return new org.specapi.parser.antlr.internal.InternalSpecApiLangParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "SpecApiDocument";
	}
	
	public SpecApiLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SpecApiLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
