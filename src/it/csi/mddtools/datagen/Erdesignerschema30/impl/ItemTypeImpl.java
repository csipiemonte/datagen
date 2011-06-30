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
package it.csi.mddtools.datagen.Erdesignerschema30.impl;

import it.csi.mddtools.datagen.Erdesignerschema30.ItemType;
import it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ItemTypeImpl#getCommentrefid <em>Commentrefid</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ItemTypeImpl#getTablerefid <em>Tablerefid</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ItemTypeImpl#getViewrefid <em>Viewrefid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemTypeImpl extends EObjectImpl implements ItemType {
	/**
	 * The default value of the '{@link #getCommentrefid() <em>Commentrefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentrefid()
	 * @generated
	 * @ordered
	 */
	protected static final Object COMMENTREFID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentrefid() <em>Commentrefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentrefid()
	 * @generated
	 * @ordered
	 */
	protected Object commentrefid = COMMENTREFID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTablerefid() <em>Tablerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablerefid()
	 * @generated
	 * @ordered
	 */
	protected static final Object TABLEREFID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTablerefid() <em>Tablerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablerefid()
	 * @generated
	 * @ordered
	 */
	protected Object tablerefid = TABLEREFID_EDEFAULT;

	/**
	 * The default value of the '{@link #getViewrefid() <em>Viewrefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewrefid()
	 * @generated
	 * @ordered
	 */
	protected static final Object VIEWREFID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewrefid() <em>Viewrefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewrefid()
	 * @generated
	 * @ordered
	 */
	protected Object viewrefid = VIEWREFID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return erdesignerschema30Package.Literals.ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCommentrefid() {
		return commentrefid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentrefid(Object newCommentrefid) {
		Object oldCommentrefid = commentrefid;
		commentrefid = newCommentrefid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ITEM_TYPE__COMMENTREFID, oldCommentrefid, commentrefid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTablerefid() {
		return tablerefid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTablerefid(Object newTablerefid) {
		Object oldTablerefid = tablerefid;
		tablerefid = newTablerefid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ITEM_TYPE__TABLEREFID, oldTablerefid, tablerefid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getViewrefid() {
		return viewrefid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewrefid(Object newViewrefid) {
		Object oldViewrefid = viewrefid;
		viewrefid = newViewrefid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ITEM_TYPE__VIEWREFID, oldViewrefid, viewrefid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case erdesignerschema30Package.ITEM_TYPE__COMMENTREFID:
				return getCommentrefid();
			case erdesignerschema30Package.ITEM_TYPE__TABLEREFID:
				return getTablerefid();
			case erdesignerschema30Package.ITEM_TYPE__VIEWREFID:
				return getViewrefid();
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
			case erdesignerschema30Package.ITEM_TYPE__COMMENTREFID:
				setCommentrefid(newValue);
				return;
			case erdesignerschema30Package.ITEM_TYPE__TABLEREFID:
				setTablerefid(newValue);
				return;
			case erdesignerschema30Package.ITEM_TYPE__VIEWREFID:
				setViewrefid(newValue);
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
			case erdesignerschema30Package.ITEM_TYPE__COMMENTREFID:
				setCommentrefid(COMMENTREFID_EDEFAULT);
				return;
			case erdesignerschema30Package.ITEM_TYPE__TABLEREFID:
				setTablerefid(TABLEREFID_EDEFAULT);
				return;
			case erdesignerschema30Package.ITEM_TYPE__VIEWREFID:
				setViewrefid(VIEWREFID_EDEFAULT);
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
			case erdesignerschema30Package.ITEM_TYPE__COMMENTREFID:
				return COMMENTREFID_EDEFAULT == null ? commentrefid != null : !COMMENTREFID_EDEFAULT.equals(commentrefid);
			case erdesignerschema30Package.ITEM_TYPE__TABLEREFID:
				return TABLEREFID_EDEFAULT == null ? tablerefid != null : !TABLEREFID_EDEFAULT.equals(tablerefid);
			case erdesignerschema30Package.ITEM_TYPE__VIEWREFID:
				return VIEWREFID_EDEFAULT == null ? viewrefid != null : !VIEWREFID_EDEFAULT.equals(viewrefid);
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
		result.append(" (commentrefid: ");
		result.append(commentrefid);
		result.append(", tablerefid: ");
		result.append(tablerefid);
		result.append(", viewrefid: ");
		result.append(viewrefid);
		result.append(')');
		return result.toString();
	}

} //ItemTypeImpl
