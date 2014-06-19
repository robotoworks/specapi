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
        
        public void ListRepositories(ListRepositoriesRequest request)
        {
            try {
                var uri = request.CreateUri(BaseUrl);
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "GET";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handleListRepositoriesResponse(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handleListRepositoriesResponse(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handleListRepositoriesResponse (ListRepositoriesRequest request, HttpWebResponse webResponse)
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
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "GET";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handleListUserRepositoriesResponse(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handleListUserRepositoriesResponse(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handleListUserRepositoriesResponse (ListUserRepositoriesRequest request, HttpWebResponse webResponse)
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
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "GET";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handleListOrganizationRepositoriesResponse(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handleListOrganizationRepositoriesResponse(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handleListOrganizationRepositoriesResponse (ListOrganizationRepositoriesRequest request, HttpWebResponse webResponse)
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
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "GET";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handleListAllPublicRepositoriesResponse(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handleListAllPublicRepositoriesResponse(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handleListAllPublicRepositoriesResponse (ListAllPublicRepositoriesRequest request, HttpWebResponse webResponse)
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
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "POST";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handleCreateRepositoryResponse(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handleCreateRepositoryResponse(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handleCreateRepositoryResponse (CreateRepositoryRequest request, HttpWebResponse webResponse)
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
                var webRequest = WebRequest.CreateHttp (uri);
                webRequest.Method = "POST";
                webRequest.UserAgent = "DotNet-GithubAPI";
    
                var webResponse = (HttpWebResponse) webRequest.GetResponse ();
                handleCreateOrganizationRepositoryResponse(request, webResponse);
            }
            catch(WebException webException) {
                var webResponse = (HttpWebResponse)  webException.Response;
                handleCreateOrganizationRepositoryResponse(request, webResponse);
            }
            catch(Exception exception) {
                throw;
            }
        }
        
        void handleCreateOrganizationRepositoryResponse (CreateOrganizationRepositoryRequest request, HttpWebResponse webResponse)
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
