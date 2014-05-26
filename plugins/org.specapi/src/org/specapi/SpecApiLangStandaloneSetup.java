/*
* generated by Xtext
*/
package org.specapi;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SpecApiLangStandaloneSetup extends SpecApiLangStandaloneSetupGenerated{

	public static void doSetup() {
		new SpecApiLangStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
	
	@Override
	public void register(Injector injector) {
		super.register(injector);
	}
}

