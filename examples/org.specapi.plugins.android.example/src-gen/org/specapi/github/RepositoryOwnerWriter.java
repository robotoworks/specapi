package org.specapi.github;

import org.specapi.android.net.JsonEntityWriter;
import org.specapi.android.net.JsonEntityWriterProvider;
import java.io.IOException;
import org.specapi.android.internal.util.JsonWriter;
import java.util.List;


public class RepositoryOwnerWriter extends JsonEntityWriter<RepositoryOwner> {

	public RepositoryOwnerWriter(JsonEntityWriterProvider provider) {
		super(provider);
	}
	
	public void write(JsonWriter writer, RepositoryOwner entity) throws IOException {
		writer.beginObject();
		
		writer.name("login");
		writer.value(entity.getLogin());
		writer.name("id");
		writer.value(entity.getId());
		writer.name("avatar_url");
		writer.value(entity.getAvatarUrl());
		writer.name("gravatar_id");
		writer.value(entity.getGravatarId());
		writer.name("url");
		writer.value(entity.getUrl());
		writer.name("html_url");
		writer.value(entity.getHtmlUrl());
		writer.name("followers_url");
		writer.value(entity.getFollowersUrl());
		writer.name("following_url");
		writer.value(entity.getFollowingUrl());
		writer.name("gists_url");
		writer.value(entity.getGistsUrl());
		writer.name("starred_url");
		writer.value(entity.getStarredUrl());
		writer.name("subscriptions_url");
		writer.value(entity.getSubscriptionsUrl());
		writer.name("organizations_url");
		writer.value(entity.getOrganizationsUrl());
		writer.name("repos_url");
		writer.value(entity.getReposUrl());
		writer.name("events_url");
		writer.value(entity.getEventsUrl());
		writer.name("received_events_url");
		writer.value(entity.getReceivedEventsUrl());
		writer.name("type");
		writer.value(entity.getType());
		writer.name("site_admin");
		writer.value(entity.isSiteAdmin());
		
		writer.endObject();
	}
	
	public void writeList(JsonWriter writer, List<RepositoryOwner> entities) throws IOException {
		writer.beginArray();
		
		for(RepositoryOwner item:entities) {
			write(writer, item);
		}
		
		writer.endArray();
	}
}
