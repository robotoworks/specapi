![Logo](/gfx/specAPI-smaller.png)

A specification language to describe Web APIs for the automatic programming of documentation, platform specific API client implementations, Server-Side contracts and more.

You can define your Web API like this using SpecAPI

``` specapi
package com.example.github

api GithubAPI https://api.github.com {
	get getIssuesForRepository /repos/owner:String/repo:String/issues {
		  response Issue[]
	}
}
```
  
Then use one of the available code generators, see the [quick start wiki page](https://github.com/robotoworks/specapi/wiki/Quick-Start)  to get started.

Contribute
----------
If you would like to submit pull requests for this project you will need to install eclipse and the xText framework.

If you would just like to author a plugin, you can see the [plugin development guide](https://github.com/robotoworks/specapi/wiki/Plugin-Development/), read on if you would like to modify the specapi language itself, improve the editor experience, or write a core plugin to be included with future releases of SpecAPI.

In Eclipse create a new workspace and import the projects:-

* org.specapi
* org.specapi.sdk
* org.specapi.standalone
* org.specapi.tests
* org.specapi.ui
* org.specapi.updatesite

Create a new Run/Debug Configuration to launch a new Eclipse instance which will allow you to debug and test SpecAPI:

```Run Configurations > Eclipse Application > New```

In the new running Eclipse instance, you can then add the SpecAPI plugin and example projects:-

* org.specapi.plugins.simple
* org.specapi.plugins.simple.example
* org.specapi.plugins.docs
* org.specapi.plugins.docs.example

These projects demonstrate how to author SpecAPI plugins, the example projects are companions to each plugin project that should provide the end user with a working example of what your plugin can do, also a Readme.md file should be provided in the root of the plugin project and the plugin example project that should provide instructions on how to use the plugin.

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
