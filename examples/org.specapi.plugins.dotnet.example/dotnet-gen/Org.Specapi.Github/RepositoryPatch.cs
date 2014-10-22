using System.Runtime.Serialization;
using System;
namespace Org.Specapi.Github
{
    [DataContract]
    public partial class RepositoryPatch
    {
        [DataMember(Name = "name")]
        public string Name { get; set; }
        [DataMember(Name = "description")]
        public string Description { get; set; }
        [DataMember(Name = "homepage")]
        public string Homepage { get; set; }
        [DataMember(Name = "private")]
        public bool Private { get; set; }
        [DataMember(Name = "has_issues")]
        public bool HasIssues { get; set; }
        [DataMember(Name = "has_wiki")]
        public bool HasWiki { get; set; }
        [DataMember(Name = "has_downloads")]
        public bool HasDownloads { get; set; }
    }
}
