package org.specapi.plugins.tests

import com.google.inject.Inject
import java.io.File
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.specapi.SpecApiLangInjectorProvider
import org.specapi.plugins.PluginConfig
import org.specapi.plugins.PluginLoader

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SpecApiLangInjectorProvider))
public class PluginLoaderTests {
    
    @Inject var PluginLoader loader
    
    @Test
    def loading() {
    	
    	// arrange
    	var resourceUrl = class.getResource("/resources/plugins")
    	var file = new File(resourceUrl.toURI)
    	
    	assertTrue(file.exists)
    	
    	// act
    	var plugins = loader.loadPlugins(#[file])
    	
    	// assert
    	assertEquals(1, plugins.length)
    	
    	var plugin = plugins.get(0)
    	
    	var IGenerator generator = plugin.generator
    	
    	assertNotNull(generator)
    	
    	var PluginConfig config = plugin.config
    	
    	assertNotNull(config)
    	assertEquals("org.specapi.plugins.simple.Plugin", config.pluginClassName)
    	assertEquals(1, config.outputConfigurations.length)
    	assertEquals("org.specapi.plugins.simple.Plugin:SIMPLE", config.outputConfigurations.head.name)
	}
}
