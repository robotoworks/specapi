package org.specapi.github;

import org.specapi.android.net.JsonEntityWriter;
import org.specapi.android.net.JsonEntityWriterProvider;
import java.io.IOException;
import org.specapi.android.internal.util.JsonWriter;
import java.util.List;


public class RepositoryPermissionsWriter extends JsonEntityWriter<RepositoryPermissions> {

	public RepositoryPermissionsWriter(JsonEntityWriterProvider provider) {
		super(provider);
	}
	
	public void write(JsonWriter writer, RepositoryPermissions entity) throws IOException {
		writer.beginObject();
		
		writer.name("admin");
		writer.value(entity.isAdmin());
		writer.name("push");
		writer.value(entity.isPush());
		writer.name("pull");
		writer.value(entity.isPull());
		
		writer.endObject();
	}
	
	public void writeList(JsonWriter writer, List<RepositoryPermissions> entities) throws IOException {
		writer.beginArray();
		
		for(RepositoryPermissions item:entities) {
			write(writer, item);
		}
		
		writer.endArray();
	}
}
