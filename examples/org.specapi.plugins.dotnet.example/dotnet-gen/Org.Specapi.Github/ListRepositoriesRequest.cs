using System.Collections.Specialized;
using System.Linq;
using System;
using System.Net;
namespace Org.Specapi.Github
{
    public partial class ListRepositoriesRequest
    {
        bool _typeParamSet = false;
        string _typeParam;
        public string Type 
        { 
            get 
            {
                return _typeParam;
            } 
            set 
            {
                _typeParamSet = true;
                _typeParam = value;
            }
        }
        
        bool _sortParamSet = false;
        string _sortParam;
        public string Sort 
        { 
            get 
            {
                return _sortParam;
            } 
            set 
            {
                _sortParamSet = true;
                _sortParam = value;
            }
        }
        
        bool _directionParamSet = false;
        string _directionParam;
        public string Direction 
        { 
            get 
            {
                return _directionParam;
            } 
            set 
            {
                _directionParamSet = true;
                _directionParam = value;
            }
        }
        
        public delegate void Status200Handler(Repository[] result);
        public delegate void Status401Handler(ErrorMessage result);
        public delegate void StatusUnexpectedHandler(HttpWebResponse result);
        public Status200Handler On200 { get; set; }
        public Status401Handler On401 { get; set; }
        public StatusUnexpectedHandler OnOther { get; set; }
                
        public ListRepositoriesRequest() {
        }
        
        public Uri CreateUri (string baseUrl)
        {
            String url = baseUrl + "/user/repos";
            
            var uriBuilder = new UriBuilder(url);
            NameValueCollection query = new NameValueCollection ();
            if(_typeParamSet) {
                query ["type"] = _typeParam;
            }
            if(_sortParamSet) {
                query ["sort"] = _sortParam;
            }
            if(_directionParamSet) {
                query ["direction"] = _directionParam;
            }
            uriBuilder.Query = string.Join("&", query.AllKeys.Select(key => string.Format("{0}={1}", WebUtility.UrlEncode(key), WebUtility.UrlEncode(query[key]))));
            return uriBuilder.Uri;
        }
    }
}
