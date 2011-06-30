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

import it.csi.mddtools.rdbmdl.Table;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Access Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Agente deputato alla manipolazione dei dati di una singola tabella
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.DataAccessObject#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.DataAccessObject#getMainTable <em>Main Table</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.DataAccessObject#getPkGenerator <em>Pk Generator</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.DataAccessObject#getInserter <em>Inserter</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.DataAccessObject#getFinders <em>Finders</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.DataAccessObject#getUpdaters <em>Updaters</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.DataAccessObject#getDeleters <em>Deleters</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getDataAccessObject()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DataAccessObject extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nome logico del <b>DAO</b>. Deve essere un identificativo vlaido di classe java.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDataAccessObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.DataAccessObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Main Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tabella su cui opera il <b>DAO</b>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Main Table</em>' reference.
	 * @see #setMainTable(Table)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDataAccessObject_MainTable()
	 * @model
	 * @generated
	 */
	Table getMainTable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.DataAccessObject#getMainTable <em>Main Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Table</em>' reference.
	 * @see #getMainTable()
	 * @generated
	 */
	void setMainTable(Table value);

	/**
	 * Returns the value of the '<em><b>Pk Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pk Generator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generatore di primary key (opzionale). Se definito e' utilizzato nelle operazioni di inserimento
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pk Generator</em>' containment reference.
	 * @see #setPkGenerator(PKGenerator)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDataAccessObject_PkGenerator()
	 * @model containment="true"
	 * @generated
	 */
	PKGenerator getPkGenerator();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.DataAccessObject#getPkGenerator <em>Pk Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pk Generator</em>' containment reference.
	 * @see #getPkGenerator()
	 * @generated
	 */
	void setPkGenerator(PKGenerator value);

	/**
	 * Returns the value of the '<em><b>Inserter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inserter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operazione di inserimento di un record
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inserter</em>' containment reference.
	 * @see #setInserter(Inserter)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDataAccessObject_Inserter()
	 * @model containment="true"
	 * @generated
	 */
	Inserter getInserter();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.DataAccessObject#getInserter <em>Inserter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inserter</em>' containment reference.
	 * @see #getInserter()
	 * @generated
	 */
	void setInserter(Inserter value);

	/**
	 * Returns the value of the '<em><b>Finders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finders</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Insieme dei possibili finder definiti per questo <b>DAO</b>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Finders</em>' containment reference.
	 * @see #setFinders(Finders)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDataAccessObject_Finders()
	 * @model containment="true"
	 * @generated
	 */
	Finders getFinders();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.DataAccessObject#getFinders <em>Finders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finders</em>' containment reference.
	 * @see #getFinders()
	 * @generated
	 */
	void setFinders(Finders value);

	/**
	 * Returns the value of the '<em><b>Updaters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updaters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Insieme dei possibili updater definiti per questo <b>DAO</b>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Updaters</em>' containment reference.
	 * @see #setUpdaters(Updaters)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDataAccessObject_Updaters()
	 * @model containment="true"
	 * @generated
	 */
	Updaters getUpdaters();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.DataAccessObject#getUpdaters <em>Updaters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updaters</em>' containment reference.
	 * @see #getUpdaters()
	 * @generated
	 */
	void setUpdaters(Updaters value);

	/**
	 * Returns the value of the '<em><b>Deleters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Insieme dei possibili deleter definiti per questo <b>DAO</b>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deleters</em>' containment reference.
	 * @see #setDeleters(Deleters)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getDataAccessObject_Deleters()
	 * @model containment="true"
	 * @generated
	 */
	Deleters getDeleters();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.DataAccessObject#getDeleters <em>Deleters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleters</em>' containment reference.
	 * @see #getDeleters()
	 * @generated
	 */
	void setDeleters(Deleters value);

} // DataAccessObject
