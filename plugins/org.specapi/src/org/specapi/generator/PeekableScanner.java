package org.specapi.generator;

import java.io.StringReader;
import java.util.Scanner;

public class PeekableScanner {
	Scanner scanner;
	
	public Scanner innerScanner() {
		return scanner;
	}
	
	private String peeked;
	
	public PeekableScanner(String scanee) {
		scanner = new Scanner(new StringReader(scanee));
		//scanner.useDelimiter("[\\s]+");
	}
	
	public boolean hasNext() {
		return scanner.hasNext();
	}
	
	public String next() {
		if(peeked != null) {
			String p = peeked;
			peeked = null;
			return p;
		}
		
		return scanner.next();
	}
	
	public String peek() {
		if(peeked == null && scanner.hasNext()) {
			peeked = scanner.next();
		}
		
		return peeked;
	}
}
