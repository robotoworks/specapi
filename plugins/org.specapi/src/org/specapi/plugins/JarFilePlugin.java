package org.specapi.plugins;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.specapi.util.Files;

public class JarFilePlugin extends Plugin {

	private File jarFile;

	public JarFilePlugin(ISpecApiPlugin plugin, PluginConfig config, File jarFile) {
		super(plugin, config);
		this.jarFile = jarFile;
	}
	
	@Override
	public void copyResources(File outputFolder) throws IOException {
		OutputConfiguration outputConfig = getFirstOutputConfigurationOrNull();
		
		if(outputConfig != null) {
			JarFile jar = new JarFile(jarFile);
			
			Enumeration<JarEntry> entries = jar.entries();
			
			while(entries.hasMoreElements()) {
				JarEntry entry = entries.nextElement();
				
				if(entry.getName().startsWith(DEFAULT_RESOURCES_PATH)) {
					File resourceRelativePath = new File(outputConfig.getOutputDirectory(), entry.getName().substring(DEFAULT_RESOURCES_PATH.length()));
					File outputFile = new File(outputFolder, resourceRelativePath.getPath());
					System.out.println("[copy resource] " + resourceRelativePath.getPath());
					
					if(entry.isDirectory()) {
						outputFile.mkdirs();
					} else {
						Files.copyStream(jar.getInputStream(entry), new FileOutputStream(outputFile));
					}
				}
			}
		}
	}
}
