package org.specapi.plugins.swagger;

import org.eclipse.xtext.generator.IGenerator;
import org.specapi.plugins.ISpecApiPlugin;
import org.specapi.plugins.swagger.generator.Generator;

public class Plugin implements ISpecApiPlugin {
	
	public static final String OUTPUT_CONFIG = Plugin.class.getName() + ":SWAGGER";
	
	@Override
	public IGenerator getGenerator() {
		return new Generator();
	}
}
