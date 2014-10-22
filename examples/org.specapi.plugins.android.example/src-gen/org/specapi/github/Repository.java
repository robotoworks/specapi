package org.specapi.github;

import android.content.ContentValues;
import org.specapi.android.db.ContentValuesUtil;
import java.util.Map;

public class Repository {
    
	public static final String KEY_ID = "id";
	public static final String KEY_NAME = "name";
	public static final String KEY_FULL_NAME = "full_name";
	public static final String KEY_OWNER = "owner";
	public static final String KEY_PRIVATE = "private";
	public static final String KEY_HTML_URL = "html_url";
	public static final String KEY_DESCRIPTION = "description";
	public static final String KEY_FORK = "fork";
	public static final String KEY_URL = "url";
	public static final String KEY_FORKS_URL = "forks_url";
	public static final String KEY_KEYS_URL = "keys_url";
	public static final String KEY_COLLABORATORS_URL = "collaborators_url";
	public static final String KEY_TEAMS_URL = "teams_url";
	public static final String KEY_HOOKS_URL = "hooks_url";
	public static final String KEY_ISSUE_EVENTS_URL = "issue_events_url";
	public static final String KEY_EVENTS_URL = "events_url";
	public static final String KEY_ASSIGNEES_URL = "assignees_url";
	public static final String KEY_BRANCHES_URL = "branches_url";
	public static final String KEY_TAGS_URL = "tags_url";
	public static final String KEY_BLOBS_URL = "blobs_url";
	public static final String KEY_GIT_TAGS_URL = "git_tags_url";
	public static final String KEY_GIT_REFS_URL = "git_refs_url";
	public static final String KEY_TREES_URL = "trees_url";
	public static final String KEY_STATUSES_URL = "statuses_url";
	public static final String KEY_LANGUAGES_URL = "languages_url";
	public static final String KEY_STARGAZERS_URL = "stargazers_url";
	public static final String KEY_CONTRIBUTORS_URL = "contributors_url";
	public static final String KEY_SUBSCRIBERS_URL = "subscribers_url";
	public static final String KEY_SUBSCRIPTION_URL = "subscription_url";
	public static final String KEY_COMMITS_URL = "commits_url";
	public static final String KEY_GIT_COMMITS_URL = "git_commits_url";
	public static final String KEY_COMMENTS_URL = "comments_url";
	public static final String KEY_ISSUE_COMMENT_URL = "issue_comment_url";
	public static final String KEY_CONTENTS_URL = "contents_url";
	public static final String KEY_COMPARE_URL = "compare_url";
	public static final String KEY_MERGES_URL = "merges_url";
	public static final String KEY_ARCHIVE_URL = "archive_url";
	public static final String KEY_DOWNLOADS_URL = "downloads_url";
	public static final String KEY_ISSUES_URL = "issues_url";
	public static final String KEY_PULLS_URL = "pulls_url";
	public static final String KEY_MILESTONES_URL = "milestones_url";
	public static final String KEY_NOTIFICATIONS_URL = "notifications_url";
	public static final String KEY_LABELS_URL = "labels_url";
	public static final String KEY_RELEASES_URL = "releases_url";
	public static final String KEY_CREATED_AT = "created_at";
	public static final String KEY_UPDATED_AT = "updated_at";
	public static final String KEY_PUSHED_AT = "pushed_at";
	public static final String KEY_GIT_URL = "git_url";
	public static final String KEY_SSH_URL = "ssh_url";
	public static final String KEY_CLONE_URL = "clone_url";
	public static final String KEY_SVN_URL = "svn_url";
	public static final String KEY_HOMEPAGE = "homepage";
	public static final String KEY_SIZE = "size";
	public static final String KEY_STARGAZERS_COUNT = "stargazers_count";
	public static final String KEY_WATCHERS_COUNT = "watchers_count";
	public static final String KEY_LANGUAGE = "language";
	public static final String KEY_HAS_ISSUES = "has_issues";
	public static final String KEY_HAS_DOWNLOADS = "has_downloads";
	public static final String KEY_HAS_WIKI = "has_wiki";
	public static final String KEY_FORKS_COUNT = "forks_count";
	public static final String KEY_MIRROR_URL = "mirror_url";
	public static final String KEY_OPEN_ISSUES_COUNT = "open_issues_count";
	public static final String KEY_FORKS = "forks";
	public static final String KEY_OPEN_ISSUES = "open_issues";
	public static final String KEY_WATCHERS = "watchers";
	public static final String KEY_DEFAULT_BRANCH = "default_branch";
	public static final String KEY_PERMISSIONS = "permissions";

