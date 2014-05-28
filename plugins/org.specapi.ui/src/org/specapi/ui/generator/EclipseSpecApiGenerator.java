package org.specapi.ui.generator;

import java.util.ArrayList;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.specapi.plugins.IPlugin;
import org.specapi.plugins.Plugin;
import org.specapi.plugins.UserPluginConfig;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class EclipseSpecApiGenerator implements IGenerator {

	private ArrayList<Plugin> plugins;
	private UserPluginConfig userConfig;

	@Inject Injector mInjector;
	
	public void setPlugins(ArrayList<Plugin> plugins) {
		this.plugins = plugins;
	}
	
	public void setUserConfig(UserPluginConfig userConfig) {
		this.userConfig = userConfig;
	}
	
	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		if(plugins != null && userConfig != null) {
			for(IPlugin plugin : plugins) {
				if(userConfig.targetsPlugin(plugin.getConfig().getPluginClassName())) {
					IGenerator generator = plugin.getGenerator();
					mInjector.injectMembers(generator);
					generator.doGenerate(input, fsa);
				}
			}
		}
	}
}
