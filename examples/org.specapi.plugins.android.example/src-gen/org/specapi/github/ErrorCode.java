package org.specapi.github;
	
public enum ErrorCode {
	MISSING("missing"),
	MISSING_FIELD("missing_field"),
	INVALID("invalid"),
	ALREADY_EXISTS("already_exists");
	
	private String value;
	
	public String getValue() {
		return value;
	}
	
	ErrorCode(String value){
		this.value = value;
	}
	
	public static ErrorCode fromValue(String value) {
		if (value == null) {
			throw new IllegalArgumentException("value cannot be null");
		}
		
		for (ErrorCode member : ErrorCode.values()) {
			if (value.equalsIgnoreCase(member.value)) {
				return member;
			}
		}
		
		throw new RuntimeException("No constant with value " + value + " found");
	}
}
