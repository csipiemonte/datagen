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

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.datagen.DatagenPackage
 * @generated
 */
public class DatagenSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatagenPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagenSwitch() {
		if (modelPackage == null) {
			modelPackage = DatagenPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DatagenPackage.DB_ACCESS_MODEL: {
				DBAccessModel dbAccessModel = (DBAccessModel)theEObject;
				T result = caseDBAccessModel(dbAccessModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.DATA_ACCESS_OBJECT: {
				DataAccessObject dataAccessObject = (DataAccessObject)theEObject;
				T result = caseDataAccessObject(dataAccessObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.DAO_PACKAGE: {
				DaoPackage daoPackage = (DaoPackage)theEObject;
				T result = caseDaoPackage(daoPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.PK_GENERATOR: {
				PKGenerator pkGenerator = (PKGenerator)theEObject;
				T result = casePKGenerator(pkGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.SEQUENCE_PK_GENERATOR: {
				SequencePKGenerator sequencePKGenerator = (SequencePKGenerator)theEObject;
				T result = caseSequencePKGenerator(sequencePKGenerator);
				if (result == null) result = casePKGenerator(sequencePKGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.DB_COMMAND: {
				DBCommand dbCommand = (DBCommand)theEObject;
				T result = caseDBCommand(dbCommand);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.INSERTER: {
				Inserter inserter = (Inserter)theEObject;
				T result = caseInserter(inserter);
				if (result == null) result = caseDBCommand(inserter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.FINDERS: {
				Finders finders = (Finders)theEObject;
				T result = caseFinders(finders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.FINDER: {
				Finder finder = (Finder)theEObject;
				T result = caseFinder(finder);
				if (result == null) result = caseDBCommand(finder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.SINGLE_RES_FINDER: {
				SingleResFinder singleResFinder = (SingleResFinder)theEObject;
				T result = caseSingleResFinder(singleResFinder);
				if (result == null) result = caseFinder(singleResFinder);
				if (result == null) result = caseDBCommand(singleResFinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.MULTI_RES_FINDER: {
				MultiResFinder multiResFinder = (MultiResFinder)theEObject;
				T result = caseMultiResFinder(multiResFinder);
				if (result == null) result = caseFinder(multiResFinder);
				if (result == null) result = caseDBCommand(multiResFinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.ORDER_SPEC: {
				OrderSpec orderSpec = (OrderSpec)theEObject;
				T result = caseOrderSpec(orderSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.ORDER_SPECS: {
				OrderSpecs orderSpecs = (OrderSpecs)theEObject;
				T result = caseOrderSpecs(orderSpecs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.FIND_BY_PK: {
				FindByPK findByPK = (FindByPK)theEObject;
				T result = caseFindByPK(findByPK);
				if (result == null) result = caseSingleResFinder(findByPK);
				if (result == null) result = caseFinder(findByPK);
				if (result == null) result = caseDBCommand(findByPK);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.FIND_ALL: {
				FindAll findAll = (FindAll)theEObject;
				T result = caseFindAll(findAll);
				if (result == null) result = caseMultiResFinder(findAll);
				if (result == null) result = caseFinder(findAll);
				if (result == null) result = caseDBCommand(findAll);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.QBE_FINDER: {
				QBEFinder qbeFinder = (QBEFinder)theEObject;
				T result = caseQBEFinder(qbeFinder);
				if (result == null) result = caseMultiResFinder(qbeFinder);
				if (result == null) result = caseFinder(qbeFinder);
				if (result == null) result = caseDBCommand(qbeFinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.CUSTOM_FINDER: {
				CustomFinder customFinder = (CustomFinder)theEObject;
				T result = caseCustomFinder(customFinder);
				if (result == null) result = caseMultiResFinder(customFinder);
				if (result == null) result = caseFinder(customFinder);
				if (result == null) result = caseDBCommand(customFinder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.UPDATERS: {
				Updaters updaters = (Updaters)theEObject;
				T result = caseUpdaters(updaters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.UPDATER: {
				Updater updater = (Updater)theEObject;
				T result = caseUpdater(updater);
				if (result == null) result = caseDBCommand(updater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.UPDATE_ROW: {
				UpdateRow updateRow = (UpdateRow)theEObject;
				T result = caseUpdateRow(updateRow);
				if (result == null) result = caseUpdater(updateRow);
				if (result == null) result = caseDBCommand(updateRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.UPDATE_COLUMNS: {
				UpdateColumns updateColumns = (UpdateColumns)theEObject;
				T result = caseUpdateColumns(updateColumns);
				if (result == null) result = caseUpdater(updateColumns);
				if (result == null) result = caseDBCommand(updateColumns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.DELETERS: {
				Deleters deleters = (Deleters)theEObject;
				T result = caseDeleters(deleters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.DELETER: {
				Deleter deleter = (Deleter)theEObject;
				T result = caseDeleter(deleter);
				if (result == null) result = caseDBCommand(deleter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.DELETE_BY_PK: {
				DeleteByPK deleteByPK = (DeleteByPK)theEObject;
				T result = caseDeleteByPK(deleteByPK);
				if (result == null) result = caseDeleter(deleteByPK);
				if (result == null) result = caseDBCommand(deleteByPK);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.CUSTOM_UPDATER: {
				CustomUpdater customUpdater = (CustomUpdater)theEObject;
				T result = caseCustomUpdater(customUpdater);
				if (result == null) result = caseUpdater(customUpdater);
				if (result == null) result = caseDBCommand(customUpdater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DatagenPackage.CUSTOM_DELETER: {
				CustomDeleter customDeleter = (CustomDeleter)theEObject;
				T result = caseCustomDeleter(customDeleter);
				if (result == null) result = caseDeleter(customDeleter);
				if (result == null) result = caseDBCommand(customDeleter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Access Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Access Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBAccessModel(DBAccessModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Access Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Access Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataAccessObject(DataAccessObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dao Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dao Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaoPackage(DaoPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PK Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PK Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePKGenerator(PKGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence PK Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence PK Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequencePKGenerator(SequencePKGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDBCommand(DBCommand object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inserter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inserter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInserter(Inserter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinder(Finder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Res Finder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Res Finder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleResFinder(SingleResFinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Res Finder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Res Finder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiResFinder(MultiResFinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderSpec(OrderSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Specs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Specs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderSpecs(OrderSpecs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find By PK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find By PK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindByPK(FindByPK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Find All</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Find All</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFindAll(FindAll object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QBE Finder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QBE Finder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQBEFinder(QBEFinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Finder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Finder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomFinder(CustomFinder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Updaters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Updaters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdaters(Updaters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Updater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Updater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdater(Updater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateRow(UpdateRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Columns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Columns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateColumns(UpdateColumns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deleters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deleters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleters(Deleters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deleter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deleter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleter(Deleter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete By PK</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete By PK</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteByPK(DeleteByPK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Updater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Updater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomUpdater(CustomUpdater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Deleter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Deleter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDeleter(CustomDeleter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finders</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finders</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinders(Finders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DatagenSwitch
