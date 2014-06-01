Swagger Example
===============
This example targets the Swagger Plugin to generate Swagger UI from github.specapi

If you wish to see the swagger site running then navigate to /swagger-gen and run ```mvn jetty:run```

You will need an access token to use the GitHub API, you can pop this in the authorization box in the Swagger UI.

Configuration
-------------
The following configuration configures the target project for this plugin.

```javascript
{
    "targets":[
        {
            "plugin":"org.specapi.plugins.swagger.Plugin"
        }
    ]
}
```