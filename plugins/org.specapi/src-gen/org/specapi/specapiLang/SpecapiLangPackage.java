/**
 */
package org.specapi.specapiLang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.specapi.specapiLang.SpecapiLangFactory
 * @model kind="package"
 * @generated
 */
public interface SpecapiLangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "specapiLang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.specapi.org/specapi/SpecApiLang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "specapiLang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpecapiLangPackage eINSTANCE = org.specapi.specapiLang.impl.SpecapiLangPackageImpl.init();

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.ModelImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.DeclarationImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.ApiImpl <em>Api</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.ApiImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getApi()
   * @generated
   */
  int API = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Base Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API__BASE_URL = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API__BLOCKS = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Api</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int API_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.ServiceBlockImpl <em>Service Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.ServiceBlockImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getServiceBlock()
   * @generated
   */
  int SERVICE_BLOCK = 3;

  /**
   * The number of structural features of the '<em>Service Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_BLOCK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.HeaderBlockImpl <em>Header Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.HeaderBlockImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getHeaderBlock()
   * @generated
   */
  int HEADER_BLOCK = 4;

  /**
   * The feature id for the '<em><b>Headers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_BLOCK__HEADERS = SERVICE_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Header Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_BLOCK_FEATURE_COUNT = SERVICE_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.HeaderImpl <em>Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.HeaderImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getHeader()
   * @generated
   */
  int HEADER = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HEADER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.HttpMethodImpl <em>Http Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.HttpMethodImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getHttpMethod()
   * @generated
   */
  int HTTP_METHOD = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__TYPE = SERVICE_BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__NAME = SERVICE_BLOCK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__PATH = SERVICE_BLOCK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__BLOCKS = SERVICE_BLOCK_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Http Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD_FEATURE_COUNT = SERVICE_BLOCK_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.HttpMethodBlockImpl <em>Http Method Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.HttpMethodBlockImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getHttpMethodBlock()
   * @generated
   */
  int HTTP_METHOD_BLOCK = 7;

  /**
   * The number of structural features of the '<em>Http Method Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD_BLOCK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.PathImpl <em>Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.PathImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getPath()
   * @generated
   */
  int PATH = 8;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.ParamsBlockImpl <em>Params Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.ParamsBlockImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getParamsBlock()
   * @generated
   */
  int PARAMS_BLOCK = 9;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS_BLOCK__PARAMS = SERVICE_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Params Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMS_BLOCK_FEATURE_COUNT = SERVICE_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.SimpleMemberAssignmentImpl <em>Simple Member Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.SimpleMemberAssignmentImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getSimpleMemberAssignment()
   * @generated
   */
  int SIMPLE_MEMBER_ASSIGNMENT = 10;

  /**
   * The feature id for the '<em><b>Member</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MEMBER_ASSIGNMENT__MEMBER = 0;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MEMBER_ASSIGNMENT__DEFAULT_VALUE = 1;

  /**
   * The number of structural features of the '<em>Simple Member Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MEMBER_ASSIGNMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.LiteralImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 11;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.BodyBlockImpl <em>Body Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.BodyBlockImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getBodyBlock()
   * @generated
   */
  int BODY_BLOCK = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_BLOCK__TYPE = HTTP_METHOD_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Body Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_BLOCK_FEATURE_COUNT = HTTP_METHOD_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.ResponseBlockImpl <em>Response Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.ResponseBlockImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getResponseBlock()
   * @generated
   */
  int RESPONSE_BLOCK = 13;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_BLOCK__SUPER_TYPE = HTTP_METHOD_BLOCK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_BLOCK__TYPE = HTTP_METHOD_BLOCK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Response Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_BLOCK_FEATURE_COUNT = HTTP_METHOD_BLOCK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.BlockTypeImpl <em>Block Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.BlockTypeImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getBlockType()
   * @generated
   */
  int BLOCK_TYPE = 14;

  /**
   * The number of structural features of the '<em>Block Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.MemberImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getMember()
   * @generated
   */
  int MEMBER = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.SimpleMemberImpl <em>Simple Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.SimpleMemberImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getSimpleMember()
   * @generated
   */
  int SIMPLE_MEMBER = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MEMBER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MEMBER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Simple Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.TypeImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getType()
   * @generated
   */
  int TYPE = 17;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = BLOCK_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.ArrayTypeImpl <em>Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.ArrayTypeImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getArrayType()
   * @generated
   */
  int ARRAY_TYPE = 18;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__ELEMENT_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__ID = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.UserTypeImpl <em>User Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.UserTypeImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getUserType()
   * @generated
   */
  int USER_TYPE = 19;

  /**
   * The feature id for the '<em><b>Declaration</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE__DECLARATION = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>User Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.UserTypeDeclarationImpl <em>User Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.UserTypeDeclarationImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getUserTypeDeclaration()
   * @generated
   */
  int USER_TYPE_DECLARATION = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_DECLARATION__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_DECLARATION__KEYWORD = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>User Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_TYPE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.ComplexTypeDeclarationImpl <em>Complex Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.ComplexTypeDeclarationImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getComplexTypeDeclaration()
   * @generated
   */
  int COMPLEX_TYPE_DECLARATION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_DECLARATION__NAME = USER_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_DECLARATION__KEYWORD = USER_TYPE_DECLARATION__KEYWORD;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_DECLARATION__LITERAL = USER_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Complex Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_DECLARATION_FEATURE_COUNT = USER_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.EnumTypeDeclarationImpl <em>Enum Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.EnumTypeDeclarationImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getEnumTypeDeclaration()
   * @generated
   */
  int ENUM_TYPE_DECLARATION = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECLARATION__NAME = USER_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECLARATION__KEYWORD = USER_TYPE_DECLARATION__KEYWORD;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECLARATION__SUPER_TYPE = USER_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECLARATION__LITERAL = USER_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_DECLARATION_FEATURE_COUNT = USER_TYPE_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.EnumTypeLiteralImpl <em>Enum Type Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.EnumTypeLiteralImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getEnumTypeLiteral()
   * @generated
   */
  int ENUM_TYPE_LITERAL = 23;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_LITERAL__MEMBERS = 0;

  /**
   * The number of structural features of the '<em>Enum Type Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_LITERAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.EnumMemberImpl <em>Enum Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.EnumMemberImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getEnumMember()
   * @generated
   */
  int ENUM_MEMBER = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__NAME = 0;

  /**
   * The feature id for the '<em><b>Assignment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__ASSIGNMENT = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER__VALUE = 2;

  /**
   * The number of structural features of the '<em>Enum Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_MEMBER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.ComplexTypeLiteralImpl <em>Complex Type Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.ComplexTypeLiteralImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getComplexTypeLiteral()
   * @generated
   */
  int COMPLEX_TYPE_LITERAL = 25;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_LITERAL__MEMBERS = BLOCK_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Complex Type Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_TYPE_LITERAL_FEATURE_COUNT = BLOCK_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.IntrinsicTypeImpl <em>Intrinsic Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.IntrinsicTypeImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getIntrinsicType()
   * @generated
   */
  int INTRINSIC_TYPE = 26;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_TYPE__ID = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Intrinsic Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTRINSIC_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.StringTypeImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 27;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE__ID = INTRINSIC_TYPE__ID;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = INTRINSIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.BooleanTypeImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getBooleanType()
   * @generated
   */
  int BOOLEAN_TYPE = 28;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE__ID = INTRINSIC_TYPE__ID;

  /**
   * The number of structural features of the '<em>Boolean Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_TYPE_FEATURE_COUNT = INTRINSIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.NumericTypeImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getNumericType()
   * @generated
   */
  int NUMERIC_TYPE = 29;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_TYPE__ID = INTRINSIC_TYPE__ID;

  /**
   * The number of structural features of the '<em>Numeric Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_TYPE_FEATURE_COUNT = INTRINSIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.IntegerTypeImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getIntegerType()
   * @generated
   */
  int INTEGER_TYPE = 30;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE__ID = NUMERIC_TYPE__ID;

  /**
   * The number of structural features of the '<em>Integer Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.LongTypeImpl <em>Long Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.LongTypeImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getLongType()
   * @generated
   */
  int LONG_TYPE = 31;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_TYPE__ID = NUMERIC_TYPE__ID;

  /**
   * The number of structural features of the '<em>Long Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LONG_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.DoubleTypeImpl <em>Double Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.DoubleTypeImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getDoubleType()
   * @generated
   */
  int DOUBLE_TYPE = 32;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_TYPE__ID = NUMERIC_TYPE__ID;

  /**
   * The number of structural features of the '<em>Double Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_TYPE_FEATURE_COUNT = NUMERIC_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.BooleanLiteralImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 33;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__LITERAL = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.StringLiteralImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 34;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__LITERAL = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.impl.NumericLiteralImpl
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getNumericLiteral()
   * @generated
   */
  int NUMERIC_LITERAL = 35;

  /**
   * The feature id for the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL__LITERAL = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Numeric Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.HttpMethodType <em>Http Method Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.HttpMethodType
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getHttpMethodType()
   * @generated
   */
  int HTTP_METHOD_TYPE = 36;

  /**
   * The meta object id for the '{@link org.specapi.specapiLang.BooleanValue <em>Boolean Value</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.specapi.specapiLang.BooleanValue
   * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 37;


  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.specapi.specapiLang.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.Model#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see org.specapi.specapiLang.Model#getPackageName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_PackageName();

  /**
   * Returns the meta object for the containment reference list '{@link org.specapi.specapiLang.Model#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.specapi.specapiLang.Model#getDeclarations()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Declarations();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see org.specapi.specapiLang.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.specapi.specapiLang.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.Api <em>Api</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Api</em>'.
   * @see org.specapi.specapiLang.Api
   * @generated
   */
  EClass getApi();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.Api#getBaseUrl <em>Base Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Url</em>'.
   * @see org.specapi.specapiLang.Api#getBaseUrl()
   * @see #getApi()
   * @generated
   */
  EAttribute getApi_BaseUrl();

  /**
   * Returns the meta object for the containment reference list '{@link org.specapi.specapiLang.Api#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see org.specapi.specapiLang.Api#getBlocks()
   * @see #getApi()
   * @generated
   */
  EReference getApi_Blocks();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.ServiceBlock <em>Service Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Block</em>'.
   * @see org.specapi.specapiLang.ServiceBlock
   * @generated
   */
  EClass getServiceBlock();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.HeaderBlock <em>Header Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header Block</em>'.
   * @see org.specapi.specapiLang.HeaderBlock
   * @generated
   */
  EClass getHeaderBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.specapi.specapiLang.HeaderBlock#getHeaders <em>Headers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Headers</em>'.
   * @see org.specapi.specapiLang.HeaderBlock#getHeaders()
   * @see #getHeaderBlock()
   * @generated
   */
  EReference getHeaderBlock_Headers();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.Header <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Header</em>'.
   * @see org.specapi.specapiLang.Header
   * @generated
   */
  EClass getHeader();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.Header#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.specapi.specapiLang.Header#getName()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Name();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.Header#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.specapi.specapiLang.Header#getValue()
   * @see #getHeader()
   * @generated
   */
  EAttribute getHeader_Value();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.HttpMethod <em>Http Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Http Method</em>'.
   * @see org.specapi.specapiLang.HttpMethod
   * @generated
   */
  EClass getHttpMethod();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.HttpMethod#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.specapi.specapiLang.HttpMethod#getType()
   * @see #getHttpMethod()
   * @generated
   */
  EAttribute getHttpMethod_Type();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.HttpMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.specapi.specapiLang.HttpMethod#getName()
   * @see #getHttpMethod()
   * @generated
   */
  EAttribute getHttpMethod_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.specapi.specapiLang.HttpMethod#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Path</em>'.
   * @see org.specapi.specapiLang.HttpMethod#getPath()
   * @see #getHttpMethod()
   * @generated
   */
  EReference getHttpMethod_Path();

  /**
   * Returns the meta object for the containment reference list '{@link org.specapi.specapiLang.HttpMethod#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see org.specapi.specapiLang.HttpMethod#getBlocks()
   * @see #getHttpMethod()
   * @generated
   */
  EReference getHttpMethod_Blocks();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.HttpMethodBlock <em>Http Method Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Http Method Block</em>'.
   * @see org.specapi.specapiLang.HttpMethodBlock
   * @generated
   */
  EClass getHttpMethodBlock();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.Path <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path</em>'.
   * @see org.specapi.specapiLang.Path
   * @generated
   */
  EClass getPath();

  /**
   * Returns the meta object for the containment reference list '{@link org.specapi.specapiLang.Path#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.specapi.specapiLang.Path#getParams()
   * @see #getPath()
   * @generated
   */
  EReference getPath_Params();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.ParamsBlock <em>Params Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Params Block</em>'.
   * @see org.specapi.specapiLang.ParamsBlock
   * @generated
   */
  EClass getParamsBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.specapi.specapiLang.ParamsBlock#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.specapi.specapiLang.ParamsBlock#getParams()
   * @see #getParamsBlock()
   * @generated
   */
  EReference getParamsBlock_Params();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.SimpleMemberAssignment <em>Simple Member Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Member Assignment</em>'.
   * @see org.specapi.specapiLang.SimpleMemberAssignment
   * @generated
   */
  EClass getSimpleMemberAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.specapi.specapiLang.SimpleMemberAssignment#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Member</em>'.
   * @see org.specapi.specapiLang.SimpleMemberAssignment#getMember()
   * @see #getSimpleMemberAssignment()
   * @generated
   */
  EReference getSimpleMemberAssignment_Member();

  /**
   * Returns the meta object for the containment reference '{@link org.specapi.specapiLang.SimpleMemberAssignment#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see org.specapi.specapiLang.SimpleMemberAssignment#getDefaultValue()
   * @see #getSimpleMemberAssignment()
   * @generated
   */
  EReference getSimpleMemberAssignment_DefaultValue();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.specapi.specapiLang.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.BodyBlock <em>Body Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body Block</em>'.
   * @see org.specapi.specapiLang.BodyBlock
   * @generated
   */
  EClass getBodyBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.specapi.specapiLang.BodyBlock#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.specapi.specapiLang.BodyBlock#getType()
   * @see #getBodyBlock()
   * @generated
   */
  EReference getBodyBlock_Type();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.ResponseBlock <em>Response Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Response Block</em>'.
   * @see org.specapi.specapiLang.ResponseBlock
   * @generated
   */
  EClass getResponseBlock();

  /**
   * Returns the meta object for the reference '{@link org.specapi.specapiLang.ResponseBlock#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.specapi.specapiLang.ResponseBlock#getSuperType()
   * @see #getResponseBlock()
   * @generated
   */
  EReference getResponseBlock_SuperType();

  /**
   * Returns the meta object for the containment reference '{@link org.specapi.specapiLang.ResponseBlock#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.specapi.specapiLang.ResponseBlock#getType()
   * @see #getResponseBlock()
   * @generated
   */
  EReference getResponseBlock_Type();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.BlockType <em>Block Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block Type</em>'.
   * @see org.specapi.specapiLang.BlockType
   * @generated
   */
  EClass getBlockType();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see org.specapi.specapiLang.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.Member#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.specapi.specapiLang.Member#getName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.specapi.specapiLang.Member#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.specapi.specapiLang.Member#getType()
   * @see #getMember()
   * @generated
   */
  EReference getMember_Type();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.SimpleMember <em>Simple Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Member</em>'.
   * @see org.specapi.specapiLang.SimpleMember
   * @generated
   */
  EClass getSimpleMember();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.SimpleMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.specapi.specapiLang.SimpleMember#getName()
   * @see #getSimpleMember()
   * @generated
   */
  EAttribute getSimpleMember_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.specapi.specapiLang.SimpleMember#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.specapi.specapiLang.SimpleMember#getType()
   * @see #getSimpleMember()
   * @generated
   */
  EReference getSimpleMember_Type();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.specapi.specapiLang.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type</em>'.
   * @see org.specapi.specapiLang.ArrayType
   * @generated
   */
  EClass getArrayType();

  /**
   * Returns the meta object for the containment reference '{@link org.specapi.specapiLang.ArrayType#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see org.specapi.specapiLang.ArrayType#getElementType()
   * @see #getArrayType()
   * @generated
   */
  EReference getArrayType_ElementType();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.ArrayType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.specapi.specapiLang.ArrayType#getId()
   * @see #getArrayType()
   * @generated
   */
  EAttribute getArrayType_Id();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.UserType <em>User Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Type</em>'.
   * @see org.specapi.specapiLang.UserType
   * @generated
   */
  EClass getUserType();

  /**
   * Returns the meta object for the reference '{@link org.specapi.specapiLang.UserType#getDeclaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Declaration</em>'.
   * @see org.specapi.specapiLang.UserType#getDeclaration()
   * @see #getUserType()
   * @generated
   */
  EReference getUserType_Declaration();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.UserTypeDeclaration <em>User Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Type Declaration</em>'.
   * @see org.specapi.specapiLang.UserTypeDeclaration
   * @generated
   */
  EClass getUserTypeDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.UserTypeDeclaration#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.specapi.specapiLang.UserTypeDeclaration#getKeyword()
   * @see #getUserTypeDeclaration()
   * @generated
   */
  EAttribute getUserTypeDeclaration_Keyword();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.ComplexTypeDeclaration <em>Complex Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Type Declaration</em>'.
   * @see org.specapi.specapiLang.ComplexTypeDeclaration
   * @generated
   */
  EClass getComplexTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.specapi.specapiLang.ComplexTypeDeclaration#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see org.specapi.specapiLang.ComplexTypeDeclaration#getLiteral()
   * @see #getComplexTypeDeclaration()
   * @generated
   */
  EReference getComplexTypeDeclaration_Literal();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.EnumTypeDeclaration <em>Enum Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type Declaration</em>'.
   * @see org.specapi.specapiLang.EnumTypeDeclaration
   * @generated
   */
  EClass getEnumTypeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.specapi.specapiLang.EnumTypeDeclaration#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see org.specapi.specapiLang.EnumTypeDeclaration#getSuperType()
   * @see #getEnumTypeDeclaration()
   * @generated
   */
  EReference getEnumTypeDeclaration_SuperType();

  /**
   * Returns the meta object for the containment reference '{@link org.specapi.specapiLang.EnumTypeDeclaration#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see org.specapi.specapiLang.EnumTypeDeclaration#getLiteral()
   * @see #getEnumTypeDeclaration()
   * @generated
   */
  EReference getEnumTypeDeclaration_Literal();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.EnumTypeLiteral <em>Enum Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type Literal</em>'.
   * @see org.specapi.specapiLang.EnumTypeLiteral
   * @generated
   */
  EClass getEnumTypeLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link org.specapi.specapiLang.EnumTypeLiteral#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.specapi.specapiLang.EnumTypeLiteral#getMembers()
   * @see #getEnumTypeLiteral()
   * @generated
   */
  EReference getEnumTypeLiteral_Members();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.EnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Member</em>'.
   * @see org.specapi.specapiLang.EnumMember
   * @generated
   */
  EClass getEnumMember();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.EnumMember#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.specapi.specapiLang.EnumMember#getName()
   * @see #getEnumMember()
   * @generated
   */
  EAttribute getEnumMember_Name();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.EnumMember#isAssignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assignment</em>'.
   * @see org.specapi.specapiLang.EnumMember#isAssignment()
   * @see #getEnumMember()
   * @generated
   */
  EAttribute getEnumMember_Assignment();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.EnumMember#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.specapi.specapiLang.EnumMember#getValue()
   * @see #getEnumMember()
   * @generated
   */
  EAttribute getEnumMember_Value();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.ComplexTypeLiteral <em>Complex Type Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Type Literal</em>'.
   * @see org.specapi.specapiLang.ComplexTypeLiteral
   * @generated
   */
  EClass getComplexTypeLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link org.specapi.specapiLang.ComplexTypeLiteral#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.specapi.specapiLang.ComplexTypeLiteral#getMembers()
   * @see #getComplexTypeLiteral()
   * @generated
   */
  EReference getComplexTypeLiteral_Members();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.IntrinsicType <em>Intrinsic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intrinsic Type</em>'.
   * @see org.specapi.specapiLang.IntrinsicType
   * @generated
   */
  EClass getIntrinsicType();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.IntrinsicType#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.specapi.specapiLang.IntrinsicType#getId()
   * @see #getIntrinsicType()
   * @generated
   */
  EAttribute getIntrinsicType_Id();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see org.specapi.specapiLang.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.BooleanType <em>Boolean Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Type</em>'.
   * @see org.specapi.specapiLang.BooleanType
   * @generated
   */
  EClass getBooleanType();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.NumericType <em>Numeric Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Type</em>'.
   * @see org.specapi.specapiLang.NumericType
   * @generated
   */
  EClass getNumericType();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.IntegerType <em>Integer Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Type</em>'.
   * @see org.specapi.specapiLang.IntegerType
   * @generated
   */
  EClass getIntegerType();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.LongType <em>Long Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Long Type</em>'.
   * @see org.specapi.specapiLang.LongType
   * @generated
   */
  EClass getLongType();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.DoubleType <em>Double Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Type</em>'.
   * @see org.specapi.specapiLang.DoubleType
   * @generated
   */
  EClass getDoubleType();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.specapi.specapiLang.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.BooleanLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see org.specapi.specapiLang.BooleanLiteral#getLiteral()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Literal();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.specapi.specapiLang.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.StringLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see org.specapi.specapiLang.StringLiteral#getLiteral()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Literal();

  /**
   * Returns the meta object for class '{@link org.specapi.specapiLang.NumericLiteral <em>Numeric Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Literal</em>'.
   * @see org.specapi.specapiLang.NumericLiteral
   * @generated
   */
  EClass getNumericLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.specapi.specapiLang.NumericLiteral#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Literal</em>'.
   * @see org.specapi.specapiLang.NumericLiteral#getLiteral()
   * @see #getNumericLiteral()
   * @generated
   */
  EAttribute getNumericLiteral_Literal();

  /**
   * Returns the meta object for enum '{@link org.specapi.specapiLang.HttpMethodType <em>Http Method Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Http Method Type</em>'.
   * @see org.specapi.specapiLang.HttpMethodType
   * @generated
   */
  EEnum getHttpMethodType();

  /**
   * Returns the meta object for enum '{@link org.specapi.specapiLang.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Boolean Value</em>'.
   * @see org.specapi.specapiLang.BooleanValue
   * @generated
   */
  EEnum getBooleanValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SpecapiLangFactory getSpecapiLangFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.ModelImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__PACKAGE_NAME = eINSTANCE.getModel_PackageName();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DECLARATIONS = eINSTANCE.getModel_Declarations();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.DeclarationImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.ApiImpl <em>Api</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.ApiImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getApi()
     * @generated
     */
    EClass API = eINSTANCE.getApi();

    /**
     * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute API__BASE_URL = eINSTANCE.getApi_BaseUrl();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference API__BLOCKS = eINSTANCE.getApi_Blocks();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.ServiceBlockImpl <em>Service Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.ServiceBlockImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getServiceBlock()
     * @generated
     */
    EClass SERVICE_BLOCK = eINSTANCE.getServiceBlock();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.HeaderBlockImpl <em>Header Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.HeaderBlockImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getHeaderBlock()
     * @generated
     */
    EClass HEADER_BLOCK = eINSTANCE.getHeaderBlock();

    /**
     * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HEADER_BLOCK__HEADERS = eINSTANCE.getHeaderBlock_Headers();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.HeaderImpl <em>Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.HeaderImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getHeader()
     * @generated
     */
    EClass HEADER = eINSTANCE.getHeader();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__NAME = eINSTANCE.getHeader_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HEADER__VALUE = eINSTANCE.getHeader_Value();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.HttpMethodImpl <em>Http Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.HttpMethodImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getHttpMethod()
     * @generated
     */
    EClass HTTP_METHOD = eINSTANCE.getHttpMethod();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_METHOD__TYPE = eINSTANCE.getHttpMethod_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_METHOD__NAME = eINSTANCE.getHttpMethod_Name();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTTP_METHOD__PATH = eINSTANCE.getHttpMethod_Path();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HTTP_METHOD__BLOCKS = eINSTANCE.getHttpMethod_Blocks();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.HttpMethodBlockImpl <em>Http Method Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.HttpMethodBlockImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getHttpMethodBlock()
     * @generated
     */
    EClass HTTP_METHOD_BLOCK = eINSTANCE.getHttpMethodBlock();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.PathImpl <em>Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.PathImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getPath()
     * @generated
     */
    EClass PATH = eINSTANCE.getPath();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PATH__PARAMS = eINSTANCE.getPath_Params();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.ParamsBlockImpl <em>Params Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.ParamsBlockImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getParamsBlock()
     * @generated
     */
    EClass PARAMS_BLOCK = eINSTANCE.getParamsBlock();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMS_BLOCK__PARAMS = eINSTANCE.getParamsBlock_Params();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.SimpleMemberAssignmentImpl <em>Simple Member Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.SimpleMemberAssignmentImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getSimpleMemberAssignment()
     * @generated
     */
    EClass SIMPLE_MEMBER_ASSIGNMENT = eINSTANCE.getSimpleMemberAssignment();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_MEMBER_ASSIGNMENT__MEMBER = eINSTANCE.getSimpleMemberAssignment_Member();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_MEMBER_ASSIGNMENT__DEFAULT_VALUE = eINSTANCE.getSimpleMemberAssignment_DefaultValue();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.LiteralImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.BodyBlockImpl <em>Body Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.BodyBlockImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getBodyBlock()
     * @generated
     */
    EClass BODY_BLOCK = eINSTANCE.getBodyBlock();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY_BLOCK__TYPE = eINSTANCE.getBodyBlock_Type();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.ResponseBlockImpl <em>Response Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.ResponseBlockImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getResponseBlock()
     * @generated
     */
    EClass RESPONSE_BLOCK = eINSTANCE.getResponseBlock();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESPONSE_BLOCK__SUPER_TYPE = eINSTANCE.getResponseBlock_SuperType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESPONSE_BLOCK__TYPE = eINSTANCE.getResponseBlock_Type();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.BlockTypeImpl <em>Block Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.BlockTypeImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getBlockType()
     * @generated
     */
    EClass BLOCK_TYPE = eINSTANCE.getBlockType();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.MemberImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__NAME = eINSTANCE.getMember_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER__TYPE = eINSTANCE.getMember_Type();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.SimpleMemberImpl <em>Simple Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.SimpleMemberImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getSimpleMember()
     * @generated
     */
    EClass SIMPLE_MEMBER = eINSTANCE.getSimpleMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_MEMBER__NAME = eINSTANCE.getSimpleMember_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_MEMBER__TYPE = eINSTANCE.getSimpleMember_Type();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.TypeImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.ArrayTypeImpl <em>Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.ArrayTypeImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getArrayType()
     * @generated
     */
    EClass ARRAY_TYPE = eINSTANCE.getArrayType();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__ELEMENT_TYPE = eINSTANCE.getArrayType_ElementType();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY_TYPE__ID = eINSTANCE.getArrayType_Id();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.UserTypeImpl <em>User Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.UserTypeImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getUserType()
     * @generated
     */
    EClass USER_TYPE = eINSTANCE.getUserType();

    /**
     * The meta object literal for the '<em><b>Declaration</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_TYPE__DECLARATION = eINSTANCE.getUserType_Declaration();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.UserTypeDeclarationImpl <em>User Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.UserTypeDeclarationImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getUserTypeDeclaration()
     * @generated
     */
    EClass USER_TYPE_DECLARATION = eINSTANCE.getUserTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USER_TYPE_DECLARATION__KEYWORD = eINSTANCE.getUserTypeDeclaration_Keyword();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.ComplexTypeDeclarationImpl <em>Complex Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.ComplexTypeDeclarationImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getComplexTypeDeclaration()
     * @generated
     */
    EClass COMPLEX_TYPE_DECLARATION = eINSTANCE.getComplexTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE_DECLARATION__LITERAL = eINSTANCE.getComplexTypeDeclaration_Literal();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.EnumTypeDeclarationImpl <em>Enum Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.EnumTypeDeclarationImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getEnumTypeDeclaration()
     * @generated
     */
    EClass ENUM_TYPE_DECLARATION = eINSTANCE.getEnumTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE_DECLARATION__SUPER_TYPE = eINSTANCE.getEnumTypeDeclaration_SuperType();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE_DECLARATION__LITERAL = eINSTANCE.getEnumTypeDeclaration_Literal();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.EnumTypeLiteralImpl <em>Enum Type Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.EnumTypeLiteralImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getEnumTypeLiteral()
     * @generated
     */
    EClass ENUM_TYPE_LITERAL = eINSTANCE.getEnumTypeLiteral();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE_LITERAL__MEMBERS = eINSTANCE.getEnumTypeLiteral_Members();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.EnumMemberImpl <em>Enum Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.EnumMemberImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getEnumMember()
     * @generated
     */
    EClass ENUM_MEMBER = eINSTANCE.getEnumMember();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_MEMBER__NAME = eINSTANCE.getEnumMember_Name();

    /**
     * The meta object literal for the '<em><b>Assignment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_MEMBER__ASSIGNMENT = eINSTANCE.getEnumMember_Assignment();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_MEMBER__VALUE = eINSTANCE.getEnumMember_Value();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.ComplexTypeLiteralImpl <em>Complex Type Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.ComplexTypeLiteralImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getComplexTypeLiteral()
     * @generated
     */
    EClass COMPLEX_TYPE_LITERAL = eINSTANCE.getComplexTypeLiteral();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_TYPE_LITERAL__MEMBERS = eINSTANCE.getComplexTypeLiteral_Members();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.IntrinsicTypeImpl <em>Intrinsic Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.IntrinsicTypeImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getIntrinsicType()
     * @generated
     */
    EClass INTRINSIC_TYPE = eINSTANCE.getIntrinsicType();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTRINSIC_TYPE__ID = eINSTANCE.getIntrinsicType_Id();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.StringTypeImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.BooleanTypeImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getBooleanType()
     * @generated
     */
    EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.NumericTypeImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getNumericType()
     * @generated
     */
    EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.IntegerTypeImpl <em>Integer Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.IntegerTypeImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getIntegerType()
     * @generated
     */
    EClass INTEGER_TYPE = eINSTANCE.getIntegerType();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.LongTypeImpl <em>Long Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.LongTypeImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getLongType()
     * @generated
     */
    EClass LONG_TYPE = eINSTANCE.getLongType();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.DoubleTypeImpl <em>Double Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.DoubleTypeImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getDoubleType()
     * @generated
     */
    EClass DOUBLE_TYPE = eINSTANCE.getDoubleType();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.BooleanLiteralImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__LITERAL = eINSTANCE.getBooleanLiteral_Literal();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.StringLiteralImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__LITERAL = eINSTANCE.getStringLiteral_Literal();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.impl.NumericLiteralImpl <em>Numeric Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.impl.NumericLiteralImpl
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getNumericLiteral()
     * @generated
     */
    EClass NUMERIC_LITERAL = eINSTANCE.getNumericLiteral();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_LITERAL__LITERAL = eINSTANCE.getNumericLiteral_Literal();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.HttpMethodType <em>Http Method Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.HttpMethodType
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getHttpMethodType()
     * @generated
     */
    EEnum HTTP_METHOD_TYPE = eINSTANCE.getHttpMethodType();

    /**
     * The meta object literal for the '{@link org.specapi.specapiLang.BooleanValue <em>Boolean Value</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.specapi.specapiLang.BooleanValue
     * @see org.specapi.specapiLang.impl.SpecapiLangPackageImpl#getBooleanValue()
     * @generated
     */
    EEnum BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

  }

} //SpecapiLangPackage
