package org.specapi.plugins

import com.google.common.base.Strings
import java.io.InputStream
import java.io.InputStreamReader
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
			
			
			var SpecApiOutputConfiguration outputConfig = new SpecApiOutputConfiguration();
			
			while(reader.hasNext()) {
				var prop = reader.nextName();
				
				if(prop.equals("name")) {
					outputConfig.setName(config.getPluginClassName() + ":" + reader.nextString());
				} else if(prop.equals("description")) {
					outputConfig.setDescription(reader.nextString());
				} else if(prop.equals("output_directory")) {
					outputConfig.setOutputDirectory(reader.nextString());
				} else if(prop.equals("override_existing_resources")) {
					outputConfig.setOverrideExistingResources(reader.nextBoolean());
				} else if(prop.equals("create_output_directory")) {
					outputConfig.setCreateOutputDirectory(reader.nextBoolean());
				} else if(prop.equals("clean_up_derived_resources")) {
					outputConfig.setCleanUpDerivedResources(reader.nextBoolean());
				} else if(prop.equals("set_derived_resources")) {
					outputConfig.setSetDerivedProperty(reader.nextBoolean());
				} else if (prop.equals("keep_local_history")) {
					outputConfig.setKeepLocalHistory(reader.nextBoolean());
				}
			}
			
			if(!Strings.isNullOrEmpty(outputConfig.name)) {
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