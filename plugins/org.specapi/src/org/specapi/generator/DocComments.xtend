package org.specapi.generator

import java.util.HashMap
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors

class DocComments {
    @Accessors HashMap<String, DocCommentTag> params = new HashMap<String, DocCommentTag>
    private var all = new ArrayList<DocCommentTag>
    
    @Accessors String content
    @Accessors DocCommentTag request
    @Accessors DocCommentTag response
    
    def addTag(DocCommentTag tag) {
    	
    	all.add(tag)
    	
        if(tag.getTag == "@param" && tag.getArgs.size > 0) {
            params.put(tag.getArgs.get(0), tag)
        } else if (tag.getTag == "@request") {
            request = tag
        }
        else if(tag.getTag == "@response") {
            response = tag
        }
    }
    
    def DocCommentTag getTagByArgument(String tag, int argNumber, String argValue) {
    	return all.findFirst[argNumber < it.args.size && 
    			it.tag.equals(tag) && 
    			it.args.get(argNumber).equals(argValue)]
    }
}