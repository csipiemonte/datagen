/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.QueryDef#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.QueryDef#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.QueryDef#getJoinClause <em>Join Clause</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.QueryDef#getWhereClause <em>Where Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getQueryDef()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface QueryDef extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Select Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Select Clause</em>' containment reference.
	 * @see #setSelectClause(SelectClause)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQueryDef_SelectClause()
	 * @model containment="true"
	 * @generated
	 */
	SelectClause getSelectClause();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QueryDef#getSelectClause <em>Select Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Clause</em>' containment reference.
	 * @see #getSelectClause()
	 * @generated
	 */
	void setSelectClause(SelectClause value);

	/**
	 * Returns the value of the '<em><b>From Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Clause</em>' containment reference.
	 * @see #setFromClause(FromClause)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQueryDef_FromClause()
	 * @model containment="true"
	 * @generated
	 */
	FromClause getFromClause();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QueryDef#getFromClause <em>From Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Clause</em>' containment reference.
	 * @see #getFromClause()
	 * @generated
	 */
	void setFromClause(FromClause value);

	/**
	 * Returns the value of the '<em><b>Join Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Clause</em>' containment reference.
	 * @see #setJoinClause(JoinClause)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQueryDef_JoinClause()
	 * @model containment="true"
	 * @generated
	 */
	JoinClause getJoinClause();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QueryDef#getJoinClause <em>Join Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Clause</em>' containment reference.
	 * @see #getJoinClause()
	 * @generated
	 */
	void setJoinClause(JoinClause value);

	/**
	 * Returns the value of the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Clause</em>' containment reference.
	 * @see #setWhereClause(WhereClause)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQueryDef_WhereClause()
	 * @model containment="true"
	 * @generated
	 */
	WhereClause getWhereClause();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QueryDef#getWhereClause <em>Where Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Clause</em>' containment reference.
	 * @see #getWhereClause()
	 * @generated
	 */
	void setWhereClause(WhereClause value);

} // QueryDef
