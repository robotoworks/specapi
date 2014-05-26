package org.specapi.ui.generator;

import java.util.ArrayList;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.specapi.plugins.IPlugin;
import org.specapi.plugins.Plugin;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class EclipseSpecApiGenerator implements IGenerator {

	private ArrayList<Plugin> plugins;

	@Inject Injector mInjector;
	
	public void setPlugins(ArrayList<Plugin> plugins) {
		this.plugins = plugins;
	}
	
	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		for(IPlugin plugin : plugins) {
			IGenerator generator = plugin.getGenerator();
			mInjector.injectMembers(generator);
			generator.doGenerate(input, fsa);
		}
	}
}
