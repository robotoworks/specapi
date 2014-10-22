package org.specapi.plugins.android.generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.specapi.SpecApiModelUtils;
import org.specapi.specapiLang.Api;
import org.specapi.specapiLang.ArrayType;
import org.specapi.specapiLang.BooleanLiteral;
import org.specapi.specapiLang.BooleanType;
import org.specapi.specapiLang.DoubleType;
import org.specapi.specapiLang.EnumMember;
import org.specapi.specapiLang.EnumTypeDeclaration;
import org.specapi.specapiLang.HeaderBlock;
import org.specapi.specapiLang.HttpMethod;
import org.specapi.specapiLang.IntegerType;
import org.specapi.specapiLang.IntrinsicType;
import org.specapi.specapiLang.Literal;
import org.specapi.specapiLang.LongType;
import org.specapi.specapiLang.Member;
import org.specapi.specapiLang.NumericLiteral;
import org.specapi.specapiLang.ParamsBlock;
import org.specapi.specapiLang.RequestBlock;
import org.specapi.specapiLang.ResponseBlock;
import org.specapi.specapiLang.StringLiteral;
import org.specapi.specapiLang.StringType;
import org.specapi.specapiLang.Type;
import org.specapi.specapiLang.UserType;
import org.specapi.util.SpecApiStringExtensions;

import com.google.common.collect.Lists;

