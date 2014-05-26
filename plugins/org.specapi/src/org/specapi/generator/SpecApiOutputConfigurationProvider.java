package org.specapi.generator;

import java.util.Collection;
import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

import com.google.common.collect.Sets;

public class SpecApiOutputConfigurationProvider extends OutputConfigurationProvider {
	
	private Set<OutputConfiguration> mSpecApiConfigurations = Sets.newHashSet();
	
	public void addConfiguration(OutputConfiguration configuration) {
		mSpecApiConfigurations.add(configuration);
	}
	
	public void addAllConfigurations(Collection<OutputConfiguration> configurations) {
		mSpecApiConfigurations.addAll(configurations);
	}
	
	
	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		
		Set<OutputConfiguration> set = super.getOutputConfigurations();
		set.addAll(mSpecApiConfigurations);
		return set;
	}
}
