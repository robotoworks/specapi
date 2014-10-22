package org.specapi.github;

import org.specapi.android.net.JsonEntityReader;
import org.specapi.android.net.JsonEntityReaderProvider;
import java.io.IOException;
import org.specapi.android.internal.util.JsonReader;
import org.specapi.android.net.JsonReaderUtil;
import java.util.List;
import org.specapi.android.internal.util.JsonToken;

public class RepositoryPermissionsReader extends JsonEntityReader<RepositoryPermissions> {			
	
	public RepositoryPermissionsReader(JsonEntityReaderProvider provider) {
		super(provider);
	}
	
	public void read(JsonReader reader, RepositoryPermissions entity) throws IOException {
		reader.beginObject();
		
		while(reader.hasNext()) {
			String name = reader.nextName();
			
			if(reader.peek() == JsonToken.NULL) {
				reader.skipValue();
				continue;
			}
			
			if(name.equals("admin")) {
				entity.setAdmin(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("push")) {
				entity.setPush(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("pull")) {
				entity.setPull(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else {
				reader.skipValue();
			}
		}
		
		reader.endObject();
	}
	
	public void readList(JsonReader reader, List<RepositoryPermissions> entities) throws IOException {
		reader.beginArray();
		
		while(reader.hasNext()) {
			RepositoryPermissions item = new RepositoryPermissions();
			read(reader, item);
			entities.add(item);
			
		}
		
		reader.endArray();
	}
}
