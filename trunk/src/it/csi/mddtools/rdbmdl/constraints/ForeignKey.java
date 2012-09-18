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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.constraints.ForeignKey#getReferredUC <em>Referred UC</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends ColumnRefConstraint {
	/**
	 * Returns the value of the '<em><b>Referred UC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred UC</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred UC</em>' reference.
	 * @see #setReferredUC(UniqueConstraint)
	 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage#getForeignKey_ReferredUC()
	 * @model required="true"
	 * @generated
	 */
	UniqueConstraint getReferredUC();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.constraints.ForeignKey#getReferredUC <em>Referred UC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred UC</em>' reference.
	 * @see #getReferredUC()
	 * @generated
	 */
	void setReferredUC(UniqueConstraint value);

} // ForeignKey
