package org.specapi.github;

import org.specapi.android.net.JsonEntityWriter;
import org.specapi.android.net.JsonEntityWriterProvider;
import java.io.IOException;
import org.specapi.android.internal.util.JsonWriter;
import java.util.List;


public class RepositoryPropertiesWriter extends JsonEntityWriter<RepositoryProperties> {

	public RepositoryPropertiesWriter(JsonEntityWriterProvider provider) {
		super(provider);
	}
	
	public void write(JsonWriter writer, RepositoryProperties entity) throws IOException {
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
		writer.name("team_id");
		writer.value(entity.getTeamId());
		writer.name("auto_init");
		writer.value(entity.isAutoInit());
		writer.name("gitigore_template");
		writer.value(entity.getGitigoreTemplate());
		writer.name("license_template");
		writer.value(entity.getLicenseTemplate());
		
		writer.endObject();
	}
	
	public void writeList(JsonWriter writer, List<RepositoryProperties> entities) throws IOException {
		writer.beginArray();
		
		for(RepositoryProperties item:entities) {
			write(writer, item);
		}
		
		writer.endArray();
	}
}
