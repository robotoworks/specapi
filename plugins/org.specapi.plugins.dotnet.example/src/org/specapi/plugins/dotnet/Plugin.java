package org.specapi.plugins.dotnet;

import org.eclipse.xtext.generator.IGenerator;
import org.specapi.plugins.ISpecApiPlugin;
import org.specapi.plugins.dotnet.generator.Generator;

public class Plugin implements ISpecApiPlugin {
	
	public static final String OUTPUT_CONFIG = Plugin.class.getName() + ":DOTNET";
	
	@Override
	public IGenerator getGenerator() {
		return new Generator();
	}

}
