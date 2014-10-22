package org.specapi.github;


import android.net.Uri;
import org.specapi.android.net.ServiceRequest;

public class ListAllPublicRepositoriesRequest extends ServiceRequest {
	
	private static final String PATH = "/repositories";
	
	private String sinceParam;
	private boolean sinceParamSet;
		
	public ListAllPublicRepositoriesRequest setSinceParam(String value) {
		this.sinceParam = value;
		this.sinceParamSet = true;
		return this;
	}
	
	public boolean isSinceParamSet() {
		return sinceParamSet;
	}
		
	public ListAllPublicRepositoriesRequest(){
	}
	
	@Override
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + PATH).buildUpon();
			
		if(sinceParamSet){
			uriBuilder.appendQueryParameter("since", sinceParam);
		}
		
		return uriBuilder.toString();			
	}
}
