using System.Runtime.Serialization;
using System;
namespace Org.Specapi.Github
{
    [DataContract]
    public partial class ErrorMessage
    {
        [DataMember(Name = "message")]
        public string Message { get; set; }
        [DataMember(Name = "documentation_url")]
        public string DocumentationUrl { get; set; }
        [DataMember(Name = "errors")]
        public Error[] Errors { get; set; }
    }
}
