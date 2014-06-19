using System.Runtime.Serialization;
using System;
namespace Org.Specapi.Github
{
    [DataContract]
    public partial class Error
    {
        [DataMember(Name = "resource")]
        public string Resource { get; set; }
        [DataMember(Name = "code")]
        public ErrorCode Code { get; set; }
        [DataMember(Name = "field")]
        public string Field { get; set; }
        [DataMember(Name = "message")]
        public string Message { get; set; }
    }
}
