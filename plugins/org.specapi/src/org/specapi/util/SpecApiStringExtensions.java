package org.specapi.util;

public class SpecApiStringExtensions {

	public static final char[] DEFAULT_BOUNDARY_CHARS = {'-', '_', ' '};
	
	public static String camelize(String str, boolean upperFirst) {
		StringBuilder builder = new StringBuilder();
		
		boolean upperNext = upperFirst;
		
		for(int i=0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(isBoundaryChar(DEFAULT_BOUNDARY_CHARS, c)) {
				upperNext = true;
				continue;
			}
			
			if(upperNext) {
				builder.append(Character.toUpperCase(c));
				upperNext = false;
			} else {
				builder.append(Character.isUpperCase(c) && i > 0 ? c : Character.toLowerCase(c));
			}
		}
		
		return builder.toString();
	}
	
	public static String camelize(String str) {
		return camelize(str, false);
	}
	
	public static String pascalize(String str) {
		return camelize(str, true);
	}
	
	public static String delimitize(String str, char[] boundaries, String delimeter) {
		StringBuilder builder = new StringBuilder();
		
		boolean dashNext = false;
		char prev = 0;
		for(int i=0; i < str.length(); i++) {
			char c = str.charAt(i);

			if(isBoundaryChar(boundaries, c)) {
				dashNext = true;
				continue;
			}
			
			if(dashNext || (i > 0 && Character.isUpperCase(c) && !Character.isUpperCase(prev))) {
				dashNext = false;
				builder.append(delimeter);
			}

			builder.append(c);
			
			prev = c;
		}
		
		return builder.toString();
	}	
	
	public static String dasherize(String str) {
		return delimitize(str, DEFAULT_BOUNDARY_CHARS, "-");
	}
	
	public static String underscorize(String str) {
		return delimitize(str, DEFAULT_BOUNDARY_CHARS, "_");
	}
	
	public static String packagerize(String str) {
		return delimitize(str, new char[]{'/'}, ".");
	}
	
	public static String patherize(String str) {
		return delimitize(str, new char[]{'.'}, "/");
	}
	
	public static String humanize(String str) {
		return delimitize(str, DEFAULT_BOUNDARY_CHARS, " ");
	}
	
	private static boolean isBoundaryChar(char[] boundaries, char c) {
		for(char b : boundaries) {
			if(b==c) {
				return true;
			}
		}
		
		return false;
	}
	
	public static String toSentenceCase(String str) {
		if(str == null || str.length() == 0) {
			return str;
		}
		String lowered = str.toLowerCase();
		
		char first = Character.toUpperCase(lowered.charAt(0));
		
		if(lowered.length() == 1) {
			return Character.toString(first);
		}
		
		return Character.toString(first) + lowered.substring(1);
	}
	
	public static String toTitleCase(String str) {
		StringBuilder builder = new StringBuilder();
		
		boolean upperNext = true;
		
		for(int i=0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(isBoundaryChar(DEFAULT_BOUNDARY_CHARS, c)) {
				builder.append(c);
				upperNext = true;
				continue;
			}
			
			if(upperNext) {
				builder.append(Character.toUpperCase(c));
				upperNext = false;
			} else {
				builder.append(Character.isUpperCase(c) && i > 0 ? c : Character.toLowerCase(c));
			}
		}
		
		return builder.toString();
	}
}
