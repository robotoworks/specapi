package org.specapi.github;

import org.specapi.android.net.JsonEntityReader;
import org.specapi.android.net.JsonEntityReaderProvider;
import java.io.IOException;
import org.specapi.android.internal.util.JsonReader;
import java.util.ArrayList;
import java.util.List;
import org.specapi.android.internal.util.JsonToken;

public class ErrorMessageReader extends JsonEntityReader<ErrorMessage> {			
	
	public ErrorMessageReader(JsonEntityReaderProvider provider) {
		super(provider);
	}
	
	public void read(JsonReader reader, ErrorMessage entity) throws IOException {
		reader.beginObject();
		
		while(reader.hasNext()) {
			String name = reader.nextName();
			
			if(reader.peek() == JsonToken.NULL) {
				reader.skipValue();
				continue;
			}
			
			if(name.equals("message")) {
				entity.setMessage(reader.nextString());
			}
			else if(name.equals("documentation_url")) {
				entity.setDocumentationUrl(reader.nextString());
			}
			else if(name.equals("errors")) {
				List<Error> entityMember = new ArrayList<Error>();
				getProvider().get(Error.class).readList(reader, entityMember);
				entity.setErrors(entityMember);
			}
			else {
				reader.skipValue();
			}
		}
		
		reader.endObject();
	}
	
	public void readList(JsonReader reader, List<ErrorMessage> entities) throws IOException {
		reader.beginArray();
		
		while(reader.hasNext()) {
			ErrorMessage item = new ErrorMessage();
			read(reader, item);
			entities.add(item);
			
		}
		
		reader.endArray();
	}
}
