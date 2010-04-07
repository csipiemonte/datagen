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
	 * The number of structural features of the '<em>Data Access Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ACCESS_OBJECT_FEATURE_COUNT = 2;


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

	}

} //DatagenPackage
