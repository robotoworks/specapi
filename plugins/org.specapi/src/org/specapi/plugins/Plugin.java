package org.specapi.plugins;

import org.eclipse.xtext.generator.IGenerator;

public abstract class Plugin implements IPlugin {

	public static final String DEFAULT_RESOURCES_PATH = "specapi-resources";
	
	protected ISpecApiPlugin plugin;
	private PluginConfig config;

	public Plugin(ISpecApiPlugin plugin, PluginConfig config) {
		this.plugin = plugin;
		this.config = config;
	}

	@Override
	public IGenerator getGenerator() {
	  return plugin.getGenerator();
 	}

	@Override
	public PluginConfig getConfig() {
		return config;
	}
}
