/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen;

import it.csi.mddtools.rdbmdl.TableColumn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QTable Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * La singola colonna che fa parte del risultato della query. Inserendo questo tipo
 * di elemento in una clausola SELECT viene inserita in output la colonna effettiva.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.QTableColumn#getQtable <em>Qtable</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.QTableColumn#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getQTableColumn()
 * @model
 * @generated
 */
public interface QTableColumn extends QResultColumn {
	/**
	 * Returns the value of the '<em><b>Qtable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qtable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tabella a cui appartiene la colonna che si desidera inserire in output.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qtable</em>' reference.
	 * @see #setQtable(QTable)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQTableColumn_Qtable()
	 * @model
	 * @generated
	 */
	QTable getQtable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QTableColumn#getQtable <em>Qtable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qtable</em>' reference.
	 * @see #getQtable()
	 * @generated
	 */
	void setQtable(QTable value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * La colonna effettiva. Deve essere una delle colonne della tabella referenziata
	 * in <i>qtable</i>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(TableColumn)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQTableColumn_Column()
	 * @model
	 * @generated
	 */
	TableColumn getColumn();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QTableColumn#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(TableColumn value);

} // QTableColumn
