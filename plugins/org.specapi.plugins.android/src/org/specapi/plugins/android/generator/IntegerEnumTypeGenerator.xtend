package org.specapi.plugins.android.generator

import org.specapi.specapiLang.EnumTypeDeclaration
import org.specapi.specapiLang.SpecApiDocument
import javax.inject.Inject

class IntegerEnumTypeGenerator {
	@Inject extension AndroidSpecApiModelUtils utils
	
	def generate(EnumTypeDeclaration type, SpecApiDocument module) '''
	package «module.packageName»;
		
	public enum «type.name» {
		«type.generateEnumMembers»;
		
		private int value;
		
		public int getValue() {
			return value;
		}
		
		«type.name»(int value){
			this.value = value;
		}
		
		public static «type.name» fromValue(int value) {
			
			for («type.name» member : «type.name».values()) {
				if (value == member.value) {
					return member;
				}
			}
			
			throw new RuntimeException("No constant with value " + value + " found");
		}
	}
	'''	
}