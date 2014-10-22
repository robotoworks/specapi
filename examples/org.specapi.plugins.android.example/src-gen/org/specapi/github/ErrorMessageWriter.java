package org.specapi.github;

import org.specapi.android.net.JsonEntityWriter;
import org.specapi.android.net.JsonEntityWriterProvider;
import java.io.IOException;
import org.specapi.android.internal.util.JsonWriter;
import java.util.List;


public class ErrorMessageWriter extends JsonEntityWriter<ErrorMessage> {

	public ErrorMessageWriter(JsonEntityWriterProvider provider) {
		super(provider);
	}
	
	public void write(JsonWriter writer, ErrorMessage entity) throws IOException {
		writer.beginObject();
		
		writer.name("message");
		writer.value(entity.getMessage());
		writer.name("documentation_url");
		writer.value(entity.getDocumentationUrl());
		if(entity.getErrors() != null) {
			writer.name("errors");
			getProvider().get(Error.class).writeList(writer, entity.getErrors());
		}
		
		writer.endObject();
	}
	
	public void writeList(JsonWriter writer, List<ErrorMessage> entities) throws IOException {
		writer.beginArray();
		
		for(ErrorMessage item:entities) {
			write(writer, item);
		}
		
		writer.endArray();
	}
}
