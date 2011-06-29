/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Updaters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Insieme degli <b>Updater</b> messia a disposizione dal <b>DataAccessObject</b>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Updaters#getUpdaters <em>Updaters</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getUpdaters()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Updaters extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Updaters</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.Updater}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updaters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco degli <b>Updater</b>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Updaters</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getUpdaters_Updaters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Updater> getUpdaters();

} // Updaters
