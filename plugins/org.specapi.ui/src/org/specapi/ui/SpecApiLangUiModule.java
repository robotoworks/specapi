/*
 * generated by Xtext
 */
package org.specapi.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingHelper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.specapi.plugins.PluginLoader;
import org.specapi.ui.generator.EclipseSpecApiGenerator;

import com.specapi.ui.plugins.EclipsePluginLoader;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SpecApiLangUiModule extends org.specapi.ui.AbstractSpecApiLangUiModule {
	public SpecApiLangUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends OutputConfigurationProvider> bindOutputConfigurationProvider() {
		return org.specapi.generator.SpecApiOutputConfigurationProvider.class;
	}
 
	public Class<? extends org.eclipse.xtext.builder.IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
		return org.specapi.ui.builder.SpecApiBuilderParticipant.class;
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return org.specapi.editor.syntaxcoloring.SpecApiSemanticHighlightingCalculator.class;
	}
	
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return org.specapi.editor.syntaxcoloring.SpecApiHighlightingConfiguration.class;
	}
	
	public Class<? extends PluginLoader> bindPluginLoader() {
		return EclipsePluginLoader.class;
	}
	
	public Class<? extends org.eclipse.xtext.generator.IGenerator> bindIGenerator() {
		return EclipseSpecApiGenerator.class;
	}
}
