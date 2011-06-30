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
package it.csi.mddtools.rdbmdl.datatypes.impl;

import it.csi.mddtools.rdbmdl.datatypes.DataType;
import it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage;

import it.csi.mddtools.rdbmdl.impl.NamedElementImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DataTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DataTypeImpl#getDecimalDigits <em>Decimal Digits</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DataTypeImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DataTypeImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DataTypeImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DataTypeImpl#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DataTypeImpl extends NamedElementImpl implements DataType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return (Integer)eGet(DatatypesPackage.Literals.DATA_TYPE__SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		eSet(DatatypesPackage.Literals.DATA_TYPE__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDecimalDigits() {
		return (Integer)eGet(DatatypesPackage.Literals.DATA_TYPE__DECIMAL_DIGITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalDigits(int newDecimalDigits) {
		eSet(DatatypesPackage.Literals.DATA_TYPE__DECIMAL_DIGITS, newDecimalDigits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullable() {
		return (Boolean)eGet(DatatypesPackage.Literals.DATA_TYPE__NULLABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(boolean newNullable) {
		eSet(DatatypesPackage.Literals.DATA_TYPE__NULLABLE, newNullable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return (String)eGet(DatatypesPackage.Literals.DATA_TYPE__DEFAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		eSet(DatatypesPackage.Literals.DATA_TYPE__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheck() {
		return (String)eGet(DatatypesPackage.Literals.DATA_TYPE__CHECK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheck(String newCheck) {
		eSet(DatatypesPackage.Literals.DATA_TYPE__CHECK, newCheck);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVar() {
		return (String)eGet(DatatypesPackage.Literals.DATA_TYPE__VAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(String newVar) {
		eSet(DatatypesPackage.Literals.DATA_TYPE__VAR, newVar);
	}

} //DataTypeImpl
