package com.specapi.ui.plugins;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.specapi.plugins.ISpecApiPlugin;
import org.specapi.plugins.Plugin;
import org.specapi.plugins.PluginConfig;
import org.specapi.plugins.PluginLoader;
import org.specapi.ui.ProjectUtil;

import com.google.common.base.Function;
import com.google.common.collect.Maps;

public class EclipsePluginLoader extends PluginLoader {
	
	@Override
	public ArrayList<Plugin> loadPlugins(List<File> files) {
		ArrayList<Plugin> plugins =  super.loadPlugins(files);
		
		// Make sure we have unique plugins, we do this so that plugin
		// projects in the workspace will take priority over compiled
		// plugin jars at the plugins path
		Map<String, Plugin> pluginMap = Maps.uniqueIndex(plugins, new Function<Plugin, String>() {
			public String apply(Plugin from) {
				return from.getConfig().getPluginClassName();
			}
		});

		ArrayList<IProject> projects = ProjectUtil.getSpecApiPluginProjects();
		
		for(IProject project : projects) {

				PluginConfig pluginConfig = ProjectUtil.loadConfig(project, getPluginConfigParser());
								
				if(pluginConfig != null) {
					
					IFolder bin = project.getFolder("bin"); // TODO should look this up
					
					if(bin.exists()) {
						String fullPath = bin.getLocation().toOSString();
						
						File file = new File(fullPath);
	
						Plugin plugin = loadPlugin(file, pluginConfig, project);
						
						pluginMap.put(pluginConfig.getPluginClassName(), plugin);
					}
				}
		}
		
		return new ArrayList<Plugin>(pluginMap.values());
	}

	private Plugin loadPlugin(File file, PluginConfig config, IProject project) {
		URLClassLoader loader;
		Object instance;
		try {
			loader = new URLClassLoader (new URL[]{file.toURI().toURL()}, getClass().getClassLoader());
			Class<?> classToLoad = Class.forName (config.getPluginClassName(), true, loader);
			instance = classToLoad.newInstance ();
			
			return new EclipseSpecApiPlugin((ISpecApiPlugin) instance, config, project);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
