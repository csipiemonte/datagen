/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Elenco (opzionale) dei cirteri di <i>join</i> che devono essere applicati alle
 * tabelle referenziate nella <b>FromClause</b>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.JoinClause#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getJoinClause()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface JoinClause extends CDOObject {

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.JoinCriterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getJoinClause_Criteria()
	 * @model containment="true"
	 * @generated
	 */
	EList<JoinCriterion> getCriteria();
} // JoinClause