	private long id;
	private String name;
	private String fullName;
	private RepositoryOwner owner;
	private boolean _private;
	private String htmlUrl;
	private String description;
	private boolean fork;
	private String url;
	private String forksUrl;
	private String keysUrl;
	private String collaboratorsUrl;
	private String teamsUrl;
	private String hooksUrl;
	private String issueEventsUrl;
	private String eventsUrl;
	private String assigneesUrl;
	private String branchesUrl;
	private String tagsUrl;
	private String blobsUrl;
	private String gitTagsUrl;
	private String gitRefsUrl;
	private String treesUrl;
	private String statusesUrl;
	private String languagesUrl;
	private String stargazersUrl;
	private String contributorsUrl;
	private String subscribersUrl;
	private String subscriptionUrl;
	private String commitsUrl;
	private String gitCommitsUrl;
	private String commentsUrl;
	private String issueCommentUrl;
	private String contentsUrl;
	private String compareUrl;
	private String mergesUrl;
	private String archiveUrl;
	private String downloadsUrl;
	private String issuesUrl;
	private String pullsUrl;
	private String milestonesUrl;
	private String notificationsUrl;
	private String labelsUrl;
	private String releasesUrl;
	private String createdAt;
	private String updatedAt;
	private String pushedAt;
	private String gitUrl;
	private String sshUrl;
	private String cloneUrl;
	private String svnUrl;
	private String homepage;
	private int size;
	private int stargazersCount;
	private int watchersCount;
	private String language;
	private boolean hasIssues;
	private boolean hasDownloads;
	private boolean hasWiki;
	private int forksCount;
	private String mirrorUrl;
	private int openIssuesCount;
	private int forks;
	private int openIssues;
	private int watchers;
	private String defaultBranch;
	private RepositoryPermissions permissions;
	
