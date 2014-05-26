package org.specapi.plugins;

import java.io.File;
import java.io.IOException;

import org.eclipse.xtext.generator.IGenerator;

public interface IPlugin {

	public abstract IGenerator getGenerator();

	public abstract PluginConfig getConfig();

	public abstract void copyResources(File outputFolder) throws IOException;

}