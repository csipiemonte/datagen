/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.CustomDeleter;
import it.csi.mddtools.datagen.CustomFinder;
import it.csi.mddtools.datagen.CustomUpdater;
import it.csi.mddtools.datagen.DBAccessModel;
import it.csi.mddtools.datagen.DBCommand;
import it.csi.mddtools.datagen.DaoPackage;
import it.csi.mddtools.datagen.DataAccessObject;
import it.csi.mddtools.datagen.DatagenFactory;
import it.csi.mddtools.datagen.DatagenPackage;

import it.csi.mddtools.datagen.DeleteByPK;
import it.csi.mddtools.datagen.Deleter;
import it.csi.mddtools.datagen.Deleters;
import it.csi.mddtools.datagen.FindAll;
import it.csi.mddtools.datagen.FindByPK;
import it.csi.mddtools.datagen.Finder;
import it.csi.mddtools.datagen.Finders;
import it.csi.mddtools.datagen.Inserter;
import it.csi.mddtools.datagen.MultiResFinder;
import it.csi.mddtools.datagen.OrderSpec;
import it.csi.mddtools.datagen.OrderSpecs;
import it.csi.mddtools.datagen.PKGenerator;
import it.csi.mddtools.datagen.QBEFinder;
import it.csi.mddtools.datagen.SequencePKGenerator;
import it.csi.mddtools.datagen.SingleResFinder;
import it.csi.mddtools.datagen.UpdateColumns;
import it.csi.mddtools.datagen.UpdateRow;
import it.csi.mddtools.datagen.Updater;
import it.csi.mddtools.datagen.Updaters;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbCommandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inserterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleResFinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiResFinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderSpecsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findByPKEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findAllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qbeFinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customFinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updatersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateColumnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteByPKEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customUpdaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customDeleterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass findersEClass = null;

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
	public EReference getDataAccessObject_Inserter() {
		return (EReference)dataAccessObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAccessObject_Finders() {
		return (EReference)dataAccessObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAccessObject_Updaters() {
		return (EReference)dataAccessObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAccessObject_Deleters() {
		return (EReference)dataAccessObjectEClass.getEStructuralFeatures().get(6);
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
	public EClass getDBCommand() {
		return dbCommandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDBCommand_Name() {
		return (EAttribute)dbCommandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInserter() {
		return inserterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinder() {
		return finderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleResFinder() {
		return singleResFinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiResFinder() {
		return multiResFinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiResFinder_Distinct() {
		return (EReference)multiResFinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiResFinder_OrderSpecs() {
		return (EReference)multiResFinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderSpec() {
		return orderSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderSpec_Column() {
		return (EReference)orderSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderSpec_Ascending() {
		return (EAttribute)orderSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderSpecs() {
		return orderSpecsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderSpecs_Specs() {
		return (EReference)orderSpecsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindByPK() {
		return findByPKEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFindAll() {
		return findAllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQBEFinder() {
		return qbeFinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomFinder() {
		return customFinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomFinder_FilterClassFQN() {
		return (EAttribute)customFinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomFinder_CustomSelect() {
		return (EAttribute)customFinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomFinder_CustomFrom() {
		return (EAttribute)customFinderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdaters() {
		return updatersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdaters_Updaters() {
		return (EReference)updatersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdater() {
		return updaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateRow() {
		return updateRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateColumns() {
		return updateColumnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateColumns_Columns() {
		return (EReference)updateColumnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleters() {
		return deletersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleters_Deleters() {
		return (EReference)deletersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleter() {
		return deleterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteByPK() {
		return deleteByPKEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomUpdater() {
		return customUpdaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomUpdater_FilterClassFQN() {
		return (EAttribute)customUpdaterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomUpdater_ValueClassFQN() {
		return (EAttribute)customUpdaterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomDeleter() {
		return customDeleterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomDeleter_FilterClassFQN() {
		return (EAttribute)customDeleterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinders() {
		return findersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinders_Finders() {
		return (EReference)findersEClass.getEStructuralFeatures().get(0);
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
		createEReference(dataAccessObjectEClass, DATA_ACCESS_OBJECT__INSERTER);
		createEReference(dataAccessObjectEClass, DATA_ACCESS_OBJECT__FINDERS);
		createEReference(dataAccessObjectEClass, DATA_ACCESS_OBJECT__UPDATERS);
		createEReference(dataAccessObjectEClass, DATA_ACCESS_OBJECT__DELETERS);

		daoPackageEClass = createEClass(DAO_PACKAGE);
		createEAttribute(daoPackageEClass, DAO_PACKAGE__NAME);
		createEReference(daoPackageEClass, DAO_PACKAGE__DAO);

		pkGeneratorEClass = createEClass(PK_GENERATOR);

		sequencePKGeneratorEClass = createEClass(SEQUENCE_PK_GENERATOR);
		createEAttribute(sequencePKGeneratorEClass, SEQUENCE_PK_GENERATOR__SEQUENCE_NAME);

		dbCommandEClass = createEClass(DB_COMMAND);
		createEAttribute(dbCommandEClass, DB_COMMAND__NAME);

		inserterEClass = createEClass(INSERTER);

		findersEClass = createEClass(FINDERS);
		createEReference(findersEClass, FINDERS__FINDERS);

		finderEClass = createEClass(FINDER);

		singleResFinderEClass = createEClass(SINGLE_RES_FINDER);

		multiResFinderEClass = createEClass(MULTI_RES_FINDER);
		createEReference(multiResFinderEClass, MULTI_RES_FINDER__DISTINCT);
		createEReference(multiResFinderEClass, MULTI_RES_FINDER__ORDER_SPECS);

		orderSpecEClass = createEClass(ORDER_SPEC);
		createEReference(orderSpecEClass, ORDER_SPEC__COLUMN);
		createEAttribute(orderSpecEClass, ORDER_SPEC__ASCENDING);

		orderSpecsEClass = createEClass(ORDER_SPECS);
		createEReference(orderSpecsEClass, ORDER_SPECS__SPECS);

		findByPKEClass = createEClass(FIND_BY_PK);

		findAllEClass = createEClass(FIND_ALL);

		qbeFinderEClass = createEClass(QBE_FINDER);

		customFinderEClass = createEClass(CUSTOM_FINDER);
		createEAttribute(customFinderEClass, CUSTOM_FINDER__FILTER_CLASS_FQN);
		createEAttribute(customFinderEClass, CUSTOM_FINDER__CUSTOM_SELECT);
		createEAttribute(customFinderEClass, CUSTOM_FINDER__CUSTOM_FROM);

		updatersEClass = createEClass(UPDATERS);
		createEReference(updatersEClass, UPDATERS__UPDATERS);

		updaterEClass = createEClass(UPDATER);

		updateRowEClass = createEClass(UPDATE_ROW);

		updateColumnsEClass = createEClass(UPDATE_COLUMNS);
		createEReference(updateColumnsEClass, UPDATE_COLUMNS__COLUMNS);

		deletersEClass = createEClass(DELETERS);
		createEReference(deletersEClass, DELETERS__DELETERS);

		deleterEClass = createEClass(DELETER);

		deleteByPKEClass = createEClass(DELETE_BY_PK);

		customUpdaterEClass = createEClass(CUSTOM_UPDATER);
		createEAttribute(customUpdaterEClass, CUSTOM_UPDATER__FILTER_CLASS_FQN);
		createEAttribute(customUpdaterEClass, CUSTOM_UPDATER__VALUE_CLASS_FQN);

		customDeleterEClass = createEClass(CUSTOM_DELETER);
		createEAttribute(customDeleterEClass, CUSTOM_DELETER__FILTER_CLASS_FQN);
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
		inserterEClass.getESuperTypes().add(this.getDBCommand());
		finderEClass.getESuperTypes().add(this.getDBCommand());
		singleResFinderEClass.getESuperTypes().add(this.getFinder());
		multiResFinderEClass.getESuperTypes().add(this.getFinder());
		findByPKEClass.getESuperTypes().add(this.getSingleResFinder());
		findAllEClass.getESuperTypes().add(this.getMultiResFinder());
		qbeFinderEClass.getESuperTypes().add(this.getMultiResFinder());
		customFinderEClass.getESuperTypes().add(this.getMultiResFinder());
		updaterEClass.getESuperTypes().add(this.getDBCommand());
		updateRowEClass.getESuperTypes().add(this.getUpdater());
		updateColumnsEClass.getESuperTypes().add(this.getUpdater());
		deleterEClass.getESuperTypes().add(this.getDBCommand());
		deleteByPKEClass.getESuperTypes().add(this.getDeleter());
		customUpdaterEClass.getESuperTypes().add(this.getUpdater());
		customDeleterEClass.getESuperTypes().add(this.getDeleter());

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
		initEReference(getDataAccessObject_Inserter(), this.getInserter(), null, "inserter", null, 0, 1, DataAccessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAccessObject_Finders(), this.getFinders(), null, "finders", null, 0, 1, DataAccessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAccessObject_Updaters(), this.getUpdaters(), null, "updaters", null, 0, 1, DataAccessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataAccessObject_Deleters(), this.getDeleters(), null, "deleters", null, 0, 1, DataAccessObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daoPackageEClass, DaoPackage.class, "DaoPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaoPackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, DaoPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDaoPackage_Dao(), this.getDataAccessObject(), null, "dao", null, 0, -1, DaoPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pkGeneratorEClass, PKGenerator.class, "PKGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequencePKGeneratorEClass, SequencePKGenerator.class, "SequencePKGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequencePKGenerator_SequenceName(), ecorePackage.getEString(), "sequenceName", null, 1, 1, SequencePKGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dbCommandEClass, DBCommand.class, "DBCommand", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDBCommand_Name(), ecorePackage.getEString(), "name", null, 0, 1, DBCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inserterEClass, Inserter.class, "Inserter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(findersEClass, Finders.class, "Finders", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinders_Finders(), this.getFinder(), null, "finders", null, 0, -1, Finders.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finderEClass, Finder.class, "Finder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleResFinderEClass, SingleResFinder.class, "SingleResFinder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiResFinderEClass, MultiResFinder.class, "MultiResFinder", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiResFinder_Distinct(), theRdbmdlPackage.getColumn(), null, "distinct", null, 0, -1, MultiResFinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiResFinder_OrderSpecs(), this.getOrderSpecs(), null, "orderSpecs", null, 0, 1, MultiResFinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderSpecEClass, OrderSpec.class, "OrderSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderSpec_Column(), theRdbmdlPackage.getColumn(), null, "column", null, 0, 1, OrderSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderSpec_Ascending(), ecorePackage.getEBoolean(), "ascending", "true", 0, 1, OrderSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderSpecsEClass, OrderSpecs.class, "OrderSpecs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderSpecs_Specs(), this.getOrderSpec(), null, "specs", null, 0, -1, OrderSpecs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(findByPKEClass, FindByPK.class, "FindByPK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(findAllEClass, FindAll.class, "FindAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qbeFinderEClass, QBEFinder.class, "QBEFinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customFinderEClass, CustomFinder.class, "CustomFinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomFinder_FilterClassFQN(), ecorePackage.getEString(), "filterClassFQN", null, 0, 1, CustomFinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomFinder_CustomSelect(), ecorePackage.getEBoolean(), "customSelect", "false", 0, 1, CustomFinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomFinder_CustomFrom(), ecorePackage.getEBoolean(), "customFrom", "false", 0, 1, CustomFinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updatersEClass, Updaters.class, "Updaters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdaters_Updaters(), this.getUpdater(), null, "updaters", null, 0, -1, Updaters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updaterEClass, Updater.class, "Updater", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateRowEClass, UpdateRow.class, "UpdateRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(updateColumnsEClass, UpdateColumns.class, "UpdateColumns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUpdateColumns_Columns(), theRdbmdlPackage.getTableColumn(), null, "columns", null, 0, -1, UpdateColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deletersEClass, Deleters.class, "Deleters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeleters_Deleters(), this.getDeleter(), null, "deleters", null, 0, -1, Deleters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleterEClass, Deleter.class, "Deleter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteByPKEClass, DeleteByPK.class, "DeleteByPK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customUpdaterEClass, CustomUpdater.class, "CustomUpdater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomUpdater_FilterClassFQN(), ecorePackage.getEString(), "filterClassFQN", null, 0, 1, CustomUpdater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomUpdater_ValueClassFQN(), ecorePackage.getEString(), "valueClassFQN", null, 0, 1, CustomUpdater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customDeleterEClass, CustomDeleter.class, "CustomDeleter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomDeleter_FilterClassFQN(), ecorePackage.getEString(), "filterClassFQN", null, 0, 1, CustomDeleter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DatagenPackageImpl
