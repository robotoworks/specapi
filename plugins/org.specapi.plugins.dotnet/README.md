.NET Plugin
===========
The .NET plugin will create API client code from your SpecAPI specifications.

Configuration
-------------
The following configuration configures the target project for this plugin, the plugin will 
generate API client code to a ```./dotnet-gen``` folder by default.

```javascript
{
    "targets":[
        {
            "plugin":"org.specapi.plugins.dotnet.Plugin"
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

With the generated client from this specification, you can create a  and
use a client like this:-

```csharp
var api = new GithubAPI ();

api.ListUserRepositories (
	new ListUserRepositoriesRequest("fluxtah") { 
		Sort = "full_name", 
		Direction = "asc",

		On200 = (repositories) => {
			// TODO: Handle a 200 response
		},
		OnOther = (response) => {
			// TODO: Handle any other response
		}
	});
```

