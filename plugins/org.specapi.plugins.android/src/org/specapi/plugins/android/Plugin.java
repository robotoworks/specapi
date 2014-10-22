package org.specapi.plugins.android;

import org.eclipse.xtext.generator.IGenerator;
import org.specapi.plugins.ISpecApiPlugin;
import org.specapi.plugins.android.generator.Generator;

public class Plugin implements ISpecApiPlugin {
	
	public static final String OUTPUT_CONFIG = Plugin.class.getName() + ":ANDROID";
	public static final String OUTPUT_CONFIG_STUBS = Plugin.class.getName() + ":ANDROID_STUBS";
	
	@Override
	public IGenerator getGenerator() {
		return new Generator();
	}
	
}
