/*
 * generated by Xtext
 */
package org.specapi.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractSpecApiLangValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.specapi.specapiLang.SpecapiLangPackage.eINSTANCE);
		return result;
	}
}
