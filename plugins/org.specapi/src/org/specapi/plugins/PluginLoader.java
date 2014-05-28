package org.specapi.plugins;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;


public class PluginLoader {

	public static final String PLUGIN_CONFIG_FILENAME = "specapiplugin.config";
	public static final String PLUGIN_TARGET_CONFIG_FILENAME = "specapi.config";

	@Inject PluginConfigParser pluginConfigParser;
	
	public PluginConfigParser getPluginConfigParser() {
		return pluginConfigParser;
	}
	
	public ArrayList<Plugin> loadPlugins(List<File> files) {
		ArrayList<Plugin> plugins = new ArrayList<Plugin>();
		
		if(files == null) {
			return plugins;
		}

		for(File rootFile : files) {
			for(File file : rootFile.listFiles(getFileFilter())) {
				Plugin plugin = loadPlugin(file);
				plugins.add(plugin);
			}
		}
		
		
		return plugins;
	}
	
	protected Plugin loadPlugin(File file) {
		URLClassLoader loader;
		Object instance;
		try {
			loader = new URLClassLoader (new URL[]{file.toURI().toURL()}, getClass().getClassLoader());
			PluginConfig config = pluginConfigParser.parsePluginConfigFromStream(loader.getResourceAsStream(PLUGIN_CONFIG_FILENAME));
			Class<?> classToLoad = Class.forName (config.getPluginClassName(), true, loader);
			instance = classToLoad.newInstance ();
			
			return new JarFilePlugin((ISpecApiPlugin) instance, config, file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	protected FilenameFilter getFileFilter() {
		return new FilenameFilter() {
			@Override
			public boolean accept(File arg0, String arg1) {
				return arg1.endsWith(".jar");
			}
		};
	}
}
