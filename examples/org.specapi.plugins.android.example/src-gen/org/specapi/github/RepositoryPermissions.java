package org.specapi.github;

import android.content.ContentValues;
import org.specapi.android.db.ContentValuesUtil;
import java.util.Map;

public class RepositoryPermissions {
    
	public static final String KEY_ADMIN = "admin";
	public static final String KEY_PUSH = "push";
	public static final String KEY_PULL = "pull";

	private boolean admin;
	private boolean push;
	private boolean pull;
	
	public boolean isAdmin(){
		return admin;
	}
	public void setAdmin(boolean value){
		this.admin = value;
	}
	public boolean isPush(){
		return push;
	}
	public void setPush(boolean value){
		this.push = value;
	}
	public boolean isPull(){
		return pull;
	}
	public void setPull(boolean value){
		this.pull = value;
	}
	
	public ContentValues toContentValues() {
	    return toContentValues(null);
	}
	
	public ContentValues toContentValues(Map<String, String> map) {
	    ContentValues values = new ContentValues();

		ContentValuesUtil.putMapped(KEY_ADMIN, map, values, admin);
		ContentValuesUtil.putMapped(KEY_PUSH, map, values, push);
		ContentValuesUtil.putMapped(KEY_PULL, map, values, pull);

        return values;
	}
}
