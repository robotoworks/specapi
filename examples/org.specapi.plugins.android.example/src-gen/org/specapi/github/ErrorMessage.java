package org.specapi.github;

import android.content.ContentValues;
import org.specapi.android.db.ContentValuesUtil;
import java.util.Map;

import java.util.List;
public class ErrorMessage {
    
	public static final String KEY_MESSAGE = "message";
	public static final String KEY_DOCUMENTATION_URL = "documentation_url";
	public static final String KEY_ERRORS = "errors";

	private String message;
	private String documentationUrl;
	private List<Error> errors;
	
	public String getMessage(){
		return message;
	}
	public void setMessage(String value){
		this.message = value;
	}
	public String getDocumentationUrl(){
		return documentationUrl;
	}
	public void setDocumentationUrl(String value){
		this.documentationUrl = value;
	}
	public List<Error> getErrors(){
		return errors;
	}
	public void setErrors(List<Error> value){
		this.errors = value;
	}
	
	public ContentValues toContentValues() {
	    return toContentValues(null);
	}
	
	public ContentValues toContentValues(Map<String, String> map) {
	    ContentValues values = new ContentValues();

		ContentValuesUtil.putMapped(KEY_MESSAGE, map, values, message);
		ContentValuesUtil.putMapped(KEY_DOCUMENTATION_URL, map, values, documentationUrl);
		ContentValuesUtil.putMapped(KEY_ERRORS, map, values, errors);

        return values;
	}
}
