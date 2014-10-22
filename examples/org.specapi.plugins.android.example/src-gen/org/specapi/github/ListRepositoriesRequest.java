package org.specapi.github;


import android.net.Uri;
import org.specapi.android.net.ServiceRequest;

public class ListRepositoriesRequest extends ServiceRequest {
	
	private static final String PATH = "/user";
	
	private String typeParam;
	private boolean typeParamSet;
	private String sortParam;
	private boolean sortParamSet;
	private String directionParam;
	private boolean directionParamSet;
		
	public ListRepositoriesRequest setTypeParam(String value) {
		this.typeParam = value;
		this.typeParamSet = true;
		return this;
	}
	
	public boolean isTypeParamSet() {
		return typeParamSet;
	}
	public ListRepositoriesRequest setSortParam(String value) {
		this.sortParam = value;
		this.sortParamSet = true;
		return this;
	}
	
	public boolean isSortParamSet() {
		return sortParamSet;
	}
	public ListRepositoriesRequest setDirectionParam(String value) {
		this.directionParam = value;
		this.directionParamSet = true;
		return this;
	}
	
	public boolean isDirectionParamSet() {
		return directionParamSet;
	}
		
	public ListRepositoriesRequest(){
	}
	
	@Override
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
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
