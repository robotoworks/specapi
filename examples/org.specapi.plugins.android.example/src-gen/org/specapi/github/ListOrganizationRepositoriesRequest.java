package org.specapi.github;


import android.net.Uri;
import org.specapi.android.net.ServiceRequest;

public class ListOrganizationRepositoriesRequest extends ServiceRequest {
	
	private static final String PATH = "/orgs/nullorgnull/repos";
	
	private final String orgSegment;
	
	private String typeParam;
	private boolean typeParamSet;
	private String sortParam;
	private boolean sortParamSet;
	private String directionParam;
	private boolean directionParamSet;
		
	public ListOrganizationRepositoriesRequest setTypeParam(String value) {
		this.typeParam = value;
		this.typeParamSet = true;
		return this;
	}
	
	public boolean isTypeParamSet() {
		return typeParamSet;
	}
	public ListOrganizationRepositoriesRequest setSortParam(String value) {
		this.sortParam = value;
		this.sortParamSet = true;
		return this;
	}
	
	public boolean isSortParamSet() {
		return sortParamSet;
	}
	public ListOrganizationRepositoriesRequest setDirectionParam(String value) {
		this.directionParam = value;
		this.directionParamSet = true;
		return this;
	}
	
	public boolean isDirectionParamSet() {
		return directionParamSet;
	}
		
	public ListOrganizationRepositoriesRequest(String orgSegment){
		this.orgSegment = orgSegment;
	}
	
	@Override
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + String.format(PATH, orgSegment)).buildUpon();
			
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
