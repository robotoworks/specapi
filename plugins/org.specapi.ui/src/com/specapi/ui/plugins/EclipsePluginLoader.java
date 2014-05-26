package com.specapi.ui.plugins;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.specapi.plugins.ISpecApiPlugin;
import org.specapi.plugins.Plugin;
import org.specapi.plugins.PluginConfig;
import org.specapi.plugins.PluginLoader;
import org.specapi.ui.ProjectUtil;

public class EclipsePluginLoader extends PluginLoader {
	
	@Override
	public ArrayList<Plugin> loadPlugins(List<File> files) {
		ArrayList<Plugin> plugins =  super.loadPlugins(files);

		ArrayList<IProject> projects = ProjectUtil.getSpecApiPluginProjects();
		
		for(IProject project : projects) {

				PluginConfig pluginConfig = ProjectUtil.loadConfig(project);
								
				if(pluginConfig != null) {
					
					IFolder bin = project.getFolder("bin"); // TODO should look this up
					
					if(bin.exists()) {
						String fullPath = bin.getLocation().toOSString();
						
						File file = new File(fullPath);
	
						Plugin plugin = loadPlugin(file, pluginConfig, project);
						
						plugins.add(plugin);
					}
				}
		}
		
		return plugins;
	}

	private Plugin loadPlugin(File file, PluginConfig config, IProject project) {
		URLClassLoader loader;
		Object instance;
		try {
			loader = new URLClassLoader (new URL[]{file.toURI().toURL()}, getClass().getClassLoader());
			Class classToLoad = Class.forName (config.getPluginClassName(), true, loader);
			instance = classToLoad.newInstance ();
			
			return new EclipseSpecApiPlugin((ISpecApiPlugin) instance, config, project);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