	public long getId(){
		return id;
	}
	public void setId(long value){
		this.id = value;
	}
	public String getName(){
		return name;
	}
	public void setName(String value){
		this.name = value;
	}
	public String getFullName(){
		return fullName;
	}
	public void setFullName(String value){
		this.fullName = value;
	}
	public RepositoryOwner getOwner(){
		return owner;
	}
	public void setOwner(RepositoryOwner value){
		this.owner = value;
	}
	public boolean isPrivate(){
		return _private;
	}
	public void setPrivate(boolean value){
		this._private = value;
	}
	public String getHtmlUrl(){
		return htmlUrl;
	}
	public void setHtmlUrl(String value){
		this.htmlUrl = value;
	}
	public String getDescription(){
		return description;
	}
	public void setDescription(String value){
		this.description = value;
	}
	public boolean isFork(){
		return fork;
	}
	public void setFork(boolean value){
		this.fork = value;
	}
	public String getUrl(){
		return url;
	}
	public void setUrl(String value){
		this.url = value;
	}
	public String getForksUrl(){
		return forksUrl;
	}
	public void setForksUrl(String value){
		this.forksUrl = value;
	}
	public String getKeysUrl(){
		return keysUrl;
	}
	public void setKeysUrl(String value){
		this.keysUrl = value;
	}
	public String getCollaboratorsUrl(){
		return collaboratorsUrl;
	}
	public void setCollaboratorsUrl(String value){
		this.collaboratorsUrl = value;
	}
	public String getTeamsUrl(){
		return teamsUrl;
	}
	public void setTeamsUrl(String value){
		this.teamsUrl = value;
	}
	public String getHooksUrl(){
		return hooksUrl;
	}
	public void setHooksUrl(String value){
		this.hooksUrl = value;
	}
	public String getIssueEventsUrl(){
		return issueEventsUrl;
	}
	public void setIssueEventsUrl(String value){
		this.issueEventsUrl = value;
	}
	public String getEventsUrl(){
		return eventsUrl;
	}
	public void setEventsUrl(String value){
		this.eventsUrl = value;
	}
	public String getAssigneesUrl(){
		return assigneesUrl;
	}
	public void setAssigneesUrl(String value){
		this.assigneesUrl = value;
	}
	public String getBranchesUrl(){
		return branchesUrl;
	}
	public void setBranchesUrl(String value){
		this.branchesUrl = value;
	}
	public String getTagsUrl(){
		return tagsUrl;
	}
	public void setTagsUrl(String value){
		this.tagsUrl = value;
	}
	public String getBlobsUrl(){
		return blobsUrl;
	}
	public void setBlobsUrl(String value){
		this.blobsUrl = value;
	}
	public String getGitTagsUrl(){
		return gitTagsUrl;
	}
	public void setGitTagsUrl(String value){
		this.gitTagsUrl = value;
	}
	public String getGitRefsUrl(){
		return gitRefsUrl;
	}
	public void setGitRefsUrl(String value){
		this.gitRefsUrl = value;
	}
	public String getTreesUrl(){
		return treesUrl;
	}
	public void setTreesUrl(String value){
		this.treesUrl = value;
	}
	public String getStatusesUrl(){
		return statusesUrl;
	}
	public void setStatusesUrl(String value){
		this.statusesUrl = value;
	}
	public String getLanguagesUrl(){
		return languagesUrl;
	}
	public void setLanguagesUrl(String value){
		this.languagesUrl = value;
	}
	public String getStargazersUrl(){
		return stargazersUrl;
	}
	public void setStargazersUrl(String value){
		this.stargazersUrl = value;
	}
	public String getContributorsUrl(){
		return contributorsUrl;
	}
	public void setContributorsUrl(String value){
		this.contributorsUrl = value;
	}
	public String getSubscribersUrl(){
		return subscribersUrl;
	}
	public void setSubscribersUrl(String value){
		this.subscribersUrl = value;
	}
	public String getSubscriptionUrl(){
		return subscriptionUrl;
	}
	public void setSubscriptionUrl(String value){
		this.subscriptionUrl = value;
	}
	public String getCommitsUrl(){
		return commitsUrl;
	}
	public void setCommitsUrl(String value){
		this.commitsUrl = value;
	}
	public String getGitCommitsUrl(){
		return gitCommitsUrl;
	}
	public void setGitCommitsUrl(String value){
		this.gitCommitsUrl = value;
	}
	public String getCommentsUrl(){
		return commentsUrl;
	}
	public void setCommentsUrl(String value){
		this.commentsUrl = value;
	}
	public String getIssueCommentUrl(){
		return issueCommentUrl;
	}
	public void setIssueCommentUrl(String value){
		this.issueCommentUrl = value;
	}
	public String getContentsUrl(){
		return contentsUrl;
	}
	public void setContentsUrl(String value){
		this.contentsUrl = value;
	}
	public String getCompareUrl(){
		return compareUrl;
	}
	public void setCompareUrl(String value){
		this.compareUrl = value;
	}
	public String getMergesUrl(){
		return mergesUrl;
	}
	public void setMergesUrl(String value){
		this.mergesUrl = value;
	}
	public String getArchiveUrl(){
		return archiveUrl;
	}
	public void setArchiveUrl(String value){
		this.archiveUrl = value;
	}
	public String getDownloadsUrl(){
		return downloadsUrl;
	}
	public void setDownloadsUrl(String value){
		this.downloadsUrl = value;
	}
	public String getIssuesUrl(){
		return issuesUrl;
	}
	public void setIssuesUrl(String value){
		this.issuesUrl = value;
	}
	public String getPullsUrl(){
		return pullsUrl;
	}
	public void setPullsUrl(String value){
		this.pullsUrl = value;
	}
	public String getMilestonesUrl(){
		return milestonesUrl;
	}
	public void setMilestonesUrl(String value){
		this.milestonesUrl = value;
	}
	public String getNotificationsUrl(){
		return notificationsUrl;
	}
	public void setNotificationsUrl(String value){
		this.notificationsUrl = value;
	}
	public String getLabelsUrl(){
		return labelsUrl;
	}
	public void setLabelsUrl(String value){
		this.labelsUrl = value;
	}
	public String getReleasesUrl(){
		return releasesUrl;
	}
	public void setReleasesUrl(String value){
		this.releasesUrl = value;
	}
	public String getCreatedAt(){
		return createdAt;
	}
	public void setCreatedAt(String value){
		this.createdAt = value;
	}
	public String getUpdatedAt(){
		return updatedAt;
	}
	public void setUpdatedAt(String value){
		this.updatedAt = value;
	}
	public String getPushedAt(){
		return pushedAt;
	}
	public void setPushedAt(String value){
		this.pushedAt = value;
	}
	public String getGitUrl(){
		return gitUrl;
	}
	public void setGitUrl(String value){
		this.gitUrl = value;
	}
	public String getSshUrl(){
		return sshUrl;
	}
	public void setSshUrl(String value){
		this.sshUrl = value;
	}
	public String getCloneUrl(){
		return cloneUrl;
	}
	public void setCloneUrl(String value){
		this.cloneUrl = value;
	}
	public String getSvnUrl(){
		return svnUrl;
	}
	public void setSvnUrl(String value){
		this.svnUrl = value;
	}
	public String getHomepage(){
		return homepage;
	}
	public void setHomepage(String value){
		this.homepage = value;
	}
	public int getSize(){
		return size;
	}
	public void setSize(int value){
		this.size = value;
	}
	public int getStargazersCount(){
		return stargazersCount;
	}
	public void setStargazersCount(int value){
		this.stargazersCount = value;
	}
	public int getWatchersCount(){
		return watchersCount;
	}
	public void setWatchersCount(int value){
		this.watchersCount = value;
	}
	public String getLanguage(){
		return language;
	}
	public void setLanguage(String value){
		this.language = value;
	}
	public boolean hasIssues(){
		return hasIssues;
	}
	public void setHasIssues(boolean value){
		this.hasIssues = value;
	}
	public boolean hasDownloads(){
		return hasDownloads;
	}
	public void setHasDownloads(boolean value){
		this.hasDownloads = value;
	}
	public boolean hasWiki(){
		return hasWiki;
	}
	public void setHasWiki(boolean value){
		this.hasWiki = value;
	}
	public int getForksCount(){
		return forksCount;
	}
	public void setForksCount(int value){
		this.forksCount = value;
	}
	public String getMirrorUrl(){
		return mirrorUrl;
	}
	public void setMirrorUrl(String value){
		this.mirrorUrl = value;
	}
	public int getOpenIssuesCount(){
		return openIssuesCount;
	}
	public void setOpenIssuesCount(int value){
		this.openIssuesCount = value;
	}
	public int getForks(){
		return forks;
	}
	public void setForks(int value){
		this.forks = value;
	}
	public int getOpenIssues(){
		return openIssues;
	}
	public void setOpenIssues(int value){
		this.openIssues = value;
	}
	public int getWatchers(){
		return watchers;
	}
	public void setWatchers(int value){
		this.watchers = value;
	}
	public String getDefaultBranch(){
		return defaultBranch;
	}
	public void setDefaultBranch(String value){
		this.defaultBranch = value;
	}
	public RepositoryPermissions getPermissions(){
		return permissions;
	}
	public void setPermissions(RepositoryPermissions value){
		this.permissions = value;
	}
	
