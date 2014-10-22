package org.specapi.github;

import org.specapi.android.net.JsonEntityWriter;
import org.specapi.android.net.JsonEntityWriterProvider;
import java.io.IOException;
import org.specapi.android.internal.util.JsonWriter;
import java.util.List;


public class ErrorWriter extends JsonEntityWriter<Error> {

	public ErrorWriter(JsonEntityWriterProvider provider) {
		super(provider);
	}
	
	public void write(JsonWriter writer, Error entity) throws IOException {
		writer.beginObject();
		
		writer.name("resource");
		writer.value(entity.getResource());
		if(entity.getCode() != null) {
			writer.name("code");
			writer.value(entity.getCode().toString());
		}
		writer.name("field");
		writer.value(entity.getField());
		writer.name("message");
		writer.value(entity.getMessage());
		
		writer.endObject();
	}
	
	public void writeList(JsonWriter writer, List<Error> entities) throws IOException {
		writer.beginArray();
		
		for(Error item:entities) {
			write(writer, item);
		}
		
		writer.endArray();
	}
}
