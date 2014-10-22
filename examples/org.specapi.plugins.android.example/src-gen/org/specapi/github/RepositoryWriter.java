package org.specapi.github;

import org.specapi.android.net.JsonEntityWriter;
import org.specapi.android.net.JsonEntityWriterProvider;
import java.io.IOException;
import org.specapi.android.internal.util.JsonWriter;
import java.util.List;


public class RepositoryWriter extends JsonEntityWriter<Repository> {

	public RepositoryWriter(JsonEntityWriterProvider provider) {
		super(provider);
	}
	
	public void write(JsonWriter writer, Repository entity) throws IOException {
		writer.beginObject();
		
		writer.name("id");
		writer.value(entity.getId());
		writer.name("name");
		writer.value(entity.getName());
		writer.name("full_name");
		writer.value(entity.getFullName());
		if(entity.getOwner() != null) {
			writer.name("owner");
			getProvider().get(RepositoryOwner.class).write(writer, entity.getOwner());
		}
		writer.name("private");
		writer.value(entity.isPrivate());
		writer.name("html_url");
		writer.value(entity.getHtmlUrl());
		writer.name("description");
		writer.value(entity.getDescription());
		writer.name("fork");
		writer.value(entity.isFork());
		writer.name("url");
		writer.value(entity.getUrl());
		writer.name("forks_url");
		writer.value(entity.getForksUrl());
		writer.name("keys_url");
		writer.value(entity.getKeysUrl());
		writer.name("collaborators_url");
		writer.value(entity.getCollaboratorsUrl());
		writer.name("teams_url");
		writer.value(entity.getTeamsUrl());
		writer.name("hooks_url");
		writer.value(entity.getHooksUrl());
		writer.name("issue_events_url");
		writer.value(entity.getIssueEventsUrl());
		writer.name("events_url");
		writer.value(entity.getEventsUrl());
		writer.name("assignees_url");
		writer.value(entity.getAssigneesUrl());
		writer.name("branches_url");
		writer.value(entity.getBranchesUrl());
		writer.name("tags_url");
		writer.value(entity.getTagsUrl());
		writer.name("blobs_url");
		writer.value(entity.getBlobsUrl());
		writer.name("git_tags_url");
		writer.value(entity.getGitTagsUrl());
		writer.name("git_refs_url");
		writer.value(entity.getGitRefsUrl());
		writer.name("trees_url");
		writer.value(entity.getTreesUrl());
		writer.name("statuses_url");
		writer.value(entity.getStatusesUrl());
		writer.name("languages_url");
		writer.value(entity.getLanguagesUrl());
		writer.name("stargazers_url");
		writer.value(entity.getStargazersUrl());
		writer.name("contributors_url");
		writer.value(entity.getContributorsUrl());
		writer.name("subscribers_url");
		writer.value(entity.getSubscribersUrl());
		writer.name("subscription_url");
		writer.value(entity.getSubscriptionUrl());
		writer.name("commits_url");
		writer.value(entity.getCommitsUrl());
		writer.name("git_commits_url");
		writer.value(entity.getGitCommitsUrl());
		writer.name("comments_url");
		writer.value(entity.getCommentsUrl());
		writer.name("issue_comment_url");
		writer.value(entity.getIssueCommentUrl());
		writer.name("contents_url");
		writer.value(entity.getContentsUrl());
		writer.name("compare_url");
		writer.value(entity.getCompareUrl());
		writer.name("merges_url");
		writer.value(entity.getMergesUrl());
		writer.name("archive_url");
		writer.value(entity.getArchiveUrl());
		writer.name("downloads_url");
		writer.value(entity.getDownloadsUrl());
		writer.name("issues_url");
		writer.value(entity.getIssuesUrl());
		writer.name("pulls_url");
		writer.value(entity.getPullsUrl());
		writer.name("milestones_url");
		writer.value(entity.getMilestonesUrl());
		writer.name("notifications_url");
		writer.value(entity.getNotificationsUrl());
		writer.name("labels_url");
		writer.value(entity.getLabelsUrl());
		writer.name("releases_url");
		writer.value(entity.getReleasesUrl());
		writer.name("created_at");
		writer.value(entity.getCreatedAt());
		writer.name("updated_at");
		writer.value(entity.getUpdatedAt());
		writer.name("pushed_at");
		writer.value(entity.getPushedAt());
		writer.name("git_url");
		writer.value(entity.getGitUrl());
		writer.name("ssh_url");
		writer.value(entity.getSshUrl());
		writer.name("clone_url");
		writer.value(entity.getCloneUrl());
		writer.name("svn_url");
		writer.value(entity.getSvnUrl());
		writer.name("homepage");
		writer.value(entity.getHomepage());
		writer.name("size");
		writer.value(entity.getSize());
		writer.name("stargazers_count");
		writer.value(entity.getStargazersCount());
		writer.name("watchers_count");
		writer.value(entity.getWatchersCount());
		writer.name("language");
		writer.value(entity.getLanguage());
		writer.name("has_issues");
		writer.value(entity.hasIssues());
		writer.name("has_downloads");
		writer.value(entity.hasDownloads());
		writer.name("has_wiki");
		writer.value(entity.hasWiki());
		writer.name("forks_count");
		writer.value(entity.getForksCount());
		writer.name("mirror_url");
		writer.value(entity.getMirrorUrl());
		writer.name("open_issues_count");
		writer.value(entity.getOpenIssuesCount());
		writer.name("forks");
		writer.value(entity.getForks());
		writer.name("open_issues");
		writer.value(entity.getOpenIssues());
		writer.name("watchers");
		writer.value(entity.getWatchers());
		writer.name("default_branch");
		writer.value(entity.getDefaultBranch());
		if(entity.getPermissions() != null) {
			writer.name("permissions");
			getProvider().get(RepositoryPermissions.class).write(writer, entity.getPermissions());
		}
		
		writer.endObject();
	}
	
	public void writeList(JsonWriter writer, List<Repository> entities) throws IOException {
		writer.beginArray();
		
		for(Repository item:entities) {
			write(writer, item);
		}
		
		writer.endArray();
	}
}
