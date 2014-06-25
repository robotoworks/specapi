/**
 */
package org.specapi.specapiLang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.specapi.specapiLang.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecapiLangFactoryImpl extends EFactoryImpl implements SpecapiLangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpecapiLangFactory init()
  {
    try
    {
      SpecapiLangFactory theSpecapiLangFactory = (SpecapiLangFactory)EPackage.Registry.INSTANCE.getEFactory(SpecapiLangPackage.eNS_URI);
      if (theSpecapiLangFactory != null)
      {
        return theSpecapiLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpecapiLangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecapiLangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SpecapiLangPackage.SPEC_API_DOCUMENT: return createSpecApiDocument();
      case SpecapiLangPackage.DECLARATION: return createDeclaration();
      case SpecapiLangPackage.API: return createApi();
      case SpecapiLangPackage.SERVICE_BLOCK: return createServiceBlock();
      case SpecapiLangPackage.HEADER_BLOCK: return createHeaderBlock();
      case SpecapiLangPackage.HTTP_METHOD: return createHttpMethod();
      case SpecapiLangPackage.HTTP_METHOD_BLOCK: return createHttpMethodBlock();
      case SpecapiLangPackage.PATH: return createPath();
      case SpecapiLangPackage.PARAMS_BLOCK: return createParamsBlock();
      case SpecapiLangPackage.LITERAL: return createLiteral();
      case SpecapiLangPackage.REQUEST_BLOCK: return createRequestBlock();
      case SpecapiLangPackage.RESPONSE_BLOCK: return createResponseBlock();
      case SpecapiLangPackage.BLOCK_TYPE: return createBlockType();
      case SpecapiLangPackage.MEMBER: return createMember();
      case SpecapiLangPackage.TYPE: return createType();
      case SpecapiLangPackage.ARRAY_TYPE: return createArrayType();
      case SpecapiLangPackage.USER_TYPE: return createUserType();
      case SpecapiLangPackage.USER_TYPE_DECLARATION: return createUserTypeDeclaration();
      case SpecapiLangPackage.COMPLEX_TYPE_DECLARATION: return createComplexTypeDeclaration();
      case SpecapiLangPackage.ENUM_TYPE_DECLARATION: return createEnumTypeDeclaration();
      case SpecapiLangPackage.ENUM_TYPE_LITERAL: return createEnumTypeLiteral();
      case SpecapiLangPackage.ENUM_MEMBER: return createEnumMember();
      case SpecapiLangPackage.COMPLEX_TYPE_LITERAL: return createComplexTypeLiteral();
      case SpecapiLangPackage.INTRINSIC_TYPE: return createIntrinsicType();
      case SpecapiLangPackage.STRING_TYPE: return createStringType();
      case SpecapiLangPackage.BOOLEAN_TYPE: return createBooleanType();
      case SpecapiLangPackage.NUMERIC_TYPE: return createNumericType();
      case SpecapiLangPackage.INTEGER_TYPE: return createIntegerType();
      case SpecapiLangPackage.LONG_TYPE: return createLongType();
      case SpecapiLangPackage.DOUBLE_TYPE: return createDoubleType();
      case SpecapiLangPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case SpecapiLangPackage.STRING_LITERAL: return createStringLiteral();
      case SpecapiLangPackage.NUMERIC_LITERAL: return createNumericLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SpecapiLangPackage.HTTP_METHOD_TYPE:
        return createHttpMethodTypeFromString(eDataType, initialValue);
      case SpecapiLangPackage.BOOLEAN_VALUE:
        return createBooleanValueFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SpecapiLangPackage.HTTP_METHOD_TYPE:
        return convertHttpMethodTypeToString(eDataType, instanceValue);
      case SpecapiLangPackage.BOOLEAN_VALUE:
        return convertBooleanValueToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecApiDocument createSpecApiDocument()
  {
    SpecApiDocumentImpl specApiDocument = new SpecApiDocumentImpl();
    return specApiDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Api createApi()
  {
    ApiImpl api = new ApiImpl();
    return api;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceBlock createServiceBlock()
  {
    ServiceBlockImpl serviceBlock = new ServiceBlockImpl();
    return serviceBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderBlock createHeaderBlock()
  {
    HeaderBlockImpl headerBlock = new HeaderBlockImpl();
    return headerBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpMethod createHttpMethod()
  {
    HttpMethodImpl httpMethod = new HttpMethodImpl();
    return httpMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpMethodBlock createHttpMethodBlock()
  {
    HttpMethodBlockImpl httpMethodBlock = new HttpMethodBlockImpl();
    return httpMethodBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Path createPath()
  {
    PathImpl path = new PathImpl();
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamsBlock createParamsBlock()
  {
    ParamsBlockImpl paramsBlock = new ParamsBlockImpl();
    return paramsBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequestBlock createRequestBlock()
  {
    RequestBlockImpl requestBlock = new RequestBlockImpl();
    return requestBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ResponseBlock createResponseBlock()
  {
    ResponseBlockImpl responseBlock = new ResponseBlockImpl();
    return responseBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockType createBlockType()
  {
    BlockTypeImpl blockType = new BlockTypeImpl();
    return blockType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Member createMember()
  {
    MemberImpl member = new MemberImpl();
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserType createUserType()
  {
    UserTypeImpl userType = new UserTypeImpl();
    return userType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserTypeDeclaration createUserTypeDeclaration()
  {
    UserTypeDeclarationImpl userTypeDeclaration = new UserTypeDeclarationImpl();
    return userTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexTypeDeclaration createComplexTypeDeclaration()
  {
    ComplexTypeDeclarationImpl complexTypeDeclaration = new ComplexTypeDeclarationImpl();
    return complexTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumTypeDeclaration createEnumTypeDeclaration()
  {
    EnumTypeDeclarationImpl enumTypeDeclaration = new EnumTypeDeclarationImpl();
    return enumTypeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumTypeLiteral createEnumTypeLiteral()
  {
    EnumTypeLiteralImpl enumTypeLiteral = new EnumTypeLiteralImpl();
    return enumTypeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumMember createEnumMember()
  {
    EnumMemberImpl enumMember = new EnumMemberImpl();
    return enumMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexTypeLiteral createComplexTypeLiteral()
  {
    ComplexTypeLiteralImpl complexTypeLiteral = new ComplexTypeLiteralImpl();
    return complexTypeLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntrinsicType createIntrinsicType()
  {
    IntrinsicTypeImpl intrinsicType = new IntrinsicTypeImpl();
    return intrinsicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanType createBooleanType()
  {
    BooleanTypeImpl booleanType = new BooleanTypeImpl();
    return booleanType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericType createNumericType()
  {
    NumericTypeImpl numericType = new NumericTypeImpl();
    return numericType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerType createIntegerType()
  {
    IntegerTypeImpl integerType = new IntegerTypeImpl();
    return integerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongType createLongType()
  {
    LongTypeImpl longType = new LongTypeImpl();
    return longType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleType createDoubleType()
  {
    DoubleTypeImpl doubleType = new DoubleTypeImpl();
    return doubleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericLiteral createNumericLiteral()
  {
    NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
    return numericLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpMethodType createHttpMethodTypeFromString(EDataType eDataType, String initialValue)
  {
    HttpMethodType result = HttpMethodType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHttpMethodTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanValue createBooleanValueFromString(EDataType eDataType, String initialValue)
  {
    BooleanValue result = BooleanValue.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanValueToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecapiLangPackage getSpecapiLangPackage()
  {
    return (SpecapiLangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpecapiLangPackage getPackage()
  {
    return SpecapiLangPackage.eINSTANCE;
  }

} //SpecapiLangFactoryImpl
