/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
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
