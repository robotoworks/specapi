package org.specapi.editor.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class SpecApiHighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String DOC_TAG_ID = "doctag";
	public static final String URL = "urls";
	
	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		
		acceptor.acceptDefaultHighlighting(DOC_TAG_ID, "Doc Comment Tag", commentTagTextStyle());
		acceptor.acceptDefaultHighlighting(URL, "Url And Paths", urlTextStyle());
	}
	
	public TextStyle commentTagTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(23, 87, 55));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}
	
	public TextStyle urlTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(140, 140, 0));
		textStyle.setStyle(SWT.NORMAL);
		return textStyle;
	}
}
