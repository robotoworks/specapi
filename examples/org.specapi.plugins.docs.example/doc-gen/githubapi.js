if (typeof jQuery === 'undefined') { throw new Error('GithubAPI requires jQuery') }

(function (window, $) {
    'use strict';
    
    var client = window.GithubAPI = function (options) {
        this.options = $.extend({}, GithubAPI.DEFAULTS, options)
    }
    
    GithubAPI.DEFAULTS = {
        baseUrl: 'https://api.github.com'
    }
    
    client.prototype.listRepositories = function(options) {
        var opts = $.extend(true, {query:{}}, options)
        var query = $.param(opts.query);
        var path = "/user/repos";
        var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
        
        return $.ajax(url, {
            type:"GET"
        });
    }

    client.prototype.listUserRepositories = function(user, options) {
        var opts = $.extend(true, {query:{}}, options)
        var query = $.param(opts.query);
        var path = "/users/:user/repos";
        path = path.replace(/\:user/, user);
        var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
        
        return $.ajax(url, {
            type:"GET"
        });
    }

    client.prototype.listOrganizationRepositories = function(org, options) {
        var opts = $.extend(true, {query:{}}, options)
        var query = $.param(opts.query);
        var path = "/orgs/:org/repos";
        path = path.replace(/\:org/, org);
        var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
        
        return $.ajax(url, {
            type:"GET"
        });
    }

    client.prototype.listAllPublicRepositories = function(options) {
        var opts = $.extend(true, {query:{}}, options)
        var query = $.param(opts.query);
        var path = "/repositories";
        var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
        
        return $.ajax(url, {
            type:"GET"
        });
    }

    client.prototype.createRepository = function(data, options) {
        var opts = $.extend(true, {query:{}}, options)
        var query = $.param(opts.query);
        var path = "/user/repos";
        var url = this.options.baseUrl + path + (query.length > 0 ? "?" + query : "");
        
        return $.ajax(url, {
            type:"POST"
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
        
        return $.ajax(url, {
            type:"POST"
            ,contentType:"application/json"
            ,data:data
        });
    }


}(window, jQuery));
