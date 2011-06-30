/**
 * <copyright>
 * (C) Copyright 2011 CSI-PIEMONTE;

 * Concesso in licenza a norma dell'EUPL, esclusivamente versione 1.1;
 * Non e' possibile utilizzare l'opera salvo nel rispetto della Licenza.
 * E' possibile ottenere una copia della Licenza al seguente indirizzo:
 *
 * http://www.eupl.it/opensource/eupl-1-1
 *
 * Salvo diversamente indicato dalla legge applicabile o concordato per 
 * iscritto, il software distribuito secondo i termini della Licenza e' 
 * distribuito "TAL QUALE", SENZA GARANZIE O CONDIZIONI DI ALCUN TIPO,
 * esplicite o implicite.
 * Si veda la Licenza per la lingua specifica che disciplina le autorizzazioni
 * e le limitazioni secondo i termini della Licenza.
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.datatypes;

import it.csi.mddtools.rdbmdl.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getSize <em>Size</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getDecimalDigits <em>Decimal Digits</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.DataType#isNullable <em>Nullable</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getDefault <em>Default</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getCheck <em>Check</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage#getDataType()
 * @model abstract="true"
 * @generated
 */
public interface DataType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage#getDataType_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Decimal Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Digits</em>' attribute.
	 * @see #setDecimalDigits(int)
	 * @see it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage#getDataType_DecimalDigits()
	 * @model
	 * @generated
	 */
	int getDecimalDigits();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getDecimalDigits <em>Decimal Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Digits</em>' attribute.
	 * @see #getDecimalDigits()
	 * @generated
	 */
	void setDecimalDigits(int value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage#getDataType_Nullable()
	 * @model
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.datatypes.DataType#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage#getDataType_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check</em>' attribute.
	 * @see #setCheck(String)
	 * @see it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage#getDataType_Check()
	 * @model
	 * @generated
	 */
	String getCheck();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getCheck <em>Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check</em>' attribute.
	 * @see #getCheck()
	 * @generated
	 */
	void setCheck(String value);

	/**
	 * Returns the value of the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' attribute.
	 * @see #setVar(String)
	 * @see it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage#getDataType_Var()
	 * @model
	 * @generated
	 */
	String getVar();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getVar <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' attribute.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(String value);

} // DataType
