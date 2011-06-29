/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.datatypes.impl;

import it.csi.mddtools.rdbmdl.datatypes.DataType;
import it.csi.mddtools.rdbmdl.datatypes.DatatypesPackage;
import it.csi.mddtools.rdbmdl.datatypes.Domain;
import it.csi.mddtools.rdbmdl.datatypes.PrimitiveDataType;

import it.csi.mddtools.rdbmdl.datatypes.PrimitiveTypeCodes;
import it.csi.mddtools.rdbmdl.impl.SchemaElementImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DomainImpl#getSize <em>Size</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DomainImpl#getDecimalDigits <em>Decimal Digits</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DomainImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DomainImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DomainImpl#getCheck <em>Check</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DomainImpl#getVar <em>Var</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DomainImpl#getType <em>Type</em>}</li>
 *   <li>{@link it.csi.mddtools.rdbmdl.datatypes.impl.DomainImpl#getParentDomain <em>Parent Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends SchemaElementImpl implements Domain {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.DOMAIN;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeCodes getType() {
		return (PrimitiveTypeCodes)eGet(DatatypesPackage.Literals.PRIMITIVE_DATA_TYPE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PrimitiveTypeCodes newType) {
		eSet(DatatypesPackage.Literals.PRIMITIVE_DATA_TYPE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getParentDomain() {
		return (Domain)eGet(DatatypesPackage.Literals.DOMAIN__PARENT_DOMAIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentDomain(Domain newParentDomain) {
		eSet(DatatypesPackage.Literals.DOMAIN__PARENT_DOMAIN, newParentDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (derivedFeatureID) {
				case DatatypesPackage.DOMAIN__SIZE: return DatatypesPackage.DATA_TYPE__SIZE;
				case DatatypesPackage.DOMAIN__DECIMAL_DIGITS: return DatatypesPackage.DATA_TYPE__DECIMAL_DIGITS;
				case DatatypesPackage.DOMAIN__NULLABLE: return DatatypesPackage.DATA_TYPE__NULLABLE;
				case DatatypesPackage.DOMAIN__DEFAULT: return DatatypesPackage.DATA_TYPE__DEFAULT;
				case DatatypesPackage.DOMAIN__CHECK: return DatatypesPackage.DATA_TYPE__CHECK;
				case DatatypesPackage.DOMAIN__VAR: return DatatypesPackage.DATA_TYPE__VAR;
				default: return -1;
			}
		}
		if (baseClass == PrimitiveDataType.class) {
			switch (derivedFeatureID) {
				case DatatypesPackage.DOMAIN__TYPE: return DatatypesPackage.PRIMITIVE_DATA_TYPE__TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataType.class) {
			switch (baseFeatureID) {
				case DatatypesPackage.DATA_TYPE__SIZE: return DatatypesPackage.DOMAIN__SIZE;
				case DatatypesPackage.DATA_TYPE__DECIMAL_DIGITS: return DatatypesPackage.DOMAIN__DECIMAL_DIGITS;
				case DatatypesPackage.DATA_TYPE__NULLABLE: return DatatypesPackage.DOMAIN__NULLABLE;
				case DatatypesPackage.DATA_TYPE__DEFAULT: return DatatypesPackage.DOMAIN__DEFAULT;
				case DatatypesPackage.DATA_TYPE__CHECK: return DatatypesPackage.DOMAIN__CHECK;
				case DatatypesPackage.DATA_TYPE__VAR: return DatatypesPackage.DOMAIN__VAR;
				default: return -1;
			}
		}
		if (baseClass == PrimitiveDataType.class) {
			switch (baseFeatureID) {
				case DatatypesPackage.PRIMITIVE_DATA_TYPE__TYPE: return DatatypesPackage.DOMAIN__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DomainImpl
