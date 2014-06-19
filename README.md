![Logo](/gfx/specAPI-smaller.png)

A specification language to describe Web APIs for the automatic programming of documentation, platform specific API client implementations, Server-Side contracts and more.

You can define your Web API like this using SpecAPI:-

``` specapi
package com.example.github

api GithubAPI https://api.github.com {
	get getIssuesForRepository /repos/owner:String/repo:String/issues {
		  response Issue[]
	}
}
```
  
Then use one of the available code generators, follow the quick start below to see it in action.

Quick Start
-----------
A SpecAPI file (*.specapi) describes the specification of a WebAPI, you can see what one looks like by checking out the example [GithubAPI Specification](../blob/master/specs/github/github.specapi).

This quick start guide will guide you through the installation, and usage of SpecAPI. It will show you how generate a static documentation website from the GithubAPI Specification, using the [SpecAPI Documentation Plugin](../master/plugins/org.specapi.plugins.docs).

SpecAPI is written in Java, so you will need a java runtime available to use it.

### Installation
Currently SpecAPI is distrubuted as a github release and it can be installed with [homebrew](https://github.com/Homebrew/homebrew) as follows (for other platforms such as Windows, refer to the wiki [Installation](https://github.com/robotoworks/specapi/wiki/Installation/) page).
```sh
brew tap robotoworks/specapi
brew install specapi
```
or you can directly install from the formula's url:-
```sh
brew install https://raw.githubusercontent.com/robotoworks/homebrew-specapi/master/specapi.rb
```

You can check the installation by running:-
```sh
specapi -v
```
which should print the SpecAPI version.

### Generating Documentation
Navigate to a folder of your choice, ie: ~/temp and create a specapi.config file:-

```sh
cd ~/temp
touch specapi.config
```

Open up the config file and put this into it and save:-

```js
{
	"targets":[
		{
			"plugin":"org.specapi.plugins.docs.Plugin"
		},
		{
			"plugin":"org.specapi.plugins.jquery.Plugin",
            "outputs":[
                {
                    "name":"JQUERY",
                    "output_directory":"./doc-gen"
                }
            ]
		}
	]
}
```

This configuration tells SpecAPI that we want to use the SpecAPI documentation plugin, the documentation plugin also depends on the jquery plugin to generate a jquery api client which you can also see in the configuration.

Now still in ```~/temp``` we will use specapi to generate according to this configuration.

```sh
specapi https://raw.github.com/robotoworks/specapi/master/specs/github/github.specapi
```

With a bit of luck you should now have a folder generated `doc-gen`

go into this folder and open up the file ```index.html``` in your favourite browser.

You should now see the generated documentation for the GithubAPI specification.

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
