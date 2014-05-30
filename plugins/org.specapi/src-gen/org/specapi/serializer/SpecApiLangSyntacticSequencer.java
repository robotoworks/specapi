package org.specapi.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.specapi.services.SpecApiLangGrammarAccess;

@SuppressWarnings("all")
public class SpecApiLangSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SpecApiLangGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Path_ANY_PATH_SEGMENTTerminalRuleCall_2_0_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SpecApiLangGrammarAccess) access;
		match_Path_ANY_PATH_SEGMENTTerminalRuleCall_2_0_a = new TokenAlias(true, true, grammarAccess.getPathAccess().getANY_PATH_SEGMENTTerminalRuleCall_2_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getANY_PATH_SEGMENTRule())
			return getANY_PATH_SEGMENTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ANY_PATH_SEGMENT:'/'!('/'|'{'|' ')*;
	 */
	protected String getANY_PATH_SEGMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Path_ANY_PATH_SEGMENTTerminalRuleCall_2_0_a.equals(syntax))
				emit_Path_ANY_PATH_SEGMENTTerminalRuleCall_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ANY_PATH_SEGMENT*
	 */
	protected void emit_Path_ANY_PATH_SEGMENTTerminalRuleCall_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
