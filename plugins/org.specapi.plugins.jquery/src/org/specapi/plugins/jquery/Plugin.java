package org.specapi.plugins.jquery;

import org.eclipse.xtext.generator.IGenerator;
import org.specapi.plugins.ISpecApiPlugin;
import org.specapi.plugins.jquery.generator.Generator;

public class Plugin implements ISpecApiPlugin {
	
	public static final String OUTPUT_CONFIG = Plugin.class.getName() + ":JQUERY";
	
	@Override
	public IGenerator getGenerator() {
		return new Generator();
	}
}
