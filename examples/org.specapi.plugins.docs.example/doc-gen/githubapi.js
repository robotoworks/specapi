if (typeof jQuery === 'undefined') { throw new Error('GithubAPI requires jQuery') }

(function (window, $) {
    'use strict';
    
    var client = window.GithubAPI = function (options) {
        this.defaultHeaders = {};
        this.options = $.extend({}, GithubAPI.DEFAULTS, options)
    }
    
    GithubAPI.DEFAULTS = {
        baseUrl: 'https://api.github.com'
    }
    
    client.prototype.addDefaultHeader = function (key, value) {
        this.defaultHeaders[key] = value;
    }
    
    client.prototype.listRepositories = function(options) {
        var opts = $.extend(true, {query:{}}, options)
        var query = $.param(opts.query);
        var path = "/user";
        var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
        
        return $.ajax({
            url:url,
            type:"GET",
            headers:this.defaultHeaders
        });
    }

    client.prototype.listUserRepositories = function(user, options) {
        var opts = $.extend(true, {query:{}}, options)
        var query = $.param(opts.query);
        var path = "/users/:user/repos";
        path = path.replace(/\:user/, user);
        var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
        
        return $.ajax({
            url:url,
            type:"GET",
            headers:this.defaultHeaders
        });
    }

    client.prototype.listOrganizationRepositories = function(org, options) {
        var opts = $.extend(true, {query:{}}, options)
        var query = $.param(opts.query);
        var path = "/orgs/:org/repos";
        path = path.replace(/\:org/, org);
        var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
        
        return $.ajax({
            url:url,
            type:"GET",
            headers:this.defaultHeaders
        });
    }

    client.prototype.listAllPublicRepositories = function(options) {
        var opts = $.extend(true, {query:{}}, options)
        var query = $.param(opts.query);
        var path = "/repositories";
        var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
        
        return $.ajax({
            url:url,
            type:"GET",
            headers:this.defaultHeaders
        });
    }

    client.prototype.createRepository = function(data, options) {
        var opts = $.extend(true, {query:{}}, options)
        var query = $.param(opts.query);
        var path = "/user";
        var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
        
        return $.ajax({
            url:url,
            type:"POST",
            headers:this.defaultHeaders
            ,contentType:"application/json"
            ,data:data
        });
    }

    client.prototype.createOrganizationRepository = function(org, data, options) {
        var opts = $.extend(true, {query:{}}, options)
        var query = $.param(opts.query);
        var path = "/orgs/:org/repos";
        path = path.replace(/\:org/, org);
        var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
        
        return $.ajax({
            url:url,
            type:"POST",
            headers:this.defaultHeaders
            ,contentType:"application/json"
            ,data:data
        });
    }

    client.prototype.editRepository = function(owner, repo, data, options) {
        var opts = $.extend(true, {query:{}}, options)
        var query = $.param(opts.query);
        var path = "/repos/:owner/:repo";
        path = path.replace(/\:owner/, owner);
        path = path.replace(/\:repo/, repo);
        var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
        
        return $.ajax({
            url:url,
            type:"PATCH",
            headers:this.defaultHeaders
            ,contentType:"application/json"
            ,data:data
        });
    }


}(window, jQuery));
