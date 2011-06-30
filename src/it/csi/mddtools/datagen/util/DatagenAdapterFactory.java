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
package it.csi.mddtools.datagen.util;

import it.csi.mddtools.datagen.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.datagen.DatagenPackage
 * @generated
 */
public class DatagenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatagenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatagenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatagenSwitch<Adapter> modelSwitch =
		new DatagenSwitch<Adapter>() {
			@Override
			public Adapter caseDBAccessModel(DBAccessModel object) {
				return createDBAccessModelAdapter();
			}
			@Override
			public Adapter caseDataAccessObject(DataAccessObject object) {
				return createDataAccessObjectAdapter();
			}
			@Override
			public Adapter caseDaoPackage(DaoPackage object) {
				return createDaoPackageAdapter();
			}
			@Override
			public Adapter casePKGenerator(PKGenerator object) {
				return createPKGeneratorAdapter();
			}
			@Override
			public Adapter caseSequencePKGenerator(SequencePKGenerator object) {
				return createSequencePKGeneratorAdapter();
			}
			@Override
			public Adapter caseDBCommand(DBCommand object) {
				return createDBCommandAdapter();
			}
			@Override
			public Adapter caseInserter(Inserter object) {
				return createInserterAdapter();
			}
			@Override
			public Adapter caseFinders(Finders object) {
				return createFindersAdapter();
			}
			@Override
			public Adapter caseFinder(Finder object) {
				return createFinderAdapter();
			}
			@Override
			public Adapter caseSingleResFinder(SingleResFinder object) {
				return createSingleResFinderAdapter();
			}
			@Override
			public Adapter caseMultiResFinder(MultiResFinder object) {
				return createMultiResFinderAdapter();
			}
			@Override
			public Adapter caseOrderSpec(OrderSpec object) {
				return createOrderSpecAdapter();
			}
			@Override
			public Adapter caseOrderSpecs(OrderSpecs object) {
				return createOrderSpecsAdapter();
			}
			@Override
			public Adapter caseFindByPK(FindByPK object) {
				return createFindByPKAdapter();
			}
			@Override
			public Adapter caseFindAll(FindAll object) {
				return createFindAllAdapter();
			}
			@Override
			public Adapter caseQBEFinder(QBEFinder object) {
				return createQBEFinderAdapter();
			}
			@Override
			public Adapter caseCustomFinder(CustomFinder object) {
				return createCustomFinderAdapter();
			}
			@Override
			public Adapter caseUpdaters(Updaters object) {
				return createUpdatersAdapter();
			}
			@Override
			public Adapter caseUpdater(Updater object) {
				return createUpdaterAdapter();
			}
			@Override
			public Adapter caseUpdateRow(UpdateRow object) {
				return createUpdateRowAdapter();
			}
			@Override
			public Adapter caseUpdateColumns(UpdateColumns object) {
				return createUpdateColumnsAdapter();
			}
			@Override
			public Adapter caseDeleters(Deleters object) {
				return createDeletersAdapter();
			}
			@Override
			public Adapter caseDeleter(Deleter object) {
				return createDeleterAdapter();
			}
			@Override
			public Adapter caseDeleteByPK(DeleteByPK object) {
				return createDeleteByPKAdapter();
			}
			@Override
			public Adapter caseCustomUpdater(CustomUpdater object) {
				return createCustomUpdaterAdapter();
			}
			@Override
			public Adapter caseCustomDeleter(CustomDeleter object) {
				return createCustomDeleterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.DBAccessModel <em>DB Access Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.DBAccessModel
	 * @generated
	 */
	public Adapter createDBAccessModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.DataAccessObject <em>Data Access Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.DataAccessObject
	 * @generated
	 */
	public Adapter createDataAccessObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.DaoPackage <em>Dao Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.DaoPackage
	 * @generated
	 */
	public Adapter createDaoPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.PKGenerator <em>PK Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.PKGenerator
	 * @generated
	 */
	public Adapter createPKGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.SequencePKGenerator <em>Sequence PK Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.SequencePKGenerator
	 * @generated
	 */
	public Adapter createSequencePKGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.DBCommand <em>DB Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.DBCommand
	 * @generated
	 */
	public Adapter createDBCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Inserter <em>Inserter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Inserter
	 * @generated
	 */
	public Adapter createInserterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Finder <em>Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Finder
	 * @generated
	 */
	public Adapter createFinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.SingleResFinder <em>Single Res Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.SingleResFinder
	 * @generated
	 */
	public Adapter createSingleResFinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.MultiResFinder <em>Multi Res Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.MultiResFinder
	 * @generated
	 */
	public Adapter createMultiResFinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.OrderSpec <em>Order Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.OrderSpec
	 * @generated
	 */
	public Adapter createOrderSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.OrderSpecs <em>Order Specs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.OrderSpecs
	 * @generated
	 */
	public Adapter createOrderSpecsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.FindByPK <em>Find By PK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.FindByPK
	 * @generated
	 */
	public Adapter createFindByPKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.FindAll <em>Find All</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.FindAll
	 * @generated
	 */
	public Adapter createFindAllAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.QBEFinder <em>QBE Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.QBEFinder
	 * @generated
	 */
	public Adapter createQBEFinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.CustomFinder <em>Custom Finder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.CustomFinder
	 * @generated
	 */
	public Adapter createCustomFinderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Updaters <em>Updaters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Updaters
	 * @generated
	 */
	public Adapter createUpdatersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Updater <em>Updater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Updater
	 * @generated
	 */
	public Adapter createUpdaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.UpdateRow <em>Update Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.UpdateRow
	 * @generated
	 */
	public Adapter createUpdateRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.UpdateColumns <em>Update Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.UpdateColumns
	 * @generated
	 */
	public Adapter createUpdateColumnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Deleters <em>Deleters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Deleters
	 * @generated
	 */
	public Adapter createDeletersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Deleter <em>Deleter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Deleter
	 * @generated
	 */
	public Adapter createDeleterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.DeleteByPK <em>Delete By PK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.DeleteByPK
	 * @generated
	 */
	public Adapter createDeleteByPKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.CustomUpdater <em>Custom Updater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.CustomUpdater
	 * @generated
	 */
	public Adapter createCustomUpdaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.CustomDeleter <em>Custom Deleter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.CustomDeleter
	 * @generated
	 */
	public Adapter createCustomDeleterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Finders <em>Finders</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Finders
	 * @generated
	 */
	public Adapter createFindersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DatagenAdapterFactory
