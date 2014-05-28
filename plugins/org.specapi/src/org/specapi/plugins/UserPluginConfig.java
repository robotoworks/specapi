package org.specapi.plugins;

import java.util.ArrayList;
import java.util.List;

public class UserPluginConfig {

	private ArrayList<PluginConfig> configs = new ArrayList<PluginConfig>();

	public List<PluginConfig> getConfigs() {
		return configs;
	}

	public PluginConfig getConfig(String pluginClassName) {
		for(PluginConfig config : configs) {
			if(config.getPluginClassName().equals(pluginClassName)) {
				return config;
			}
		}
		
		return null;
	}

	public boolean targetsPlugin(String pluginClassName) {
		for(PluginConfig config : configs) {
			if(config.getPluginClassName().equals(pluginClassName)) {
				return true;
			}
		}
		
		return false;
	}
}
