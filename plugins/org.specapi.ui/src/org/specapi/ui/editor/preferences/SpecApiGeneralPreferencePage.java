package org.specapi.ui.editor.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.xtext.ui.editor.preferences.PreferenceStoreAccessImpl;

import com.google.inject.Inject;
import com.specapi.ui.plugins.SpecAPIUIConstants;

public class SpecApiGeneralPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private PreferenceStoreAccessImpl preferenceStoreAccessImpl;
	private PluginDirectoryFieldEditor mDirectoryField;
	
	public SpecApiGeneralPreferencePage() {
		super(GRID);
	}
	
	@Inject
	public void setPreferenceStoreAccessImpl(PreferenceStoreAccessImpl preferenceStoreAccessImpl) {
		this.preferenceStoreAccessImpl = preferenceStoreAccessImpl;
	}
	
	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createFieldEditors() {
		
		setPreferenceStore(preferenceStoreAccessImpl.getWritablePreferenceStore());
		
        mDirectoryField = new PluginDirectoryFieldEditor(
        		SpecAPIUIConstants.PREF_PLUGINS_LOCATION,
                "SpecAPI Plugin Location", 
                getFieldEditorParent());

        addField(mDirectoryField);
		
	}
	
	public class PluginDirectoryFieldEditor extends DirectoryFieldEditor {

		public PluginDirectoryFieldEditor(String name, String labelText, Composite parent) {
			super(name, labelText, parent);
			setEmptyStringAllowed(false);
		}
		
		@Override
		protected boolean doCheckState() {
			return super.doCheckState();
		}
	}
}
