using System.Collections.Specialized;
using System.Linq;
using System;
using System.Net;
namespace Org.Specapi.Github
{
    public partial class CreateRepositoryRequest
    {
        
        public CreateRepositoryRequest() {
        }
        
        public Uri CreateUri (string baseUrl)
        {
            String url = baseUrl + "/user/repos";
            
            return new Uri(url);
        }
    }
}
