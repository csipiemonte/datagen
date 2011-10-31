/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen;

import it.csi.mddtools.rdbmdl.TableColumn;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Criterion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.JoinCriterion#getLeftTable <em>Left Table</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.JoinCriterion#getLeftColumn <em>Left Column</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.JoinCriterion#getRightTable <em>Right Table</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.JoinCriterion#getRightColumn <em>Right Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getJoinCriterion()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface JoinCriterion extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Left Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Table</em>' reference.
	 * @see #setLeftTable(QTable)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getJoinCriterion_LeftTable()
	 * @model
	 * @generated
	 */
	QTable getLeftTable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.JoinCriterion#getLeftTable <em>Left Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Table</em>' reference.
	 * @see #getLeftTable()
	 * @generated
	 */
	void setLeftTable(QTable value);

	/**
	 * Returns the value of the '<em><b>Left Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Column</em>' reference.
	 * @see #setLeftColumn(TableColumn)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getJoinCriterion_LeftColumn()
	 * @model
	 * @generated
	 */
	TableColumn getLeftColumn();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.JoinCriterion#getLeftColumn <em>Left Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Column</em>' reference.
	 * @see #getLeftColumn()
	 * @generated
	 */
	void setLeftColumn(TableColumn value);

	/**
	 * Returns the value of the '<em><b>Right Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Table</em>' reference.
	 * @see #setRightTable(QTable)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getJoinCriterion_RightTable()
	 * @model
	 * @generated
	 */
	QTable getRightTable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.JoinCriterion#getRightTable <em>Right Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Table</em>' reference.
	 * @see #getRightTable()
	 * @generated
	 */
	void setRightTable(QTable value);

	/**
	 * Returns the value of the '<em><b>Right Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Column</em>' reference.
	 * @see #setRightColumn(TableColumn)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getJoinCriterion_RightColumn()
	 * @model
	 * @generated
	 */
	TableColumn getRightColumn();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.JoinCriterion#getRightColumn <em>Right Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Column</em>' reference.
	 * @see #getRightColumn()
	 * @generated
	 */
	void setRightColumn(TableColumn value);

} // JoinCriterion
