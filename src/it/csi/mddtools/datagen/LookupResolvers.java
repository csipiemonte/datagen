/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup Resolvers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.LookupResolvers#getResolvers <em>Resolvers</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getLookupResolvers()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface LookupResolvers extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Resolvers</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.LookupResolver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolvers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolvers</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getLookupResolvers_Resolvers()
	 * @model containment="true"
	 * @generated
	 */
	EList<LookupResolver> getResolvers();

} // LookupResolvers
