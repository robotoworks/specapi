package org.specapi.github;

import org.specapi.android.net.JsonEntityWriter;
import org.specapi.android.net.JsonEntityWriterProvider;
import java.io.IOException;
import org.specapi.android.internal.util.JsonWriter;
import java.util.List;


public class RepositoryPatchWriter extends JsonEntityWriter<RepositoryPatch> {

	public RepositoryPatchWriter(JsonEntityWriterProvider provider) {
		super(provider);
	}
	
	public void write(JsonWriter writer, RepositoryPatch entity) throws IOException {
		writer.beginObject();
		
		writer.name("name");
		writer.value(entity.getName());
		writer.name("description");
		writer.value(entity.getDescription());
		writer.name("homepage");
		writer.value(entity.getHomepage());
		writer.name("private");
		writer.value(entity.isPrivate());
		writer.name("has_issues");
		writer.value(entity.hasIssues());
		writer.name("has_wiki");
		writer.value(entity.hasWiki());
		writer.name("has_downloads");
		writer.value(entity.hasDownloads());
		
		writer.endObject();
	}
	
	public void writeList(JsonWriter writer, List<RepositoryPatch> entities) throws IOException {
		writer.beginArray();
		
		for(RepositoryPatch item:entities) {
			write(writer, item);
		}
		
		writer.endArray();
	}
}
