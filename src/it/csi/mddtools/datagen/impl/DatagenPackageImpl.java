/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.DBAccessModel;
import it.csi.mddtools.datagen.DaoPackage;
import it.csi.mddtools.datagen.DataAccessObject;
import it.csi.mddtools.datagen.DatagenFactory;
import it.csi.mddtools.datagen.DatagenPackage;

import it.csi.mddtools.datagen.PKGenerator;
import it.csi.mddtools.datagen.SequencePKGenerator;
import it.csi.mddtools.rdbmdl.RdbmdlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatagenPackageImpl extends EPackageImpl implements DatagenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbAccessModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAccessObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pkGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequencePKGeneratorEClass = null;

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
	 * @see it.csi.mddtools.datagen.DatagenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatagenPackageImpl() {
		super(eNS_URI, DatagenFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatagenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatagenPackage init() {
		if (isInited) return (DatagenPackage)EPackage.Registry.INSTANCE.getEPackage(DatagenPackage.eNS_URI);

		// Obtain or create and register package
		DatagenPackageImpl theDatagenPackage = (DatagenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatagenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DatagenPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RdbmdlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDatagenPackage.createPackageContents();

		// Initialize created meta-data
		theDatagenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatagenPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatagenPackage.eNS_URI, theDatagenPackage);
		return theDatagenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBAccessModel() {
		return dbAccessModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBAccessModel_Schema() {
		return (EReference)dbAccessModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDBAccessModel_Daopkgs() {
		return (EReference)dbAccessModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBAccessModel_CodProdotto() {
		return (EAttribute)dbAccessModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBAccessModel_CodComponente() {
		return (EAttribute)dbAccessModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAccessObject() {
		return dataAccessObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAccessObject_Name() {
		return (EAttribute)dataAccessObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAccessObject_MainTable() {
		return (EReference)dataAccessObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAccessObject_PkGenerator() {
		return (EReference)dataAccessObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaoPackage() {
		return daoPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaoPackage_Name() {
		return (EAttribute)daoPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaoPackage_Dao() {
		return (EReference)daoPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPKGenerator() {
		return pkGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequencePKGenerator() {
		return sequencePKGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequencePKGenerator_SequenceName() {
		return (EAttribute)sequencePKGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagenFactory getDatagenFactory() {
		return (DatagenFactory)getEFactoryInstance();
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
		dbAccessModelEClass = createEClass(DB_ACCESS_MODEL);
		createEReference(dbAccessModelEClass, DB_ACCESS_MODEL__SCHEMA);
		createEReference(dbAccessModelEClass, DB_ACCESS_MODEL__DAOPKGS);
		createEAttribute(dbAccessModelEClass, DB_ACCESS_MODEL__COD_PRODOTTO);
		createEAttribute(dbAccessModelEClass, DB_ACCESS_MODEL__COD_COMPONENTE);

		dataAccessObjectEClass = createEClass(DATA_ACCESS_OBJECT);
		createEAttribute(dataAccessObjectEClass, DATA_ACCESS_OBJECT__NAME);
		createEReference(dataAccessObjectEClass, DATA_ACCESS_OBJECT__MAIN_TABLE);
		createEReference(dataAccessObjectEClass, DATA_ACCESS_OBJECT__PK_GENERATOR);

		daoPackageEClass = createEClass(DAO_PACKAGE);
		createEAttribute(daoPackageEClass, DAO_PACKAGE__NAME);
		createEReference(daoPackageEClass, DAO_PACKAGE__DAO);

		pkGeneratorEClass = createEClass(PK_GENERATOR);

		sequencePKGeneratorEClass = createEClass(SEQUENCE_PK_GENERATOR);
		createEAttribute(sequencePKGeneratorEClass, SEQUENCE_PK_GENERATOR__SEQUENCE_NAME);
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
		sequencePKGeneratorEClass.getESuperTypes().add(this.getPKGenerator());

		// Initialize classes and features; add operations and parameters
		initEClass(dbAccessModelEClass, DBAccessModel.class, "DBAccessModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDBAccessModel_Schema(), theRdbmdlPackage.getSchema(), null, "schema", null, 1, 1, DBAccessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDBAccessModel_Daopkgs(), this.getDaoPackage(), null, "daopkgs", null, 0, -1, DBAccessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBAccessModel_CodProdotto(), ecorePackage.getEString(), "codProdotto", null, 0, 1, DBAccessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDBAccessModel_CodComponente(), ecorePackage.getEString(), "codComponente", null, 0, 1, DBAccessModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataAccessObjectEClass, DataAccessObject.class, "DataAccessObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataAccessObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataAccessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAccessObject_MainTable(), theRdbmdlPackage.getTable(), null, "mainTable", null, 0, 1, DataAccessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAccessObject_PkGenerator(), this.getPKGenerator(), null, "pkGenerator", null, 0, 1, DataAccessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daoPackageEClass, DaoPackage.class, "DaoPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaoPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, DaoPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDaoPackage_Dao(), this.getDataAccessObject(), null, "dao", null, 0, -1, DaoPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pkGeneratorEClass, PKGenerator.class, "PKGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequencePKGeneratorEClass, SequencePKGenerator.class, "SequencePKGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequencePKGenerator_SequenceName(), ecorePackage.getEString(), "sequenceName", null, 1, 1, SequencePKGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DatagenPackageImpl
