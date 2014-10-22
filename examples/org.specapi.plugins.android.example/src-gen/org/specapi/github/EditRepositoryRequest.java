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

public class EditRepositoryRequest extends EntityEnclosedServiceRequest {
	
	private static final String PATH = "/repos/nullownernull/nullreponull";
	
	private final String ownerSegment;
	private final String repoSegment;
	
	private final RepositoryPatch repositoryPatch;
	
	public RepositoryPatch getRepositoryPatch() {
		return repositoryPatch;
	}
	public EditRepositoryRequest(String ownerSegment,
	String repoSegment,
	RepositoryPatch repositoryPatch){
		this.ownerSegment = ownerSegment;
		this.repoSegment = repoSegment;
		this.repositoryPatch = repositoryPatch;
	}
	
	@Override
	public void writeBody(JsonEntityWriterProvider provider, OutputStream stream) throws IOException {
		JsonWriter writer = null;
		try {
			if(stream != null) {
				writer = new JsonWriter(new OutputStreamWriter(stream, Charset.defaultCharset()));
				
		provider.get(RepositoryPatch.class).write(writer, repositoryPatch);
				
			}
		} finally {
			Closeables.closeSilently(writer);
		}
	}

	@Override
	public String createUrl(String baseUrl){
		Uri.Builder uriBuilder = Uri.parse(baseUrl + String.format(PATH, ownerSegment, repoSegment)).buildUpon();
			
		return uriBuilder.toString();			
	}
}
