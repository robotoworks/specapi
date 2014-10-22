package org.specapi.plugins.android.generator

import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.SpecApiDocument
import static extension org.specapi.util.SpecApiStringExtensions.*

class StringEnumTypeGenerator {
	def generate(EnumTypeDeclaration type, SpecApiDocument module) '''
	package «module.packageName»;
		
	public enum «type.name» {
		«type.literal.members.join(",\n", [member|member.name.underscorize.toUpperCase + '("' + member.name + '")'])»;
		
		private String value;
		
		public String getValue() {
			return value;
		}
		
		«type.name»(String value){
			this.value = value;
		}
		
		public static «type.name» fromValue(String value) {
			if (value == null) {
				throw new IllegalArgumentException("value cannot be null");
			}
			
			for («type.name» member : «type.name».values()) {
				if (value.equalsIgnoreCase(member.value)) {
					return member;
				}
			}
			
			throw new RuntimeException("No constant with value " + value + " found");
		}
	}
	'''
}