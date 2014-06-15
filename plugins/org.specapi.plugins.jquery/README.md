jQuery Plugin
===========
The jQuery plugin will create API client code from your SpecAPI specifications.

To see it in action look at the [example project](../../examples/org.specapi.plugins.docs.example)

The generated client code requires jQuery.

Configuration
-------------
The following configuration configures the target project for this plugin, the plugin will 
generate API client code to a ```./jquery-gen``` folder by default.

```javascript
{
    "targets":[
        {
            "plugin":"org.specapi.plugins.jquery.Plugin"
        }
    ]
}
```

Usage
-----
The generated client code generates methods for each API method, assuming the following specification:-

```specapi
package com.example.github

api GithubAPI https://api.github.com {
    get listUserRepositories /users/user:string/repos {
        params type:string, sort:string, direction:string
        response Repository[]
    }
}
```

With the generated client from this specification, you can create a new client like this:-

```js
var api = new GithubAPI();

api.listUserRepositories('joe_bloggs')
.done(function(data, textStatus, jqXHR) {
  // Do something with data
})
.fail(function(jqXHR, textStatus, errorThrown) {
  // Handle the error
});
```

### Query parameters
To add query parameters to a request you can do this:-
```js
var api = new GithubAPI();

api.listUserRepositories('joe_bloggs', {query:{"sort", "full_name"}})
.done(function(data, textStatus, jqXHR) {
  // Do something with data
})
.fail(function(jqXHR, textStatus, errorThrown) {
  // Handle the error
});
```
