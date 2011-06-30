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
package it.csi.mddtools.rdbmdl.constraints;

import it.csi.mddtools.rdbmdl.NamedElement;
import it.csi.mddtools.rdbmdl.TableColumn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indexed Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn#isAscending <em>Ascending</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn#getRefColumn <em>Ref Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getIndexedColumn()
 * @model
 * @generated
 */
public interface IndexedColumn extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ascending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ascending</em>' attribute.
	 * @see #setAscending(boolean)
	 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getIndexedColumn_Ascending()
	 * @model
	 * @generated
	 */
	boolean isAscending();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn#isAscending <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ascending</em>' attribute.
	 * @see #isAscending()
	 * @generated
	 */
	void setAscending(boolean value);

	/**
	 * Returns the value of the '<em><b>Ref Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Column</em>' reference.
	 * @see #setRefColumn(TableColumn)
	 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getIndexedColumn_RefColumn()
	 * @model required="true"
	 * @generated
	 */
	TableColumn getRefColumn();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn#getRefColumn <em>Ref Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Column</em>' reference.
	 * @see #getRefColumn()
	 * @generated
	 */
	void setRefColumn(TableColumn value);

} // IndexedColumn
