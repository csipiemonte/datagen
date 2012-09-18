/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.datatypes.impl;

import it.csi.mddtools.rdbmdl.RdbmdlPackage;

import it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage;

import it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl;

import it.csi.mddtools.rdbmdl.datatypes.DataType;
import it.csi.mddtools.rdbmdl.datatypes.DatatypesFactory;
import it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage;
import it.csi.mddtools.rdbmdl.datatypes.Domain;
import it.csi.mddtools.rdbmdl.datatypes.PrimitiveDataType;

import it.csi.mddtools.rdbmdl.datatypes.PrimitiveTypeCodes;
import it.csi.mddtools.rdbmdl.impl.RdbmdlPackageImpl;

import it.csi.mddtools.rdbmdl.view.ViewPackage;

import it.csi.mddtools.rdbmdl.view.impl.ViewPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatatypesPackageImpl extends EPackageImpl implements DatatypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeCodesEEnum = null;

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
	 * @see it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesPackageImpl() {
		super(eNS_URI, DatatypesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatatypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypesPackage init() {
		if (isInited) return (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatatypesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		RdbmdlPackageImpl theRdbmdlPackage = (RdbmdlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RdbmdlPackage.eNS_URI) instanceof RdbmdlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RdbmdlPackage.eNS_URI) : RdbmdlPackage.eINSTANCE);
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) instanceof ConstraintsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI) : ConstraintsPackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);

		// Create package meta-data objects
		theDatatypesPackage.createPackageContents();
		theRdbmdlPackage.createPackageContents();
		theConstraintsPackage.createPackageContents();
		theViewPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypesPackage.initializePackageContents();
		theRdbmdlPackage.initializePackageContents();
		theConstraintsPackage.initializePackageContents();
		theViewPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatatypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesPackage.eNS_URI, theDatatypesPackage);
		return theDatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomain_ParentDomain() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Size() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_DecimalDigits() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Nullable() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Default() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Check() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Var() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDataType() {
		return primitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveDataType_Type() {
		return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimitiveTypeCodes() {
		return primitiveTypeCodesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesFactory getDatatypesFactory() {
		return (DatatypesFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__PARENT_DOMAIN);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__SIZE);
		createEAttribute(dataTypeEClass, DATA_TYPE__DECIMAL_DIGITS);
		createEAttribute(dataTypeEClass, DATA_TYPE__NULLABLE);
		createEAttribute(dataTypeEClass, DATA_TYPE__DEFAULT);
		createEAttribute(dataTypeEClass, DATA_TYPE__CHECK);
		createEAttribute(dataTypeEClass, DATA_TYPE__VAR);

		primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);
		createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__TYPE);

		// Create enums
		primitiveTypeCodesEEnum = createEEnum(PRIMITIVE_TYPE_CODES);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RdbmdlPackage theRdbmdlPackage = (RdbmdlPackage)EPackage.Registry.INSTANCE.getEPackage(RdbmdlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		domainEClass.getESuperTypes().add(theRdbmdlPackage.getSchemaElement());
		domainEClass.getESuperTypes().add(this.getPrimitiveDataType());
		dataTypeEClass.getESuperTypes().add(theRdbmdlPackage.getNamedElement());
		primitiveDataTypeEClass.getESuperTypes().add(this.getDataType());

		// Initialize classes and features; add operations and parameters
		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_ParentDomain(), this.getDomain(), null, "parentDomain", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Size(), ecorePackage.getEInt(), "size", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_DecimalDigits(), ecorePackage.getEInt(), "decimalDigits", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Default(), ecorePackage.getEString(), "default", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Check(), ecorePackage.getEString(), "check", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Var(), ecorePackage.getEString(), "var", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveDataType_Type(), this.getPrimitiveTypeCodes(), "type", null, 0, 1, PrimitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(primitiveTypeCodesEEnum, PrimitiveTypeCodes.class, "PrimitiveTypeCodes");
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.ARRAY);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.BIGINT);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.BINARY);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.BIT);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.BLOB);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.BOOLEAN);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.CHAR);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.CLOB);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.DATALINK);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.DATE);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.DECIMAL);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.DISTINCT);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.DOUBLE);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.FLOAT);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.INTEGER);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.JAVA_OBJECT);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.LONGNVARCHAR);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.LONGVARBINARY);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.LONGVARCHAR);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.NCHAR);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.NCLOB);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.NULL);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.NUMERIC);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.NVARCHAR);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.OTHER);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.REAL);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.REF);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.ROWID);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.SMALLINT);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.SQLXML);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.STRUCT);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.TIME);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.TIMESTAMP);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.TINYINT);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.VARBINARY);
		addEEnumLiteral(primitiveTypeCodesEEnum, PrimitiveTypeCodes.VARCHAR);
	}

} //DatatypesPackageImpl
