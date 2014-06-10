package org.specapi.plugins.tests

import com.google.inject.Inject
import java.io.ByteArrayInputStream
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import org.specapi.SpecApiLangInjectorProvider
import org.specapi.plugins.OutputConfigurationMerger
import org.specapi.plugins.PluginConfig
import org.specapi.plugins.PluginConfigParser
import org.specapi.plugins.UserPluginConfig

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SpecApiLangInjectorProvider))
public class OutputConfigurationMergerTests {
    
    @Inject var PluginConfigParser parser
    @Inject var OutputConfigurationMerger merger
    
	@Test
	def mergeUserOutputConfig() {
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
					"clean_up_derived_resources":false,
					"set_derived_resources":true,
					"keep_local_history":true
				},
				{
					"name":"B",
					"description":"B Output Folder",
					"output_directory":"./b-gen",
					"override_existing_resources":true,
					"create_output_directory":true,
					"clean_up_derived_resources":true,
					"set_derived_resources":true,
					"keep_local_history":false
				}
			]
		}
		'''.toString.getBytes("UTF-8"))		
		
		var userConfigStream = new ByteArrayInputStream('''
		{
			"targets":[
				{
					"plugin":"org.specapi.plugins.docs.TestPlugin",
					"outputs":[
						{
							"name":"A",
							"output_directory":"./a-gen-changed",
							"override_existing_resources":false
						}
					]
				}
			]
		}
		'''.toString.getBytes("UTF-8"))
		
		var PluginConfig pluginConfig = parser.parsePluginConfigFromStream(configStream)
		var UserPluginConfig userConfig = parser.parseUserConfigFromStream(userConfigStream)
		
		// act
		var mergedConfigs = merger.merge(userConfig, pluginConfig)
		
		assertNotNull(mergedConfigs)
		assertEquals(2, mergedConfigs.length)
		
		// config A should be merged
		assertEquals("org.specapi.plugins.docs.TestPlugin:A", mergedConfigs.get(0).name)
		assertEquals("./a-gen-changed", mergedConfigs.get(0).outputDirectory)
		assertEquals(false, mergedConfigs.get(0).overrideExistingResources)
		assertEquals(true, mergedConfigs.get(0).createOutputDirectory)
		assertEquals(false, mergedConfigs.get(0).cleanUpDerivedResources)
		assertEquals(true, mergedConfigs.get(0).setDerivedProperty)
		assertEquals(true, mergedConfigs.get(0).keepLocalHistory)
		
		// config B remains the same
		assertEquals("org.specapi.plugins.docs.TestPlugin:B", mergedConfigs.get(1).name)
		assertEquals("./b-gen", mergedConfigs.get(1).outputDirectory)
		assertEquals(true, mergedConfigs.get(1).overrideExistingResources)
		assertEquals(true, mergedConfigs.get(1).createOutputDirectory)
		assertEquals(true, mergedConfigs.get(1).cleanUpDerivedResources)
		assertEquals(true, mergedConfigs.get(1).setDerivedProperty)
		assertEquals(false, mergedConfigs.get(1).keepLocalHistory)
	}
}
