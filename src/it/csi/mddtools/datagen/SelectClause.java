/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Determina l'elenco delle colonne che costituiscono il risultato della query.
 * Le colonne possono essere di due tipi: 
 * <ul>
 * <li>colonne appartenenti ad una qualsiasi delle tabelle coinvolte (ovvero quelle
 * referenziate nella <b>FromClause</b></li>
 * <li>colonne <i>calcolate</i>, ottenute ad esempio applicando funzioni di
 * aggregazione a colonne effettive (es. somma), oppure applicando altri tipi di funzioni ad
 * una o pi&ugrave; colonne effettive (es. concatenzaione)</li>
 * </ul>
 * Il DTO associato al <b>CustomFinder</b> che utlizza questo tipo di costrutto
 * conterr&agrave; i campi necessari a contenenre adeguatamente i risultati della
 * query e non sar&agrave; il DTO classico associato al DAO.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.SelectClause#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getSelectClause()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface SelectClause extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.QResultColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getSelectClause_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<QResultColumn> getColumns();

} // SelectClause
