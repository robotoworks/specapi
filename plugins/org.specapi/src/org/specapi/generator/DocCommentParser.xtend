package org.specapi.generator

import com.google.common.collect.Sets
import com.google.inject.Inject
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider
import java.util.Map
import java.util.Set
import com.google.common.collect.Maps

class DocCommentParser {
    
    @Inject MultiLineCommentDocumentationProvider commentProvider
    
    static var multilineTags = #{"@param", "@response", "@body", "@see", "@example"}
    static var multilineTagArgs = #{"@param"->1, "@response"->0, "@body"->0, "@see"->1, "@example"->0}
    
    // LATER: static var inlineTags = Sets.newHashSet("@see")
    
    def parseDocComments(EObject obj) {
    	parseDocComments(obj, multilineTags, multilineTagArgs)
    }
    
    def parseDocComments(EObject obj, Map<String, Integer> customTagDefinition) {
    	var args = Maps.newHashMap(multilineTagArgs)
    	args.putAll(customTagDefinition)
    	
    	var tags = Sets.newHashSet(multilineTags)
    	tags.addAll(customTagDefinition.keySet)
    	
    	parseDocComments(obj, tags, args)
    }
    
    private def parseDocComments(EObject obj, Set<String> tags, Map<String, Integer> tagArgs) {
    	
        var text = obj.getSanitizedComments
        
        var comments = new DocComments
        if(text.nullOrEmpty) return comments
        
        var content = new StringBuilder
        var scanner = new PeekableScanner(text)
        

        while(scanner.hasNext) {
            var token = scanner.peek
            
            if(tags.contains(token)) {
                token = scanner.next
                var tag = readTag(scanner, token, tags, tagArgs)
                
                comments.addTag(tag)
            } else {
                content.append(scanner.next).append(" ")
            }
        }
        
        comments.content = content.toString.trim
        
        return comments
    }
    
    private def readTag(PeekableScanner scanner, String tag, Set<String> tags, Map<String, Integer> tagArgs) {
        var tagObj = new DocCommentTag
        tagObj.tag = tag
        
        var scan = true;
        var numArgs = tagArgs.get(tag)
        var args = new ArrayList<String>
        var content = new StringBuilder
        
        while(scan && scanner.hasNext) {
            var token = scanner.peek
            
            if(!tags.contains(token)) {
                if(args.size < numArgs) {
                    args.add(scanner.next)
                } else {
                    content.append(scanner.next).append(" ")
                }
            } else {
                scan = false
            }
        }
        
        tagObj.content = content.toString.trim
        tagObj.args = args
        
        return tagObj
    }
    
    private def getSanitizedComments(EObject obj) {
                var docNodes = commentProvider.getDocumentationNodes(obj)
        var text = docNodes?.head?.text
        
        var builder = new StringBuilder();
        
        if(!text.nullOrEmpty) {
            text = text.substring(2, text.length - 2)
            
            for(line : text.split("\n")) {
                var trimmed = line.trim
                
                if(trimmed.startsWith("*")) {
                    trimmed = trimmed.substring(1)
                }
                
                builder.append(trimmed)
            }
        }
        
        return builder.toString.trim
    }
}