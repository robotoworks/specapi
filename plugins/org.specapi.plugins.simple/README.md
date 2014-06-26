Simple Plugin
===========
This is an example of a simple plugin that lists all the methods in a SpecAPI specification, it can
be used as a starting point for new plugins.

To see it in action look at the [example project](../../examples/org.specapi.plugins.simple.example)

Configuration
-------------
The following configuration configures the target project for this plugin, the plugin will 
generate code to a ```./simple-gen``` folder by default.

```javascript
{
    "targets":[
        {
            "plugin":"org.specapi.plugins.simple.Plugin"
        }
    ]
}
```