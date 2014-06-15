Docs Plugin
===========
The docs plugin will create rich documentation for your API's from your SpecAPI specifications.

To see it in action look at the [example project](../../examples/org.specapi.plugins.docs.example)
Configuration
-------------
The following configuration configures the target project for this plugin, the
plugin must also use the jquery plugin, which must be configured to output the
jquery generated ajax client into the same folder that the docs plugin will
generate into, which by default in ```./doc-gen```.
```javascript
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
Credits
-------
This plugin makes use of the following fantastic components:-

* [Bootstrap](https://github.com/twbs/bootstrap)
* [Ace](https://github.com/ajaxorg/ace)
* [Highlight.js] (https://github.com/isagalaev/highlight.js)
* [JSON-js] (https://github.com/douglascrockford/JSON-js)
* [JQuery Storage API](https://github.com/julien-maurel/jQuery-Storage-API)
