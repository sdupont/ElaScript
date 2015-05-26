/*
 * generated by Xtext
 */
package org.elascript.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.elascript.services.ElascriptGrammarAccess;

public class ElascriptParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ElascriptGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.elascript.parser.antlr.internal.InternalElascriptParser createParser(XtextTokenStream stream) {
		return new org.elascript.parser.antlr.internal.InternalElascriptParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Script";
	}
	
	public ElascriptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ElascriptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
