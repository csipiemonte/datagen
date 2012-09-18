/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen;

import it.csi.mddtools.rdbmdl.datatypes.PrimitiveDataType;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QCalculated Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Inserendo questo tipo
 * di elemento in una clausola SELECT viene inserita in output una colonna 
 * calcolata a seconda del contenuto delle varie propriet&agrave;.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.QCalculatedColumn#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.QCalculatedColumn#getFreeTextExpression <em>Free Text Expression</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.QCalculatedColumn#getCalculatedType <em>Calculated Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getQCalculatedColumn()
 * @model
 * @generated
 */
public interface QCalculatedColumn extends QResultColumn {

	/**
	 * Returns the value of the '<em><b>Referenced Columns</b></em>' containment reference list.
	 * The list contents are of type {@link it.csi.mddtools.datagen.QResultColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Le colonne che sono referenziate nella espressione. L'ordine in cui sono definite
	 * &egrave; rilevante.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Columns</em>' containment reference list.
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQCalculatedColumn_ReferencedColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<QResultColumn> getReferencedColumns();

	/**
	 * Returns the value of the '<em><b>Free Text Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Espressione che coinvolge le colonne referenziate nella property
	 * <i>referencedColumns</i>. L'espressione deve essere scritta nel dialetto SQL
	 * del DBMS target e pu&ograve; contenere segnaposto nella forma <i>$i</i> dove
	 * <i>i</i> rappresenta la posizione a partire da 1 nell'elenco delle colonne referenziate.
	 * L'espressione non pu&ograve; contenere una funzione di aggregazione.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free Text Expression</em>' attribute.
	 * @see #setFreeTextExpression(String)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQCalculatedColumn_FreeTextExpression()
	 * @model required="true"
	 * @generated
	 */
	String getFreeTextExpression();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QCalculatedColumn#getFreeTextExpression <em>Free Text Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Text Expression</em>' attribute.
	 * @see #getFreeTextExpression()
	 * @generated
	 */
	void setFreeTextExpression(String value);

	/**
	 * Returns the value of the '<em><b>Calculated Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Il tipo della colonna calcolata. Dipende:
	 * <ul>
	 * <li>dal tipo delle colonne coinvolte nell'espressione</li>
	 * <li>dall'espressione stessa</li>
	 * </ul>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculated Type</em>' containment reference.
	 * @see #setCalculatedType(PrimitiveDataType)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQCalculatedColumn_CalculatedType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PrimitiveDataType getCalculatedType();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QCalculatedColumn#getCalculatedType <em>Calculated Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated Type</em>' containment reference.
	 * @see #getCalculatedType()
	 * @generated
	 */
	void setCalculatedType(PrimitiveDataType value);
} // QCalculatedColumn
