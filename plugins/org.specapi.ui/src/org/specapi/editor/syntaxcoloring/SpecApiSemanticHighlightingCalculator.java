package org.specapi.editor.syntaxcoloring;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.internal.RegEx.Match;
import org.eclipse.emf.ecore.xml.type.internal.RegEx.RegularExpression;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.specapi.specapiLang.Path;

import com.google.inject.Inject;

public class SpecApiSemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {
	
	Pattern commentTagPattern = Pattern.compile("@[a-z0-9_]+");

	@Inject MultiLineCommentDocumentationProvider commentProvider;
	
	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
		    return;
		    
		  INode root = resource.getParseResult().getRootNode();
		  for (INode node : root.getAsTreeIterable()) {
		    if (node instanceof CompositeNodeWithSemanticElement) {
		    	
		    	CompositeNodeWithSemanticElement composite = (CompositeNodeWithSemanticElement) node;
		    	EObject semanticElement = composite.getSemanticElement();
		    	if(semanticElement instanceof Path) {
		    	
			      acceptor.addPosition(node.getOffset(), node.getLength(), 
			    		  DefaultHighlightingConfiguration.STRING_ID);	
		    	} else {
		    		List<INode> commentNodes = commentProvider.getDocumentationNodes(semanticElement);
		    		
		    		if(commentNodes.size() > 0) {
		    			INode commentNode = commentNodes.get(0);

		    			Matcher matcher = commentTagPattern.matcher(commentNode.getText());
		    			while(matcher.find()) {
		    				MatchResult result = matcher.toMatchResult();
		    				acceptor.addPosition(
		    						commentNode.getOffset() + result.start(), 
		    						result.end() - result.start(), 
		    						SpecApiHighlightingConfiguration.DOC_TAG_ID);
		    			}
		    		}
		    		
		    	}
		    }
		  }
	}

}
