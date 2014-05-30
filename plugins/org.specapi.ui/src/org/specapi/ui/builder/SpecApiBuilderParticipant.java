package org.specapi.ui.builder;

import static com.google.common.collect.Maps.uniqueIndex;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.specapi.plugins.IPlugin;
import org.specapi.plugins.OutputConfigurationMerger;
import org.specapi.plugins.Plugin;
import org.specapi.plugins.PluginConfigParser;
import org.specapi.plugins.PluginLoader;
import org.specapi.plugins.UserPluginConfig;
import org.specapi.ui.ProjectUtil;
import org.specapi.ui.generator.EclipseSpecApiGenerator;

import com.google.common.base.Function;
import com.google.inject.Inject;

public class SpecApiBuilderParticipant extends BuilderParticipant {
	
	@Inject PluginLoader pluginLoader;
	@Inject PluginConfigParser pluginConfigParser;
	private ArrayList<Plugin> mPlugins;
	private UserPluginConfig mTargetConfig;
	@Inject OutputConfigurationMerger mOutputConfigMerger;
	
	@Override
	public void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		
		EclipseSpecApiGenerator generator = (EclipseSpecApiGenerator) getGenerator();
		
		if(ProjectUtil.isGeneratorTargetProject(context.getBuiltProject())) {
			// TODO: Replace null with the plugin path ie:- /a/b/c/plugins or wherever it is
			mPlugins = pluginLoader.loadPlugins(null);
			mTargetConfig = ProjectUtil.loadTargetConfig(context.getBuiltProject(), pluginConfigParser);
			
			generator.setPlugins(mPlugins);
			generator.setUserConfig(mTargetConfig);
			copyPluginResources(context, monitor);
		} else {
			mPlugins = null;
			mTargetConfig = null;
			generator.setPlugins(null);
			generator.setUserConfig(null);			
		}
		
		super.build(context, monitor);
	}
	
	private void copyPluginResources(IBuildContext context, IProgressMonitor monitor) {
		if(mPlugins != null) {
			for(IPlugin plugin : mPlugins) {
				if(mTargetConfig != null && mTargetConfig.targetsPlugin(plugin.getConfig().getPluginClassName())) {
					try {
						plugin.copyResources(context.getBuiltProject().getLocation().toFile());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
		
	@Override
	protected Map<String, OutputConfiguration> getOutputConfigurations(
			IBuildContext context) {
		
		Set<OutputConfiguration> configurations = getOutputConfigurationProvider().getOutputConfigurations(context.getBuiltProject());
		
		if(ProjectUtil.isGeneratorTargetProject(context.getBuiltProject())) {
			if(mPlugins != null) {
				for(IPlugin plugin : mPlugins) {
					if(mTargetConfig != null && mTargetConfig.targetsPlugin(plugin.getConfig().getPluginClassName())) {
						for(OutputConfiguration config : mOutputConfigMerger.merge(mTargetConfig, plugin.getConfig())) {
							configurations.add(config);
						}
					}
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
