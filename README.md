![Logo](/gfx/specAPI-small.png)

A Web API specification language powered by the awesome xText framework.

To get started refer to the wiki [Quick Start](Quick Start).

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

Why SpecAPI?
------------
SpecAPI was born from a specification language to specify Web API Clients for Android (Mechanoid NET), its motiviation was "What you see is what you spec" - this came about from the fact that every Web API client that I have hand-written, was either specified in a Word Document or had some manually maintained website, or possibly even a specification using one of your favourite markup languages (XML or JSON).

Under the hood SpecAPI is powered by an outstanding Language Development Environment known as xText. xText provides a lot of core features such as lexing/parsing, validation as well as top class Eclipse IDE integration giving a well rounded editor experience.

SpecAPI aims to provide a concise grammar in the domain of HTTP, its a work in progress, and definetly in need of contributors to anyone who is interested, wether that be providing code generators or helping shape the grammar.

Contribute
----------
To get started you need to install the Eclipse IDE and the xText Plugin.

In Eclipse create a new workspace and import the projects:-

* org.specapi
* org.specapi.sdk
* org.specapi.standalone
* org.specapi.tests
* org.specapi.ui
* org.specapi.updatesite

Then create a new Run/Debug Configuration to launch the a new Eclipse instance which will allow you to debug and test SpecAPI:

```Run Configurations > Eclipse Application > New```

In the new running Eclipse instance, you can then add the SpecAPI plugin and example projects:-

* org.specapi.plugins.simple
* org.specapi.plugins.simple.example
* org.specapi.plugins.docs
* org.specapi.plugins.docs.example

These projects demonstrate how to author SpecAPI plugins, the example projects are companions to each plugin project that should provide the end user with a working example of what your plugin can do, also a Readme.md file should be provided in the root of the example project

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
