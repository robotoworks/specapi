package org.specapi;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.specapi.specapiLang.Api;
import org.specapi.specapiLang.ArrayType;
import org.specapi.specapiLang.BodyBlock;
import org.specapi.specapiLang.BooleanType;
import org.specapi.specapiLang.DoubleType;
import org.specapi.specapiLang.HeaderBlock;
import org.specapi.specapiLang.HttpMethod;
import org.specapi.specapiLang.IntegerType;
import org.specapi.specapiLang.IntrinsicType;
import org.specapi.specapiLang.LongType;
import org.specapi.specapiLang.ParamsBlock;
import org.specapi.specapiLang.ResponseBlock;
import org.specapi.specapiLang.StringType;
import org.specapi.specapiLang.Type;
import org.specapi.specapiLang.UserType;

import com.google.inject.Inject;

public class ModelUtil {
	@Inject ISerializer serializer;
	
	public String getPathAsFormatString(HttpMethod method) {
		if(method.getPath() == null) {
			return "";
		}
		
		String path = serializer.serialize(method.getPath()).trim();
		
		return path.replaceAll("[\\^a-zA-Z_0-9]+:[a-zA-Z_0-9]+", "%s");
	}	
	
	public String getPathAsString(HttpMethod method) {
		if(method.getPath() == null) {
			return "";
		}
		
		String path = serializer.serialize(method.getPath()).trim();
		
		return path.replaceAll("([\\^a-zA-Z_0-9]+):[a-zA-Z_0-9]+", ":$1");
	}	
	
	public String getPathAsFormatString(HttpMethod method, String paramPrefix, String paramPostfix) {
		if(method.getPath() == null) {
			return "";
		}
		
		try {
		String path = serializer.serialize(method.getPath()).trim();
		
		return path.replaceAll("([\\^a-zA-Z_0-9]+):[a-zA-Z_0-9]+", 
				String.format("%s%s%s", paramPrefix, "$1", paramPostfix));
		} catch(Exception e) {
			return "";
		}
	}
	
	private static final Set<String> reservedWords = new HashSet<String>();
	
	static {
		reservedWords.add("source");
		reservedWords.add("target");
		reservedWords.add("abstract");
		reservedWords.add("continue");
		reservedWords.add("for");
		reservedWords.add("new");
		reservedWords.add("switch");
		reservedWords.add("assert");
		reservedWords.add("default");
		reservedWords.add("goto");
		reservedWords.add("package");
		reservedWords.add("synchronized");
		reservedWords.add("boolean");
		reservedWords.add("do");
		reservedWords.add("if");
		reservedWords.add("private");
		reservedWords.add("this");
		reservedWords.add("break");
		reservedWords.add("double");
		reservedWords.add("implements");
		reservedWords.add("protected");
		reservedWords.add("throw");
		reservedWords.add("byte");
		reservedWords.add("else");
		reservedWords.add("import");
		reservedWords.add("public");
		reservedWords.add("throws");
		reservedWords.add("case");
		reservedWords.add("enum");
		reservedWords.add("instanceof");
		reservedWords.add("return");
		reservedWords.add("transient");
		reservedWords.add("catch");
		reservedWords.add("extends");
		reservedWords.add("int");
		reservedWords.add("short");
		reservedWords.add("try");
		reservedWords.add("char");
		reservedWords.add("final");
		reservedWords.add("interface");
		reservedWords.add("static");
		reservedWords.add("void");
		reservedWords.add("class");
		reservedWords.add("finally");
		reservedWords.add("long");
		reservedWords.add("strictfp");
		reservedWords.add("volatile");
		reservedWords.add("const");
		reservedWords.add("float");
		reservedWords.add("native");
		reservedWords.add("super");
		reservedWords.add("while");
	}

	public String getBoxedTypeSignature(IntrinsicType type) {
		if(type instanceof StringType) {
			return "String";
		} else if (type instanceof BooleanType) {
			return "Boolean";
		} else if (type instanceof IntegerType) {
			return "Integer";
		} else if (type instanceof LongType) {
			return "Long";
		} else if (type instanceof DoubleType) {
			return "Double";
		}
		
		return "[unsupported]";
	}
	
	public String signature(Type type){
		if(type instanceof IntrinsicType){
			return ((IntrinsicType) type).getId();
		} else if(type instanceof UserType) {
			return ((UserType) type).getDeclaration().getName();
		} else if(type instanceof ArrayType){
			ArrayType genType = (ArrayType) type;
			if(genType.getElementType() instanceof UserType){
				return "List<" + ((UserType)genType.getElementType()).getDeclaration().getName() + ">";				
			} else {
				return "List<" + getBoxedTypeSignature((IntrinsicType)genType.getElementType()) + ">";							
			}
		}
		
		return "[unsupported]";
	}
	
	public String innerSignature(Type type){
		if(type instanceof IntrinsicType){
			return ((IntrinsicType) type).getId();
		} else if(type instanceof UserType) {
			return ((UserType) type).getDeclaration().getName();
		} else if(type instanceof ArrayType){
			ArrayType genType = (ArrayType) type;
			if(genType.getElementType() instanceof UserType){
				return ((UserType)genType.getElementType()).getDeclaration().getName();				
			} else {
				return ((IntrinsicType)genType.getElementType()).getId();							
			}
		}
		
		return "[unsupported]";
	}
	
	public boolean hasBody(HttpMethod method){
		
		Iterable<BodyBlock> bodies = IterableExtensions.filter(method.getBlocks(), BodyBlock.class);
		return IterableExtensions.size(bodies) > 0;
	}
	
	public BodyBlock getBody(HttpMethod method){
		Iterable<BodyBlock> bodies = IterableExtensions.filter(method.getBlocks(), BodyBlock.class);
		return IterableExtensions.head(bodies);
	}
	
	public ParamsBlock getParamsBlock(Api api){
		Iterable<ParamsBlock> blocks = IterableExtensions.filter(api.getBlocks(), ParamsBlock.class);
		return IterableExtensions.head(blocks);
	}
	
	public HeaderBlock getHeaderBlock(Api api){
		Iterable<HeaderBlock> blocks = IterableExtensions.filter(api.getBlocks(), HeaderBlock.class);
		return IterableExtensions.head(blocks);
	}
	
	public ParamsBlock getParamsBlock(HttpMethod method){
		Iterable<ParamsBlock> blocks = IterableExtensions.filter(method.getBlocks(), ParamsBlock.class);
		return IterableExtensions.head(blocks);
	}
	
	public HeaderBlock getHeaderBlock(HttpMethod method){
		Iterable<HeaderBlock> blocks = IterableExtensions.filter(method.getBlocks(), HeaderBlock.class);
		return IterableExtensions.head(blocks);
	}
	public ResponseBlock getResponseBlock(HttpMethod method){
		Iterable<ResponseBlock> blocks = IterableExtensions.filter(method.getBlocks(), ResponseBlock.class);
		return IterableExtensions.head(blocks);
	}
	
	/**
	 * Adds an _ to the start if the string is a reserved word
	 * @param value
	 * @return
	 */
	public String escapeReserved(String value){
		// Reserved
		if(reservedWords.contains(value)){
			return "_" + value;
		} else {
			return value;
		}
	}
	
	public String getDefaultValueLiteral(IntrinsicType type) {
		if(type instanceof StringType) {
			return "null";
		} else if (type instanceof BooleanType) {
			return "false";
		} else if (type instanceof IntegerType) {
			return "0";
		} else if (type instanceof LongType) {
			return "0L";
		} else if (type instanceof DoubleType) {
			return "0.0d";
		}
		
		return "INVALID_TYPE";
	}	
}
