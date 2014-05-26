package org.specapi.plugins.simple;

import org.eclipse.xtext.generator.IGenerator;
import org.specapi.plugins.ISpecApiPlugin;
import org.specapi.plugins.simple.generator.Generator;

public class Plugin implements ISpecApiPlugin {
	
	public static final String OUTPUT_CONFIG = Plugin.class.getName() + ":SIMPLE";
	
	@Override
	public IGenerator getGenerator() {
		return new Generator();
	}
	
}
