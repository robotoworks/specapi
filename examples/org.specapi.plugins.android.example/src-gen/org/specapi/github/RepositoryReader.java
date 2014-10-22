package org.specapi.github;

import org.specapi.android.net.JsonEntityReader;
import org.specapi.android.net.JsonEntityReaderProvider;
import java.io.IOException;
import org.specapi.android.internal.util.JsonReader;
import org.specapi.android.net.JsonReaderUtil;
import java.util.List;
import org.specapi.android.internal.util.JsonToken;

public class RepositoryReader extends JsonEntityReader<Repository> {			
	
	public RepositoryReader(JsonEntityReaderProvider provider) {
		super(provider);
	}
	
	public void read(JsonReader reader, Repository entity) throws IOException {
		reader.beginObject();
		
		while(reader.hasNext()) {
			String name = reader.nextName();
			
			if(reader.peek() == JsonToken.NULL) {
				reader.skipValue();
				continue;
			}
			
			if(name.equals("id")) {
				entity.setId(reader.nextLong());
			}
			else if(name.equals("name")) {
				entity.setName(reader.nextString());
			}
			else if(name.equals("full_name")) {
				entity.setFullName(reader.nextString());
			}
			else if(name.equals("owner")) {
				RepositoryOwner entityMember = new RepositoryOwner();
				getProvider().get(RepositoryOwner.class).read(reader, entityMember);
				entity.setOwner(entityMember);
			}
			else if(name.equals("private")) {
				entity.setPrivate(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("html_url")) {
				entity.setHtmlUrl(reader.nextString());
			}
			else if(name.equals("description")) {
				entity.setDescription(reader.nextString());
			}
			else if(name.equals("fork")) {
				entity.setFork(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("url")) {
				entity.setUrl(reader.nextString());
			}
			else if(name.equals("forks_url")) {
				entity.setForksUrl(reader.nextString());
			}
			else if(name.equals("keys_url")) {
				entity.setKeysUrl(reader.nextString());
			}
			else if(name.equals("collaborators_url")) {
				entity.setCollaboratorsUrl(reader.nextString());
			}
			else if(name.equals("teams_url")) {
				entity.setTeamsUrl(reader.nextString());
			}
			else if(name.equals("hooks_url")) {
				entity.setHooksUrl(reader.nextString());
			}
			else if(name.equals("issue_events_url")) {
				entity.setIssueEventsUrl(reader.nextString());
			}
			else if(name.equals("events_url")) {
				entity.setEventsUrl(reader.nextString());
			}
			else if(name.equals("assignees_url")) {
				entity.setAssigneesUrl(reader.nextString());
			}
			else if(name.equals("branches_url")) {
				entity.setBranchesUrl(reader.nextString());
			}
			else if(name.equals("tags_url")) {
				entity.setTagsUrl(reader.nextString());
			}
			else if(name.equals("blobs_url")) {
				entity.setBlobsUrl(reader.nextString());
			}
			else if(name.equals("git_tags_url")) {
				entity.setGitTagsUrl(reader.nextString());
			}
			else if(name.equals("git_refs_url")) {
				entity.setGitRefsUrl(reader.nextString());
			}
			else if(name.equals("trees_url")) {
				entity.setTreesUrl(reader.nextString());
			}
			else if(name.equals("statuses_url")) {
				entity.setStatusesUrl(reader.nextString());
			}
			else if(name.equals("languages_url")) {
				entity.setLanguagesUrl(reader.nextString());
			}
			else if(name.equals("stargazers_url")) {
				entity.setStargazersUrl(reader.nextString());
			}
			else if(name.equals("contributors_url")) {
				entity.setContributorsUrl(reader.nextString());
			}
			else if(name.equals("subscribers_url")) {
				entity.setSubscribersUrl(reader.nextString());
			}
			else if(name.equals("subscription_url")) {
				entity.setSubscriptionUrl(reader.nextString());
			}
			else if(name.equals("commits_url")) {
				entity.setCommitsUrl(reader.nextString());
			}
			else if(name.equals("git_commits_url")) {
				entity.setGitCommitsUrl(reader.nextString());
			}
			else if(name.equals("comments_url")) {
				entity.setCommentsUrl(reader.nextString());
			}
			else if(name.equals("issue_comment_url")) {
				entity.setIssueCommentUrl(reader.nextString());
			}
			else if(name.equals("contents_url")) {
				entity.setContentsUrl(reader.nextString());
			}
			else if(name.equals("compare_url")) {
				entity.setCompareUrl(reader.nextString());
			}
			else if(name.equals("merges_url")) {
				entity.setMergesUrl(reader.nextString());
			}
			else if(name.equals("archive_url")) {
				entity.setArchiveUrl(reader.nextString());
			}
			else if(name.equals("downloads_url")) {
				entity.setDownloadsUrl(reader.nextString());
			}
			else if(name.equals("issues_url")) {
				entity.setIssuesUrl(reader.nextString());
			}
			else if(name.equals("pulls_url")) {
				entity.setPullsUrl(reader.nextString());
			}
			else if(name.equals("milestones_url")) {
				entity.setMilestonesUrl(reader.nextString());
			}
			else if(name.equals("notifications_url")) {
				entity.setNotificationsUrl(reader.nextString());
			}
			else if(name.equals("labels_url")) {
				entity.setLabelsUrl(reader.nextString());
			}
			else if(name.equals("releases_url")) {
				entity.setReleasesUrl(reader.nextString());
			}
			else if(name.equals("created_at")) {
				entity.setCreatedAt(reader.nextString());
			}
			else if(name.equals("updated_at")) {
				entity.setUpdatedAt(reader.nextString());
			}
			else if(name.equals("pushed_at")) {
				entity.setPushedAt(reader.nextString());
			}
			else if(name.equals("git_url")) {
				entity.setGitUrl(reader.nextString());
			}
			else if(name.equals("ssh_url")) {
				entity.setSshUrl(reader.nextString());
			}
			else if(name.equals("clone_url")) {
				entity.setCloneUrl(reader.nextString());
			}
			else if(name.equals("svn_url")) {
				entity.setSvnUrl(reader.nextString());
			}
			else if(name.equals("homepage")) {
				entity.setHomepage(reader.nextString());
			}
			else if(name.equals("size")) {
				entity.setSize(reader.nextInt());
			}
			else if(name.equals("stargazers_count")) {
				entity.setStargazersCount(reader.nextInt());
			}
			else if(name.equals("watchers_count")) {
				entity.setWatchersCount(reader.nextInt());
			}
			else if(name.equals("language")) {
				entity.setLanguage(reader.nextString());
			}
			else if(name.equals("has_issues")) {
				entity.setHasIssues(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("has_downloads")) {
				entity.setHasDownloads(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("has_wiki")) {
				entity.setHasWiki(JsonReaderUtil.coerceNextBoolean(reader));
			}
			else if(name.equals("forks_count")) {
				entity.setForksCount(reader.nextInt());
			}
			else if(name.equals("mirror_url")) {
				entity.setMirrorUrl(reader.nextString());
			}
			else if(name.equals("open_issues_count")) {
				entity.setOpenIssuesCount(reader.nextInt());
			}
			else if(name.equals("forks")) {
				entity.setForks(reader.nextInt());
			}
			else if(name.equals("open_issues")) {
				entity.setOpenIssues(reader.nextInt());
			}
			else if(name.equals("watchers")) {
				entity.setWatchers(reader.nextInt());
			}
			else if(name.equals("default_branch")) {
				entity.setDefaultBranch(reader.nextString());
			}
			else if(name.equals("permissions")) {
				RepositoryPermissions entityMember = new RepositoryPermissions();
				getProvider().get(RepositoryPermissions.class).read(reader, entityMember);
				entity.setPermissions(entityMember);
			}
			else {
				reader.skipValue();
			}
		}
		
		reader.endObject();
	}
	
	public void readList(JsonReader reader, List<Repository> entities) throws IOException {
		reader.beginArray();
		
		while(reader.hasNext()) {
			Repository item = new Repository();
			read(reader, item);
			entities.add(item);
			
		}
		
		reader.endArray();
	}
}
