package org.specapi.github;

import org.specapi.android.net.JsonEntityWriterProvider;
import org.specapi.android.net.JsonEntityWriter;
import java.util.HashMap;

public class DefaultGithubAPIWriterProvider implements JsonEntityWriterProvider {

	private HashMap<Class<?>, JsonEntityWriter<?>> mMap = new HashMap<Class<?>, JsonEntityWriter<?>>();
	
	public DefaultGithubAPIWriterProvider(){
		registerWriters(mMap);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T, R extends JsonEntityWriter<T>> R get(Class<T> entityType) {
		return (R) mMap.get(entityType);
	}
	
	protected void registerWriters(HashMap<Class<?>, JsonEntityWriter<?>> map) {
		map.put(Repository.class, new RepositoryWriter(this));
		map.put(RepositoryOwner.class, new RepositoryOwnerWriter(this));
		map.put(RepositoryPermissions.class, new RepositoryPermissionsWriter(this));
		map.put(RepositoryProperties.class, new RepositoryPropertiesWriter(this));
		map.put(RepositoryPatch.class, new RepositoryPatchWriter(this));
		map.put(ErrorMessage.class, new ErrorMessageWriter(this));
		map.put(Error.class, new ErrorWriter(this));
	}
}
