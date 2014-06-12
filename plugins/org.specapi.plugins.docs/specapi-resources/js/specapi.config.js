
(function (window, $) {

    var SpecApiConfigManager = function() {    
        var self = this;
        
        $('.form-configure').delegate( ".form-config-btn-delete", "click", function() {
            $(this).closest('.form-group').remove();
            self.save();
        });
        
        $('#btn_add_config').click(function () {
            self.addRow();
        });
        $('#btn_save_config').click(function () {
            self.save();
        });
//        $('#btn_export_config').click(function () {
//            self.export();
//        });
    };
    
    SpecApiConfigManager.prototype.addRow = function(options) {
        var content = $('<div class="form-group"> \
                <div class="row"> \
                <div class="col-xs-4"> \
                <input type="text" class="form-control form-config-key" placeholder="Key"> \
                </div> \
                <div class="col-xs-4"> \
                <input type="text" class="form-control form-config-value" placeholder="Value"> \
                </div> \
                <div class="col-xs-2"> \
                <select class="form-control form-config-type"> \
                <option value="header">header</option> \
                <option value="query">query</option> \
                </select> \
                </div> \
                <div class="col-xs-2"> \
                <button type="button" class="btn btn-danger form-config-btn-delete"><span class="glyphicon glyphicon-remove"></span></button> \
                </div> \
                </div> \
                </div>');
        
        if(typeof options != "undefined") {
            if(options.key != "undefined") {
                $('.form-config-key', content).val(options.key);
            }
            
            if(options.value != "undefined") {
                $('.form-config-value', content).val(options.value);
            }
            
            if(options.type != "undefined") {
                $('.form-config-type', content).val(options.type);
            }
        }
    
        $('.form-actions').before(content);    
    }
    
    SpecApiConfigManager.prototype.serialize = function() {
        var fields = $('.form-config-key, .form-config-value, .form-config-type');
        var config = {headers:[], params:[]};
        
        for(var i=0; i < fields.length; i+=3) {
            var entry = {};
            entry["key"] = $(fields[i]).val();
            entry["value"] = $(fields[i + 1]).val();
            if($(fields[i + 2]).val() == "query") {
                config.params.push(entry);
            } else {
                config.headers.push(entry);
            }
        }
        
        return config;
    }
    
    SpecApiConfigManager.prototype.save = function () {
        $.localStorage.set("specapi_config", JSON.stringify(this.serialize()));
    }
    
    SpecApiConfigManager.prototype.getConfig = function () {
        return $.localStorage.get("specapi_config");
    }
    
    SpecApiConfigManager.prototype.restore = function() {
         var config = $.localStorage.get("specapi_config");
         
         if(config == null || (!config.headers.length && !config.params.length)) {
            this.addRow();
            return;
         }
         
         for(var i=0; i < config.headers.length; i++) {
            var entry = config.headers[i];
            this.addRow({key:entry.key, value:entry.value, type:"header"});
         }
         
         for(var i=0; i < config.params.length; i++) {
            var entry = config.params[i];
            this.addRow({key:entry.key, value:entry.value, type:"query"});
         }
    }
    
    SpecApiConfigManager.prototype.export = function() {
        var pom = document.createElement('a');
        pom.setAttribute('href', 'data:text/plain;charset=utf-8,' + encodeURIComponent(JSON.stringify(this.serialize())));
        pom.setAttribute('download', "specapi.config.json");
        pom.click();
    }
    
    window.specApiConfig = new SpecApiConfigManager();
    
}(window, jQuery));