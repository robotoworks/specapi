package org.specapi.github;


import android.net.Uri;
import org.specapi.android.net.JsonEntityWriterProvider;
import org.specapi.android.net.EntityEnclosedServiceRequest;
import org.specapi.android.util.Closeables;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.io.OutputStreamWriter;
import org.specapi.android.internal.util.JsonWriter;
import java.io.IOException;

public class CreateOrganizationRepositoryRequest extends EntityEnclosedServiceRequest {
	
	private static final String PATH = "/orgs/nullorgnull/repos";
	
	private final String orgSegment;
	
	private final RepositoryProperties repositoryProperties;
	
	public RepositoryProperties getRepositoryProperties() {
		return repositoryProperties;
	}
	public CreateOrganizationRepositoryRequest(String orgSegment,
	RepositoryProperties repositoryProperties){
		this.orgSegment = orgSegment;
		this.repositoryProperties = repositoryProperties;
	}
	
	@Override
	public void writeBody(JsonEntityWriterProvider provider, OutputStream stream) throws IOException {
		JsonWriter writer = null;
		try {
			if(stream != null) {
				writer = new JsonWriter(new OutputStreamWriter(stream, Charset.defaultCharset()));
				
		provider.get(RepositoryProperties.class).write(writer, repositoryProperties);
				
			}
		} finally {
			Closeables.closeSilently(writer);
		}
	}

	@Override
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + String.format(PATH, orgSegment)).buildUpon();
			
		return uriBuilder.toString();			
	}
}
