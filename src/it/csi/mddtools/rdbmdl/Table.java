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
package it.csi.mddtools.rdbmdl;

import it.csi.mddtools.rdbmdl.constraints.CheckConstraint;
import it.csi.mddtools.rdbmdl.constraints.ForeignKey;
import it.csi.mddtools.rdbmdl.constraints.Index;
import it.csi.mddtools.rdbmdl.constraints.PrimaryKey;
import it.csi.mddtools.rdbmdl.constraints.UniqueConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.Table#getUniqueConstraints <em>Unique Constraints</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.Table#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.Table#getIndices <em>Indices</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.Table#getChecks <em>Checks</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends NamedColumnSet {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.rdbmdl.TableColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getTable_Columns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TableColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Key</em>' containment reference.
	 * @see #setPrimaryKey(PrimaryKey)
	 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getTable_PrimaryKey()
	 * @model containment="true"
	 * @generated
	 */
	PrimaryKey getPrimaryKey();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.Table#getPrimaryKey <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Key</em>' containment reference.
	 * @see #getPrimaryKey()
	 * @generated
	 */
	void setPrimaryKey(PrimaryKey value);

	/**
	 * Returns the value of the '<em><b>Unique Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.rdbmdl.constraints.UniqueConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Constraints</em>' containment reference list.
	 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getTable_UniqueConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<UniqueConstraint> getUniqueConstraints();

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.rdbmdl.constraints.ForeignKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Keys</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference list.
	 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getTable_ForeignKeys()
	 * @model containment="true"
	 * @generated
	 */
	EList<ForeignKey> getForeignKeys();

	/**
	 * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.rdbmdl.constraints.Index}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' containment reference list.
	 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getTable_Indices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getIndices();

	/**
	 * Returns the value of the '<em><b>Checks</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.rdbmdl.constraints.CheckConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checks</em>' containment reference list.
	 * @see it.csi.mddtools.rdbmdl.RdbmdlPackage#getTable_Checks()
	 * @model containment="true"
	 * @generated
	 */
	EList<CheckConstraint> getChecks();

} // Table
