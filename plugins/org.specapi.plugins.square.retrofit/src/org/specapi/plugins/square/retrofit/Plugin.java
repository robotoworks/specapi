package org.specapi.plugins.square.retrofit;

import org.eclipse.xtext.generator.IGenerator;
import org.specapi.plugins.ISpecApiPlugin;
import org.specapi.plugins.square.retrofit.generator.Generator;

public class Plugin implements ISpecApiPlugin {
	
	public static final String OUTPUT_CONFIG = Plugin.class.getName() + ":RETROFIT";
	
	@Override
	public IGenerator getGenerator() {
		return new Generator();
	}

}
