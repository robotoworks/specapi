package org.specapi.github;

import org.specapi.android.net.JsonEntityReader;
import org.specapi.android.net.JsonEntityReaderProvider;
import java.io.IOException;
import org.specapi.android.internal.util.JsonReader;
import org.specapi.android.net.JsonReaderUtil;
import java.util.List;
import org.specapi.android.internal.util.JsonToken;

public class RepositoryPropertiesReader extends JsonEntityReader<RepositoryProperties> {			
	
	public RepositoryPropertiesReader(JsonEntityReaderProvider provider) {
		super(provider);
	}
	
	public void read(JsonReader reader, RepositoryProperties entity) throws IOException {
		reader.beginObject();
		
		while(reader.hasNext()) {
			String name = reader.nextName();
			
			if(reader.peek() == JsonToken.NULL) {
				reader.skipValue();
				continue;
			}
			
			if(name.equals("name")) {
				entity.setName(reader.nextString());
			}
			else if(name.equals("description")) {
				entity.setDescription(reader.nextString());
			}
			else if(name.equals("homepage")) {
				entity.setHomepage(reader.nextString());
			}
			else if(name.equals("private")) {
				entity.setPrivate(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("has_issues")) {
				entity.setHasIssues(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("has_wiki")) {
				entity.setHasWiki(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("has_downloads")) {
				entity.setHasDownloads(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("team_id")) {
				entity.setTeamId(reader.nextLong());
			}
			else if(name.equals("auto_init")) {
				entity.setAutoInit(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("gitigore_template")) {
				entity.setGitigoreTemplate(reader.nextString());
			}
			else if(name.equals("license_template")) {
				entity.setLicenseTemplate(reader.nextString());
			}
			else {
				reader.skipValue();
			}
		}
		
		reader.endObject();
	}
	
	public void readList(JsonReader reader, List<RepositoryProperties> entities) throws IOException {
		reader.beginArray();
		
		while(reader.hasNext()) {
			RepositoryProperties item = new RepositoryProperties();
			read(reader, item);
			entities.add(item);
			
		}
		
		reader.endArray();
	}
}
