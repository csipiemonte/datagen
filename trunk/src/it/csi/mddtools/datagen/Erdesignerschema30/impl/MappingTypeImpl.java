/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.Erdesignerschema30.impl;

import it.csi.mddtools.datagen.Erdesignerschema30.MappingType;
import it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.MappingTypeImpl#getExportingexpressionrefid <em>Exportingexpressionrefid</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.MappingTypeImpl#getImportingattributerefid <em>Importingattributerefid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingTypeImpl extends EObjectImpl implements MappingType {
	/**
	 * The default value of the '{@link #getExportingexpressionrefid() <em>Exportingexpressionrefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportingexpressionrefid()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXPORTINGEXPRESSIONREFID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExportingexpressionrefid() <em>Exportingexpressionrefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportingexpressionrefid()
	 * @generated
	 * @ordered
	 */
	protected Object exportingexpressionrefid = EXPORTINGEXPRESSIONREFID_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportingattributerefid() <em>Importingattributerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportingattributerefid()
	 * @generated
	 * @ordered
	 */
	protected static final Object IMPORTINGATTRIBUTEREFID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportingattributerefid() <em>Importingattributerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportingattributerefid()
	 * @generated
	 * @ordered
	 */
	protected Object importingattributerefid = IMPORTINGATTRIBUTEREFID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return erdesignerschema30Package.Literals.MAPPING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExportingexpressionrefid() {
		return exportingexpressionrefid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportingexpressionrefid(Object newExportingexpressionrefid) {
		Object oldExportingexpressionrefid = exportingexpressionrefid;
		exportingexpressionrefid = newExportingexpressionrefid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MAPPING_TYPE__EXPORTINGEXPRESSIONREFID, oldExportingexpressionrefid, exportingexpressionrefid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImportingattributerefid() {
		return importingattributerefid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingattributerefid(Object newImportingattributerefid) {
		Object oldImportingattributerefid = importingattributerefid;
		importingattributerefid = newImportingattributerefid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.MAPPING_TYPE__IMPORTINGATTRIBUTEREFID, oldImportingattributerefid, importingattributerefid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case erdesignerschema30Package.MAPPING_TYPE__EXPORTINGEXPRESSIONREFID:
				return getExportingexpressionrefid();
			case erdesignerschema30Package.MAPPING_TYPE__IMPORTINGATTRIBUTEREFID:
				return getImportingattributerefid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case erdesignerschema30Package.MAPPING_TYPE__EXPORTINGEXPRESSIONREFID:
				setExportingexpressionrefid(newValue);
				return;
			case erdesignerschema30Package.MAPPING_TYPE__IMPORTINGATTRIBUTEREFID:
				setImportingattributerefid(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case erdesignerschema30Package.MAPPING_TYPE__EXPORTINGEXPRESSIONREFID:
				setExportingexpressionrefid(EXPORTINGEXPRESSIONREFID_EDEFAULT);
				return;
			case erdesignerschema30Package.MAPPING_TYPE__IMPORTINGATTRIBUTEREFID:
				setImportingattributerefid(IMPORTINGATTRIBUTEREFID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case erdesignerschema30Package.MAPPING_TYPE__EXPORTINGEXPRESSIONREFID:
				return EXPORTINGEXPRESSIONREFID_EDEFAULT == null ? exportingexpressionrefid != null : !EXPORTINGEXPRESSIONREFID_EDEFAULT.equals(exportingexpressionrefid);
			case erdesignerschema30Package.MAPPING_TYPE__IMPORTINGATTRIBUTEREFID:
				return IMPORTINGATTRIBUTEREFID_EDEFAULT == null ? importingattributerefid != null : !IMPORTINGATTRIBUTEREFID_EDEFAULT.equals(importingattributerefid);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (exportingexpressionrefid: ");
		result.append(exportingexpressionrefid);
		result.append(", importingattributerefid: ");
		result.append(importingattributerefid);
		result.append(')');
		return result.toString();
	}

} //MappingTypeImpl
