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

import it.csi.mddtools.rdbmdl.Column;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifica di ordinamento relativa ad una singola colonna
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.OrderSpec#getColumn <em>Column</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.OrderSpec#isAscending <em>Ascending</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.OrderSpec#getQcolumn <em>Qcolumn</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getOrderSpec()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface OrderSpec extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * La colonna oggetto dell'ordinamento
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getOrderSpec_Column()
	 * @model
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.OrderSpec#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Ascending</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ascending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifica la direzione di ordinamento: se il valore &egrave; _true_
	 * l'ordinamento &egrave; ascendente, altrimenti discendente
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ascending</em>' attribute.
	 * @see #setAscending(boolean)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getOrderSpec_Ascending()
	 * @model default="true"
	 * @generated
	 */
	boolean isAscending();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.OrderSpec#isAscending <em>Ascending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ascending</em>' attribute.
	 * @see #isAscending()
	 * @generated
	 */
	void setAscending(boolean value);

	/**
	 * Returns the value of the '<em><b>Qcolumn</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * La colonna calcolata oggetto dell'ordinamento (utilizzare questo campo in alternativa al
	 * campo <i>column</i> e solo in un <b>CustomFinder</b> con 
	 * <b>QueryDef<b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qcolumn</em>' reference.
	 * @see #setQcolumn(QTableColumn)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getOrderSpec_Qcolumn()
	 * @model
	 * @generated
	 */
	QTableColumn getQcolumn();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.OrderSpec#getQcolumn <em>Qcolumn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qcolumn</em>' reference.
	 * @see #getQcolumn()
	 * @generated
	 */
	void setQcolumn(QTableColumn value);

} // OrderSpec
