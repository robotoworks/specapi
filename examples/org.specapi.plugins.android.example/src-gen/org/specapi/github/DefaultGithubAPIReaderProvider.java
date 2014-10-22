package org.specapi.github;

import org.specapi.android.net.JsonEntityReaderProvider;
import org.specapi.android.net.JsonEntityReader;
import java.util.HashMap;

public class DefaultGithubAPIReaderProvider implements JsonEntityReaderProvider {

	private HashMap<Class<?>, JsonEntityReader<?>> mMap = new HashMap<Class<?>, JsonEntityReader<?>>();
	
	public DefaultGithubAPIReaderProvider(){
		registerReaders(mMap);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T, R extends JsonEntityReader<T>> R get(Class<T> entityType) {
		return (R) mMap.get(entityType);
	}
	
	protected void registerReaders(HashMap<Class<?>, JsonEntityReader<?>> map) {
		map.put(Repository.class, new RepositoryReader(this));
		map.put(RepositoryOwner.class, new RepositoryOwnerReader(this));
		map.put(RepositoryPermissions.class, new RepositoryPermissionsReader(this));
		map.put(RepositoryProperties.class, new RepositoryPropertiesReader(this));
		map.put(RepositoryPatch.class, new RepositoryPatchReader(this));
		map.put(ErrorMessage.class, new ErrorMessageReader(this));
		map.put(Error.class, new ErrorReader(this));
	}
}
