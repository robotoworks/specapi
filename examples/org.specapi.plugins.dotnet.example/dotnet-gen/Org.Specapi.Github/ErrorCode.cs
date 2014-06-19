using System.Runtime.Serialization;
using System;
namespace Org.Specapi.Github
{
    [DataContract]
    public enum ErrorCode
    {
        [DataMember(Name = "missing")]
        Missing,
        [DataMember(Name = "missing_field")]
        MissingField,
        [DataMember(Name = "invalid")]
        Invalid,
        [DataMember(Name = "already_exists")]
        AlreadyExists
    }    
}
