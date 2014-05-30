package com.specapi.ui.plugins;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.specapi.plugins.ISpecApiPlugin;
import org.specapi.plugins.Plugin;
import org.specapi.plugins.PluginConfig;
import org.specapi.util.Files;

public class EclipseSpecApiPlugin extends Plugin {
	private IProject project;

	public IProject getProject() {
		return project;
	}
	
	public EclipseSpecApiPlugin(ISpecApiPlugin plugin, PluginConfig config, IProject project) {
		super(plugin, config);
		this.project = project;
	}
	
	@Override
	public void copyResources(File outputFolder) throws IOException {
		if(getConfig().getOutputConfigurations().size() > 0) {
			OutputConfiguration outputConfig = getConfig().getOutputConfigurations().iterator().next();
			File sourceFolder = project.getFolder(DEFAULT_RESOURCES_PATH).getLocation().toFile();
			
			File targetFolder = new File(outputFolder, outputConfig.getOutputDirectory());
			
			Files.copyFolder(sourceFolder, targetFolder);
		}
	}
}
