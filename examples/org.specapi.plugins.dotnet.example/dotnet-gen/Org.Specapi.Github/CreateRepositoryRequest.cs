using System.Collections.Specialized;
using System.Linq;
using System;
using System.Net;
namespace Org.Specapi.Github
{
    public partial class CreateRepositoryRequest
    {
        public delegate void Status201Handler(Repository result);
        public delegate void Status400Handler(ErrorMessage result);
        public delegate void Status401Handler(ErrorMessage result);
        public delegate void Status422Handler(ErrorMessage result);
        public delegate void StatusUnexpectedHandler(HttpWebResponse result);
        public Status201Handler On201 { get; set; }
        public Status400Handler On400 { get; set; }
        public Status401Handler On401 { get; set; }
        public Status422Handler On422 { get; set; }
        public StatusUnexpectedHandler OnOther { get; set; }
        
        public RepositoryProperties Entity { get; set; }
    
        public CreateRepositoryRequest() {
        }
        
        public Uri CreateUri (string baseUrl)
        {
            String url = baseUrl + "/user";
            
            return new Uri(url);
        }
    }
}
