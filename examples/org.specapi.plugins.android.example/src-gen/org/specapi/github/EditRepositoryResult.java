package org.specapi.github;


import org.specapi.android.net.JsonEntityReaderProvider;
import java.io.IOException;
import org.specapi.android.net.ServiceResult;
import java.io.InputStream;
import org.specapi.android.util.Closeables;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.specapi.android.internal.util.JsonReader;
import java.nio.charset.Charset;

public class EditRepositoryResult extends ServiceResult {
	private Repository repository;
	public Repository getRepository(){
		return this.repository;
	}
	
	public EditRepositoryResult(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {
		JsonReader reader = null;
		try {
			if(inStream != null) {
				reader = new JsonReader(new BufferedReader(new InputStreamReader(inStream, Charset.defaultCharset())));
			this.repository = new Repository();
			provider.get(Repository.class).read(reader, this.repository);
		}
	} finally {
		Closeables.closeSilently(reader);
	}
	}
}
