package org.specapi.plugins;

import java.util.ArrayList;
import java.util.List;

public class PluginConfig {

	private String mPluginClassName;
	private ArrayList<SpecApiOutputConfiguration> mOutputConfigurations = new ArrayList<SpecApiOutputConfiguration>();

	public void setPluginClassName(String name) {
		mPluginClassName = name;
	}

	public String getPluginClassName() {
		return mPluginClassName;
	}

	public List<SpecApiOutputConfiguration> getOutputConfigurations() {
		return mOutputConfigurations;
	}

	public SpecApiOutputConfiguration getOutputConfiguration(String name) {
		for (SpecApiOutputConfiguration config : mOutputConfigurations) {
			if(config.getName().equals(name)) {
				return config;
			}
		}
		
		return null;
	}
}
