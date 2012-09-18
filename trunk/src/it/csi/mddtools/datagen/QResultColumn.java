/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QResult Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Superclasse (astratta) delle colonne che costituiscono l'output di una query.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.QResultColumn#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getQResultColumn()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface QResultColumn extends CDOObject {

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Se presente serve per disambiguare eventuali colonne con lo stesso nome ma
	 * provenienti da differenti tabelle. Nel caso delle colonne calcolate &egrave; 
	 * obbligatorio.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQResultColumn_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QResultColumn#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);
} // QResultColumn
