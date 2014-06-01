/**
 */
package org.specapi.specapiLang.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.specapi.specapiLang.Api;
import org.specapi.specapiLang.ArrayType;
import org.specapi.specapiLang.BlockType;
import org.specapi.specapiLang.BodyBlock;
import org.specapi.specapiLang.BooleanLiteral;
import org.specapi.specapiLang.BooleanType;
import org.specapi.specapiLang.BooleanValue;
import org.specapi.specapiLang.ComplexTypeDeclaration;
import org.specapi.specapiLang.ComplexTypeLiteral;
import org.specapi.specapiLang.Declaration;
import org.specapi.specapiLang.DoubleType;
import org.specapi.specapiLang.EnumMember;
import org.specapi.specapiLang.EnumTypeDeclaration;
import org.specapi.specapiLang.EnumTypeLiteral;
import org.specapi.specapiLang.HeaderBlock;
import org.specapi.specapiLang.HttpMethod;
import org.specapi.specapiLang.HttpMethodBlock;
import org.specapi.specapiLang.HttpMethodType;
import org.specapi.specapiLang.IntegerType;
import org.specapi.specapiLang.IntrinsicType;
import org.specapi.specapiLang.Literal;
import org.specapi.specapiLang.LongType;
import org.specapi.specapiLang.Member;
import org.specapi.specapiLang.NumericLiteral;
import org.specapi.specapiLang.NumericType;
import org.specapi.specapiLang.ParamsBlock;
import org.specapi.specapiLang.Path;
import org.specapi.specapiLang.ResponseBlock;
import org.specapi.specapiLang.ServiceBlock;
import org.specapi.specapiLang.SpecApiDocument;
import org.specapi.specapiLang.SpecapiLangFactory;
import org.specapi.specapiLang.SpecapiLangPackage;
import org.specapi.specapiLang.StringLiteral;
import org.specapi.specapiLang.StringType;
import org.specapi.specapiLang.Type;
import org.specapi.specapiLang.UserType;
import org.specapi.specapiLang.UserTypeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecapiLangPackageImpl extends EPackageImpl implements SpecapiLangPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specApiDocumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass apiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass headerBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpMethodBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramsBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bodyBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass responseBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumTypeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexTypeLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intrinsicTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass longTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numericLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum httpMethodTypeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanValueEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.specapi.specapiLang.SpecapiLangPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SpecapiLangPackageImpl()
  {
    super(eNS_URI, SpecapiLangFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SpecapiLangPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SpecapiLangPackage init()
  {
    if (isInited) return (SpecapiLangPackage)EPackage.Registry.INSTANCE.getEPackage(SpecapiLangPackage.eNS_URI);

    // Obtain or create and register package
    SpecapiLangPackageImpl theSpecapiLangPackage = (SpecapiLangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpecapiLangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpecapiLangPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSpecapiLangPackage.createPackageContents();

    // Initialize created meta-data
    theSpecapiLangPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSpecapiLangPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SpecapiLangPackage.eNS_URI, theSpecapiLangPackage);
    return theSpecapiLangPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecApiDocument()
  {
    return specApiDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecApiDocument_PackageName()
  {
    return (EAttribute)specApiDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecApiDocument_Declarations()
  {
    return (EReference)specApiDocumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaration_Name()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApi()
  {
    return apiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApi_BaseUrl()
  {
    return (EAttribute)apiEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getApi_Blocks()
  {
    return (EReference)apiEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceBlock()
  {
    return serviceBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHeaderBlock()
  {
    return headerBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHeaderBlock_Headers()
  {
    return (EReference)headerBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpMethod()
  {
    return httpMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpMethod_Type()
  {
    return (EAttribute)httpMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpMethod_Name()
  {
    return (EAttribute)httpMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpMethod_Path()
  {
    return (EReference)httpMethodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHttpMethod_Blocks()
  {
    return (EReference)httpMethodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpMethodBlock()
  {
    return httpMethodBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPath()
  {
    return pathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPath_Params()
  {
    return (EReference)pathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamsBlock()
  {
    return paramsBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParamsBlock_Params()
  {
    return (EReference)paramsBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBodyBlock()
  {
    return bodyBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBodyBlock_Type()
  {
    return (EReference)bodyBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResponseBlock()
  {
    return responseBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getResponseBlock_Code()
  {
    return (EAttribute)responseBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResponseBlock_SuperType()
  {
    return (EReference)responseBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getResponseBlock_Type()
  {
    return (EReference)responseBlockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlockType()
  {
    return blockTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMember()
  {
    return memberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMember_Name()
  {
    return (EAttribute)memberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMember_Type()
  {
    return (EReference)memberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMember_DefaultValue()
  {
    return (EReference)memberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayType()
  {
    return arrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayType_ElementType()
  {
    return (EReference)arrayTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArrayType_Id()
  {
    return (EAttribute)arrayTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUserType()
  {
    return userTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserType_Declaration()
  {
    return (EReference)userTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUserTypeDeclaration()
  {
    return userTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUserTypeDeclaration_Keyword()
  {
    return (EAttribute)userTypeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexTypeDeclaration()
  {
    return complexTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexTypeDeclaration_Literal()
  {
    return (EReference)complexTypeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumTypeDeclaration()
  {
    return enumTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumTypeDeclaration_SuperType()
  {
    return (EReference)enumTypeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumTypeDeclaration_Literal()
  {
    return (EReference)enumTypeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumTypeLiteral()
  {
    return enumTypeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumTypeLiteral_Members()
  {
    return (EReference)enumTypeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumMember()
  {
    return enumMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumMember_Name()
  {
    return (EAttribute)enumMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumMember_Assignment()
  {
    return (EAttribute)enumMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumMember_Value()
  {
    return (EAttribute)enumMemberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexTypeLiteral()
  {
    return complexTypeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComplexTypeLiteral_Members()
  {
    return (EReference)complexTypeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntrinsicType()
  {
    return intrinsicTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntrinsicType_Id()
  {
    return (EAttribute)intrinsicTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringType()
  {
    return stringTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanType()
  {
    return booleanTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericType()
  {
    return numericTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerType()
  {
    return integerTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLongType()
  {
    return longTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleType()
  {
    return doubleTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteral()
  {
    return booleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteral_Literal()
  {
    return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Literal()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumericLiteral()
  {
    return numericLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumericLiteral_Literal()
  {
    return (EAttribute)numericLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getHttpMethodType()
  {
    return httpMethodTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBooleanValue()
  {
    return booleanValueEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpecapiLangFactory getSpecapiLangFactory()
  {
    return (SpecapiLangFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    specApiDocumentEClass = createEClass(SPEC_API_DOCUMENT);
    createEAttribute(specApiDocumentEClass, SPEC_API_DOCUMENT__PACKAGE_NAME);
    createEReference(specApiDocumentEClass, SPEC_API_DOCUMENT__DECLARATIONS);

    declarationEClass = createEClass(DECLARATION);
    createEAttribute(declarationEClass, DECLARATION__NAME);

    apiEClass = createEClass(API);
    createEAttribute(apiEClass, API__BASE_URL);
    createEReference(apiEClass, API__BLOCKS);

    serviceBlockEClass = createEClass(SERVICE_BLOCK);

    headerBlockEClass = createEClass(HEADER_BLOCK);
    createEReference(headerBlockEClass, HEADER_BLOCK__HEADERS);

    httpMethodEClass = createEClass(HTTP_METHOD);
    createEAttribute(httpMethodEClass, HTTP_METHOD__TYPE);
    createEAttribute(httpMethodEClass, HTTP_METHOD__NAME);
    createEReference(httpMethodEClass, HTTP_METHOD__PATH);
    createEReference(httpMethodEClass, HTTP_METHOD__BLOCKS);

    httpMethodBlockEClass = createEClass(HTTP_METHOD_BLOCK);

    pathEClass = createEClass(PATH);
    createEReference(pathEClass, PATH__PARAMS);

    paramsBlockEClass = createEClass(PARAMS_BLOCK);
    createEReference(paramsBlockEClass, PARAMS_BLOCK__PARAMS);

    literalEClass = createEClass(LITERAL);

    bodyBlockEClass = createEClass(BODY_BLOCK);
    createEReference(bodyBlockEClass, BODY_BLOCK__TYPE);

    responseBlockEClass = createEClass(RESPONSE_BLOCK);
    createEAttribute(responseBlockEClass, RESPONSE_BLOCK__CODE);
    createEReference(responseBlockEClass, RESPONSE_BLOCK__SUPER_TYPE);
    createEReference(responseBlockEClass, RESPONSE_BLOCK__TYPE);

    blockTypeEClass = createEClass(BLOCK_TYPE);

    memberEClass = createEClass(MEMBER);
    createEAttribute(memberEClass, MEMBER__NAME);
    createEReference(memberEClass, MEMBER__TYPE);
    createEReference(memberEClass, MEMBER__DEFAULT_VALUE);

    typeEClass = createEClass(TYPE);

    arrayTypeEClass = createEClass(ARRAY_TYPE);
    createEReference(arrayTypeEClass, ARRAY_TYPE__ELEMENT_TYPE);
    createEAttribute(arrayTypeEClass, ARRAY_TYPE__ID);

    userTypeEClass = createEClass(USER_TYPE);
    createEReference(userTypeEClass, USER_TYPE__DECLARATION);

    userTypeDeclarationEClass = createEClass(USER_TYPE_DECLARATION);
    createEAttribute(userTypeDeclarationEClass, USER_TYPE_DECLARATION__KEYWORD);

    complexTypeDeclarationEClass = createEClass(COMPLEX_TYPE_DECLARATION);
    createEReference(complexTypeDeclarationEClass, COMPLEX_TYPE_DECLARATION__LITERAL);

    enumTypeDeclarationEClass = createEClass(ENUM_TYPE_DECLARATION);
    createEReference(enumTypeDeclarationEClass, ENUM_TYPE_DECLARATION__SUPER_TYPE);
    createEReference(enumTypeDeclarationEClass, ENUM_TYPE_DECLARATION__LITERAL);

    enumTypeLiteralEClass = createEClass(ENUM_TYPE_LITERAL);
    createEReference(enumTypeLiteralEClass, ENUM_TYPE_LITERAL__MEMBERS);

    enumMemberEClass = createEClass(ENUM_MEMBER);
    createEAttribute(enumMemberEClass, ENUM_MEMBER__NAME);
    createEAttribute(enumMemberEClass, ENUM_MEMBER__ASSIGNMENT);
    createEAttribute(enumMemberEClass, ENUM_MEMBER__VALUE);

    complexTypeLiteralEClass = createEClass(COMPLEX_TYPE_LITERAL);
    createEReference(complexTypeLiteralEClass, COMPLEX_TYPE_LITERAL__MEMBERS);

    intrinsicTypeEClass = createEClass(INTRINSIC_TYPE);
    createEAttribute(intrinsicTypeEClass, INTRINSIC_TYPE__ID);

    stringTypeEClass = createEClass(STRING_TYPE);

    booleanTypeEClass = createEClass(BOOLEAN_TYPE);

    numericTypeEClass = createEClass(NUMERIC_TYPE);

    integerTypeEClass = createEClass(INTEGER_TYPE);

    longTypeEClass = createEClass(LONG_TYPE);

    doubleTypeEClass = createEClass(DOUBLE_TYPE);

    booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
    createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__LITERAL);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__LITERAL);

    numericLiteralEClass = createEClass(NUMERIC_LITERAL);
    createEAttribute(numericLiteralEClass, NUMERIC_LITERAL__LITERAL);

    // Create enums
    httpMethodTypeEEnum = createEEnum(HTTP_METHOD_TYPE);
    booleanValueEEnum = createEEnum(BOOLEAN_VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    apiEClass.getESuperTypes().add(this.getDeclaration());
    headerBlockEClass.getESuperTypes().add(this.getServiceBlock());
    headerBlockEClass.getESuperTypes().add(this.getHttpMethodBlock());
    httpMethodEClass.getESuperTypes().add(this.getServiceBlock());
    paramsBlockEClass.getESuperTypes().add(this.getServiceBlock());
    paramsBlockEClass.getESuperTypes().add(this.getHttpMethodBlock());
    bodyBlockEClass.getESuperTypes().add(this.getHttpMethodBlock());
    responseBlockEClass.getESuperTypes().add(this.getHttpMethodBlock());
    typeEClass.getESuperTypes().add(this.getBlockType());
    arrayTypeEClass.getESuperTypes().add(this.getType());
    userTypeEClass.getESuperTypes().add(this.getType());
    userTypeDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    complexTypeDeclarationEClass.getESuperTypes().add(this.getUserTypeDeclaration());
    enumTypeDeclarationEClass.getESuperTypes().add(this.getUserTypeDeclaration());
    complexTypeLiteralEClass.getESuperTypes().add(this.getBlockType());
    intrinsicTypeEClass.getESuperTypes().add(this.getType());
    stringTypeEClass.getESuperTypes().add(this.getIntrinsicType());
    booleanTypeEClass.getESuperTypes().add(this.getIntrinsicType());
    numericTypeEClass.getESuperTypes().add(this.getIntrinsicType());
    integerTypeEClass.getESuperTypes().add(this.getNumericType());
    longTypeEClass.getESuperTypes().add(this.getNumericType());
    doubleTypeEClass.getESuperTypes().add(this.getNumericType());
    booleanLiteralEClass.getESuperTypes().add(this.getLiteral());
    stringLiteralEClass.getESuperTypes().add(this.getLiteral());
    numericLiteralEClass.getESuperTypes().add(this.getLiteral());

    // Initialize classes and features; add operations and parameters
    initEClass(specApiDocumentEClass, SpecApiDocument.class, "SpecApiDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpecApiDocument_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, SpecApiDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecApiDocument_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, SpecApiDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(apiEClass, Api.class, "Api", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApi_BaseUrl(), ecorePackage.getEString(), "baseUrl", null, 0, 1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getApi_Blocks(), this.getServiceBlock(), null, "blocks", null, 0, -1, Api.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceBlockEClass, ServiceBlock.class, "ServiceBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(headerBlockEClass, HeaderBlock.class, "HeaderBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHeaderBlock_Headers(), this.getMember(), null, "headers", null, 0, -1, HeaderBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpMethodEClass, HttpMethod.class, "HttpMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHttpMethod_Type(), this.getHttpMethodType(), "type", null, 0, 1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHttpMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpMethod_Path(), this.getPath(), null, "path", null, 0, 1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHttpMethod_Blocks(), this.getHttpMethodBlock(), null, "blocks", null, 0, -1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpMethodBlockEClass, HttpMethodBlock.class, "HttpMethodBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPath_Params(), this.getMember(), null, "params", null, 0, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramsBlockEClass, ParamsBlock.class, "ParamsBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParamsBlock_Params(), this.getMember(), null, "params", null, 0, -1, ParamsBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bodyBlockEClass, BodyBlock.class, "BodyBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBodyBlock_Type(), this.getBlockType(), null, "type", null, 0, 1, BodyBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(responseBlockEClass, ResponseBlock.class, "ResponseBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResponseBlock_Code(), ecorePackage.getEInt(), "code", null, 0, 1, ResponseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResponseBlock_SuperType(), this.getComplexTypeDeclaration(), null, "superType", null, 0, 1, ResponseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getResponseBlock_Type(), this.getBlockType(), null, "type", null, 0, 1, ResponseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockTypeEClass, BlockType.class, "BlockType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMember_Type(), this.getType(), null, "type", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMember_DefaultValue(), this.getLiteral(), null, "defaultValue", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayType_ElementType(), this.getType(), null, "elementType", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArrayType_Id(), ecorePackage.getEString(), "id", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userTypeEClass, UserType.class, "UserType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUserType_Declaration(), this.getUserTypeDeclaration(), null, "declaration", null, 0, 1, UserType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userTypeDeclarationEClass, UserTypeDeclaration.class, "UserTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUserTypeDeclaration_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, UserTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexTypeDeclarationEClass, ComplexTypeDeclaration.class, "ComplexTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexTypeDeclaration_Literal(), this.getComplexTypeLiteral(), null, "literal", null, 0, 1, ComplexTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumTypeDeclarationEClass, EnumTypeDeclaration.class, "EnumTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumTypeDeclaration_SuperType(), this.getIntegerType(), null, "superType", null, 0, 1, EnumTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumTypeDeclaration_Literal(), this.getEnumTypeLiteral(), null, "literal", null, 0, 1, EnumTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumTypeLiteralEClass, EnumTypeLiteral.class, "EnumTypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumTypeLiteral_Members(), this.getEnumMember(), null, "members", null, 0, -1, EnumTypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumMemberEClass, EnumMember.class, "EnumMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumMember_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumMember_Assignment(), ecorePackage.getEBoolean(), "assignment", null, 0, 1, EnumMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumMember_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, EnumMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexTypeLiteralEClass, ComplexTypeLiteral.class, "ComplexTypeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComplexTypeLiteral_Members(), this.getMember(), null, "members", null, 0, -1, ComplexTypeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intrinsicTypeEClass, IntrinsicType.class, "IntrinsicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntrinsicType_Id(), ecorePackage.getEString(), "id", null, 0, 1, IntrinsicType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numericTypeEClass, NumericType.class, "NumericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerTypeEClass, IntegerType.class, "IntegerType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(longTypeEClass, LongType.class, "LongType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(doubleTypeEClass, DoubleType.class, "DoubleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanLiteral_Literal(), this.getBooleanValue(), "literal", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numericLiteralEClass, NumericLiteral.class, "NumericLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumericLiteral_Literal(), ecorePackage.getEBigDecimal(), "literal", null, 0, 1, NumericLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(httpMethodTypeEEnum, HttpMethodType.class, "HttpMethodType");
    addEEnumLiteral(httpMethodTypeEEnum, HttpMethodType.GET);
    addEEnumLiteral(httpMethodTypeEEnum, HttpMethodType.PUT);
    addEEnumLiteral(httpMethodTypeEEnum, HttpMethodType.POST);
    addEEnumLiteral(httpMethodTypeEEnum, HttpMethodType.DELETE);
    addEEnumLiteral(httpMethodTypeEEnum, HttpMethodType.PATCH);

    initEEnum(booleanValueEEnum, BooleanValue.class, "BooleanValue");
    addEEnumLiteral(booleanValueEEnum, BooleanValue.TRUE);
    addEEnumLiteral(booleanValueEEnum, BooleanValue.FALSE);

    // Create resource
    createResource(eNS_URI);
  }

} //SpecapiLangPackageImpl
