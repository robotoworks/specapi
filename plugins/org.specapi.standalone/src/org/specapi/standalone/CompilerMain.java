package org.specapi.standalone;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.specapi.SpecApiLangStandaloneSetup;

public class CompilerMain {
	
    private static final String VERSION="0.1.2";
	
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
			}
			else if(arg.equals("-v")) {
				printVersion();
				return;
			} else {
				inputSource = arg;
			}
		}
		
		// TODO: this is very basic way of downloading a single file, we should
		// expand on this to make it more flexibile
		if(inputSource != null && 
				(inputSource.startsWith("http://") || inputSource.startsWith("https://"))) {
			try {
			URL website = new URL(inputSource);
			String targetFileName = inputSource.substring(inputSource.lastIndexOf("/") + 1);
			ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			System.out.println("[downloading] " + targetFileName);
			FileOutputStream fos = new FileOutputStream(targetFileName);
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			fos.close();
			
			inputSource = targetFileName;
			
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("[error] could not download specification " + inputSource);
				return;
			}
		}
		
		ArrayList<File> pluginRoots = new ArrayList<File>();
		
		String mainPath = CompilerMain.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		mainPath = mainPath.substring(0, mainPath.lastIndexOf("/"));
		File defaultPluginRoot = new File(mainPath, "../plugins");
		pluginRoots.add(defaultPluginRoot);
		
		System.out.println("[plugins path] " + defaultPluginRoot.getAbsolutePath());
		
		Compiler compiler = new Compiler(new SpecApiLangStandaloneSetup(), pluginRoots, ".specapi");
		
		compiler.compile(inputSource, recurse);
	}
	
	private static void printVersion() {
		System.out.println("SpecAPI " + VERSION);
	}

	private static void printUsage() {
		System.out.println("Usage: <options> <input source>");
		System.out.println("Options:");
		System.out.println("-r 			recurse the given input source (must be a directory)");
		System.out.println("-v 			version");
	}
}
