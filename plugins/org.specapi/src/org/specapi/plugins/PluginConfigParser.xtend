package org.specapi.plugins

import com.google.common.base.Strings
import java.io.InputStream
import java.io.InputStreamReader
import org.eclipse.xtext.generator.OutputConfiguration
import org.specapi.json.JsonReader

class PluginConfigParser {
	
	def PluginConfig parsePluginConfigFromStream(InputStream stream) {
		
		var config = new PluginConfig();

		var reader = new JsonReader(new InputStreamReader(stream));
		
		try {
			parseConfig(reader, config);
		} finally {
			reader.close();
		}
		
		
		return config;
	}
	
	private def parseConfig(JsonReader reader, PluginConfig config) {
		reader.beginObject();
		
		while(reader.hasNext()) {
			var name = reader.nextName();
			
			if(name.equals("plugin")) {
				config.setPluginClassName(reader.nextString());
			}
			
			if(name.equals("configurations")) {
				parseOutputConfigurations(reader, config);
			}
		}
		reader.endObject()
	}
	
	private def parseOutputConfigurations(JsonReader reader, PluginConfig config) {
		reader.beginArray();
		
		while(reader.hasNext()) {
			reader.beginObject();
			
			
			var String configName = null;
			var String configDescription = null;
			var String configOutDir = null;
			var configOverrideExisting = true;
			var configCreateOutputDir = true;
			var configCleanUpDerived = true;
			var configSetDerived = true;
			var configKeepLocalHistory = true;
			
			while(reader.hasNext()) {
				var prop = reader.nextName();
				
				if(prop.equals("name")) {
					configName = reader.nextString();
				} else if(prop.equals("description")) {
					configDescription = reader.nextString();
				} else if(prop.equals("output_directory")) {
					configOutDir = reader.nextString();
				} else if(prop.equals("override_existing_resources")) {
					configOverrideExisting = reader.nextBoolean();
				} else if(prop.equals("create_output_directory")) {
					configCreateOutputDir = reader.nextBoolean();
				} else if(prop.equals("clean_up_derived_resources")) {
					configCleanUpDerived = reader.nextBoolean();
				} else if(prop.equals("set_derived_resources")) {
					configSetDerived = reader.nextBoolean();
				} else if (prop.equals("keep_local_history")) {
					configKeepLocalHistory = reader.nextBoolean();
				}
			}
			
			if(!Strings.isNullOrEmpty(configName)) {
				var outputConfig = new OutputConfiguration(config.getPluginClassName() + ":" + configName);
				outputConfig.setDescription(configDescription);
				outputConfig.setOutputDirectory(configOutDir);
				outputConfig.setOverrideExistingResources(configOverrideExisting);
				outputConfig.setCreateOutputDirectory(configCreateOutputDir);
				outputConfig.setCleanUpDerivedResources(configCleanUpDerived);
				outputConfig.setSetDerivedProperty(configSetDerived);
				outputConfig.setKeepLocalHistory(configKeepLocalHistory);
				
				config.getOutputConfigurations().add(outputConfig);
			}
			
			reader.endObject();
		}
		
		reader.endArray()
	}
	
	def UserPluginConfig parseUserConfigFromStream(InputStream stream) {
		var config = new UserPluginConfig;

		var reader = new JsonReader(new InputStreamReader(stream));
			
		try {
			reader.beginObject();
		
			while(reader.hasNext()) {
				var name = reader.nextName();
				if(name.equals("targets")) {
					reader.beginArray
						while(reader.hasNext) {
							var pluginConfig = new PluginConfig
							parseConfig(reader, pluginConfig)
							config.configs.add(pluginConfig)
						}
					reader.endArray
				}
			}
		} finally {
			reader.close;
		}
		
		
		return config;
	}
	
}