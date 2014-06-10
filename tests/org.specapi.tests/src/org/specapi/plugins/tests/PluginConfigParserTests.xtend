package org.specapi.plugins.tests

import com.google.inject.Inject
import java.io.ByteArrayInputStream
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.specapi.SpecApiLangInjectorProvider
import org.specapi.plugins.PluginConfigParser
import org.specapi.plugins.UserPluginConfig

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SpecApiLangInjectorProvider))
public class PluginConfigParserTests {
    
    @Inject var PluginConfigParser parser
    
    @Test
    def parsePluginConfig() {
		var configStream = new ByteArrayInputStream('''
		{
			"plugin":"org.specapi.plugins.docs.TestPlugin",
			"outputs":[
				{
					"name":"A",
					"description":"A Output Folder",
					"output_directory":"./a-gen",
					"override_existing_resources":true,
					"create_output_directory":true,
					"clean_up_derived_resources":true,
					"set_derived_resources":true,
					"keep_local_history":true
				},
				{
					"name":"B",
					"description":"B Output Folder",
					"output_directory":"./b-gen",
					"override_existing_resources":false,
					"create_output_directory":true,
					"clean_up_derived_resources":true,
					"set_derived_resources":true,
					"keep_local_history":false
				}
			]
		}
		'''.toString.getBytes("UTF-8"))
		
		var config = parser.parsePluginConfigFromStream(configStream)
		
		assertEquals("org.specapi.plugins.docs.TestPlugin", config.pluginClassName)
		assertEquals(2, config.outputConfigurations.length)
		
		assertEquals("org.specapi.plugins.docs.TestPlugin:A", config.outputConfigurations.get(0).name)
		assertEquals("A Output Folder", config.outputConfigurations.get(0).description)
		assertEquals("./a-gen", config.outputConfigurations.get(0).outputDirectory)
		assertEquals(true, config.outputConfigurations.get(0).overrideExistingResources)
		assertEquals(true, config.outputConfigurations.get(0).createOutputDirectory)
		assertEquals(true, config.outputConfigurations.get(0).cleanUpDerivedResources)
		assertEquals(true, config.outputConfigurations.get(0).keepLocalHistory)
		
		assertEquals("org.specapi.plugins.docs.TestPlugin:B", config.outputConfigurations.get(1).name)
		assertEquals("B Output Folder", config.outputConfigurations.get(1).description)
		assertEquals("./b-gen", config.outputConfigurations.get(1).outputDirectory)
		assertEquals(false, config.outputConfigurations.get(1).overrideExistingResources)
		assertEquals(true, config.outputConfigurations.get(1).createOutputDirectory)
		assertEquals(true, config.outputConfigurations.get(1).cleanUpDerivedResources)
		assertEquals(false, config.outputConfigurations.get(1).keepLocalHistory)
	}
	
	@Test
    def parseUserConfig() {
		var configStream = new ByteArrayInputStream('''
		{
			"targets":[
				{
					"plugin":"org.specapi.plugins.docs.TestPlugin",
					"outputs":[
						{
							"name":"A",
							"output_directory":"./a-gen"
						}
					]
				},
				{
					"plugin":"org.specapi.plugins.docs.TestPlugin2",
					"outputs":[
						{
							"name":"B",
							"output_directory":"./a-gen"
						}
					]
				}
			]
		}
		'''.toString.getBytes("UTF-8"))
		
		
		var UserPluginConfig config = parser.parseUserConfigFromStream(configStream)
		
		assertEquals(2, config.configs.length)
		assertEquals("org.specapi.plugins.docs.TestPlugin", config.configs.get(0).pluginClassName)
		assertEquals("org.specapi.plugins.docs.TestPlugin2", config.configs.get(1).pluginClassName)
		
		assertEquals(1, config.configs.get(0).outputConfigurations.length);
		assertEquals(1, config.configs.get(1).outputConfigurations.length);
		
		assertNotNull(config.getConfig("org.specapi.plugins.docs.TestPlugin"))
		assertNotNull(config.getConfig("org.specapi.plugins.docs.TestPlugin2"))
		
		assertTrue(config.targetsPlugin("org.specapi.plugins.docs.TestPlugin"))
		assertTrue(config.targetsPlugin("org.specapi.plugins.docs.TestPlugin2"))
	}
}
