/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.Erdesignerschema30.impl;

import it.csi.mddtools.datagen.Erdesignerschema30.IndexattributeType;
import it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indexattribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.IndexattributeTypeImpl#getAttributerefid <em>Attributerefid</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.IndexattributeTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.IndexattributeTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndexattributeTypeImpl extends EObjectImpl implements IndexattributeType {
	/**
	 * The default value of the '{@link #getAttributerefid() <em>Attributerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributerefid()
	 * @generated
	 * @ordered
	 */
	protected static final Object ATTRIBUTEREFID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributerefid() <em>Attributerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributerefid()
	 * @generated
	 * @ordered
	 */
	protected Object attributerefid = ATTRIBUTEREFID_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Object expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Object ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Object id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexattributeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return erdesignerschema30Package.Literals.INDEXATTRIBUTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAttributerefid() {
		return attributerefid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributerefid(Object newAttributerefid) {
		Object oldAttributerefid = attributerefid;
		attributerefid = newAttributerefid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.INDEXATTRIBUTE_TYPE__ATTRIBUTEREFID, oldAttributerefid, attributerefid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Object newExpression) {
		Object oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.INDEXATTRIBUTE_TYPE__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Object newId) {
		Object oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.INDEXATTRIBUTE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE__ATTRIBUTEREFID:
				return getAttributerefid();
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE__EXPRESSION:
				return getExpression();
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE__ID:
				return getId();
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
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE__ATTRIBUTEREFID:
				setAttributerefid(newValue);
				return;
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE__EXPRESSION:
				setExpression(newValue);
				return;
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE__ID:
				setId(newValue);
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
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE__ATTRIBUTEREFID:
				setAttributerefid(ATTRIBUTEREFID_EDEFAULT);
				return;
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE__ATTRIBUTEREFID:
				return ATTRIBUTEREFID_EDEFAULT == null ? attributerefid != null : !ATTRIBUTEREFID_EDEFAULT.equals(attributerefid);
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (attributerefid: ");
		result.append(attributerefid);
		result.append(", expression: ");
		result.append(expression);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //IndexattributeTypeImpl
