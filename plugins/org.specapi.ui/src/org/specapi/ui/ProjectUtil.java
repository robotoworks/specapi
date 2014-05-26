package org.specapi.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.specapi.plugins.PluginConfig;
import org.specapi.plugins.PluginLoader;

public class ProjectUtil {
	public static ArrayList<IProject> getSpecApiPluginProjects() {
		
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		ArrayList<IProject> list = new ArrayList<IProject>();
		
		for(IProject project : projects) {

			IFile pluginConfigFile = project.getFile(PluginLoader.PLUGIN_CONFIG_FILENAME);
			
			if(pluginConfigFile.exists()) {
				list.add(project);
			}
		}	
		
		return list;
	}
	
	public static PluginConfig loadConfig(IProject project) {
		IFile pluginConfigFile = project.getFile(PluginLoader.PLUGIN_CONFIG_FILENAME);
		
		String pluginFilePath = pluginConfigFile.getLocation().toOSString();
		
		try {
			return PluginConfig.fromStream(new FileInputStream(new File(pluginFilePath)));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return null;
	}
	
	public static boolean isGeneratorTargetProject(IProject project) {
		IFile specapiConfig = project.getFile("specapi.config");
		
		if(specapiConfig.exists()) {
			return true;
		}
		
		return false;
	}
}
