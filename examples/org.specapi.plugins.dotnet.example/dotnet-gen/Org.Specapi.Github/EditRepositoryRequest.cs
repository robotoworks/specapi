using System.Collections.Specialized;
using System.Linq;
using System;
using System.Net;
namespace Org.Specapi.Github
{
    public partial class EditRepositoryRequest
    {
        public string Owner { get; set; }
        public string Repo { get; set; }
        public delegate void Status200Handler(Repository result);
        public delegate void StatusUnexpectedHandler(HttpWebResponse result);
        public Status200Handler On200 { get; set; }
        public StatusUnexpectedHandler OnOther { get; set; }
        
        public RepositoryPatch Entity { get; set; }
    
        public EditRepositoryRequest(string owner, string repo) {
            Owner = owner;
            Repo = repo;
        }
        
        public Uri CreateUri (string baseUrl)
        {
            String path = String.Format ("/repos/{0}/{1}", Owner, Repo);
            String url = baseUrl + path;
            
            return new Uri(url);
        }
    }
}
