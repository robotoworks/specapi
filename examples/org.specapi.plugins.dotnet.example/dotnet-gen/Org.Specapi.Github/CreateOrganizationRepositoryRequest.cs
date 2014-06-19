using System.Collections.Specialized;
using System.Linq;
using System;
using System.Net;
namespace Org.Specapi.Github
{
    public partial class CreateOrganizationRepositoryRequest
    {
        public string Org { get; set; }
        
        public CreateOrganizationRepositoryRequest(string org) {
            Org = org;
        }
        
        public Uri CreateUri (string baseUrl)
        {
            String path = String.Format ("/orgs/{0}/repos", Org);
            String url = baseUrl + path;
            
            return new Uri(url);
        }
    }
}
