package org.specapi.github;


import org.specapi.android.net.JsonEntityReaderProvider;
import java.io.IOException;
import org.specapi.android.net.ServiceResult;
import java.io.InputStream;
import org.specapi.android.util.Closeables;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.List;
import java.io.InputStreamReader;
import org.specapi.android.internal.util.JsonReader;
import java.nio.charset.Charset;

public class ListRepositoriesResult extends ServiceResult {
	private List<Repository> repositories;
	public List<Repository> getRepositories(){
		return this.repositories;
	}
	
	public ListRepositoriesResult(JsonEntityReaderProvider provider, InputStream inStream) throws IOException {
		JsonReader reader = null;
		try {
			if(inStream != null) {
				reader = new JsonReader(new BufferedReader(new InputStreamReader(inStream, Charset.defaultCharset())));
			this.repositories = new ArrayList<Repository>();
			provider.get(Repository.class).readList(reader, this.repositories);
		}
	} finally {
		Closeables.closeSilently(reader);
	}
	}
}