	public ContentValues toContentValues() {
	    return toContentValues(null);
	}
	
	public ContentValues toContentValues(Map<String, String> map) {
	    ContentValues values = new ContentValues();

		ContentValuesUtil.putMapped(KEY_ID, map, values, id);
		ContentValuesUtil.putMapped(KEY_NAME, map, values, name);
		ContentValuesUtil.putMapped(KEY_FULL_NAME, map, values, fullName);
		ContentValuesUtil.putMapped(KEY_OWNER, map, values, owner);
		ContentValuesUtil.putMapped(KEY_PRIVATE, map, values, _private);
		ContentValuesUtil.putMapped(KEY_HTML_URL, map, values, htmlUrl);
		ContentValuesUtil.putMapped(KEY_DESCRIPTION, map, values, description);
		ContentValuesUtil.putMapped(KEY_FORK, map, values, fork);
		ContentValuesUtil.putMapped(KEY_URL, map, values, url);
		ContentValuesUtil.putMapped(KEY_FORKS_URL, map, values, forksUrl);
		ContentValuesUtil.putMapped(KEY_KEYS_URL, map, values, keysUrl);
		ContentValuesUtil.putMapped(KEY_COLLABORATORS_URL, map, values, collaboratorsUrl);
		ContentValuesUtil.putMapped(KEY_TEAMS_URL, map, values, teamsUrl);
		ContentValuesUtil.putMapped(KEY_HOOKS_URL, map, values, hooksUrl);
		ContentValuesUtil.putMapped(KEY_ISSUE_EVENTS_URL, map, values, issueEventsUrl);
		ContentValuesUtil.putMapped(KEY_EVENTS_URL, map, values, eventsUrl);
		ContentValuesUtil.putMapped(KEY_ASSIGNEES_URL, map, values, assigneesUrl);
		ContentValuesUtil.putMapped(KEY_BRANCHES_URL, map, values, branchesUrl);
		ContentValuesUtil.putMapped(KEY_TAGS_URL, map, values, tagsUrl);
		ContentValuesUtil.putMapped(KEY_BLOBS_URL, map, values, blobsUrl);
		ContentValuesUtil.putMapped(KEY_GIT_TAGS_URL, map, values, gitTagsUrl);
		ContentValuesUtil.putMapped(KEY_GIT_REFS_URL, map, values, gitRefsUrl);
		ContentValuesUtil.putMapped(KEY_TREES_URL, map, values, treesUrl);
		ContentValuesUtil.putMapped(KEY_STATUSES_URL, map, values, statusesUrl);
		ContentValuesUtil.putMapped(KEY_LANGUAGES_URL, map, values, languagesUrl);
		ContentValuesUtil.putMapped(KEY_STARGAZERS_URL, map, values, stargazersUrl);
		ContentValuesUtil.putMapped(KEY_CONTRIBUTORS_URL, map, values, contributorsUrl);
		ContentValuesUtil.putMapped(KEY_SUBSCRIBERS_URL, map, values, subscribersUrl);
		ContentValuesUtil.putMapped(KEY_SUBSCRIPTION_URL, map, values, subscriptionUrl);
		ContentValuesUtil.putMapped(KEY_COMMITS_URL, map, values, commitsUrl);
		ContentValuesUtil.putMapped(KEY_GIT_COMMITS_URL, map, values, gitCommitsUrl);
		ContentValuesUtil.putMapped(KEY_COMMENTS_URL, map, values, commentsUrl);
		ContentValuesUtil.putMapped(KEY_ISSUE_COMMENT_URL, map, values, issueCommentUrl);
		ContentValuesUtil.putMapped(KEY_CONTENTS_URL, map, values, contentsUrl);
		ContentValuesUtil.putMapped(KEY_COMPARE_URL, map, values, compareUrl);
		ContentValuesUtil.putMapped(KEY_MERGES_URL, map, values, mergesUrl);
		ContentValuesUtil.putMapped(KEY_ARCHIVE_URL, map, values, archiveUrl);
		ContentValuesUtil.putMapped(KEY_DOWNLOADS_URL, map, values, downloadsUrl);
		ContentValuesUtil.putMapped(KEY_ISSUES_URL, map, values, issuesUrl);
		ContentValuesUtil.putMapped(KEY_PULLS_URL, map, values, pullsUrl);
		ContentValuesUtil.putMapped(KEY_MILESTONES_URL, map, values, milestonesUrl);
		ContentValuesUtil.putMapped(KEY_NOTIFICATIONS_URL, map, values, notificationsUrl);
		ContentValuesUtil.putMapped(KEY_LABELS_URL, map, values, labelsUrl);
		ContentValuesUtil.putMapped(KEY_RELEASES_URL, map, values, releasesUrl);
		ContentValuesUtil.putMapped(KEY_CREATED_AT, map, values, createdAt);
		ContentValuesUtil.putMapped(KEY_UPDATED_AT, map, values, updatedAt);
		ContentValuesUtil.putMapped(KEY_PUSHED_AT, map, values, pushedAt);
		ContentValuesUtil.putMapped(KEY_GIT_URL, map, values, gitUrl);
		ContentValuesUtil.putMapped(KEY_SSH_URL, map, values, sshUrl);
		ContentValuesUtil.putMapped(KEY_CLONE_URL, map, values, cloneUrl);
		ContentValuesUtil.putMapped(KEY_SVN_URL, map, values, svnUrl);
		ContentValuesUtil.putMapped(KEY_HOMEPAGE, map, values, homepage);
		ContentValuesUtil.putMapped(KEY_SIZE, map, values, size);
		ContentValuesUtil.putMapped(KEY_STARGAZERS_COUNT, map, values, stargazersCount);
		ContentValuesUtil.putMapped(KEY_WATCHERS_COUNT, map, values, watchersCount);
		ContentValuesUtil.putMapped(KEY_LANGUAGE, map, values, language);
		ContentValuesUtil.putMapped(KEY_HAS_ISSUES, map, values, hasIssues);
		ContentValuesUtil.putMapped(KEY_HAS_DOWNLOADS, map, values, hasDownloads);
		ContentValuesUtil.putMapped(KEY_HAS_WIKI, map, values, hasWiki);
		ContentValuesUtil.putMapped(KEY_FORKS_COUNT, map, values, forksCount);
		ContentValuesUtil.putMapped(KEY_MIRROR_URL, map, values, mirrorUrl);
		ContentValuesUtil.putMapped(KEY_OPEN_ISSUES_COUNT, map, values, openIssuesCount);
		ContentValuesUtil.putMapped(KEY_FORKS, map, values, forks);
		ContentValuesUtil.putMapped(KEY_OPEN_ISSUES, map, values, openIssues);
		ContentValuesUtil.putMapped(KEY_WATCHERS, map, values, watchers);
		ContentValuesUtil.putMapped(KEY_DEFAULT_BRANCH, map, values, defaultBranch);
		ContentValuesUtil.putMapped(KEY_PERMISSIONS, map, values, permissions);

        return values;
	}
}
