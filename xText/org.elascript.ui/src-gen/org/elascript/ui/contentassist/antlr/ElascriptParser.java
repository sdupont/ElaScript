/*
 * generated by Xtext
 */
package org.elascript.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.elascript.services.ElascriptGrammarAccess;

public class ElascriptParser extends AbstractContentAssistParser {
	
	@Inject
	private ElascriptGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.elascript.ui.contentassist.antlr.internal.InternalElascriptParser createParser() {
		org.elascript.ui.contentassist.antlr.internal.InternalElascriptParser result = new org.elascript.ui.contentassist.antlr.internal.InternalElascriptParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getParallelAccess().getGroup(), "rule__Parallel__Group__0");
					put(grammarAccess.getParallelBodyAccess().getGroup(), "rule__ParallelBody__Group__0");
					put(grammarAccess.getParallelBodyAccess().getGroup_1(), "rule__ParallelBody__Group_1__0");
					put(grammarAccess.getCommandAccess().getGroup(), "rule__Command__Group__0");
					put(grammarAccess.getParamListAccess().getGroup(), "rule__ParamList__Group__0");
					put(grammarAccess.getParamListAccess().getGroup_1(), "rule__ParamList__Group_1__0");
					put(grammarAccess.getScriptAccess().getActionsAssignment(), "rule__Script__ActionsAssignment");
					put(grammarAccess.getParallelAccess().getNameAssignment_2(), "rule__Parallel__NameAssignment_2");
					put(grammarAccess.getParallelBodyAccess().getActionsAssignment_0(), "rule__ParallelBody__ActionsAssignment_0");
					put(grammarAccess.getParallelBodyAccess().getActionsAssignment_1_1(), "rule__ParallelBody__ActionsAssignment_1_1");
					put(grammarAccess.getActionListAccess().getActionsAssignment(), "rule__ActionList__ActionsAssignment");
					put(grammarAccess.getCommandAccess().getNameAssignment_0(), "rule__Command__NameAssignment_0");
					put(grammarAccess.getCommandAccess().getParamsAssignment_2(), "rule__Command__ParamsAssignment_2");
					put(grammarAccess.getParamListAccess().getParamsAssignment_0(), "rule__ParamList__ParamsAssignment_0");
					put(grammarAccess.getParamListAccess().getParamsAssignment_1_1(), "rule__ParamList__ParamsAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.elascript.ui.contentassist.antlr.internal.InternalElascriptParser typedParser = (org.elascript.ui.contentassist.antlr.internal.InternalElascriptParser) parser;
			typedParser.entryRuleScript();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ElascriptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ElascriptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
