package org.specapi.github;

import org.specapi.android.net.JsonEntityReader;
import org.specapi.android.net.JsonEntityReaderProvider;
import java.io.IOException;
import org.specapi.android.internal.util.JsonReader;
import java.util.List;
import org.specapi.android.internal.util.JsonToken;

public class ErrorReader extends JsonEntityReader<Error> {			
	
	public ErrorReader(JsonEntityReaderProvider provider) {
		super(provider);
	}
	
	public void read(JsonReader reader, Error entity) throws IOException {
		reader.beginObject();
		
		while(reader.hasNext()) {
			String name = reader.nextName();
			
			if(reader.peek() == JsonToken.NULL) {
				reader.skipValue();
				continue;
			}
			
			if(name.equals("resource")) {
				entity.setResource(reader.nextString());
			}
			else if(name.equals("code")) {
				ErrorCode entityMember = ErrorCode.fromValue(reader.nextString());
				entity.setCode(entityMember);
			}
			else if(name.equals("field")) {
				entity.setField(reader.nextString());
			}
			else if(name.equals("message")) {
				entity.setMessage(reader.nextString());
			}
			else {
				reader.skipValue();
			}
		}
		
		reader.endObject();
	}
	
	public void readList(JsonReader reader, List<Error> entities) throws IOException {
		reader.beginArray();
		
		while(reader.hasNext()) {
			Error item = new Error();
			read(reader, item);
			entities.add(item);
			
		}
		
		reader.endArray();
	}
}
