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

import it.csi.mddtools.datagen.CacheabilityTypes;
import it.csi.mddtools.datagen.DataAccessObject;
import it.csi.mddtools.datagen.DatagenPackage;

import it.csi.mddtools.datagen.Deleters;
import it.csi.mddtools.datagen.Finders;
import it.csi.mddtools.datagen.Inserter;
import it.csi.mddtools.datagen.PKGenerator;
import it.csi.mddtools.datagen.Updaters;
import it.csi.mddtools.rdbmdl.Table;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Access Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl#getMainTable <em>Main Table</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl#getPkGenerator <em>Pk Generator</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl#getInserter <em>Inserter</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl#getFinders <em>Finders</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl#getDeleters <em>Deleters</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl#getCacheability <em>Cacheability</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.impl.DataAccessObjectImpl#getCacheTTLminutes <em>Cache TT Lminutes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataAccessObjectImpl extends CDOObjectImpl implements DataAccessObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataAccessObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatagenPackage.Literals.DATA_ACCESS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getMainTable() {
		return (Table)eGet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__MAIN_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainTable(Table newMainTable) {
		eSet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__MAIN_TABLE, newMainTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PKGenerator getPkGenerator() {
		return (PKGenerator)eGet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__PK_GENERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPkGenerator(PKGenerator newPkGenerator) {
		eSet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__PK_GENERATOR, newPkGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inserter getInserter() {
		return (Inserter)eGet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__INSERTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInserter(Inserter newInserter) {
		eSet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__INSERTER, newInserter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Finders getFinders() {
		return (Finders)eGet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__FINDERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinders(Finders newFinders) {
		eSet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__FINDERS, newFinders);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Updaters getUpdaters() {
		return (Updaters)eGet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__UPDATERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdaters(Updaters newUpdaters) {
		eSet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__UPDATERS, newUpdaters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deleters getDeleters() {
		return (Deleters)eGet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__DELETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleters(Deleters newDeleters) {
		eSet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__DELETERS, newDeleters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheabilityTypes getCacheability() {
		return (CacheabilityTypes)eGet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__CACHEABILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheability(CacheabilityTypes newCacheability) {
		eSet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__CACHEABILITY, newCacheability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCacheTTLminutes() {
		return (Integer)eGet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__CACHE_TT_LMINUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheTTLminutes(int newCacheTTLminutes) {
		eSet(DatagenPackage.Literals.DATA_ACCESS_OBJECT__CACHE_TT_LMINUTES, newCacheTTLminutes);
	}

} //DataAccessObjectImpl
