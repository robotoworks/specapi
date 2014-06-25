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
        
        protected HttpWebRequest CreateRequest(Uri uri)
        {
            var request = WebRequest.CreateHttp (uri);
            ConfigureRequest(request);
            return request;
    
        }
    
        partial void ConfigureRequest(HttpWebRequest request);
    
        public void ListRepositories(ListRepositoriesRequest request)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = CreateRequest (uri);
                webRequest.Method = "GET";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                HandleListRepositoriesResponse(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                HandleListRepositoriesResponse(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        protected void HandleListRepositoriesResponse (ListRepositoriesRequest request, HttpWebResponse webResponse)
        {
            int status = (int) webResponse.StatusCode;
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            if (status == 200 && request.On200 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(Repository[]));
                Repository[] result = (Repository[]) serializer.ReadObject (responseStream);
                request.On200(result);
            }else
            if (status == 401 && request.On401 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                request.On401(result);
            }
            else if(request.OnOther != null) 
            {
                request.OnOther(webResponse);
            }
        }       
        public void ListUserRepositories(ListUserRepositoriesRequest request)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = CreateRequest (uri);
                webRequest.Method = "GET";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                HandleListUserRepositoriesResponse(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                HandleListUserRepositoriesResponse(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        protected void HandleListUserRepositoriesResponse (ListUserRepositoriesRequest request, HttpWebResponse webResponse)
        {
            int status = (int) webResponse.StatusCode;
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            if (status == 200 && request.On200 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(Repository[]));
                Repository[] result = (Repository[]) serializer.ReadObject (responseStream);
                request.On200(result);
            }
            else if(request.OnOther != null) 
            {
                request.OnOther(webResponse);
            }
        }       
        public void ListOrganizationRepositories(ListOrganizationRepositoriesRequest request)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = CreateRequest (uri);
                webRequest.Method = "GET";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                HandleListOrganizationRepositoriesResponse(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                HandleListOrganizationRepositoriesResponse(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        protected void HandleListOrganizationRepositoriesResponse (ListOrganizationRepositoriesRequest request, HttpWebResponse webResponse)
        {
            int status = (int) webResponse.StatusCode;
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            if (status == 200 && request.On200 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(Repository[]));
                Repository[] result = (Repository[]) serializer.ReadObject (responseStream);
                request.On200(result);
            }
            else if(request.OnOther != null) 
            {
                request.OnOther(webResponse);
            }
        }       
        public void ListAllPublicRepositories(ListAllPublicRepositoriesRequest request)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = CreateRequest (uri);
                webRequest.Method = "GET";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                HandleListAllPublicRepositoriesResponse(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                HandleListAllPublicRepositoriesResponse(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        protected void HandleListAllPublicRepositoriesResponse (ListAllPublicRepositoriesRequest request, HttpWebResponse webResponse)
        {
            int status = (int) webResponse.StatusCode;
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            if (status == 200 && request.On200 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(Repository[]));
                Repository[] result = (Repository[]) serializer.ReadObject (responseStream);
                request.On200(result);
            }
            else if(request.OnOther != null) 
            {
                request.OnOther(webResponse);
            }
        }       
        public void CreateRepository(CreateRepositoryRequest request)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = CreateRequest (uri);
                webRequest.Method = "POST";
                webRequest.UserAgent = "DotNet-GithubAPI";
                
                var payload = request.Entity;
                var requestStream = webRequest.GetRequestStream();
                var serializer = new DataContractJsonSerializer (typeof(CreateRepositoryInput));
                serializer.WriteObject(requestStream, payload);
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                HandleCreateRepositoryResponse(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                HandleCreateRepositoryResponse(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        protected void HandleCreateRepositoryResponse (CreateRepositoryRequest request, HttpWebResponse webResponse)
        {
            int status = (int) webResponse.StatusCode;
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            if (status == 200 && request.On200 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(Repository));
                Repository result = (Repository) serializer.ReadObject (responseStream);
                request.On200(result);
            }else
            if (status == 400 && request.On400 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                request.On400(result);
            }else
            if (status == 401 && request.On401 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                request.On401(result);
            }else
            if (status == 422 && request.On422 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                request.On422(result);
            }
            else if(request.OnOther != null) 
            {
                request.OnOther(webResponse);
            }
        }       
        public void CreateOrganizationRepository(CreateOrganizationRepositoryRequest request)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = CreateRequest (uri);
                webRequest.Method = "POST";
                webRequest.UserAgent = "DotNet-GithubAPI";
                
                var payload = request.Entity;
                var requestStream = webRequest.GetRequestStream();
                var serializer = new DataContractJsonSerializer (typeof(CreateRepositoryInput));
                serializer.WriteObject(requestStream, payload);
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                HandleCreateOrganizationRepositoryResponse(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                HandleCreateOrganizationRepositoryResponse(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        protected void HandleCreateOrganizationRepositoryResponse (CreateOrganizationRepositoryRequest request, HttpWebResponse webResponse)
        {
            int status = (int) webResponse.StatusCode;
            var responseStream = webResponse.GetResponseStream ();
            DataContractJsonSerializer serializer = null;
            
            if (status == 200 && request.On200 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(Repository));
                Repository result = (Repository) serializer.ReadObject (responseStream);
                request.On200(result);
            }else
            if (status == 400 && request.On400 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                request.On400(result);
            }else
            if (status == 401 && request.On401 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                request.On401(result);
            }else
            if (status == 422 && request.On422 != null) 
            {
                serializer = new DataContractJsonSerializer (typeof(ErrorMessage));
                ErrorMessage result = (ErrorMessage) serializer.ReadObject (responseStream);
                request.On422(result);
            }
            else if(request.OnOther != null) 
            {
                request.OnOther(webResponse);
            }
        }       
    }
}
