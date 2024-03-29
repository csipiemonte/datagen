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
package it.csi.mddtools.datagen;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ACCESS_MODEL__NAME = 4;

	/**
	 * The number of structural features of the '<em>DB Access Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_ACCESS_MODEL_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Cacheability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT__CACHEABILITY = 7;

	/**
	 * The feature id for the '<em><b>Cache TT Lminutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT__CACHE_TT_LMINUTES = 8;

	/**
	 * The feature id for the '<em><b>Lookup Resolvers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT__LOOKUP_RESOLVERS = 9;

	/**
	 * The number of structural features of the '<em>Data Access Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT_FEATURE_COUNT = 10;


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
	int FIND_BY_PK = 13;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.FindAllImpl <em>Find All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.FindAllImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getFindAll()
	 * @generated
	 */
	int FIND_ALL = 14;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.QBEFinderImpl <em>QBE Finder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.QBEFinderImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQBEFinder()
	 * @generated
	 */
	int QBE_FINDER = 15;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.CustomFinderImpl <em>Custom Finder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.CustomFinderImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getCustomFinder()
	 * @generated
	 */
	int CUSTOM_FINDER = 16;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.UpdatersImpl <em>Updaters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.UpdatersImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getUpdaters()
	 * @generated
	 */
	int UPDATERS = 17;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.UpdaterImpl <em>Updater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.UpdaterImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getUpdater()
	 * @generated
	 */
	int UPDATER = 18;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.UpdateRowImpl <em>Update Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.UpdateRowImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getUpdateRow()
	 * @generated
	 */
	int UPDATE_ROW = 19;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.DeletersImpl <em>Deleters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.DeletersImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDeleters()
	 * @generated
	 */
	int DELETERS = 21;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.DeleterImpl <em>Deleter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.DeleterImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDeleter()
	 * @generated
	 */
	int DELETER = 22;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.DeleteByPKImpl <em>Delete By PK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.DeleteByPKImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getDeleteByPK()
	 * @generated
	 */
	int DELETE_BY_PK = 23;

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
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.SingleResFinderImpl <em>Single Res Finder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.SingleResFinderImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getSingleResFinder()
	 * @generated
	 */
	int SINGLE_RES_FINDER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_RES_FINDER__NAME = FINDER__NAME;

	/**
	 * The number of structural features of the '<em>Single Res Finder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_RES_FINDER_FEATURE_COUNT = FINDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.MultiResFinderImpl <em>Multi Res Finder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.MultiResFinderImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getMultiResFinder()
	 * @generated
	 */
	int MULTI_RES_FINDER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RES_FINDER__NAME = FINDER__NAME;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RES_FINDER__DISTINCT = FINDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order Specs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RES_FINDER__ORDER_SPECS = FINDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Res Finder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_RES_FINDER_FEATURE_COUNT = FINDER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.OrderSpecImpl <em>Order Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.OrderSpecImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getOrderSpec()
	 * @generated
	 */
	int ORDER_SPEC = 11;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SPEC__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SPEC__ASCENDING = 1;

	/**
	 * The feature id for the '<em><b>Qcolumn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SPEC__QCOLUMN = 2;

	/**
	 * The number of structural features of the '<em>Order Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SPEC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.OrderSpecsImpl <em>Order Specs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.OrderSpecsImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getOrderSpecs()
	 * @generated
	 */
	int ORDER_SPECS = 12;

	/**
	 * The feature id for the '<em><b>Specs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SPECS__SPECS = 0;

	/**
	 * The number of structural features of the '<em>Order Specs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_SPECS_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_PK__NAME = SINGLE_RES_FINDER__NAME;

	/**
	 * The number of structural features of the '<em>Find By PK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_BY_PK_FEATURE_COUNT = SINGLE_RES_FINDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_ALL__NAME = MULTI_RES_FINDER__NAME;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_ALL__DISTINCT = MULTI_RES_FINDER__DISTINCT;

	/**
	 * The feature id for the '<em><b>Order Specs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_ALL__ORDER_SPECS = MULTI_RES_FINDER__ORDER_SPECS;

	/**
	 * The number of structural features of the '<em>Find All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIND_ALL_FEATURE_COUNT = MULTI_RES_FINDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QBE_FINDER__NAME = MULTI_RES_FINDER__NAME;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QBE_FINDER__DISTINCT = MULTI_RES_FINDER__DISTINCT;

	/**
	 * The feature id for the '<em><b>Order Specs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QBE_FINDER__ORDER_SPECS = MULTI_RES_FINDER__ORDER_SPECS;

	/**
	 * The number of structural features of the '<em>QBE Finder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QBE_FINDER_FEATURE_COUNT = MULTI_RES_FINDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FINDER__NAME = MULTI_RES_FINDER__NAME;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FINDER__DISTINCT = MULTI_RES_FINDER__DISTINCT;

	/**
	 * The feature id for the '<em><b>Order Specs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FINDER__ORDER_SPECS = MULTI_RES_FINDER__ORDER_SPECS;

	/**
	 * The feature id for the '<em><b>Filter Class FQN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FINDER__FILTER_CLASS_FQN = MULTI_RES_FINDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Select</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FINDER__CUSTOM_SELECT = MULTI_RES_FINDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Custom From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FINDER__CUSTOM_FROM = MULTI_RES_FINDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Query Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FINDER__QUERY_DEFINITION = MULTI_RES_FINDER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Custom Finder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FINDER_FEATURE_COUNT = MULTI_RES_FINDER_FEATURE_COUNT + 4;

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
	int UPDATE_COLUMNS = 20;

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
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.CustomUpdaterImpl <em>Custom Updater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.CustomUpdaterImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getCustomUpdater()
	 * @generated
	 */
	int CUSTOM_UPDATER = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_UPDATER__NAME = UPDATER__NAME;

	/**
	 * The feature id for the '<em><b>Filter Class FQN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_UPDATER__FILTER_CLASS_FQN = UPDATER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Class FQN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_UPDATER__VALUE_CLASS_FQN = UPDATER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Updater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_UPDATER_FEATURE_COUNT = UPDATER_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.CustomDeleterImpl <em>Custom Deleter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.CustomDeleterImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getCustomDeleter()
	 * @generated
	 */
	int CUSTOM_DELETER = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DELETER__NAME = DELETER__NAME;

	/**
	 * The feature id for the '<em><b>Filter Class FQN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DELETER__FILTER_CLASS_FQN = DELETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Deleter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DELETER_FEATURE_COUNT = DELETER_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.LookupResolversImpl <em>Lookup Resolvers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.LookupResolversImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getLookupResolvers()
	 * @generated
	 */
	int LOOKUP_RESOLVERS = 26;

	/**
	 * The feature id for the '<em><b>Resolvers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_RESOLVERS__RESOLVERS = 0;

	/**
	 * The number of structural features of the '<em>Lookup Resolvers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_RESOLVERS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.LookupResolverImpl <em>Lookup Resolver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.LookupResolverImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getLookupResolver()
	 * @generated
	 */
	int LOOKUP_RESOLVER = 27;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_RESOLVER__FOREIGN_KEY = 0;

	/**
	 * The feature id for the '<em><b>Supplier DAO</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_RESOLVER__SUPPLIER_DAO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_RESOLVER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Lookup Resolver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_RESOLVER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.QueryDefImpl <em>Query Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.QueryDefImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQueryDef()
	 * @generated
	 */
	int QUERY_DEF = 28;

	/**
	 * The feature id for the '<em><b>Select Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEF__SELECT_CLAUSE = 0;

	/**
	 * The feature id for the '<em><b>From Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEF__FROM_CLAUSE = 1;

	/**
	 * The feature id for the '<em><b>Join Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEF__JOIN_CLAUSE = 2;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEF__WHERE_CLAUSE = 3;

	/**
	 * The number of structural features of the '<em>Query Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_DEF_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.SelectClauseImpl <em>Select Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.SelectClauseImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getSelectClause()
	 * @generated
	 */
	int SELECT_CLAUSE = 29;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_CLAUSE__COLUMNS = 0;

	/**
	 * The number of structural features of the '<em>Select Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.QResultColumnImpl <em>QResult Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.QResultColumnImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQResultColumn()
	 * @generated
	 */
	int QRESULT_COLUMN = 30;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QRESULT_COLUMN__ALIAS = 0;

	/**
	 * The number of structural features of the '<em>QResult Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QRESULT_COLUMN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.QTableColumnImpl <em>QTable Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.QTableColumnImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQTableColumn()
	 * @generated
	 */
	int QTABLE_COLUMN = 31;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTABLE_COLUMN__ALIAS = QRESULT_COLUMN__ALIAS;

	/**
	 * The feature id for the '<em><b>Qtable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTABLE_COLUMN__QTABLE = QRESULT_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTABLE_COLUMN__COLUMN = QRESULT_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>QTable Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTABLE_COLUMN_FEATURE_COUNT = QRESULT_COLUMN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.QCalculatedColumnImpl <em>QCalculated Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.QCalculatedColumnImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQCalculatedColumn()
	 * @generated
	 */
	int QCALCULATED_COLUMN = 32;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCALCULATED_COLUMN__ALIAS = QRESULT_COLUMN__ALIAS;

	/**
	 * The feature id for the '<em><b>Referenced Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCALCULATED_COLUMN__REFERENCED_COLUMNS = QRESULT_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Free Text Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCALCULATED_COLUMN__FREE_TEXT_EXPRESSION = QRESULT_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Calculated Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCALCULATED_COLUMN__CALCULATED_TYPE = QRESULT_COLUMN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>QCalculated Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCALCULATED_COLUMN_FEATURE_COUNT = QRESULT_COLUMN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.FromClauseImpl <em>From Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.FromClauseImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getFromClause()
	 * @generated
	 */
	int FROM_CLAUSE = 33;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLAUSE__TABLES = 0;

	/**
	 * The number of structural features of the '<em>From Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.QTableImpl <em>QTable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.QTableImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQTable()
	 * @generated
	 */
	int QTABLE = 34;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTABLE__TABLE = 0;

	/**
	 * The feature id for the '<em><b>Alias Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTABLE__ALIAS_NAME = 1;

	/**
	 * The number of structural features of the '<em>QTable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.JoinClauseImpl <em>Join Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.JoinClauseImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getJoinClause()
	 * @generated
	 */
	int JOIN_CLAUSE = 35;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CLAUSE__CRITERIA = 0;

	/**
	 * The number of structural features of the '<em>Join Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.JoinCriterionImpl <em>Join Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.JoinCriterionImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getJoinCriterion()
	 * @generated
	 */
	int JOIN_CRITERION = 36;

	/**
	 * The feature id for the '<em><b>Left Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CRITERION__LEFT_TABLE = 0;

	/**
	 * The feature id for the '<em><b>Left Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CRITERION__LEFT_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Right Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CRITERION__RIGHT_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Right Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CRITERION__RIGHT_COLUMN = 3;

	/**
	 * The number of structural features of the '<em>Join Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_CRITERION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.impl.WhereClauseImpl <em>Where Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.impl.WhereClauseImpl
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getWhereClause()
	 * @generated
	 */
	int WHERE_CLAUSE = 37;

	/**
	 * The feature id for the '<em><b>Freetext Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE__FREETEXT_EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Where Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.CacheabilityTypes <em>Cacheability Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.CacheabilityTypes
	 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getCacheabilityTypes()
	 * @generated
	 */
	int CACHEABILITY_TYPES = 38;


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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.DBAccessModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.DBAccessModel#getName()
	 * @see #getDBAccessModel()
	 * @generated
	 */
	EAttribute getDBAccessModel_Name();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.DataAccessObject#getCacheability <em>Cacheability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cacheability</em>'.
	 * @see it.csi.mddtools.datagen.DataAccessObject#getCacheability()
	 * @see #getDataAccessObject()
	 * @generated
	 */
	EAttribute getDataAccessObject_Cacheability();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.DataAccessObject#getCacheTTLminutes <em>Cache TT Lminutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache TT Lminutes</em>'.
	 * @see it.csi.mddtools.datagen.DataAccessObject#getCacheTTLminutes()
	 * @see #getDataAccessObject()
	 * @generated
	 */
	EAttribute getDataAccessObject_CacheTTLminutes();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.DataAccessObject#getLookupResolvers <em>Lookup Resolvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lookup Resolvers</em>'.
	 * @see it.csi.mddtools.datagen.DataAccessObject#getLookupResolvers()
	 * @see #getDataAccessObject()
	 * @generated
	 */
	EReference getDataAccessObject_LookupResolvers();

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
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.SingleResFinder <em>Single Res Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Res Finder</em>'.
	 * @see it.csi.mddtools.datagen.SingleResFinder
	 * @generated
	 */
	EClass getSingleResFinder();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.MultiResFinder <em>Multi Res Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Res Finder</em>'.
	 * @see it.csi.mddtools.datagen.MultiResFinder
	 * @generated
	 */
	EClass getMultiResFinder();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.datagen.MultiResFinder#getDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Distinct</em>'.
	 * @see it.csi.mddtools.datagen.MultiResFinder#getDistinct()
	 * @see #getMultiResFinder()
	 * @generated
	 */
	EReference getMultiResFinder_Distinct();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.MultiResFinder#getOrderSpecs <em>Order Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order Specs</em>'.
	 * @see it.csi.mddtools.datagen.MultiResFinder#getOrderSpecs()
	 * @see #getMultiResFinder()
	 * @generated
	 */
	EReference getMultiResFinder_OrderSpecs();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.OrderSpec <em>Order Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Spec</em>'.
	 * @see it.csi.mddtools.datagen.OrderSpec
	 * @generated
	 */
	EClass getOrderSpec();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.OrderSpec#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see it.csi.mddtools.datagen.OrderSpec#getColumn()
	 * @see #getOrderSpec()
	 * @generated
	 */
	EReference getOrderSpec_Column();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.OrderSpec#isAscending <em>Ascending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ascending</em>'.
	 * @see it.csi.mddtools.datagen.OrderSpec#isAscending()
	 * @see #getOrderSpec()
	 * @generated
	 */
	EAttribute getOrderSpec_Ascending();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.OrderSpec#getQcolumn <em>Qcolumn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qcolumn</em>'.
	 * @see it.csi.mddtools.datagen.OrderSpec#getQcolumn()
	 * @see #getOrderSpec()
	 * @generated
	 */
	EReference getOrderSpec_Qcolumn();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.OrderSpecs <em>Order Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Specs</em>'.
	 * @see it.csi.mddtools.datagen.OrderSpecs
	 * @generated
	 */
	EClass getOrderSpecs();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.OrderSpecs#getSpecs <em>Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specs</em>'.
	 * @see it.csi.mddtools.datagen.OrderSpecs#getSpecs()
	 * @see #getOrderSpecs()
	 * @generated
	 */
	EReference getOrderSpecs_Specs();

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
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.CustomFinder#isCustomSelect <em>Custom Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Select</em>'.
	 * @see it.csi.mddtools.datagen.CustomFinder#isCustomSelect()
	 * @see #getCustomFinder()
	 * @generated
	 */
	EAttribute getCustomFinder_CustomSelect();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.CustomFinder#isCustomFrom <em>Custom From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom From</em>'.
	 * @see it.csi.mddtools.datagen.CustomFinder#isCustomFrom()
	 * @see #getCustomFinder()
	 * @generated
	 */
	EAttribute getCustomFinder_CustomFrom();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.CustomFinder#getQueryDefinition <em>Query Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Definition</em>'.
	 * @see it.csi.mddtools.datagen.CustomFinder#getQueryDefinition()
	 * @see #getCustomFinder()
	 * @generated
	 */
	EReference getCustomFinder_QueryDefinition();

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
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.CustomUpdater <em>Custom Updater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Updater</em>'.
	 * @see it.csi.mddtools.datagen.CustomUpdater
	 * @generated
	 */
	EClass getCustomUpdater();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.CustomUpdater#getFilterClassFQN <em>Filter Class FQN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Class FQN</em>'.
	 * @see it.csi.mddtools.datagen.CustomUpdater#getFilterClassFQN()
	 * @see #getCustomUpdater()
	 * @generated
	 */
	EAttribute getCustomUpdater_FilterClassFQN();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.CustomUpdater#getValueClassFQN <em>Value Class FQN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Class FQN</em>'.
	 * @see it.csi.mddtools.datagen.CustomUpdater#getValueClassFQN()
	 * @see #getCustomUpdater()
	 * @generated
	 */
	EAttribute getCustomUpdater_ValueClassFQN();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.CustomDeleter <em>Custom Deleter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Deleter</em>'.
	 * @see it.csi.mddtools.datagen.CustomDeleter
	 * @generated
	 */
	EClass getCustomDeleter();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.CustomDeleter#getFilterClassFQN <em>Filter Class FQN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Class FQN</em>'.
	 * @see it.csi.mddtools.datagen.CustomDeleter#getFilterClassFQN()
	 * @see #getCustomDeleter()
	 * @generated
	 */
	EAttribute getCustomDeleter_FilterClassFQN();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.LookupResolvers <em>Lookup Resolvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Resolvers</em>'.
	 * @see it.csi.mddtools.datagen.LookupResolvers
	 * @generated
	 */
	EClass getLookupResolvers();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.LookupResolvers#getResolvers <em>Resolvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resolvers</em>'.
	 * @see it.csi.mddtools.datagen.LookupResolvers#getResolvers()
	 * @see #getLookupResolvers()
	 * @generated
	 */
	EReference getLookupResolvers_Resolvers();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.LookupResolver <em>Lookup Resolver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup Resolver</em>'.
	 * @see it.csi.mddtools.datagen.LookupResolver
	 * @generated
	 */
	EClass getLookupResolver();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.LookupResolver#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreign Key</em>'.
	 * @see it.csi.mddtools.datagen.LookupResolver#getForeignKey()
	 * @see #getLookupResolver()
	 * @generated
	 */
	EReference getLookupResolver_ForeignKey();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.LookupResolver#getSupplierDAO <em>Supplier DAO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier DAO</em>'.
	 * @see it.csi.mddtools.datagen.LookupResolver#getSupplierDAO()
	 * @see #getLookupResolver()
	 * @generated
	 */
	EReference getLookupResolver_SupplierDAO();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.LookupResolver#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.LookupResolver#getName()
	 * @see #getLookupResolver()
	 * @generated
	 */
	EAttribute getLookupResolver_Name();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.QueryDef <em>Query Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Def</em>'.
	 * @see it.csi.mddtools.datagen.QueryDef
	 * @generated
	 */
	EClass getQueryDef();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.QueryDef#getSelectClause <em>Select Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select Clause</em>'.
	 * @see it.csi.mddtools.datagen.QueryDef#getSelectClause()
	 * @see #getQueryDef()
	 * @generated
	 */
	EReference getQueryDef_SelectClause();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.QueryDef#getFromClause <em>From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Clause</em>'.
	 * @see it.csi.mddtools.datagen.QueryDef#getFromClause()
	 * @see #getQueryDef()
	 * @generated
	 */
	EReference getQueryDef_FromClause();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.QueryDef#getJoinClause <em>Join Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join Clause</em>'.
	 * @see it.csi.mddtools.datagen.QueryDef#getJoinClause()
	 * @see #getQueryDef()
	 * @generated
	 */
	EReference getQueryDef_JoinClause();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.QueryDef#getWhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where Clause</em>'.
	 * @see it.csi.mddtools.datagen.QueryDef#getWhereClause()
	 * @see #getQueryDef()
	 * @generated
	 */
	EReference getQueryDef_WhereClause();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.SelectClause <em>Select Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Clause</em>'.
	 * @see it.csi.mddtools.datagen.SelectClause
	 * @generated
	 */
	EClass getSelectClause();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.SelectClause#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see it.csi.mddtools.datagen.SelectClause#getColumns()
	 * @see #getSelectClause()
	 * @generated
	 */
	EReference getSelectClause_Columns();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.QResultColumn <em>QResult Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QResult Column</em>'.
	 * @see it.csi.mddtools.datagen.QResultColumn
	 * @generated
	 */
	EClass getQResultColumn();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.QResultColumn#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see it.csi.mddtools.datagen.QResultColumn#getAlias()
	 * @see #getQResultColumn()
	 * @generated
	 */
	EAttribute getQResultColumn_Alias();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.QTableColumn <em>QTable Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QTable Column</em>'.
	 * @see it.csi.mddtools.datagen.QTableColumn
	 * @generated
	 */
	EClass getQTableColumn();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.QTableColumn#getQtable <em>Qtable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qtable</em>'.
	 * @see it.csi.mddtools.datagen.QTableColumn#getQtable()
	 * @see #getQTableColumn()
	 * @generated
	 */
	EReference getQTableColumn_Qtable();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.QTableColumn#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see it.csi.mddtools.datagen.QTableColumn#getColumn()
	 * @see #getQTableColumn()
	 * @generated
	 */
	EReference getQTableColumn_Column();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.QCalculatedColumn <em>QCalculated Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QCalculated Column</em>'.
	 * @see it.csi.mddtools.datagen.QCalculatedColumn
	 * @generated
	 */
	EClass getQCalculatedColumn();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.QCalculatedColumn#getReferencedColumns <em>Referenced Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referenced Columns</em>'.
	 * @see it.csi.mddtools.datagen.QCalculatedColumn#getReferencedColumns()
	 * @see #getQCalculatedColumn()
	 * @generated
	 */
	EReference getQCalculatedColumn_ReferencedColumns();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.QCalculatedColumn#getFreeTextExpression <em>Free Text Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free Text Expression</em>'.
	 * @see it.csi.mddtools.datagen.QCalculatedColumn#getFreeTextExpression()
	 * @see #getQCalculatedColumn()
	 * @generated
	 */
	EAttribute getQCalculatedColumn_FreeTextExpression();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.QCalculatedColumn#getCalculatedType <em>Calculated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Calculated Type</em>'.
	 * @see it.csi.mddtools.datagen.QCalculatedColumn#getCalculatedType()
	 * @see #getQCalculatedColumn()
	 * @generated
	 */
	EReference getQCalculatedColumn_CalculatedType();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.FromClause <em>From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Clause</em>'.
	 * @see it.csi.mddtools.datagen.FromClause
	 * @generated
	 */
	EClass getFromClause();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.FromClause#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see it.csi.mddtools.datagen.FromClause#getTables()
	 * @see #getFromClause()
	 * @generated
	 */
	EReference getFromClause_Tables();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.QTable <em>QTable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QTable</em>'.
	 * @see it.csi.mddtools.datagen.QTable
	 * @generated
	 */
	EClass getQTable();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.QTable#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see it.csi.mddtools.datagen.QTable#getTable()
	 * @see #getQTable()
	 * @generated
	 */
	EReference getQTable_Table();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.QTable#getAliasName <em>Alias Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias Name</em>'.
	 * @see it.csi.mddtools.datagen.QTable#getAliasName()
	 * @see #getQTable()
	 * @generated
	 */
	EAttribute getQTable_AliasName();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.JoinClause <em>Join Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Clause</em>'.
	 * @see it.csi.mddtools.datagen.JoinClause
	 * @generated
	 */
	EClass getJoinClause();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.JoinClause#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see it.csi.mddtools.datagen.JoinClause#getCriteria()
	 * @see #getJoinClause()
	 * @generated
	 */
	EReference getJoinClause_Criteria();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.JoinCriterion <em>Join Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Criterion</em>'.
	 * @see it.csi.mddtools.datagen.JoinCriterion
	 * @generated
	 */
	EClass getJoinCriterion();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.JoinCriterion#getLeftTable <em>Left Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Table</em>'.
	 * @see it.csi.mddtools.datagen.JoinCriterion#getLeftTable()
	 * @see #getJoinCriterion()
	 * @generated
	 */
	EReference getJoinCriterion_LeftTable();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.JoinCriterion#getLeftColumn <em>Left Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left Column</em>'.
	 * @see it.csi.mddtools.datagen.JoinCriterion#getLeftColumn()
	 * @see #getJoinCriterion()
	 * @generated
	 */
	EReference getJoinCriterion_LeftColumn();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.JoinCriterion#getRightTable <em>Right Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Table</em>'.
	 * @see it.csi.mddtools.datagen.JoinCriterion#getRightTable()
	 * @see #getJoinCriterion()
	 * @generated
	 */
	EReference getJoinCriterion_RightTable();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.datagen.JoinCriterion#getRightColumn <em>Right Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right Column</em>'.
	 * @see it.csi.mddtools.datagen.JoinCriterion#getRightColumn()
	 * @see #getJoinCriterion()
	 * @generated
	 */
	EReference getJoinCriterion_RightColumn();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.WhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where Clause</em>'.
	 * @see it.csi.mddtools.datagen.WhereClause
	 * @generated
	 */
	EClass getWhereClause();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.WhereClause#getFreetextExpression <em>Freetext Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freetext Expression</em>'.
	 * @see it.csi.mddtools.datagen.WhereClause#getFreetextExpression()
	 * @see #getWhereClause()
	 * @generated
	 */
	EAttribute getWhereClause_FreetextExpression();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.datagen.CacheabilityTypes <em>Cacheability Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cacheability Types</em>'.
	 * @see it.csi.mddtools.datagen.CacheabilityTypes
	 * @generated
	 */
	EEnum getCacheabilityTypes();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB_ACCESS_MODEL__NAME = eINSTANCE.getDBAccessModel_Name();

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
		 * The meta object literal for the '<em><b>Cacheability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ACCESS_OBJECT__CACHEABILITY = eINSTANCE.getDataAccessObject_Cacheability();

		/**
		 * The meta object literal for the '<em><b>Cache TT Lminutes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ACCESS_OBJECT__CACHE_TT_LMINUTES = eINSTANCE.getDataAccessObject_CacheTTLminutes();

		/**
		 * The meta object literal for the '<em><b>Lookup Resolvers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ACCESS_OBJECT__LOOKUP_RESOLVERS = eINSTANCE.getDataAccessObject_LookupResolvers();

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
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.SingleResFinderImpl <em>Single Res Finder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.SingleResFinderImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getSingleResFinder()
		 * @generated
		 */
		EClass SINGLE_RES_FINDER = eINSTANCE.getSingleResFinder();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.MultiResFinderImpl <em>Multi Res Finder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.MultiResFinderImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getMultiResFinder()
		 * @generated
		 */
		EClass MULTI_RES_FINDER = eINSTANCE.getMultiResFinder();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_RES_FINDER__DISTINCT = eINSTANCE.getMultiResFinder_Distinct();

		/**
		 * The meta object literal for the '<em><b>Order Specs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_RES_FINDER__ORDER_SPECS = eINSTANCE.getMultiResFinder_OrderSpecs();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.OrderSpecImpl <em>Order Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.OrderSpecImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getOrderSpec()
		 * @generated
		 */
		EClass ORDER_SPEC = eINSTANCE.getOrderSpec();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_SPEC__COLUMN = eINSTANCE.getOrderSpec_Column();

		/**
		 * The meta object literal for the '<em><b>Ascending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_SPEC__ASCENDING = eINSTANCE.getOrderSpec_Ascending();

		/**
		 * The meta object literal for the '<em><b>Qcolumn</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_SPEC__QCOLUMN = eINSTANCE.getOrderSpec_Qcolumn();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.OrderSpecsImpl <em>Order Specs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.OrderSpecsImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getOrderSpecs()
		 * @generated
		 */
		EClass ORDER_SPECS = eINSTANCE.getOrderSpecs();

		/**
		 * The meta object literal for the '<em><b>Specs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_SPECS__SPECS = eINSTANCE.getOrderSpecs_Specs();

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
		 * The meta object literal for the '<em><b>Custom Select</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_FINDER__CUSTOM_SELECT = eINSTANCE.getCustomFinder_CustomSelect();

		/**
		 * The meta object literal for the '<em><b>Custom From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_FINDER__CUSTOM_FROM = eINSTANCE.getCustomFinder_CustomFrom();

		/**
		 * The meta object literal for the '<em><b>Query Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_FINDER__QUERY_DEFINITION = eINSTANCE.getCustomFinder_QueryDefinition();

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
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.CustomUpdaterImpl <em>Custom Updater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.CustomUpdaterImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getCustomUpdater()
		 * @generated
		 */
		EClass CUSTOM_UPDATER = eINSTANCE.getCustomUpdater();

		/**
		 * The meta object literal for the '<em><b>Filter Class FQN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_UPDATER__FILTER_CLASS_FQN = eINSTANCE.getCustomUpdater_FilterClassFQN();

		/**
		 * The meta object literal for the '<em><b>Value Class FQN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_UPDATER__VALUE_CLASS_FQN = eINSTANCE.getCustomUpdater_ValueClassFQN();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.CustomDeleterImpl <em>Custom Deleter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.CustomDeleterImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getCustomDeleter()
		 * @generated
		 */
		EClass CUSTOM_DELETER = eINSTANCE.getCustomDeleter();

		/**
		 * The meta object literal for the '<em><b>Filter Class FQN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_DELETER__FILTER_CLASS_FQN = eINSTANCE.getCustomDeleter_FilterClassFQN();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.LookupResolversImpl <em>Lookup Resolvers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.LookupResolversImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getLookupResolvers()
		 * @generated
		 */
		EClass LOOKUP_RESOLVERS = eINSTANCE.getLookupResolvers();

		/**
		 * The meta object literal for the '<em><b>Resolvers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_RESOLVERS__RESOLVERS = eINSTANCE.getLookupResolvers_Resolvers();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.LookupResolverImpl <em>Lookup Resolver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.LookupResolverImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getLookupResolver()
		 * @generated
		 */
		EClass LOOKUP_RESOLVER = eINSTANCE.getLookupResolver();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_RESOLVER__FOREIGN_KEY = eINSTANCE.getLookupResolver_ForeignKey();

		/**
		 * The meta object literal for the '<em><b>Supplier DAO</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOKUP_RESOLVER__SUPPLIER_DAO = eINSTANCE.getLookupResolver_SupplierDAO();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOKUP_RESOLVER__NAME = eINSTANCE.getLookupResolver_Name();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.QueryDefImpl <em>Query Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.QueryDefImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQueryDef()
		 * @generated
		 */
		EClass QUERY_DEF = eINSTANCE.getQueryDef();

		/**
		 * The meta object literal for the '<em><b>Select Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_DEF__SELECT_CLAUSE = eINSTANCE.getQueryDef_SelectClause();

		/**
		 * The meta object literal for the '<em><b>From Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_DEF__FROM_CLAUSE = eINSTANCE.getQueryDef_FromClause();

		/**
		 * The meta object literal for the '<em><b>Join Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_DEF__JOIN_CLAUSE = eINSTANCE.getQueryDef_JoinClause();

		/**
		 * The meta object literal for the '<em><b>Where Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_DEF__WHERE_CLAUSE = eINSTANCE.getQueryDef_WhereClause();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.SelectClauseImpl <em>Select Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.SelectClauseImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getSelectClause()
		 * @generated
		 */
		EClass SELECT_CLAUSE = eINSTANCE.getSelectClause();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_CLAUSE__COLUMNS = eINSTANCE.getSelectClause_Columns();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.QResultColumnImpl <em>QResult Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.QResultColumnImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQResultColumn()
		 * @generated
		 */
		EClass QRESULT_COLUMN = eINSTANCE.getQResultColumn();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QRESULT_COLUMN__ALIAS = eINSTANCE.getQResultColumn_Alias();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.QTableColumnImpl <em>QTable Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.QTableColumnImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQTableColumn()
		 * @generated
		 */
		EClass QTABLE_COLUMN = eINSTANCE.getQTableColumn();

		/**
		 * The meta object literal for the '<em><b>Qtable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QTABLE_COLUMN__QTABLE = eINSTANCE.getQTableColumn_Qtable();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QTABLE_COLUMN__COLUMN = eINSTANCE.getQTableColumn_Column();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.QCalculatedColumnImpl <em>QCalculated Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.QCalculatedColumnImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQCalculatedColumn()
		 * @generated
		 */
		EClass QCALCULATED_COLUMN = eINSTANCE.getQCalculatedColumn();

		/**
		 * The meta object literal for the '<em><b>Referenced Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QCALCULATED_COLUMN__REFERENCED_COLUMNS = eINSTANCE.getQCalculatedColumn_ReferencedColumns();

		/**
		 * The meta object literal for the '<em><b>Free Text Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QCALCULATED_COLUMN__FREE_TEXT_EXPRESSION = eINSTANCE.getQCalculatedColumn_FreeTextExpression();

		/**
		 * The meta object literal for the '<em><b>Calculated Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QCALCULATED_COLUMN__CALCULATED_TYPE = eINSTANCE.getQCalculatedColumn_CalculatedType();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.FromClauseImpl <em>From Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.FromClauseImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getFromClause()
		 * @generated
		 */
		EClass FROM_CLAUSE = eINSTANCE.getFromClause();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_CLAUSE__TABLES = eINSTANCE.getFromClause_Tables();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.QTableImpl <em>QTable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.QTableImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getQTable()
		 * @generated
		 */
		EClass QTABLE = eINSTANCE.getQTable();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QTABLE__TABLE = eINSTANCE.getQTable_Table();

		/**
		 * The meta object literal for the '<em><b>Alias Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTABLE__ALIAS_NAME = eINSTANCE.getQTable_AliasName();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.JoinClauseImpl <em>Join Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.JoinClauseImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getJoinClause()
		 * @generated
		 */
		EClass JOIN_CLAUSE = eINSTANCE.getJoinClause();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_CLAUSE__CRITERIA = eINSTANCE.getJoinClause_Criteria();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.JoinCriterionImpl <em>Join Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.JoinCriterionImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getJoinCriterion()
		 * @generated
		 */
		EClass JOIN_CRITERION = eINSTANCE.getJoinCriterion();

		/**
		 * The meta object literal for the '<em><b>Left Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_CRITERION__LEFT_TABLE = eINSTANCE.getJoinCriterion_LeftTable();

		/**
		 * The meta object literal for the '<em><b>Left Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_CRITERION__LEFT_COLUMN = eINSTANCE.getJoinCriterion_LeftColumn();

		/**
		 * The meta object literal for the '<em><b>Right Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_CRITERION__RIGHT_TABLE = eINSTANCE.getJoinCriterion_RightTable();

		/**
		 * The meta object literal for the '<em><b>Right Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN_CRITERION__RIGHT_COLUMN = eINSTANCE.getJoinCriterion_RightColumn();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.impl.WhereClauseImpl <em>Where Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.impl.WhereClauseImpl
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getWhereClause()
		 * @generated
		 */
		EClass WHERE_CLAUSE = eINSTANCE.getWhereClause();

		/**
		 * The meta object literal for the '<em><b>Freetext Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHERE_CLAUSE__FREETEXT_EXPRESSION = eINSTANCE.getWhereClause_FreetextExpression();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.CacheabilityTypes <em>Cacheability Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.CacheabilityTypes
		 * @see it.csi.mddtools.datagen.impl.DatagenPackageImpl#getCacheabilityTypes()
		 * @generated
		 */
		EEnum CACHEABILITY_TYPES = eINSTANCE.getCacheabilityTypes();

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
