package org.specapi.plugins;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.specapi.util.Files;

public class JarFilePlugin extends Plugin {

	private File jarFile;

	public JarFilePlugin(ISpecApiPlugin plugin, PluginConfig config, File jarFile) {
		super(plugin, config);
		this.jarFile = jarFile;
	}
	
	@Override
	public void copyResources(File outputFolder) throws IOException {
		JarFile jar = new JarFile(jarFile);
		
		Enumeration<JarEntry> entries = jar.entries();
		
		while(entries.hasMoreElements()) {
			JarEntry entry = entries.nextElement();
			
			if(entry.getName().startsWith(DEFAULT_RESOURCES_PATH)) {
				String resourceRelativePath = entry.getName().substring(DEFAULT_RESOURCES_PATH.length());
				System.out.println("[copy resource] " + resourceRelativePath);
				
				if(entry.isDirectory()) {
					File dir = new File(outputFolder, resourceRelativePath);
					dir.mkdirs();
				} else {
					File outputFile = new File(outputFolder, resourceRelativePath);
					Files.copyStream(jar.getInputStream(entry), new FileOutputStream(outputFile));
				}
			}
		}
	}
}
