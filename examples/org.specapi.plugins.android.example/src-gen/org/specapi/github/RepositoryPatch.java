package org.specapi.github;

import android.content.ContentValues;
import org.specapi.android.db.ContentValuesUtil;
import java.util.Map;

public class RepositoryPatch {
    
	public static final String KEY_NAME = "name";
	public static final String KEY_DESCRIPTION = "description";
	public static final String KEY_HOMEPAGE = "homepage";
	public static final String KEY_PRIVATE = "private";
	public static final String KEY_HAS_ISSUES = "has_issues";
	public static final String KEY_HAS_WIKI = "has_wiki";
	public static final String KEY_HAS_DOWNLOADS = "has_downloads";

	private String name;
	private String description;
	private String homepage;
	private boolean _private;
	private boolean hasIssues;
	private boolean hasWiki;
	private boolean hasDownloads;
	
	public String getName(){
		return name;
	}
	public void setName(String value){
		this.name = value;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String value){
		this.description = value;
	}
	public String getHomepage(){
		return homepage;
	}
	public void setHomepage(String value){
		this.homepage = value;
	}
	public boolean isPrivate(){
		return _private;
	}
	public void setPrivate(boolean value){
		this._private = value;
	}
	public boolean hasIssues(){
		return hasIssues;
	}
	public void setHasIssues(boolean value){
		this.hasIssues = value;
	}
	public boolean hasWiki(){
		return hasWiki;
	}
	public void setHasWiki(boolean value){
		this.hasWiki = value;
	}
	public boolean hasDownloads(){
		return hasDownloads;
	}
	public void setHasDownloads(boolean value){
		this.hasDownloads = value;
	}
	
	public ContentValues toContentValues() {
	    return toContentValues(null);
	}
	
	public ContentValues toContentValues(Map<String, String> map) {
	    ContentValues values = new ContentValues();

		ContentValuesUtil.putMapped(KEY_NAME, map, values, name);
		ContentValuesUtil.putMapped(KEY_DESCRIPTION, map, values, description);
		ContentValuesUtil.putMapped(KEY_HOMEPAGE, map, values, homepage);
		ContentValuesUtil.putMapped(KEY_PRIVATE, map, values, _private);
		ContentValuesUtil.putMapped(KEY_HAS_ISSUES, map, values, hasIssues);
		ContentValuesUtil.putMapped(KEY_HAS_WIKI, map, values, hasWiki);
		ContentValuesUtil.putMapped(KEY_HAS_DOWNLOADS, map, values, hasDownloads);

        return values;
	}
}
