using System.Collections.Specialized;
using System.Linq;
using System;
using System.Net;
namespace Org.Specapi.Github
{
    public partial class ListAllPublicRepositoriesRequest
    {
        bool _sinceParamSet = false;
        string _sinceParam;
        public string Since 
        { 
            get 
            {
                return _sinceParam;
            } 
            set 
            {
                _sinceParamSet = true;
                _sinceParam = value;
            }
        }
        
        public delegate void Status200Handler(Repository[] result);
        public delegate void StatusUnexpectedHandler(HttpWebResponse result);
        public Status200Handler On200 { get; set; }
        public StatusUnexpectedHandler OnOther { get; set; }
                
        public ListAllPublicRepositoriesRequest() {
        }
        
        public Uri CreateUri (string baseUrl)
        {
            String url = baseUrl + "/repositories";
            
            var uriBuilder = new UriBuilder(url);
            NameValueCollection query = new NameValueCollection ();
            if(_sinceParamSet) {
                query ["since"] = _sinceParam;
            }
            uriBuilder.Query = string.Join("&", query.AllKeys.Select(key => string.Format("{0}={1}", WebUtility.UrlEncode(key), WebUtility.UrlEncode(query[key]))));
            return uriBuilder.Uri;
        }
    }
}