public class AndroidSpecApiModelUtils extends SpecApiModelUtils {
//	private static final Set<String> reservedWords = new HashSet<String>();
//	
//	static {
//		reservedWords.add("source");
//		reservedWords.add("target");
//		reservedWords.add("abstract");
//		reservedWords.add("continue");
//		reservedWords.add("for");
//		reservedWords.add("new");
//		reservedWords.add("switch");
//		reservedWords.add("assert");
//		reservedWords.add("default");
//		reservedWords.add("goto");
//		reservedWords.add("package");
//		reservedWords.add("synchronized");
//		reservedWords.add("boolean");
//		reservedWords.add("do");
//		reservedWords.add("if");
//		reservedWords.add("private");
//		reservedWords.add("this");
//		reservedWords.add("break");
//		reservedWords.add("double");
//		reservedWords.add("implements");
//		reservedWords.add("protected");
//		reservedWords.add("throw");
//		reservedWords.add("byte");
//		reservedWords.add("else");
//		reservedWords.add("import");
//		reservedWords.add("public");
//		reservedWords.add("throws");
//		reservedWords.add("case");
//		reservedWords.add("enum");
//		reservedWords.add("instanceof");
//		reservedWords.add("return");
//		reservedWords.add("transient");
//		reservedWords.add("catch");
//		reservedWords.add("extends");
//		reservedWords.add("int");
//		reservedWords.add("short");
//		reservedWords.add("try");
//		reservedWords.add("char");
//		reservedWords.add("final");
//		reservedWords.add("interface");
//		reservedWords.add("static");
//		reservedWords.add("void");
//		reservedWords.add("class");
//		reservedWords.add("finally");
//		reservedWords.add("long");
//		reservedWords.add("strictfp");
//		reservedWords.add("volatile");
//		reservedWords.add("const");
//		reservedWords.add("float");
//		reservedWords.add("native");
//		reservedWords.add("super");
//		reservedWords.add("while");
//	}
//
//	public static String getBoxedTypeSignature(IntrinsicType type) {
//		if(type instanceof StringType) {
//			return "String";
//		} else if (type instanceof BooleanType) {
//			return "Boolean";
//		} else if (type instanceof IntegerType) {
//			return "Integer";
//		} else if (type instanceof LongType) {
//			return "Long";
//		} else if (type instanceof DoubleType) {
//			return "Double";
//		}
//		
//		return "[unsupported]";
//	}
//	
	public String signature(Type type){
		if(type instanceof IntrinsicType){
			String id = ((IntrinsicType) type).getId();
			if(id.equals("string")) {
				return "String";
			} else {
				return id;
			}
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
//	
//	public static String toJSONPropertyGetMethod(IntrinsicType type){
//		return "get" + SpecApiStringExtensions.pascalize(type.getId());
//	}
//	
//	public static String toJSONOptPropertyGetMethod(IntrinsicType type){
//		return "opt" + SpecApiStringExtensions.pascalize(type.getId());
//	}
//	
	public boolean hasBody(HttpMethod method){
		
		Iterable<RequestBlock> bodies = IterableExtensions.filter(method.getBlocks(), RequestBlock.class);
		return IterableExtensions.size(bodies) > 0;
	}
	
	public RequestBlock getBody(HttpMethod method){
		Iterable<RequestBlock> bodies = IterableExtensions.filter(method.getBlocks(), RequestBlock.class);
		return IterableExtensions.head(bodies);
	}
	
//	public static ParamsBlock getParamsBlock(Api client){
//		Iterable<ParamsBlock> blocks = IterableExtensions.filter(client.getBlocks(), ParamsBlock.class);
//		return IterableExtensions.head(blocks);
//	}
//	
//	public static HeaderBlock getHeaderBlock(Api client){
//		Iterable<HeaderBlock> blocks = IterableExtensions.filter(client.getBlocks(), HeaderBlock.class);
//		return IterableExtensions.head(blocks);
//	}
//	
//	public static ParamsBlock getParamsBlock(HttpMethod method){
//		Iterable<ParamsBlock> blocks = IterableExtensions.filter(method.getBlocks(), ParamsBlock.class);
//		return IterableExtensions.head(blocks);
//	}
//	
//	public static HeaderBlock getHeaderBlock(HttpMethod method){
//		Iterable<HeaderBlock> blocks = IterableExtensions.filter(method.getBlocks(), HeaderBlock.class);
//		return IterableExtensions.head(blocks);
//	}
//	public static ResponseBlock getResponseBlock(HttpMethod method){
//		Iterable<ResponseBlock> blocks = IterableExtensions.filter(method.getBlocks(), ResponseBlock.class);
//		return IterableExtensions.head(blocks);
//	}
//	
	public String generateEnumMembers(EnumTypeDeclaration decl){
		Set<Integer> set = new HashSet<Integer>();
		EList<EnumMember> members = decl.getLiteral().getMembers();
		StringBuilder builder = new StringBuilder();

		boolean someAssigned = false;
		
		int numAssigned = 0;
		for(EnumMember member : members){
			if(member.isAssignment()){
				someAssigned = true;
				numAssigned++;
			}
						
			set.add(member.getValue().intValue());
		}	
		
		if(someAssigned){
			// First one is assigned
			if(numAssigned == 1 && members.get(0).isAssignment()){
				int idx = members.get(0).getValue().intValue();
				
				for(int i=0; i < members.size(); i++){
					builder.append(SpecApiStringExtensions.underscorize(members.get(i).getName()).toUpperCase());
					builder.append("(").append(idx++).append(")");
					if(i < members.size() - 1){
						builder.append(", \n");
					}
				}
				
				return builder.toString();
			}
			else if(set.size() == members.size()){
				for(int i=0; i < members.size(); i++){
					builder.append(SpecApiStringExtensions.underscorize(members.get(i).getName()).toUpperCase());
					builder.append("(").append(members.get(i).getValue()).append(")");
					if(i < members.size() - 1){
						builder.append(", \n");
					}
				}
				
				return builder.toString();
			} else {
				for(int i=0; i < members.size(); i++){
					builder.append(SpecApiStringExtensions.underscorize(members.get(i).getName()).toUpperCase());
					builder.append("(").append(i).append(")");
					if(i < members.size() - 1){
						builder.append(", \n");
					}
				}
				
				return builder.toString();
			}
		} else {
			for(int i=0; i < members.size(); i++){
				builder.append(SpecApiStringExtensions.underscorize(members.get(i).getName()).toUpperCase());
				builder.append("(").append(i).append(")");
				if(i < members.size() - 1){
					builder.append(", \n");
				}
			}
			
			return builder.toString();
		}
	}

	public String resolveGetJSONValueMethodName(EnumTypeDeclaration decl){
		if(decl.getSuperType() != null){
			return "optInt";
		} else {
			return "optString";
		}
	}
	
	public String resolveJsonReaderMethodName(EnumTypeDeclaration decl){
		if(decl.getSuperType() != null){
			return "nextInt";
		} else {
			return "nextString";
		}
	}
//	
//	/**
//	 * Adds an _ to the start if the string is a reserved word
//	 * @param value
//	 * @return
//	 */
//	public static String escapeReserved(String value){
//		// Reserved
//		if(reservedWords.contains(value)){
//			return "_" + value;
//		} else {
//			return value;
//		}
//	}
//	
//	public static String toIdentifierOrGetMethodName(Member member, boolean asGetMethod){
//		if(asGetMethod){
//			return toGetMethodName(member);
//		} else {
//			return toIdentifier(member, null);
//		}
//	}
//	
	public String toIdentifier(Member member){
		return toIdentifier(member, null);
	}
//	
//	public static String maybeMethodize(String identifier, boolean methodize){
//		if(methodize){
//			return identifier + "()";
//		} else {
//			return identifier;
//		}
//	}
//	
	public String toGetMethodName(Member member){
		if(member.getType() instanceof BooleanType){	
			String name = member.getName().toLowerCase();
			if(name.startsWith("is") || 
					name.startsWith("has") ||
					name.startsWith("contains")){
				return toIdentifier(member, null);
			} else {
				return toIdentifier(member, "is");
			}
		} else {
			return toIdentifier(member, "get");
		}
	}
	
	public String toSetMethodName(Member member){
		return toIdentifier(member, "set");
	}
//	
//	public static String ifTrue(boolean option, String str){
//		return option ? str : "";
//	}
//	
	/**
	 * Takes a string (identifier) and prefixes it with ownerName seperated by a .
	 * ie:- given the identifier getQux, and an ownerName of this, the result would be this.getQux,
	 * by setting the methodize flag to true, it will append () on the end, ie:- this.getQux()
	 * @param identifier The identifier to memberize
	 * @param ownerName The owner of the member
	 * @param methodize Adds () on the end of the result
	 * @return
	 */
	public String memberize(String identifier, String ownerName, boolean methodize){
		if(ownerName == null || ownerName.length() == 0){
			return identifier + (methodize ? "()" : "");
		} else {
			return ownerName + "." + identifier + (methodize ? "()" : "");
		}
	}
	
	public String memberize(String identifier, String ownerName){
		return memberize(identifier, ownerName, false);
	}

	public String toIdentifier(Member member, String prefix){
		String name = member.getName();

		name = spacesToUnderscores(name);
		
		if(prefix != null){
			return prefix + SpecApiStringExtensions.pascalize(name);
		} else {
			return escapeReserved(SpecApiStringExtensions.camelize(name));				
		}
	}

	private String spacesToUnderscores(String name) {
		if(name.contains(" ")) {
			StringBuffer result = new StringBuffer(name.length());
			for(int i=0; i < name.length(); i++){
				char ch = name.charAt(i);
				if(Character.isWhitespace(ch)){
					result.append('_');
				}
				else if(Character.isJavaIdentifierPart(ch)){
					result.append(ch);
				}
			}
			
			name = result.toString();
		}
		
		return name;
	}
//	
//	public static String toReference(String name, boolean getter, String prefix){
//		if(getter){
//			return prefix == null ? "get" + SpecApiStringExtensions.pascalize(name) : prefix + ".get" + SpecApiStringExtensions.pascalize(name) + "()";
//		} else {
//			return prefix == null ? SpecApiStringExtensions.camelize(name) : prefix + "." + SpecApiStringExtensions.camelize(name);
//		}
//	}
//	
//	public static String getPathAsFormatString(HttpMethod method, ISerializer serializer){
//		if(method.getPath() == null) {
//			return "";
//		}
//		
//		String path = serializer.serialize(method.getPath()).trim();
//		
//		return path.replaceAll("[\\^a-zA-Z_0-9]+:[a-zA-Z_0-9]+", "%s");
//	}	
//	
//	public static Iterable<String> getArgsFromPath(String path) {
//		if(path == null) {
//			return new ArrayList<String>();
//		}
//
//		return IterableExtensions.filter(Lists.newArrayList(path.split("/|\\.")), new Function1<String, Boolean>(){public Boolean apply(String p) {
//			return p.startsWith(":");
//		}});
//	}
//	
//	public static String getDefaultValueLiteral(IntrinsicType type) {
//		if(type instanceof StringType) {
//			return "null";
//		} else if (type instanceof BooleanType) {
//			return "false";
//		} else if (type instanceof IntegerType) {
//			return "0";
//		} else if (type instanceof LongType) {
//			return "0L";
//		} else if (type instanceof DoubleType) {
//			return "0.0d";
//		}
//		
//		return "INVALID_TYPE";
//	}
	
	public String convertToJavaLiteral(Literal literal) { 
		if(literal instanceof StringLiteral) {
			return "\"" + org.eclipse.xtext.util.Strings.convertToJavaString(((StringLiteral) literal).getLiteral()) + "\"";
			
		} else if(literal instanceof BooleanLiteral) {
			return ((BooleanLiteral)literal).getLiteral().getLiteral();
			
		} else if(literal instanceof NumericLiteral) {
			return ((NumericLiteral)literal).getLiteral().toString();
		}
		
		return "";
	}
}
