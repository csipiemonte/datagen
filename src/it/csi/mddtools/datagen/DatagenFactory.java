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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.datagen.DatagenPackage
 * @generated
 */
public interface DatagenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatagenFactory eINSTANCE = it.csi.mddtools.datagen.impl.DatagenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DB Access Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DB Access Model</em>'.
	 * @generated
	 */
	DBAccessModel createDBAccessModel();

	/**
	 * Returns a new object of class '<em>Data Access Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Access Object</em>'.
	 * @generated
	 */
	DataAccessObject createDataAccessObject();

	/**
	 * Returns a new object of class '<em>Dao Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dao Package</em>'.
	 * @generated
	 */
	DaoPackage createDaoPackage();

	/**
	 * Returns a new object of class '<em>Sequence PK Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence PK Generator</em>'.
	 * @generated
	 */
	SequencePKGenerator createSequencePKGenerator();

	/**
	 * Returns a new object of class '<em>Inserter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inserter</em>'.
	 * @generated
	 */
	Inserter createInserter();

	/**
	 * Returns a new object of class '<em>Find By PK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find By PK</em>'.
	 * @generated
	 */
	FindByPK createFindByPK();

	/**
	 * Returns a new object of class '<em>Find All</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Find All</em>'.
	 * @generated
	 */
	FindAll createFindAll();

	/**
	 * Returns a new object of class '<em>QBE Finder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QBE Finder</em>'.
	 * @generated
	 */
	QBEFinder createQBEFinder();

	/**
	 * Returns a new object of class '<em>Custom Finder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Finder</em>'.
	 * @generated
	 */
	CustomFinder createCustomFinder();

	/**
	 * Returns a new object of class '<em>Updaters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Updaters</em>'.
	 * @generated
	 */
	Updaters createUpdaters();

	/**
	 * Returns a new object of class '<em>Update Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Row</em>'.
	 * @generated
	 */
	UpdateRow createUpdateRow();

	/**
	 * Returns a new object of class '<em>Update Columns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Columns</em>'.
	 * @generated
	 */
	UpdateColumns createUpdateColumns();

	/**
	 * Returns a new object of class '<em>Deleters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deleters</em>'.
	 * @generated
	 */
	Deleters createDeleters();

	/**
	 * Returns a new object of class '<em>Delete By PK</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete By PK</em>'.
	 * @generated
	 */
	DeleteByPK createDeleteByPK();

	/**
	 * Returns a new object of class '<em>Custom Updater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Updater</em>'.
	 * @generated
	 */
	CustomUpdater createCustomUpdater();

	/**
	 * Returns a new object of class '<em>Custom Deleter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Deleter</em>'.
	 * @generated
	 */
	CustomDeleter createCustomDeleter();

	/**
	 * Returns a new object of class '<em>Lookup Resolvers</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lookup Resolvers</em>'.
	 * @generated
	 */
	LookupResolvers createLookupResolvers();

	/**
	 * Returns a new object of class '<em>Lookup Resolver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lookup Resolver</em>'.
	 * @generated
	 */
	LookupResolver createLookupResolver();

	/**
	 * Returns a new object of class '<em>Query Def</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query Def</em>'.
	 * @generated
	 */
	QueryDef createQueryDef();

	/**
	 * Returns a new object of class '<em>Select Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Clause</em>'.
	 * @generated
	 */
	SelectClause createSelectClause();

	/**
	 * Returns a new object of class '<em>QTable Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QTable Column</em>'.
	 * @generated
	 */
	QTableColumn createQTableColumn();

	/**
	 * Returns a new object of class '<em>QCalculated Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QCalculated Column</em>'.
	 * @generated
	 */
	QCalculatedColumn createQCalculatedColumn();

	/**
	 * Returns a new object of class '<em>From Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>From Clause</em>'.
	 * @generated
	 */
	FromClause createFromClause();

	/**
	 * Returns a new object of class '<em>QTable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QTable</em>'.
	 * @generated
	 */
	QTable createQTable();

	/**
	 * Returns a new object of class '<em>Join Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Clause</em>'.
	 * @generated
	 */
	JoinClause createJoinClause();

	/**
	 * Returns a new object of class '<em>Join Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Criterion</em>'.
	 * @generated
	 */
	JoinCriterion createJoinCriterion();

	/**
	 * Returns a new object of class '<em>Where Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Where Clause</em>'.
	 * @generated
	 */
	WhereClause createWhereClause();

	/**
	 * Returns a new object of class '<em>Finders</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finders</em>'.
	 * @generated
	 */
	Finders createFinders();

	/**
	 * Returns a new object of class '<em>Order Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Spec</em>'.
	 * @generated
	 */
	OrderSpec createOrderSpec();

	/**
	 * Returns a new object of class '<em>Order Specs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Specs</em>'.
	 * @generated
	 */
	OrderSpecs createOrderSpecs();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DatagenPackage getDatagenPackage();

} //DatagenFactory
