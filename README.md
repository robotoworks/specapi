SpecAPI
=======

A Web API specification language powered by the awesome xText framework, with a primary focus on code generation from a platform agnostic specification.

You can define your Web API like this using SpecAPI

``` specapi
package com.example.github

api GithubAPI https://api.github.com {
	get getIssuesForRepository /repos/owner:String/repo:String/issues {
		  response Issue[]
	}
}

entity Issue {
	id:long,
	number:long,
	title:String,
	"body":String	
	url:String,
}
``` 
  
Then use code generators to generate your assets, such as api clients, server-side contracts, documentation and more.

More to come...
