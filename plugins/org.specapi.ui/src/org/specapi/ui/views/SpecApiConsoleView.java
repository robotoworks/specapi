package org.specapi.ui.views;


import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;

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