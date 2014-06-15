package org.specapi.standalone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.specapi.StandaloneFileSystemAccess;
import org.specapi.plugins.IPlugin;
import org.specapi.plugins.OutputConfigurationMerger;
import org.specapi.plugins.Plugin;
import org.specapi.plugins.PluginConfigParser;
import org.specapi.plugins.PluginLoader;
import org.specapi.plugins.UserPluginConfig;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Compiler {
	
	@Inject Injector mInjector;
	@Inject StandaloneFileSystemAccess mFileSystemAccess;
	@Inject XtextResourceSet mResourceSet;
	@Inject PluginConfigParser mConfigParser;
	@Inject PluginLoader mPluginLoader;
	@Inject OutputConfigurationMerger mOutputConfigMerger;
	private ArrayList<Plugin> mPlugins;
	private UserPluginConfig mTargetConfig;
	private Map<String, OutputConfiguration> mOutputConfigurations;

	public void compile(List<File> pluginRoots, String source, boolean recurse) {
		
		mPlugins = mPluginLoader.loadPlugins(pluginRoots);
		mResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		File file = new File(System.getProperty("user.dir"), source);
		
		System.out.println("[input] " + file.getAbsolutePath());

		if(!file.exists()) {
			System.out.println("[input] invalid input source, the file or directory could not be found");
			return;
		}
		
		try {
			mTargetConfig = loadTargetConfig(file);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.out.println("[failed] could not find config " + PluginLoader.PLUGIN_TARGET_CONFIG_FILENAME);
			return;
		}

		mOutputConfigurations = createOutputConfigurations();
		mFileSystemAccess.setOutputConfigurations(mOutputConfigurations);
		
		ArrayList<String> resourcePaths = new ArrayList<String>();
		
		gatherResourcePaths(resourcePaths, file, recurse);
		
		loadResources(resourcePaths);
		
		List<Issue> issues = validate();
		
		for(Issue issue : issues) {
			System.out.println(String.format("%s %s, line:%s, offset:%s, len:%s", 
					issue.getSeverity().name(),
					issue.getMessage(), 
					issue.getLineNumber(), 
					issue.getOffset(), 
					issue.getLength()));
		}
		
		if(issues.size() == 0) {
			try {
				copyResources();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("[failed] failed to copy resources, see trace");
				return;
			}
			
			generate();
		}

	}

	private UserPluginConfig loadTargetConfig(File file) throws FileNotFoundException {
		File configFile = null;
		
		if(file.isDirectory()) {
			configFile = new File(file, PluginLoader.PLUGIN_TARGET_CONFIG_FILENAME);
		} else {
			configFile = new File(file.getParentFile(), PluginLoader.PLUGIN_TARGET_CONFIG_FILENAME);
		}
		
		return mConfigParser.parseUserConfigFromStream(new FileInputStream(configFile));
	}

	private List<Issue> validate() {
		List<Issue> issues = Lists.newArrayList();
		for (Resource resource : mResourceSet.getResources()) {
			IResourceServiceProvider resourceServiceProvider = IResourceServiceProvider.Registry.INSTANCE
					.getResourceServiceProvider(resource.getURI());
			if (resourceServiceProvider != null) {
				IResourceValidator resourceValidator = resourceServiceProvider.getResourceValidator();
				List<Issue> result = resourceValidator.validate(resource, CheckMode.ALL, null);
				
				for(Issue issue : result) {
						issues.add(issue);
				}
			}
		}
		return issues;
	}

	protected void generate() {
		for(Resource resource : mResourceSet.getResources()) {
			for(IPlugin plugin : mPlugins) {
				if(plugin.getGenerator() != null && mTargetConfig.targetsPlugin(plugin.getConfig().getPluginClassName())) {
					IGenerator generator = plugin.getGenerator();
					mInjector.injectMembers(generator);
					generator.doGenerate(resource, mFileSystemAccess);
				}
			}
		}
	}
	
	protected void copyResources() throws IOException {
		for(IPlugin plugin : mPlugins) {
			if(mTargetConfig.targetsPlugin(plugin.getConfig().getPluginClassName())) {
				OutputConfiguration outConfiguration = mOutputConfigurations.get(plugin.getConfig().getOutputConfigurations().get(0).getName());
				File outputFolder = new File(System.getProperty("user.dir"), outConfiguration.getOutputDirectory());
			    plugin.copyResources(outputFolder);
			}
		}
	}

	protected void loadResources(ArrayList<String> resourcePaths) {
		for(String path : resourcePaths) {
			mResourceSet.getResource(URI.createURI(path), true);
		}
	}

	private void gatherResourcePaths(ArrayList<String> paths, File file, boolean recurse) {
		
		if(file.isFile() && file.toString().endsWith(".specapi")) {
			paths.add(file.toString());
			return;
		}
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			
			for(File f : files) {
				if(f.isDirectory() && recurse) {
					gatherResourcePaths(paths, f, recurse);
				} else if (f.isFile() && f.toString().endsWith(".specapi")) {
					paths.add(f.toString());
				}
			}
			
		}
	}

	protected Map<String, OutputConfiguration> createOutputConfigurations() {
		
		Map<String, OutputConfiguration> outputConfigurations = new HashMap<String, OutputConfiguration>();
		
		for(IPlugin plugin : mPlugins) {
			if(mTargetConfig.targetsPlugin(plugin.getConfig().getPluginClassName())) {
				for(OutputConfiguration outConfig : mOutputConfigMerger.merge(mTargetConfig, plugin.getConfig())) {
					outputConfigurations.put(outConfig.getName(), outConfig);
				}
			}
		}
		return outputConfigurations;
	}
}