package org.specapi;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import com.google.inject.Injector;

public class CompilerMain {
	
	public static void main(String[] args) {
		
		if(args == null || args.length == 0) {
			printUsage();
			return;
		}
		
		Iterator<String> arguments = Arrays.asList(args).iterator();
		
		String inputSource = null;
		boolean recurse = false;
		
		while(arguments.hasNext()) {
			String arg = arguments.next();
			
			if(arg.equals("-r")) {
				recurse = true;
			} else {
				inputSource = arg;
			}
		}
		
		ArrayList<File> pluginRoots = new ArrayList<File>();
		
		File defaultPluginRoot = new File(CompilerMain.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		pluginRoots.add(defaultPluginRoot);
		
		System.out.println("[plugins path] " + defaultPluginRoot.getAbsolutePath());
		
		Compiler compiler = new Compiler(new SpecApiLangStandaloneSetup(), pluginRoots, ".specapi");
		
		compiler.compile(inputSource, recurse);
	}
	
	private static void printUsage() {
		System.out.println("Usage: <options> <input source>");
		System.out.println("Options:");
		System.out.println("-r 			recurse the given input source (must be a directory)");
	}
}
