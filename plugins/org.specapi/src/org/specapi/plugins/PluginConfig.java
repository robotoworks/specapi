package org.specapi.plugins;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.generator.OutputConfiguration;

public class PluginConfig {
	
	private String mPluginClassName;
	private ArrayList<OutputConfiguration> mOutputConfigurations = new ArrayList<OutputConfiguration>();

	public void setPluginClassName(String name) {
		mPluginClassName = name;
	}
	
	public String getPluginClassName() {
		return mPluginClassName;
	}
	
	public List<OutputConfiguration> getOutputConfigurations() {
		return mOutputConfigurations;
	}
}
