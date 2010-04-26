/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * <!-- begin-model-doc -->
 * Modellazione dello strato di accesso ai dati
 * <!-- end-model-doc -->
 * @see it.csi.mddtools.datagen.DatagenFactory
 * @model kind="package"
 * @generated
 */
public interface DatagenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datagen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.csi.it/mddtools/datagen";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datagen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatagenPackage eINSTANCE = it.csi.mddtools.datagen.impl.DatagenPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.DBAccessModelImpl <em>DB Access Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.DBAccessModelImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDBAccessModel()
	 * @generated
	 */
	int DB_ACCESS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ACCESS_MODEL__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Daopkgs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ACCESS_MODEL__DAOPKGS = 1;

	/**
	 * The feature id for the '<em><b>Cod Prodotto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ACCESS_MODEL__COD_PRODOTTO = 2;

	/**
	 * The feature id for the '<em><b>Cod Componente</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ACCESS_MODEL__COD_COMPONENTE = 3;

	/**
	 * The number of structural features of the '<em>DB Access Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ACCESS_MODEL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl <em>Data Access Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.DataAccessObjectImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDataAccessObject()
	 * @generated
	 */
	int DATA_ACCESS_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Main Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT__MAIN_TABLE = 1;

	/**
	 * The feature id for the '<em><b>Pk Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT__PK_GENERATOR = 2;

	/**
	 * The feature id for the '<em><b>Inserter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT__INSERTER = 3;

	/**
	 * The feature id for the '<em><b>Finders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT__FINDERS = 4;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT__UPDATERS = 5;

	/**
	 * The feature id for the '<em><b>Deleters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT__DELETERS = 6;

	/**
	 * The number of structural features of the '<em>Data Access Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT_FEATURE_COUNT = 7;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.DaoPackageImpl <em>Dao Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.DaoPackageImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDaoPackage()
	 * @generated
	 */
	int DAO_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAO_PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dao</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAO_PACKAGE__DAO = 1;

	/**
	 * The number of structural features of the '<em>Dao Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAO_PACKAGE_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.PKGeneratorImpl <em>PK Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.PKGeneratorImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getPKGenerator()
	 * @generated
	 */
	int PK_GENERATOR = 3;

	/**
	 * The number of structural features of the '<em>PK Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PK_GENERATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.SequencePKGeneratorImpl <em>Sequence PK Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.SequencePKGeneratorImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getSequencePKGenerator()
	 * @generated
	 */
	int SEQUENCE_PK_GENERATOR = 4;

	/**
	 * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_PK_GENERATOR__SEQUENCE_NAME = PK_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence PK Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_PK_GENERATOR_FEATURE_COUNT = PK_GENERATOR_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.DBCommandImpl <em>DB Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.DBCommandImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDBCommand()
	 * @generated
	 */
	int DB_COMMAND = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COMMAND__NAME = 0;

	/**
	 * The number of structural features of the '<em>DB Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_COMMAND_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.InserterImpl <em>Inserter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.InserterImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getInserter()
	 * @generated
	 */
	int INSERTER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTER__NAME = DB_COMMAND__NAME;

	/**
	 * The number of structural features of the '<em>Inserter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTER_FEATURE_COUNT = DB_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.FinderImpl <em>Finder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.FinderImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getFinder()
	 * @generated
	 */
	int FINDER = 8;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.FindByPKImpl <em>Find By PK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.FindByPKImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getFindByPK()
	 * @generated
	 */
	int FIND_BY_PK = 9;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.FindAllImpl <em>Find All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.FindAllImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getFindAll()
	 * @generated
	 */
	int FIND_ALL = 10;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.QBEFinderImpl <em>QBE Finder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.QBEFinderImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQBEFinder()
	 * @generated
	 */
	int QBE_FINDER = 11;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.CustomFinderImpl <em>Custom Finder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.CustomFinderImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getCustomFinder()
	 * @generated
	 */
	int CUSTOM_FINDER = 12;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.UpdatersImpl <em>Updaters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.UpdatersImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getUpdaters()
	 * @generated
	 */
	int UPDATERS = 13;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.UpdaterImpl <em>Updater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.UpdaterImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getUpdater()
	 * @generated
	 */
	int UPDATER = 14;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.UpdateRowImpl <em>Update Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.UpdateRowImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getUpdateRow()
	 * @generated
	 */
	int UPDATE_ROW = 15;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.DeletersImpl <em>Deleters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.DeletersImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDeleters()
	 * @generated
	 */
	int DELETERS = 17;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.DeleterImpl <em>Deleter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.DeleterImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDeleter()
	 * @generated
	 */
	int DELETER = 18;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.DeleteByPKImpl <em>Delete By PK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.DeleteByPKImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDeleteByPK()
	 * @generated
	 */
	int DELETE_BY_PK = 19;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.FindersImpl <em>Finders</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.FindersImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getFinders()
	 * @generated
	 */
	int FINDERS = 7;

	/**
	 * The feature id for the '<em><b>Finders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDERS__FINDERS = 0;

	/**
	 * The number of structural features of the '<em>Finders</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDERS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDER__NAME = DB_COMMAND__NAME;

	/**
	 * The number of structural features of the '<em>Finder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINDER_FEATURE_COUNT = DB_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_PK__NAME = FINDER__NAME;

	/**
	 * The number of structural features of the '<em>Find By PK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_PK_FEATURE_COUNT = FINDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_ALL__NAME = FINDER__NAME;

	/**
	 * The number of structural features of the '<em>Find All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_ALL_FEATURE_COUNT = FINDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QBE_FINDER__NAME = FINDER__NAME;

	/**
	 * The number of structural features of the '<em>QBE Finder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QBE_FINDER_FEATURE_COUNT = FINDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FINDER__NAME = FINDER__NAME;

	/**
	 * The feature id for the '<em><b>Filter Class FQN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FINDER__FILTER_CLASS_FQN = FINDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Finder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FINDER_FEATURE_COUNT = FINDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Updaters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATERS__UPDATERS = 0;

	/**
	 * The number of structural features of the '<em>Updaters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATERS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATER__NAME = DB_COMMAND__NAME;

	/**
	 * The number of structural features of the '<em>Updater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATER_FEATURE_COUNT = DB_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ROW__NAME = UPDATER__NAME;

	/**
	 * The number of structural features of the '<em>Update Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ROW_FEATURE_COUNT = UPDATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.UpdateColumnsImpl <em>Update Columns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.UpdateColumnsImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getUpdateColumns()
	 * @generated
	 */
	int UPDATE_COLUMNS = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_COLUMNS__NAME = UPDATER__NAME;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_COLUMNS__COLUMNS = UPDATER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_COLUMNS_FEATURE_COUNT = UPDATER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Deleters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETERS__DELETERS = 0;

	/**
	 * The number of structural features of the '<em>Deleters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETERS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETER__NAME = DB_COMMAND__NAME;

	/**
	 * The number of structural features of the '<em>Deleter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETER_FEATURE_COUNT = DB_COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_PK__NAME = DELETER__NAME;

	/**
	 * The number of structural features of the '<em>Delete By PK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_PK_FEATURE_COUNT = DELETER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.DBAccessModel <em>DB Access Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Access Model</em>'.
	 * @see it.csi.mddtools.datagen.DBAccessModel
	 * @generated
	 */
	EClass getDBAccessModel();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.DBAccessModel#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see it.csi.mddtools.datagen.DBAccessModel#getSchema()
	 * @see #getDBAccessModel()
	 * @generated
	 */
	EReference getDBAccessModel_Schema();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.DBAccessModel#getDaopkgs <em>Daopkgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Daopkgs</em>'.
	 * @see it.csi.mddtools.datagen.DBAccessModel#getDaopkgs()
	 * @see #getDBAccessModel()
	 * @generated
	 */
	EReference getDBAccessModel_Daopkgs();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.DBAccessModel#getCodProdotto <em>Cod Prodotto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Prodotto</em>'.
	 * @see it.csi.mddtools.datagen.DBAccessModel#getCodProdotto()
	 * @see #getDBAccessModel()
	 * @generated
	 */
	EAttribute getDBAccessModel_CodProdotto();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.DBAccessModel#getCodComponente <em>Cod Componente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cod Componente</em>'.
	 * @see it.csi.mddtools.datagen.DBAccessModel#getCodComponente()
	 * @see #getDBAccessModel()
	 * @generated
	 */
	EAttribute getDBAccessModel_CodComponente();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.DataAccessObject <em>Data Access Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Access Object</em>'.
	 * @see it.csi.mddtools.datagen.DataAccessObject
	 * @generated
	 */
	EClass getDataAccessObject();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.DataAccessObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.DataAccessObject#getName()
	 * @see #getDataAccessObject()
	 * @generated
	 */
	EAttribute getDataAccessObject_Name();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.DataAccessObject#getMainTable <em>Main Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Table</em>'.
	 * @see it.csi.mddtools.datagen.DataAccessObject#getMainTable()
	 * @see #getDataAccessObject()
	 * @generated
	 */
	EReference getDataAccessObject_MainTable();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.DataAccessObject#getPkGenerator <em>Pk Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pk Generator</em>'.
	 * @see it.csi.mddtools.datagen.DataAccessObject#getPkGenerator()
	 * @see #getDataAccessObject()
	 * @generated
	 */
	EReference getDataAccessObject_PkGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.DataAccessObject#getInserter <em>Inserter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inserter</em>'.
	 * @see it.csi.mddtools.datagen.DataAccessObject#getInserter()
	 * @see #getDataAccessObject()
	 * @generated
	 */
	EReference getDataAccessObject_Inserter();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.DataAccessObject#getFinders <em>Finders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finders</em>'.
	 * @see it.csi.mddtools.datagen.DataAccessObject#getFinders()
	 * @see #getDataAccessObject()
	 * @generated
	 */
	EReference getDataAccessObject_Finders();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.DataAccessObject#getUpdaters <em>Updaters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Updaters</em>'.
	 * @see it.csi.mddtools.datagen.DataAccessObject#getUpdaters()
	 * @see #getDataAccessObject()
	 * @generated
	 */
	EReference getDataAccessObject_Updaters();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.DataAccessObject#getDeleters <em>Deleters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deleters</em>'.
	 * @see it.csi.mddtools.datagen.DataAccessObject#getDeleters()
	 * @see #getDataAccessObject()
	 * @generated
	 */
	EReference getDataAccessObject_Deleters();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.DaoPackage <em>Dao Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dao Package</em>'.
	 * @see it.csi.mddtools.datagen.DaoPackage
	 * @generated
	 */
	EClass getDaoPackage();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.DaoPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.DaoPackage#getName()
	 * @see #getDaoPackage()
	 * @generated
	 */
	EAttribute getDaoPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.DaoPackage#getDao <em>Dao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dao</em>'.
	 * @see it.csi.mddtools.datagen.DaoPackage#getDao()
	 * @see #getDaoPackage()
	 * @generated
	 */
	EReference getDaoPackage_Dao();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.PKGenerator <em>PK Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PK Generator</em>'.
	 * @see it.csi.mddtools.datagen.PKGenerator
	 * @generated
	 */
	EClass getPKGenerator();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.SequencePKGenerator <em>Sequence PK Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence PK Generator</em>'.
	 * @see it.csi.mddtools.datagen.SequencePKGenerator
	 * @generated
	 */
	EClass getSequencePKGenerator();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.SequencePKGenerator#getSequenceName <em>Sequence Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Name</em>'.
	 * @see it.csi.mddtools.datagen.SequencePKGenerator#getSequenceName()
	 * @see #getSequencePKGenerator()
	 * @generated
	 */
	EAttribute getSequencePKGenerator_SequenceName();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.DBCommand <em>DB Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB Command</em>'.
	 * @see it.csi.mddtools.datagen.DBCommand
	 * @generated
	 */
	EClass getDBCommand();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.DBCommand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.DBCommand#getName()
	 * @see #getDBCommand()
	 * @generated
	 */
	EAttribute getDBCommand_Name();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Inserter <em>Inserter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inserter</em>'.
	 * @see it.csi.mddtools.datagen.Inserter
	 * @generated
	 */
	EClass getInserter();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Finder <em>Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finder</em>'.
	 * @see it.csi.mddtools.datagen.Finder
	 * @generated
	 */
	EClass getFinder();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.FindByPK <em>Find By PK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find By PK</em>'.
	 * @see it.csi.mddtools.datagen.FindByPK
	 * @generated
	 */
	EClass getFindByPK();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.FindAll <em>Find All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Find All</em>'.
	 * @see it.csi.mddtools.datagen.FindAll
	 * @generated
	 */
	EClass getFindAll();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.QBEFinder <em>QBE Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QBE Finder</em>'.
	 * @see it.csi.mddtools.datagen.QBEFinder
	 * @generated
	 */
	EClass getQBEFinder();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.CustomFinder <em>Custom Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Finder</em>'.
	 * @see it.csi.mddtools.datagen.CustomFinder
	 * @generated
	 */
	EClass getCustomFinder();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.CustomFinder#getFilterClassFQN <em>Filter Class FQN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Class FQN</em>'.
	 * @see it.csi.mddtools.datagen.CustomFinder#getFilterClassFQN()
	 * @see #getCustomFinder()
	 * @generated
	 */
	EAttribute getCustomFinder_FilterClassFQN();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Updaters <em>Updaters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Updaters</em>'.
	 * @see it.csi.mddtools.datagen.Updaters
	 * @generated
	 */
	EClass getUpdaters();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Updaters#getUpdaters <em>Updaters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Updaters</em>'.
	 * @see it.csi.mddtools.datagen.Updaters#getUpdaters()
	 * @see #getUpdaters()
	 * @generated
	 */
	EReference getUpdaters_Updaters();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Updater <em>Updater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Updater</em>'.
	 * @see it.csi.mddtools.datagen.Updater
	 * @generated
	 */
	EClass getUpdater();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.UpdateRow <em>Update Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Row</em>'.
	 * @see it.csi.mddtools.datagen.UpdateRow
	 * @generated
	 */
	EClass getUpdateRow();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.UpdateColumns <em>Update Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Columns</em>'.
	 * @see it.csi.mddtools.datagen.UpdateColumns
	 * @generated
	 */
	EClass getUpdateColumns();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.datagen.UpdateColumns#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see it.csi.mddtools.datagen.UpdateColumns#getColumns()
	 * @see #getUpdateColumns()
	 * @generated
	 */
	EReference getUpdateColumns_Columns();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Deleters <em>Deleters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deleters</em>'.
	 * @see it.csi.mddtools.datagen.Deleters
	 * @generated
	 */
	EClass getDeleters();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Deleters#getDeleters <em>Deleters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deleters</em>'.
	 * @see it.csi.mddtools.datagen.Deleters#getDeleters()
	 * @see #getDeleters()
	 * @generated
	 */
	EReference getDeleters_Deleters();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Deleter <em>Deleter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deleter</em>'.
	 * @see it.csi.mddtools.datagen.Deleter
	 * @generated
	 */
	EClass getDeleter();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.DeleteByPK <em>Delete By PK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete By PK</em>'.
	 * @see it.csi.mddtools.datagen.DeleteByPK
	 * @generated
	 */
	EClass getDeleteByPK();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Finders <em>Finders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finders</em>'.
	 * @see it.csi.mddtools.datagen.Finders
	 * @generated
	 */
	EClass getFinders();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Finders#getFinders <em>Finders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Finders</em>'.
	 * @see it.csi.mddtools.datagen.Finders#getFinders()
	 * @see #getFinders()
	 * @generated
	 */
	EReference getFinders_Finders();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatagenFactory getDatagenFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.DBAccessModelImpl <em>DB Access Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.DBAccessModelImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDBAccessModel()
		 * @generated
		 */
		EClass DB_ACCESS_MODEL = eINSTANCE.getDBAccessModel();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_ACCESS_MODEL__SCHEMA = eINSTANCE.getDBAccessModel_Schema();

		/**
		 * The meta object literal for the '<em><b>Daopkgs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DB_ACCESS_MODEL__DAOPKGS = eINSTANCE.getDBAccessModel_Daopkgs();

		/**
		 * The meta object literal for the '<em><b>Cod Prodotto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_ACCESS_MODEL__COD_PRODOTTO = eINSTANCE.getDBAccessModel_CodProdotto();

		/**
		 * The meta object literal for the '<em><b>Cod Componente</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_ACCESS_MODEL__COD_COMPONENTE = eINSTANCE.getDBAccessModel_CodComponente();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl <em>Data Access Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.DataAccessObjectImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDataAccessObject()
		 * @generated
		 */
		EClass DATA_ACCESS_OBJECT = eINSTANCE.getDataAccessObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ACCESS_OBJECT__NAME = eINSTANCE.getDataAccessObject_Name();

		/**
		 * The meta object literal for the '<em><b>Main Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_OBJECT__MAIN_TABLE = eINSTANCE.getDataAccessObject_MainTable();

		/**
		 * The meta object literal for the '<em><b>Pk Generator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_OBJECT__PK_GENERATOR = eINSTANCE.getDataAccessObject_PkGenerator();

		/**
		 * The meta object literal for the '<em><b>Inserter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_OBJECT__INSERTER = eINSTANCE.getDataAccessObject_Inserter();

		/**
		 * The meta object literal for the '<em><b>Finders</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_OBJECT__FINDERS = eINSTANCE.getDataAccessObject_Finders();

		/**
		 * The meta object literal for the '<em><b>Updaters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_OBJECT__UPDATERS = eINSTANCE.getDataAccessObject_Updaters();

		/**
		 * The meta object literal for the '<em><b>Deleters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_OBJECT__DELETERS = eINSTANCE.getDataAccessObject_Deleters();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.DaoPackageImpl <em>Dao Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.DaoPackageImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDaoPackage()
		 * @generated
		 */
		EClass DAO_PACKAGE = eINSTANCE.getDaoPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAO_PACKAGE__NAME = eINSTANCE.getDaoPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Dao</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAO_PACKAGE__DAO = eINSTANCE.getDaoPackage_Dao();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.PKGeneratorImpl <em>PK Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.PKGeneratorImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getPKGenerator()
		 * @generated
		 */
		EClass PK_GENERATOR = eINSTANCE.getPKGenerator();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.SequencePKGeneratorImpl <em>Sequence PK Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.SequencePKGeneratorImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getSequencePKGenerator()
		 * @generated
		 */
		EClass SEQUENCE_PK_GENERATOR = eINSTANCE.getSequencePKGenerator();

		/**
		 * The meta object literal for the '<em><b>Sequence Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE_PK_GENERATOR__SEQUENCE_NAME = eINSTANCE.getSequencePKGenerator_SequenceName();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.DBCommandImpl <em>DB Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.DBCommandImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDBCommand()
		 * @generated
		 */
		EClass DB_COMMAND = eINSTANCE.getDBCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_COMMAND__NAME = eINSTANCE.getDBCommand_Name();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.InserterImpl <em>Inserter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.InserterImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getInserter()
		 * @generated
		 */
		EClass INSERTER = eINSTANCE.getInserter();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.FinderImpl <em>Finder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.FinderImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getFinder()
		 * @generated
		 */
		EClass FINDER = eINSTANCE.getFinder();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.FindByPKImpl <em>Find By PK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.FindByPKImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getFindByPK()
		 * @generated
		 */
		EClass FIND_BY_PK = eINSTANCE.getFindByPK();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.FindAllImpl <em>Find All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.FindAllImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getFindAll()
		 * @generated
		 */
		EClass FIND_ALL = eINSTANCE.getFindAll();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.QBEFinderImpl <em>QBE Finder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.QBEFinderImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQBEFinder()
		 * @generated
		 */
		EClass QBE_FINDER = eINSTANCE.getQBEFinder();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.CustomFinderImpl <em>Custom Finder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.CustomFinderImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getCustomFinder()
		 * @generated
		 */
		EClass CUSTOM_FINDER = eINSTANCE.getCustomFinder();

		/**
		 * The meta object literal for the '<em><b>Filter Class FQN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_FINDER__FILTER_CLASS_FQN = eINSTANCE.getCustomFinder_FilterClassFQN();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.UpdatersImpl <em>Updaters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.UpdatersImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getUpdaters()
		 * @generated
		 */
		EClass UPDATERS = eINSTANCE.getUpdaters();

		/**
		 * The meta object literal for the '<em><b>Updaters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATERS__UPDATERS = eINSTANCE.getUpdaters_Updaters();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.UpdaterImpl <em>Updater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.UpdaterImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getUpdater()
		 * @generated
		 */
		EClass UPDATER = eINSTANCE.getUpdater();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.UpdateRowImpl <em>Update Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.UpdateRowImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getUpdateRow()
		 * @generated
		 */
		EClass UPDATE_ROW = eINSTANCE.getUpdateRow();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.UpdateColumnsImpl <em>Update Columns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.UpdateColumnsImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getUpdateColumns()
		 * @generated
		 */
		EClass UPDATE_COLUMNS = eINSTANCE.getUpdateColumns();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_COLUMNS__COLUMNS = eINSTANCE.getUpdateColumns_Columns();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.DeletersImpl <em>Deleters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.DeletersImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDeleters()
		 * @generated
		 */
		EClass DELETERS = eINSTANCE.getDeleters();

		/**
		 * The meta object literal for the '<em><b>Deleters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETERS__DELETERS = eINSTANCE.getDeleters_Deleters();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.DeleterImpl <em>Deleter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.DeleterImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDeleter()
		 * @generated
		 */
		EClass DELETER = eINSTANCE.getDeleter();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.DeleteByPKImpl <em>Delete By PK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.DeleteByPKImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDeleteByPK()
		 * @generated
		 */
		EClass DELETE_BY_PK = eINSTANCE.getDeleteByPK();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.FindersImpl <em>Finders</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.FindersImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getFinders()
		 * @generated
		 */
		EClass FINDERS = eINSTANCE.getFinders();

		/**
		 * The meta object literal for the '<em><b>Finders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINDERS__FINDERS = eINSTANCE.getFinders_Finders();

	}

} //DatagenPackage
