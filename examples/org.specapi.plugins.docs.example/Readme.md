Docs Example
==============
This example demonstrates how to use the docs plugin. The docs plugin will 
generate documentation and api test console for a SpecAPI specification, 
it requires the jQuery plugin in order to generate a jquery ajax clien.

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
            "configurations":[
                {
                    "name":"JQUERY",
                    "output_directory":"./doc-gen"
                }
            ]
        }
    ]
}
```