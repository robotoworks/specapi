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

License
=======

Apache
-------

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

Eclipse
-------

    All rights reserved. This program and the accompanying materials
    are made available under the terms of the Eclipse Public License v1.0
    which accompanies this distribution, and is available at
       
       http://www.eclipse.org/legal/epl-v10.html
