package org.specapi.github;


import org.specapi.android.net.Parser;
import java.io.IOException;
import org.specapi.android.net.Response;
import org.specapi.android.net.ServiceException;
import java.io.InputStream;
import org.specapi.android.net.ServiceClient;
import org.specapi.android.net.JsonEntityWriterProvider;
import org.specapi.android.net.JsonEntityReaderProvider;

public abstract class AbstractGithubAPI extends ServiceClient {
	private static final String LOG_TAG = "GithubAPI";
	
	protected static final String DEFAULT_BASE_URL = "https://api.github.com";
	
	@Override
	protected String getLogTag() {
		return LOG_TAG;
	}
	
	@Override
	protected JsonEntityWriterProvider createWriterProvider() {
		return new DefaultGithubAPIWriterProvider();
	}
	
	@Override
	protected JsonEntityReaderProvider createReaderProvider() {
		return new DefaultGithubAPIReaderProvider();
	}
	
	public AbstractGithubAPI(String baseUrl, boolean debug){
		super(baseUrl, debug);
		
	}
	
	public Response<ListRepositoriesResult> listRepositories()
	  throws ServiceException {
	  	return listRepositories(new ListRepositoriesRequest());
	}
	
	public Response<ListRepositoriesResult> listRepositories(ListRepositoriesRequest request)
	  throws ServiceException {
		
		Parser<ListRepositoriesResult> parser = new Parser<ListRepositoriesResult>() {
			public ListRepositoriesResult parse(InputStream inStream) throws IOException {
				return new ListRepositoriesResult(getReaderProvider(), inStream);
			}
		};
		
		return get(request, parser);
	}
	
	public Response<ListUserRepositoriesResult> listUserRepositories(ListUserRepositoriesRequest request)
	  throws ServiceException {
		
		Parser<ListUserRepositoriesResult> parser = new Parser<ListUserRepositoriesResult>() {
			public ListUserRepositoriesResult parse(InputStream inStream) throws IOException {
				return new ListUserRepositoriesResult(getReaderProvider(), inStream);
			}
		};
		
		return get(request, parser);
	}
	
	public Response<ListOrganizationRepositoriesResult> listOrganizationRepositories(ListOrganizationRepositoriesRequest request)
	  throws ServiceException {
		
		Parser<ListOrganizationRepositoriesResult> parser = new Parser<ListOrganizationRepositoriesResult>() {
			public ListOrganizationRepositoriesResult parse(InputStream inStream) throws IOException {
				return new ListOrganizationRepositoriesResult(getReaderProvider(), inStream);
			}
		};
		
		return get(request, parser);
	}
	
	public Response<ListAllPublicRepositoriesResult> listAllPublicRepositories()
	  throws ServiceException {
	  	return listAllPublicRepositories(new ListAllPublicRepositoriesRequest());
	}
	
	public Response<ListAllPublicRepositoriesResult> listAllPublicRepositories(ListAllPublicRepositoriesRequest request)
	  throws ServiceException {
		
		Parser<ListAllPublicRepositoriesResult> parser = new Parser<ListAllPublicRepositoriesResult>() {
			public ListAllPublicRepositoriesResult parse(InputStream inStream) throws IOException {
				return new ListAllPublicRepositoriesResult(getReaderProvider(), inStream);
			}
		};
		
		return get(request, parser);
	}
	
	public Response<CreateRepositoryResult> createRepository(CreateRepositoryRequest request)
	  throws ServiceException {
		
		Parser<CreateRepositoryResult> parser = new Parser<CreateRepositoryResult>() {
			public CreateRepositoryResult parse(InputStream inStream) throws IOException {
				return new CreateRepositoryResult(getReaderProvider(), inStream);
			}
		};
		
		return post(request, parser);
	}
	
	public Response<CreateOrganizationRepositoryResult> createOrganizationRepository(CreateOrganizationRepositoryRequest request)
	  throws ServiceException {
		
		Parser<CreateOrganizationRepositoryResult> parser = new Parser<CreateOrganizationRepositoryResult>() {
			public CreateOrganizationRepositoryResult parse(InputStream inStream) throws IOException {
				return new CreateOrganizationRepositoryResult(getReaderProvider(), inStream);
			}
		};
		
		return post(request, parser);
	}
	
	public Response<EditRepositoryResult> editRepository(EditRepositoryRequest request)
	  throws ServiceException {
		
		Parser<EditRepositoryResult> parser = new Parser<EditRepositoryResult>() {
			public EditRepositoryResult parse(InputStream inStream) throws IOException {
				return new EditRepositoryResult(getReaderProvider(), inStream);
			}
		};
		
		return delete(request, parser);
	}
	
}
