package org.specapi.plugins.android.generator

import org.eclipse.xtend.lib.annotations.Accessors
import org.specapi.specapiLang.ComplexTypeDeclaration
import org.specapi.specapiLang.ComplexTypeLiteral
import org.eclipse.emf.common.util.EList
import org.specapi.specapiLang.Member
import org.specapi.specapiLang.IntrinsicType
import org.specapi.specapiLang.UserType
import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.ArrayType
import javax.inject.Inject

class JsonWriterStatementGenerator {
	@Inject extension AndroidSpecApiModelUtils utils
	@Accessors ImportHelper imports
	@Accessors String writerIdentifier = "target"
	@Accessors String subjectIdentifier = "subject"
	@Accessors String providerIdentifier = "provider"
	
	def genWriteComplexType(ComplexTypeDeclaration decl) {
		genWriteComplexTypeLiteral(decl.literal)
	}
	
	def genWriteComplexTypeLiteral(ComplexTypeLiteral literal) '''
		«genWriteComplexTypeLiteralForMembers(literal.members)»
	'''
	
	def genWriteComplexTypeLiteralForMembers(EList<Member> members) '''
		«writerIdentifier».beginObject();
		
		«FOR member:members»
			«genStatement(member)»
		«ENDFOR»
		
		«writerIdentifier».endObject();
	'''
	
	def genStatement(Member member) {
		genStatementForType(member, member.type)
	}
	
	def dispatch genStatementForType(Member member, IntrinsicType type) '''
		«writerIdentifier».name("«member.name»");
		«writerIdentifier».value(«member.toGetMethodName.memberize(subjectIdentifier)»());
	'''
	
	def dispatch genStatementForType(Member member, UserType type) {
		genStatementForType(member, type, type.declaration)
	}
	
	def dispatch genStatementForType(Member member, UserType type, ComplexTypeDeclaration decl) '''
		if(«member.toGetMethodName.memberize(subjectIdentifier)»() != null) {
			«writerIdentifier».name("«member.name»");
			«providerIdentifier».get(«type.innerSignature».class).write(«writerIdentifier», «member.toGetMethodName.memberize(subjectIdentifier)»());
		}
	'''
	
	def dispatch genStatementForType(Member member, UserType type, EnumTypeDeclaration decl) '''
		if(«member.toGetMethodName.memberize(subjectIdentifier)»() != null) {
			«writerIdentifier».name("«member.name»");
			«writerIdentifier».value(«member.toGetMethodName.memberize(subjectIdentifier)»().toString());
		}
	'''
	
	def dispatch genStatementForType(Member member, ArrayType type) {
		genStatementForGenericListType(member, type, type.elementType)
	}
	
	def dispatch genStatementForGenericListType(Member member, ArrayType type, IntrinsicType itemType) '''
		«imports.addImport("org.specapi.android.internal.util.JsonUtil")»
		«imports.addImport("java.util.List")»
		if(«member.toGetMethodName.memberize(subjectIdentifier)»() != null) {
			«writerIdentifier».name("«member.name»");
			JsonUtil.write«itemType.boxedTypeSignature»List(«writerIdentifier», «member.toGetMethodName.memberize(subjectIdentifier)»());
		}
	'''
	
	def dispatch genStatementForGenericListType(Member member, ArrayType type, UserType itemType) { 
		genStatementForUserTypeGenericList(member, type, itemType, itemType.declaration)
	}
	
	def dispatch genStatementForUserTypeGenericList(Member member, ArrayType type, UserType itemType, ComplexTypeDeclaration decl) '''
		«imports.addImport("java.util.List")»
		if(«member.toGetMethodName.memberize(subjectIdentifier)»() != null) {
			«writerIdentifier».name("«member.name»");
			«providerIdentifier».get(«type.innerSignature».class).writeList(«writerIdentifier», «member.toGetMethodName.memberize(subjectIdentifier)»());
		}
	'''
	
	def dispatch genStatementForUserTypeGenericList(Member member, ArrayType type, UserType itemType, EnumTypeDeclaration decl) '''
		«imports.addImport("java.util.List")»
		«imports.addImport("java.util.ArrayList")»
		
		if(«member.toGetMethodName.memberize(subjectIdentifier)»() != null) {
			
			«writerIdentifier».name("«member.name»");
			
			«writerIdentifier».beginArray();
			
			for(«member.type.innerSignature» element : «member.toGetMethodName.memberize(subjectIdentifier)»()) {
				«writerIdentifier».value(element.toString());
			}
			
			«writerIdentifier».endArray();
		}
	'''
}