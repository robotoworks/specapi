using System.Collections.Specialized;
using System.Linq;
using System;
using System.Net;
namespace Org.Specapi.Github
{
    public partial class ListUserRepositoriesRequest
    {
        public string User { get; set; }
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
        
        
        public ListUserRepositoriesRequest(string user) {
            User = user;
        }
        
        public Uri CreateUri (string baseUrl)
        {
            String path = String.Format ("/users/{0}/repos", User);
            String url = baseUrl + path;
            
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
