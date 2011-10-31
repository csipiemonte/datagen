/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.WhereClause#getFreetextExpression <em>Freetext Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getWhereClause()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface WhereClause extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Freetext Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Freetext Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Freetext Expression</em>' attribute.
	 * @see #setFreetextExpression(String)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getWhereClause_FreetextExpression()
	 * @model
	 * @generated
	 */
	String getFreetextExpression();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.WhereClause#getFreetextExpression <em>Freetext Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freetext Expression</em>' attribute.
	 * @see #getFreetextExpression()
	 * @generated
	 */
	void setFreetextExpression(String value);

} // WhereClause
