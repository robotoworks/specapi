using System;
using System.Runtime.Serialization.Json;
using System.Net;
namespace Org.Specapi.Github
{
    public partial class GithubAPI
    {
        public static String DefaultBaseUrl { get { return "https://api.github.com"; }}
        
        public String BaseUrl { get; set; }
        
        public GithubAPI() {
            BaseUrl = DefaultBaseUrl;
        }
        
        public void ListRepositories(ListRepositoriesRequest request, ListRepositoriesResponder responder)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "GET";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handleListRepositoriesResponse((int) webResponse.StatusCode, webResponse, responder);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handleListRepositoriesResponse((int) webResponse.StatusCode, webResponse, responder);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handleListRepositoriesResponse (int status, HttpWebResponse webResponse, ListRepositoriesResponder responder)
        {
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            if (status == 200 && responder.On200 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(Repository[]));
                Repository[] result = (Repository[]) serializer.ReadObject (responseStream);
                responder.On200(result);
            }else
            if (status == 401 && responder.On401 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                responder.On401(result);
            }
            else if(responder.OnOther != null) 
            {
                responder.OnOther(webResponse);
            }
        }       
        public void ListUserRepositories(ListUserRepositoriesRequest request, ListUserRepositoriesResponder responder)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "GET";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handleListUserRepositoriesResponse((int) webResponse.StatusCode, webResponse, responder);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handleListUserRepositoriesResponse((int) webResponse.StatusCode, webResponse, responder);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handleListUserRepositoriesResponse (int status, HttpWebResponse webResponse, ListUserRepositoriesResponder responder)
        {
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            if (status == 200 && responder.On200 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(Repository[]));
                Repository[] result = (Repository[]) serializer.ReadObject (responseStream);
                responder.On200(result);
            }
            else if(responder.OnOther != null) 
            {
                responder.OnOther(webResponse);
            }
        }       
        public void ListOrganizationRepositories(ListOrganizationRepositoriesRequest request, ListOrganizationRepositoriesResponder responder)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "GET";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handleListOrganizationRepositoriesResponse((int) webResponse.StatusCode, webResponse, responder);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handleListOrganizationRepositoriesResponse((int) webResponse.StatusCode, webResponse, responder);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handleListOrganizationRepositoriesResponse (int status, HttpWebResponse webResponse, ListOrganizationRepositoriesResponder responder)
        {
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            if (status == 200 && responder.On200 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(Repository[]));
                Repository[] result = (Repository[]) serializer.ReadObject (responseStream);
                responder.On200(result);
            }
            else if(responder.OnOther != null) 
            {
                responder.OnOther(webResponse);
            }
        }       
        public void ListAllPublicRepositories(ListAllPublicRepositoriesRequest request, ListAllPublicRepositoriesResponder responder)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "GET";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handleListAllPublicRepositoriesResponse((int) webResponse.StatusCode, webResponse, responder);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handleListAllPublicRepositoriesResponse((int) webResponse.StatusCode, webResponse, responder);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handleListAllPublicRepositoriesResponse (int status, HttpWebResponse webResponse, ListAllPublicRepositoriesResponder responder)
        {
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            if (status == 200 && responder.On200 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(Repository[]));
                Repository[] result = (Repository[]) serializer.ReadObject (responseStream);
                responder.On200(result);
            }
            else if(responder.OnOther != null) 
            {
                responder.OnOther(webResponse);
            }
        }       
        public void CreateRepository(CreateRepositoryRequest request, CreateRepositoryResponder responder)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "POST";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handleCreateRepositoryResponse((int) webResponse.StatusCode, webResponse, responder);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handleCreateRepositoryResponse((int) webResponse.StatusCode, webResponse, responder);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handleCreateRepositoryResponse (int status, HttpWebResponse webResponse, CreateRepositoryResponder responder)
        {
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            if (status == 200 && responder.On200 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(Repository));
                Repository result = (Repository) serializer.ReadObject (responseStream);
                responder.On200(result);
            }else
            if (status == 400 && responder.On400 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                responder.On400(result);
            }else
            if (status == 401 && responder.On401 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                responder.On401(result);
            }else
            if (status == 422 && responder.On422 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                responder.On422(result);
            }
            else if(responder.OnOther != null) 
            {
                responder.OnOther(webResponse);
            }
        }       
        public void CreateOrganizationRepository(CreateOrganizationRepositoryRequest request, CreateOrganizationRepositoryResponder responder)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "POST";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handleCreateOrganizationRepositoryResponse((int) webResponse.StatusCode, webResponse, responder);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handleCreateOrganizationRepositoryResponse((int) webResponse.StatusCode, webResponse, responder);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handleCreateOrganizationRepositoryResponse (int status, HttpWebResponse webResponse, CreateOrganizationRepositoryResponder responder)
        {
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            if (status == 200 && responder.On200 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(Repository));
                Repository result = (Repository) serializer.ReadObject (responseStream);
                responder.On200(result);
            }else
            if (status == 400 && responder.On400 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                responder.On400(result);
            }else
            if (status == 401 && responder.On401 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                responder.On401(result);
            }else
            if (status == 422 && responder.On422 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                responder.On422(result);
            }
            else if(responder.OnOther != null) 
            {
                responder.OnOther(webResponse);
            }
        }       
    }
}
