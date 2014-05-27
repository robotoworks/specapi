package org.specapi.standalone;

import java.io.File;
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
import org.specapi.SpecApiLangStandaloneSetup;
import org.specapi.StandaloneFileSystemAccess;
import org.specapi.plugins.IPlugin;
import org.specapi.plugins.Plugin;
import org.specapi.plugins.PluginLoader;

import com.google.common.collect.Lists;
import com.google.inject.Injector;

public class Compiler {
	
	private Injector mInjector;
	private StandaloneFileSystemAccess mFileSystemAccess;
	private XtextResourceSet mResourceSet;
	private String mExtension;
	private ArrayList<Plugin> mPlugins;

	public Compiler(SpecApiLangStandaloneSetup setup, List<File> pluginRoots, String extension) {
		mExtension = extension;
		mInjector = setup.createInjectorAndDoEMFRegistration();
		mPlugins = mInjector.getInstance(PluginLoader.class).loadPlugins(pluginRoots);
		
		mFileSystemAccess = mInjector.getInstance(StandaloneFileSystemAccess.class);
		
		mResourceSet = mInjector.getInstance(XtextResourceSet.class);
		mResourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
	}

	public void compile(String source, boolean recurse) {
		
		Map<String, OutputConfiguration> outputConfigurations = createOutputConfigurations();
		mFileSystemAccess.setOutputConfigurations(outputConfigurations);
		
		File file = new File(System.getProperty("user.dir"), source);
		
		System.out.println("[input] " + file.getAbsolutePath());

		if(!file.exists()) {
			System.out.println("[input] invalid input source, the file or directory could not be found");
		}
		
		ArrayList<String> resourcePaths = new ArrayList<String>();
		
		getResourcePaths(resourcePaths, file, recurse);
		
		loadResources(resourcePaths);
		
		List<Issue> issues = validate();
		
		for(Issue issue : issues) {
			System.out.println(issue.getCode() + ":" + issue.getMessage());
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
				if(plugin.getGenerator() != null) {
					IGenerator generator = plugin.getGenerator();
					mInjector.injectMembers(generator);
					generator.doGenerate(resource, mFileSystemAccess);
				}
			}
		}
	}
	
	protected void copyResources() throws IOException {
		for(IPlugin plugin : mPlugins) {
			if(!plugin.getConfig().getOutputConfigurations().isEmpty()) {
				File outputFolder = new File(System.getProperty("user.dir"), plugin.getConfig().getOutputConfigurations().iterator().next().getOutputDirectory());
			    plugin.copyResources(outputFolder);
			}
		}
	}

	protected void loadResources(ArrayList<String> resourcePaths) {
		for(String path : resourcePaths) {
			mResourceSet.getResource(URI.createURI(path), true);
		}
	}

	private void getResourcePaths(ArrayList<String> paths, File file, boolean recurse) {
		
		if(file.isFile() && file.toString().endsWith(mExtension)) {
			paths.add(file.toString());
			return;
		}
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			
			for(File f : files) {
				if(f.isDirectory() && recurse) {
					getResourcePaths(paths, f, recurse);
				} else if (f.isFile() && f.toString().endsWith(mExtension)) {
					paths.add(f.toString());
				}
			}
			
		}
	}

	protected Map<String, OutputConfiguration> createOutputConfigurations() {
		
		Map<String, OutputConfiguration> outputConfigurations = new HashMap<String, OutputConfiguration>();
		
		for(IPlugin plugin : mPlugins) {
			for(OutputConfiguration outConfig : plugin.getConfig().getOutputConfigurations()) {
				outputConfigurations.put(outConfig.getName(), outConfig);
			}
		}
		return outputConfigurations;
	}
}