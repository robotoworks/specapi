package org.specapi.ui.builder;

import static com.google.common.collect.Maps.uniqueIndex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.specapi.plugins.IPlugin;
import org.specapi.plugins.Plugin;
import org.specapi.plugins.PluginLoader;
import org.specapi.ui.ProjectUtil;
import org.specapi.ui.generator.EclipseSpecApiGenerator;

import com.google.common.base.Function;
import com.google.inject.Inject;

public class SpecApiBuilderParticipant extends BuilderParticipant {
	
	@Inject PluginLoader pluginLoader;
	private ArrayList<Plugin> mPlugins;
	
	@Override
	public void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		
		EclipseSpecApiGenerator generator = (EclipseSpecApiGenerator) getGenerator();
		// TODO: load this from some config setting in preferences where the
		// user can specify where the plugins are
		mPlugins = pluginLoader.loadPlugins(null);
		
		generator.setPlugins(mPlugins);
		
		// Copy resources
		if(ProjectUtil.isGeneratorTargetProject(context.getBuiltProject())) {
			copyPluginResources(context, monitor);
		}
		
		super.build(context, monitor);
	}
	
	private void copyPluginResources(IBuildContext context, IProgressMonitor monitor) {
		if(mPlugins != null) {
			for(IPlugin plugin : mPlugins) {
				try {
					plugin.copyResources(context.getBuiltProject().getLocation().toFile());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
		
	@Override
	protected Map<String, OutputConfiguration> getOutputConfigurations(
			IBuildContext context) {
		
		Set<OutputConfiguration> configurations = getOutputConfigurationProvider().getOutputConfigurations(context.getBuiltProject());
		
		if(mPlugins != null) {
			for(IPlugin plugin : mPlugins) {
				for(OutputConfiguration config : plugin.getConfig().getOutputConfigurations()) {
					configurations.add(config);
				}
			}
		}
		
		return uniqueIndex(configurations, new Function<OutputConfiguration, String>() {
			public String apply(OutputConfiguration from) {
				return from.getName();
			}
		});
	}
}
