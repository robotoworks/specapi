package org.specapi.ui.views;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class SpecApiConsoleView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.specapi.ui.views.SpecApiConsoleView";

	/**
	 * The constructor.
	 */
	public SpecApiConsoleView() {
		
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		hookContextMenu();
	}

	private void hookContextMenu() {
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//super.setFocus();
	}
}