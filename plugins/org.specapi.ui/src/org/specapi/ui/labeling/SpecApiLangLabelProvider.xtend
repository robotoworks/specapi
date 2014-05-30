/*
* generated by Xtext
*/
package org.specapi.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.specapi.ModelUtil
import org.specapi.specapiLang.Api
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.EnumMember
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.Header
import org.specapi.specapiLang.HeaderBlock
import org.specapi.specapiLang.HttpMethod
import org.specapi.specapiLang.Member
import org.specapi.specapiLang.SpecApiDocument
import org.specapi.specapiLang.Type

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
class SpecApiLangLabelProvider extends DefaultEObjectLabelProvider {

	@Inject extension ModelUtil modelUtil
	
	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	// Labels and icons can be computed like this:
	
    def image(SpecApiDocument ele) {
        return "package.gif";
    }
    
    def image(ComplexTypeDeclaration ele) {
        return "entity_obj.gif";
    }
    
    def image(EnumTypeDeclaration ele) {
        return "enum_obj.gif";
    }
    
    def image(Member ele) {
        return "member_obj.gif";
    }
    
    def image(EnumMember ele) {
        return "member_obj.gif";
    }
    
    def image(HttpMethod ele) {
        return "httpmethod_obj.gif";
    }
    
    def image(Api ele) {
        return "api_obj.gif";
    }
    
    def text(Member ele) {
        return ele.getName() + " : " + ele.type.signature;
    }
    
    def text(HttpMethod ele) {
        var block = ele.responseBlock;
        
        var name = ele.getName();
        
        name = name.concat(" " + ele.getPathAsFormatString("{", "}"))
        
        if(block != null && block.getType() instanceof Type) {
			name = name.concat(" : " + (block.getType() as Type).signature)
        }
        
        return name;
    }
    
    def text (HeaderBlock ele) {
        return "headers";
    }
    
    def text (Header ele) {
        return ele.getName() + " : " + ele.getValue();
    }  
}
