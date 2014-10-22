package org.specapi.github;

public class GithubAPI extends AbstractGithubAPI {
	public GithubAPI(){
		super(DEFAULT_BASE_URL, false);
	}

	public GithubAPI(boolean debug){
		super(DEFAULT_BASE_URL, debug);
	}
	
	public GithubAPI(String baseUrl){
		super(baseUrl, false);
	}
	
	public GithubAPI(String baseUrl, boolean debug){
		super(baseUrl, debug);
	}
}
