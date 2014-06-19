using System.Runtime.Serialization;
using System;
namespace Org.Specapi.Github
{
    [DataContract]
    public partial class RepositoryPermissions
    {
        [DataMember(Name = "admin")]
        public bool Admin { get; set; }
        [DataMember(Name = "push")]
        public bool Push { get; set; }
        [DataMember(Name = "pull")]
        public bool Pull { get; set; }
    }
}
