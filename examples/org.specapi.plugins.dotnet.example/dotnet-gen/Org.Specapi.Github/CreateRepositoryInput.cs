using System.Runtime.Serialization;
using System;
namespace Org.Specapi.Github
{
    [DataContract]
    public partial class CreateRepositoryInput
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
        [DataMember(Name = "team_id")]
        public long TeamId { get; set; }
        [DataMember(Name = "auto_init")]
        public bool AutoInit { get; set; }
        [DataMember(Name = "gitigore_template")]
        public string GitigoreTemplate { get; set; }
        [DataMember(Name = "license_template")]
        public string LicenseTemplate { get; set; }
    }
}
