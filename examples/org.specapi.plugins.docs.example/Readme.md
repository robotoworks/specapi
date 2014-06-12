Docs Example
============
This example demonstrates how to use the [SpecAPI Docs plugin](../../plugins/org.specapi.plugins.docs).

The example is generated from the SpecAPI [github example specification](../../specs/github/github.specapi).

You can view the generated output in the [doc-gen](doc-gen/) folder, simple open up the index.html file in a browser.

See the readme in the [SpecAPI Docs plugin project](../../plugins/org.specapi.plugins.docs) for detailed information on how
to use it.

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