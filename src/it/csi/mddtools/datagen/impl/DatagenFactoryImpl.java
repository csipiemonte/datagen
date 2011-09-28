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
package it.csi.mddtools.datagen.impl;

import it.csi.mddtools.datagen.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatagenFactoryImpl extends EFactoryImpl implements DatagenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatagenFactory init() {
		try {
			DatagenFactory theDatagenFactory = (DatagenFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.csi.it/mddtools/datagen"); 
			if (theDatagenFactory != null) {
				return theDatagenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatagenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DatagenPackage.DB_ACCESS_MODEL: return (EObject)createDBAccessModel();
			case DatagenPackage.DATA_ACCESS_OBJECT: return (EObject)createDataAccessObject();
			case DatagenPackage.DAO_PACKAGE: return (EObject)createDaoPackage();
			case DatagenPackage.SEQUENCE_PK_GENERATOR: return (EObject)createSequencePKGenerator();
			case DatagenPackage.INSERTER: return (EObject)createInserter();
			case DatagenPackage.FINDERS: return (EObject)createFinders();
			case DatagenPackage.ORDER_SPEC: return (EObject)createOrderSpec();
			case DatagenPackage.ORDER_SPECS: return (EObject)createOrderSpecs();
			case DatagenPackage.FIND_BY_PK: return (EObject)createFindByPK();
			case DatagenPackage.FIND_ALL: return (EObject)createFindAll();
			case DatagenPackage.QBE_FINDER: return (EObject)createQBEFinder();
			case DatagenPackage.CUSTOM_FINDER: return (EObject)createCustomFinder();
			case DatagenPackage.UPDATERS: return (EObject)createUpdaters();
			case DatagenPackage.UPDATE_ROW: return (EObject)createUpdateRow();
			case DatagenPackage.UPDATE_COLUMNS: return (EObject)createUpdateColumns();
			case DatagenPackage.DELETERS: return (EObject)createDeleters();
			case DatagenPackage.DELETE_BY_PK: return (EObject)createDeleteByPK();
			case DatagenPackage.CUSTOM_UPDATER: return (EObject)createCustomUpdater();
			case DatagenPackage.CUSTOM_DELETER: return (EObject)createCustomDeleter();
			case DatagenPackage.LOOKUP_RESOLVERS: return (EObject)createLookupResolvers();
			case DatagenPackage.LOOKUP_RESOLVER: return (EObject)createLookupResolver();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DatagenPackage.CACHEABILITY_TYPES:
				return createCacheabilityTypesFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DatagenPackage.CACHEABILITY_TYPES:
				return convertCacheabilityTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBAccessModel createDBAccessModel() {
		DBAccessModelImpl dbAccessModel = new DBAccessModelImpl();
		return dbAccessModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataAccessObject createDataAccessObject() {
		DataAccessObjectImpl dataAccessObject = new DataAccessObjectImpl();
		return dataAccessObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaoPackage createDaoPackage() {
		DaoPackageImpl daoPackage = new DaoPackageImpl();
		return daoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequencePKGenerator createSequencePKGenerator() {
		SequencePKGeneratorImpl sequencePKGenerator = new SequencePKGeneratorImpl();
		return sequencePKGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inserter createInserter() {
		InserterImpl inserter = new InserterImpl();
		return inserter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindByPK createFindByPK() {
		FindByPKImpl findByPK = new FindByPKImpl();
		return findByPK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FindAll createFindAll() {
		FindAllImpl findAll = new FindAllImpl();
		return findAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QBEFinder createQBEFinder() {
		QBEFinderImpl qbeFinder = new QBEFinderImpl();
		return qbeFinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomFinder createCustomFinder() {
		CustomFinderImpl customFinder = new CustomFinderImpl();
		return customFinder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Updaters createUpdaters() {
		UpdatersImpl updaters = new UpdatersImpl();
		return updaters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateRow createUpdateRow() {
		UpdateRowImpl updateRow = new UpdateRowImpl();
		return updateRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateColumns createUpdateColumns() {
		UpdateColumnsImpl updateColumns = new UpdateColumnsImpl();
		return updateColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deleters createDeleters() {
		DeletersImpl deleters = new DeletersImpl();
		return deleters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteByPK createDeleteByPK() {
		DeleteByPKImpl deleteByPK = new DeleteByPKImpl();
		return deleteByPK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomUpdater createCustomUpdater() {
		CustomUpdaterImpl customUpdater = new CustomUpdaterImpl();
		return customUpdater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDeleter createCustomDeleter() {
		CustomDeleterImpl customDeleter = new CustomDeleterImpl();
		return customDeleter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupResolvers createLookupResolvers() {
		LookupResolversImpl lookupResolvers = new LookupResolversImpl();
		return lookupResolvers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookupResolver createLookupResolver() {
		LookupResolverImpl lookupResolver = new LookupResolverImpl();
		return lookupResolver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheabilityTypes createCacheabilityTypesFromString(EDataType eDataType, String initialValue) {
		CacheabilityTypes result = CacheabilityTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheabilityTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Finders createFinders() {
		FindersImpl finders = new FindersImpl();
		return finders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSpec createOrderSpec() {
		OrderSpecImpl orderSpec = new OrderSpecImpl();
		return orderSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderSpecs createOrderSpecs() {
		OrderSpecsImpl orderSpecs = new OrderSpecsImpl();
		return orderSpecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagenPackage getDatagenPackage() {
		return (DatagenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatagenPackage getPackage() {
		return DatagenPackage.eINSTANCE;
	}

} //DatagenFactoryImpl
