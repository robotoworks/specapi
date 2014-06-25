.NET Plugin
===========
The .NET plugin will create API client code from your SpecAPI specifications as a .NET Portable Library.

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