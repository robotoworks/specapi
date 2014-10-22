package org.specapi.github;


import android.net.Uri;
import org.specapi.android.net.ServiceRequest;

public class ListUserRepositoriesRequest extends ServiceRequest {
	
	private static final String PATH = "/users/nullusernull/repos";
	
	private final String userSegment;
	
	private String typeParam;
	private boolean typeParamSet;
	private String sortParam;
	private boolean sortParamSet;
	private String directionParam;
	private boolean directionParamSet;
		
	public ListUserRepositoriesRequest setTypeParam(String value) {
		this.typeParam = value;
		this.typeParamSet = true;
		return this;
	}
	
	public boolean isTypeParamSet() {
		return typeParamSet;
	}
	public ListUserRepositoriesRequest setSortParam(String value) {
		this.sortParam = value;
		this.sortParamSet = true;
		return this;
	}
	
	public boolean isSortParamSet() {
		return sortParamSet;
	}
	public ListUserRepositoriesRequest setDirectionParam(String value) {
		this.directionParam = value;
		this.directionParamSet = true;
		return this;
	}
	
	public boolean isDirectionParamSet() {
		return directionParamSet;
	}
		
	public ListUserRepositoriesRequest(String userSegment){
		this.userSegment = userSegment;
	}
	
	@Override
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + String.format(PATH, userSegment)).buildUpon();
			
		if(typeParamSet){
			uriBuilder.appendQueryParameter("type", typeParam);
		}
		if(sortParamSet){
			uriBuilder.appendQueryParameter("sort", sortParam);
		}
		if(directionParamSet){
			uriBuilder.appendQueryParameter("direction", directionParam);
		}
		
		return uriBuilder.toString();			
	}
}
