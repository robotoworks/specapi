package org.specapi.github;

import android.content.ContentValues;
import org.specapi.android.db.ContentValuesUtil;
import java.util.Map;

public class Error {
    
	public static final String KEY_RESOURCE = "resource";
	public static final String KEY_CODE = "code";
	public static final String KEY_FIELD = "field";
	public static final String KEY_MESSAGE = "message";

	private String resource;
	private ErrorCode code;
	private String field;
	private String message;
	
	public String getResource(){
		return resource;
	}
	public void setResource(String value){
		this.resource = value;
	}
	public ErrorCode getCode(){
		return code;
	}
	public void setCode(ErrorCode value){
		this.code = value;
	}
	public String getField(){
		return field;
	}
	public void setField(String value){
		this.field = value;
	}
	public String getMessage(){
		return message;
	}
	public void setMessage(String value){
		this.message = value;
	}
	
	public ContentValues toContentValues() {
	    return toContentValues(null);
	}
	
	public ContentValues toContentValues(Map<String, String> map) {
	    ContentValues values = new ContentValues();

		ContentValuesUtil.putMapped(KEY_RESOURCE, map, values, resource);
		ContentValuesUtil.putMapped(KEY_CODE, map, values, code);
		ContentValuesUtil.putMapped(KEY_FIELD, map, values, field);
		ContentValuesUtil.putMapped(KEY_MESSAGE, map, values, message);

        return values;
	}
}
