package org.specapi.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.specapi.services.SpecApiLangGrammarAccess;
import org.specapi.specapiLang.Api;
import org.specapi.specapiLang.ArrayType;
import org.specapi.specapiLang.BodyBlock;
import org.specapi.specapiLang.BooleanLiteral;
import org.specapi.specapiLang.BooleanType;
import org.specapi.specapiLang.ComplexTypeDeclaration;
import org.specapi.specapiLang.ComplexTypeLiteral;
import org.specapi.specapiLang.DoubleType;
import org.specapi.specapiLang.EnumMember;
import org.specapi.specapiLang.EnumTypeDeclaration;
import org.specapi.specapiLang.EnumTypeLiteral;
import org.specapi.specapiLang.Header;
import org.specapi.specapiLang.HeaderBlock;
import org.specapi.specapiLang.HttpMethod;
import org.specapi.specapiLang.IntegerType;
import org.specapi.specapiLang.LongType;
import org.specapi.specapiLang.Member;
import org.specapi.specapiLang.Model;
import org.specapi.specapiLang.NumericLiteral;
import org.specapi.specapiLang.ParamsBlock;
import org.specapi.specapiLang.Path;
import org.specapi.specapiLang.ResponseBlock;
import org.specapi.specapiLang.SimpleMember;
import org.specapi.specapiLang.SimpleMemberAssignment;
import org.specapi.specapiLang.SpecapiLangPackage;
import org.specapi.specapiLang.StringLiteral;
import org.specapi.specapiLang.StringType;
import org.specapi.specapiLang.UserType;

