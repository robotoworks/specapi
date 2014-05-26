package org.specapi.plugins.docs;

import org.eclipse.xtext.generator.IGenerator;
import org.specapi.plugins.ISpecApiPlugin;
import org.specapi.plugins.docs.generator.Generator;

public class Plugin implements ISpecApiPlugin {
	
	public static final String OUTPUT_CONFIG = Plugin.class.getName() + ":DOCS";
	
	@Override
	public IGenerator getGenerator() {
		return new Generator();
	}
	
}
