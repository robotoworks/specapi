package org.specapi.plugins;

import org.eclipse.xtext.generator.OutputConfiguration;

public class SpecApiOutputConfiguration extends OutputConfiguration {

	private boolean canClearOutputDirectoryIsSet;
	private boolean cleanUpDerivedResourcesIsSet;
	private boolean createOutputDirectoryIsSet;
	private boolean outputDirectoryIsSet;
	private boolean overrideExistingResourcesIsSet;
	private String name;
	
	public SpecApiOutputConfiguration() {
		super(null);
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public SpecApiOutputConfiguration(String name) {
		super(name);
		this.name = name;
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
	
	public boolean isOverrideExistingResourcesSet() {
		return overrideExistingResourcesIsSet;
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
	
	@Override
	public void setOverrideExistingResources(boolean overrideExistingResources) {
		super.setOverrideExistingResources(overrideExistingResources);
		overrideExistingResourcesIsSet = true;
	}
	
	public SpecApiOutputConfiguration copy() {
		SpecApiOutputConfiguration copy = new SpecApiOutputConfiguration(getName());
		copy.setDescription(getDescription());
		copy.setOutputDirectory(getOutputDirectory());
		copy.setCanClearOutputDirectory(isCanClearOutputDirectory());
		copy.setCleanUpDerivedResources(isCleanUpDerivedResources());
		copy.setCreateOutputDirectory(isCreateOutputDirectory());
		copy.setKeepLocalHistory(isKeepLocalHistory());
		copy.setOverrideExistingResources(isOverrideExistingResources());
		copy.setSetDerivedProperty(isSetDerivedProperty());
		copy.setHideSyntheticLocalVariables(isHideSyntheticLocalVariables());
		copy.setInstallDslAsPrimarySource(isInstallDslAsPrimarySource());

		return copy;
	}
}