@SuppressWarnings("all")
public class SpecApiLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SpecApiLangGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SpecapiLangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SpecapiLangPackage.API:
				if(context == grammarAccess.getApiRule() ||
				   context == grammarAccess.getDeclarationRule()) {
					sequence_Api(context, (Api) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.ARRAY_TYPE:
				if(context == grammarAccess.getArrayTypeRule() ||
				   context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ArrayType(context, (ArrayType) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.BODY_BLOCK:
				if(context == grammarAccess.getBodyBlockRule() ||
				   context == grammarAccess.getHttpMethodBlockRule()) {
					sequence_BodyBlock(context, (BodyBlock) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.BOOLEAN_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getBooleanTypeRule() ||
				   context == grammarAccess.getIntrinsicTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_BooleanType(context, (BooleanType) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.COMPLEX_TYPE_DECLARATION:
				if(context == grammarAccess.getComplexTypeDeclarationRule() ||
				   context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getUserTypeDeclarationRule()) {
					sequence_ComplexTypeDeclaration(context, (ComplexTypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.COMPLEX_TYPE_LITERAL:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getComplexTypeLiteralRule()) {
					sequence_ComplexTypeLiteral(context, (ComplexTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.DOUBLE_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getDoubleTypeRule() ||
				   context == grammarAccess.getIntrinsicTypeRule() ||
				   context == grammarAccess.getNumericTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_DoubleType(context, (DoubleType) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.ENUM_MEMBER:
				if(context == grammarAccess.getEnumMemberRule()) {
					sequence_EnumMember(context, (EnumMember) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.ENUM_TYPE_DECLARATION:
				if(context == grammarAccess.getDeclarationRule() ||
				   context == grammarAccess.getEnumTypeDeclarationRule() ||
				   context == grammarAccess.getUserTypeDeclarationRule()) {
					sequence_EnumTypeDeclaration(context, (EnumTypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.ENUM_TYPE_LITERAL:
				if(context == grammarAccess.getEnumTypeLiteralRule()) {
					sequence_EnumTypeLiteral(context, (EnumTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.HEADER:
				if(context == grammarAccess.getHeaderRule()) {
					sequence_Header(context, (Header) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.HEADER_BLOCK:
				if(context == grammarAccess.getHeaderBlockRule() ||
				   context == grammarAccess.getHttpMethodBlockRule() ||
				   context == grammarAccess.getServiceBlockRule()) {
					sequence_HeaderBlock(context, (HeaderBlock) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.HTTP_METHOD:
				if(context == grammarAccess.getHttpMethodRule() ||
				   context == grammarAccess.getServiceBlockRule()) {
					sequence_HttpMethod(context, (HttpMethod) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.INTEGER_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getIntegerTypeRule() ||
				   context == grammarAccess.getIntrinsicTypeRule() ||
				   context == grammarAccess.getNumericTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_IntegerType(context, (IntegerType) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.LONG_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getIntrinsicTypeRule() ||
				   context == grammarAccess.getLongTypeRule() ||
				   context == grammarAccess.getNumericTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_LongType(context, (LongType) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.MEMBER:
				if(context == grammarAccess.getMemberRule()) {
					sequence_Member(context, (Member) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.NUMERIC_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (NumericLiteral) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.PARAMS_BLOCK:
				if(context == grammarAccess.getHttpMethodBlockRule() ||
				   context == grammarAccess.getParamsBlockRule() ||
				   context == grammarAccess.getServiceBlockRule()) {
					sequence_ParamsBlock(context, (ParamsBlock) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.PATH:
				if(context == grammarAccess.getPathRule()) {
					sequence_Path(context, (Path) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.RESPONSE_BLOCK:
				if(context == grammarAccess.getHttpMethodBlockRule() ||
				   context == grammarAccess.getResponseBlockRule()) {
					sequence_ResponseBlock(context, (ResponseBlock) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.SIMPLE_MEMBER:
				if(context == grammarAccess.getSimpleMemberRule()) {
					sequence_SimpleMember(context, (SimpleMember) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.SIMPLE_MEMBER_ASSIGNMENT:
				if(context == grammarAccess.getSimpleMemberAssignmentRule()) {
					sequence_SimpleMemberAssignment(context, (SimpleMemberAssignment) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.STRING_LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.STRING_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getIntrinsicTypeRule() ||
				   context == grammarAccess.getStringTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_StringType(context, (StringType) semanticObject); 
					return; 
				}
				else break;
			case SpecapiLangPackage.USER_TYPE:
				if(context == grammarAccess.getBlockTypeRule() ||
				   context == grammarAccess.getTypeRule() ||
				   context == grammarAccess.getUserTypeRule()) {
					sequence_UserType(context, (UserType) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID baseUrl=STRING? blocks+=ServiceBlock*)
	 */
	protected void sequence_Api(EObject context, Api semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elementType=UserType | elementType=IntrinsicType) id='[]')
	 */
	protected void sequence_ArrayType(EObject context, ArrayType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=BlockType
	 */
	protected void sequence_BodyBlock(EObject context, BodyBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecapiLangPackage.Literals.BODY_BLOCK__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecapiLangPackage.Literals.BODY_BLOCK__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBodyBlockAccess().getTypeBlockTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     id='boolean'
	 */
	protected void sequence_BooleanType(EObject context, BooleanType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecapiLangPackage.Literals.INTRINSIC_TYPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecapiLangPackage.Literals.INTRINSIC_TYPE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanTypeAccess().getIdBooleanKeyword_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='entity' nogen?='nogen'? name=ID literal=ComplexTypeLiteral?)
	 */
	protected void sequence_ComplexTypeDeclaration(EObject context, ComplexTypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (members+=Member members+=Member*)
	 */
	protected void sequence_ComplexTypeLiteral(EObject context, ComplexTypeLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id='double'
	 */
	protected void sequence_DoubleType(EObject context, DoubleType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecapiLangPackage.Literals.INTRINSIC_TYPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecapiLangPackage.Literals.INTRINSIC_TYPE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoubleTypeAccess().getIdDoubleKeyword_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (assignment?='=' value=NUMBER)?)
	 */
	protected void sequence_EnumMember(EObject context, EnumMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='enum' nogen?='nogen'? name=ID superType=IntegerType? literal=EnumTypeLiteral?)
	 */
	protected void sequence_EnumTypeDeclaration(EObject context, EnumTypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (members+=EnumMember members+=EnumMember*)
	 */
	protected void sequence_EnumTypeLiteral(EObject context, EnumTypeLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (headers+=Header headers+=Header*)
	 */
	protected void sequence_HeaderBlock(EObject context, HeaderBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING value=STRING)
	 */
	protected void sequence_Header(EObject context, Header semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecapiLangPackage.Literals.HEADER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecapiLangPackage.Literals.HEADER__NAME));
			if(transientValues.isValueTransient(semanticObject, SpecapiLangPackage.Literals.HEADER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecapiLangPackage.Literals.HEADER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getHeaderAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=HttpMethodType name=ID path=Path? blocks+=HttpMethodBlock*)
	 */
	protected void sequence_HttpMethod(EObject context, HttpMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id='int'
	 */
	protected void sequence_IntegerType(EObject context, IntegerType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecapiLangPackage.Literals.INTRINSIC_TYPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecapiLangPackage.Literals.INTRINSIC_TYPE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerTypeAccess().getIdIntKeyword_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal=BooleanValue
	 */
	protected void sequence_Literal(EObject context, BooleanLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecapiLangPackage.Literals.BOOLEAN_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecapiLangPackage.Literals.BOOLEAN_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getLiteralBooleanValueEnumRuleCall_0_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal=SignedNumber
	 */
	protected void sequence_Literal(EObject context, NumericLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecapiLangPackage.Literals.NUMERIC_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecapiLangPackage.Literals.NUMERIC_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getLiteralSignedNumberParserRuleCall_2_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     literal=STRING
	 */
	protected void sequence_Literal(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecapiLangPackage.Literals.STRING_LITERAL__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecapiLangPackage.Literals.STRING_LITERAL__LITERAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getLiteralSTRINGTerminalRuleCall_1_1_0(), semanticObject.getLiteral());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     id='long'
	 */
	protected void sequence_LongType(EObject context, LongType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecapiLangPackage.Literals.INTRINSIC_TYPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecapiLangPackage.Literals.INTRINSIC_TYPE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLongTypeAccess().getIdLongKeyword_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID | name=STRING) type=Type)
	 */
	protected void sequence_Member(EObject context, Member semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (packageName=QualifiedName declarations+=Declaration*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params+=SimpleMemberAssignment params+=SimpleMemberAssignment*)
	 */
	protected void sequence_ParamsBlock(EObject context, ParamsBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params+=SimpleMemberAssignment? params+=SimpleMemberAssignment*)
	 */
	protected void sequence_Path(EObject context, Path semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (superType=[ComplexTypeDeclaration|ID]? type=BlockType?)
	 */
	protected void sequence_ResponseBlock(EObject context, ResponseBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (member=SimpleMember defaultValue=Literal?)
	 */
	protected void sequence_SimpleMemberAssignment(EObject context, SimpleMemberAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ID | name=STRING) type=IntrinsicType)
	 */
	protected void sequence_SimpleMember(EObject context, SimpleMember semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id='string'
	 */
	protected void sequence_StringType(EObject context, StringType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecapiLangPackage.Literals.INTRINSIC_TYPE__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecapiLangPackage.Literals.INTRINSIC_TYPE__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringTypeAccess().getIdStringKeyword_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     declaration=[UserTypeDeclaration|ID]
	 */
	protected void sequence_UserType(EObject context, UserType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SpecapiLangPackage.Literals.USER_TYPE__DECLARATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SpecapiLangPackage.Literals.USER_TYPE__DECLARATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUserTypeAccess().getDeclarationUserTypeDeclarationIDTerminalRuleCall_0_1(), semanticObject.getDeclaration());
		feeder.finish();
	}
}
