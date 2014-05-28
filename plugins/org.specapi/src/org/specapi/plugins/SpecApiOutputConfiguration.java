package org.specapi.plugins;

import org.eclipse.xtext.generator.OutputConfiguration;

public class SpecApiOutputConfiguration extends OutputConfiguration {

	private boolean canClearOutputDirectoryIsSet;
	private boolean cleanUpDerivedResourcesIsSet;
	private boolean createOutputDirectoryIsSet;
	private boolean outputDirectoryIsSet;
	
	public SpecApiOutputConfiguration(String name) {
		super(name);
	}
	
	public boolean isCanClearOutputDirectorySet() {
		return canClearOutputDirectoryIsSet;
	}
	
	public boolean isCleanUpDerivedResourcesSet() {
		return cleanUpDerivedResourcesIsSet;
	}
	
	public boolean isCreateOutputDirectorySet() {
		return createOutputDirectoryIsSet;
	}
	
	public boolean isOutputDirectorySet() {
		return outputDirectoryIsSet;
	}
	
	@Override
	public void setCanClearOutputDirectory(boolean canClearOutputDirectory) {
		super.setCanClearOutputDirectory(canClearOutputDirectory);
		canClearOutputDirectoryIsSet = true;
	}
	
	@Override
	public void setCleanUpDerivedResources(boolean cleanUpDerivedResources) {
		super.setCleanUpDerivedResources(cleanUpDerivedResources);
		cleanUpDerivedResourcesIsSet = true;
	}
	
	@Override
	public void setCreateOutputDirectory(boolean createOutputDirectory) {
		super.setCreateOutputDirectory(createOutputDirectory);
		createOutputDirectoryIsSet = true;
	}
	
	@Override
	public void setOutputDirectory(String outputDirectory) {
		super.setOutputDirectory(outputDirectory);
		outputDirectoryIsSet = true;
	}
}
