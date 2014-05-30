package org.specapi.plugins

import java.util.List
import java.util.ArrayList

class OutputConfigurationMerger {
	
	def List<SpecApiOutputConfiguration> merge(UserPluginConfig from, PluginConfig to) {
		var mergedConfigs = new ArrayList<SpecApiOutputConfiguration> 
		
		var userConfig = from.getConfig(to.pluginClassName)
		
		for(config : to.outputConfigurations) {
			var userOutConfig = userConfig.getOutputConfiguration(config.name)
			
			if(userOutConfig == null) {
				mergedConfigs.add(config)
			} else {
				var mergedConfig = config.copy
				
				if(userOutConfig.outputDirectorySet) {
					mergedConfig.setOutputDirectory(userOutConfig.outputDirectory)
				}
				
				if(userOutConfig.canClearOutputDirectorySet) {
					mergedConfig.setCanClearOutputDirectory(userOutConfig.canClearOutputDirectory)
				}
				
				if(userOutConfig.cleanUpDerivedResourcesSet) {
					mergedConfig.setCleanUpDerivedResources(userOutConfig.cleanUpDerivedResources)
				}
				
				if(userOutConfig.createOutputDirectorySet) {
					mergedConfig.setCreateOutputDirectory(userOutConfig.createOutputDirectory)
				}
				
				if(userOutConfig.overrideExistingResourcesSet) {
					mergedConfig.setOverrideExistingResources(userOutConfig.overrideExistingResources)
				}
				
				mergedConfigs.add(mergedConfig)
				
			}
			
		}
		
		return mergedConfigs
	}
	
}