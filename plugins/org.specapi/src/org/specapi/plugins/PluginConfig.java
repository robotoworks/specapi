package org.specapi.plugins;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;

import com.google.common.base.Strings;
import org.specapi.json.JsonReader;

public class PluginConfig {
	
	private String mPluginClassName;
	private HashSet<OutputConfiguration> mOutputConfigurations = new HashSet<OutputConfiguration>();

	public void setPluginClassName(String name) {
		mPluginClassName = name;
	}
	
	public String getPluginClassName() {
		return mPluginClassName;
	}
	
	public Set<OutputConfiguration> getOutputConfigurations() {
		return mOutputConfigurations;
	}
	
	public static PluginConfig fromStream(InputStream stream) throws IOException {
		
		PluginConfig config = new PluginConfig();

		JsonReader reader = new JsonReader(new InputStreamReader(stream));
		
		try {
			reader.beginObject();
			
			while(reader.hasNext()) {
				String name = reader.nextName();
				
				if(name.equals("plugin")) {
					config.setPluginClassName(reader.nextString());
				}
				
				if(name.equals("configurations")) {
					reader.beginArray();
					
					while(reader.hasNext()) {
						reader.beginObject();
						
						
						String configName = null;
						String configDescription = null;
						String configOutDir = null;
						boolean configOverrideExisting = true;
						boolean configCreateOutputDir = true;
						boolean configCleanUpDerived = true;
						boolean configSetDerived = true;
						boolean configKeepLocalHistory = true;
						
						while(reader.hasNext()) {
							String configProperty = reader.nextName();
							
							if(configProperty.equals("name")) {
								configName = reader.nextString();
							} else if(configProperty.equals("description")) {
								configDescription = reader.nextString();
							} else if(configProperty.equals("output_directory")) {
								configOutDir = reader.nextString();
							} else if(configProperty.equals("override_existing_resources")) {
								configOverrideExisting = reader.nextBoolean();
							} else if(configProperty.equals("create_output_directory")) {
								configCreateOutputDir = reader.nextBoolean();
							} else if(configProperty.equals("clean_up_derived_resources")) {
								configCleanUpDerived = reader.nextBoolean();
							} else if(configProperty.equals("set_derived_resources")) {
								configSetDerived = reader.nextBoolean();
							} else if (configProperty.equals("keep_local_history")) {
								configKeepLocalHistory = reader.nextBoolean();
							}
						}
						
						if(!Strings.isNullOrEmpty(configName)) {
							OutputConfiguration outputConfig = new OutputConfiguration(config.getPluginClassName() + ":" + configName);
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
					
					reader.endArray();
				}
			}
			reader.endObject();
		} finally {
			reader.close();
		}
		
		
		return config;
	}
}
