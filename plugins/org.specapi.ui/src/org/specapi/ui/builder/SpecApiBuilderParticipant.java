package org.specapi.ui.builder;

import static com.google.common.collect.Maps.uniqueIndex;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.ui.editor.preferences.PreferenceStoreAccessImpl;
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
import com.specapi.ui.plugins.SpecAPIUIConstants;

public class SpecApiBuilderParticipant extends BuilderParticipant {
	
	@Inject PluginLoader pluginLoader;
	@Inject PluginConfigParser pluginConfigParser;
	private ArrayList<Plugin> mPlugins;
	private UserPluginConfig mTargetConfig;
	@Inject OutputConfigurationMerger mOutputConfigMerger;
	@Inject PreferenceStoreAccessImpl preferenceStoreAccessImpl;
	
	@Override
	public void build(IBuildContext context, IProgressMonitor monitor)
			throws CoreException {
		
		EclipseSpecApiGenerator generator = (EclipseSpecApiGenerator) getGenerator();
		
		if(ProjectUtil.isGeneratorTargetProject(context.getBuiltProject())) {
			ArrayList<File> pluginPaths = getPluginPaths();
			
			mPlugins = pluginLoader.loadPlugins(pluginPaths);
			
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

	private ArrayList<File> getPluginPaths() {
		ArrayList<File> files = new ArrayList<File>();
		IPreferenceStore preferenceStore = preferenceStoreAccessImpl.getPreferenceStore();
		String pluginLocation = preferenceStore.getString(SpecAPIUIConstants.PREF_PLUGINS_LOCATION);
		File file = new File(pluginLocation);
		if(file.exists()) {
			files.add(file);
		}
		return files;
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
