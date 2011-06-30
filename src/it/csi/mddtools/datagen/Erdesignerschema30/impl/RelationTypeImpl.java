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

import it.csi.mddtools.datagen.Erdesignerschema30.MappingType;
import it.csi.mddtools.datagen.Erdesignerschema30.PropertyType;
import it.csi.mddtools.datagen.Erdesignerschema30.RelationType;
import it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl#getExportingtablerefid <em>Exportingtablerefid</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl#getImportingtablerefid <em>Importingtablerefid</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl#getOndelete <em>Ondelete</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl#getOnupdate <em>Onupdate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationTypeImpl extends EObjectImpl implements RelationType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getExportingtablerefid() <em>Exportingtablerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportingtablerefid()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXPORTINGTABLEREFID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExportingtablerefid() <em>Exportingtablerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportingtablerefid()
	 * @generated
	 * @ordered
	 */
	protected Object exportingtablerefid = EXPORTINGTABLEREFID_EDEFAULT;

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
	 * The default value of the '{@link #getImportingtablerefid() <em>Importingtablerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportingtablerefid()
	 * @generated
	 * @ordered
	 */
	protected static final Object IMPORTINGTABLEREFID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportingtablerefid() <em>Importingtablerefid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportingtablerefid()
	 * @generated
	 * @ordered
	 */
	protected Object importingtablerefid = IMPORTINGTABLEREFID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final Object NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Object name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOndelete() <em>Ondelete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOndelete()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONDELETE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOndelete() <em>Ondelete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOndelete()
	 * @generated
	 * @ordered
	 */
	protected Object ondelete = ONDELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnupdate() <em>Onupdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnupdate()
	 * @generated
	 * @ordered
	 */
	protected static final Object ONUPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnupdate() <em>Onupdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnupdate()
	 * @generated
	 * @ordered
	 */
	protected Object onupdate = ONUPDATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return erdesignerschema30Package.Literals.RELATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, erdesignerschema30Package.RELATION_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyType> getProperty() {
		return getGroup().list(erdesignerschema30Package.Literals.RELATION_TYPE__PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComment() {
		return getGroup().list(erdesignerschema30Package.Literals.RELATION_TYPE__COMMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingType> getMapping() {
		return getGroup().list(erdesignerschema30Package.Literals.RELATION_TYPE__MAPPING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExportingtablerefid() {
		return exportingtablerefid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportingtablerefid(Object newExportingtablerefid) {
		Object oldExportingtablerefid = exportingtablerefid;
		exportingtablerefid = newExportingtablerefid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.RELATION_TYPE__EXPORTINGTABLEREFID, oldExportingtablerefid, exportingtablerefid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.RELATION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImportingtablerefid() {
		return importingtablerefid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportingtablerefid(Object newImportingtablerefid) {
		Object oldImportingtablerefid = importingtablerefid;
		importingtablerefid = newImportingtablerefid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.RELATION_TYPE__IMPORTINGTABLEREFID, oldImportingtablerefid, importingtablerefid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Object newName) {
		Object oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.RELATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOndelete() {
		return ondelete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOndelete(Object newOndelete) {
		Object oldOndelete = ondelete;
		ondelete = newOndelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.RELATION_TYPE__ONDELETE, oldOndelete, ondelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOnupdate() {
		return onupdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnupdate(Object newOnupdate) {
		Object oldOnupdate = onupdate;
		onupdate = newOnupdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.RELATION_TYPE__ONUPDATE, oldOnupdate, onupdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case erdesignerschema30Package.RELATION_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case erdesignerschema30Package.RELATION_TYPE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case erdesignerschema30Package.RELATION_TYPE__MAPPING:
				return ((InternalEList<?>)getMapping()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case erdesignerschema30Package.RELATION_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case erdesignerschema30Package.RELATION_TYPE__PROPERTY:
				return getProperty();
			case erdesignerschema30Package.RELATION_TYPE__COMMENT:
				return getComment();
			case erdesignerschema30Package.RELATION_TYPE__MAPPING:
				return getMapping();
			case erdesignerschema30Package.RELATION_TYPE__EXPORTINGTABLEREFID:
				return getExportingtablerefid();
			case erdesignerschema30Package.RELATION_TYPE__ID:
				return getId();
			case erdesignerschema30Package.RELATION_TYPE__IMPORTINGTABLEREFID:
				return getImportingtablerefid();
			case erdesignerschema30Package.RELATION_TYPE__NAME:
				return getName();
			case erdesignerschema30Package.RELATION_TYPE__ONDELETE:
				return getOndelete();
			case erdesignerschema30Package.RELATION_TYPE__ONUPDATE:
				return getOnupdate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case erdesignerschema30Package.RELATION_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case erdesignerschema30Package.RELATION_TYPE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends PropertyType>)newValue);
				return;
			case erdesignerschema30Package.RELATION_TYPE__COMMENT:
				getComment().clear();
				getComment().addAll((Collection<? extends String>)newValue);
				return;
			case erdesignerschema30Package.RELATION_TYPE__MAPPING:
				getMapping().clear();
				getMapping().addAll((Collection<? extends MappingType>)newValue);
				return;
			case erdesignerschema30Package.RELATION_TYPE__EXPORTINGTABLEREFID:
				setExportingtablerefid(newValue);
				return;
			case erdesignerschema30Package.RELATION_TYPE__ID:
				setId(newValue);
				return;
			case erdesignerschema30Package.RELATION_TYPE__IMPORTINGTABLEREFID:
				setImportingtablerefid(newValue);
				return;
			case erdesignerschema30Package.RELATION_TYPE__NAME:
				setName(newValue);
				return;
			case erdesignerschema30Package.RELATION_TYPE__ONDELETE:
				setOndelete(newValue);
				return;
			case erdesignerschema30Package.RELATION_TYPE__ONUPDATE:
				setOnupdate(newValue);
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
			case erdesignerschema30Package.RELATION_TYPE__GROUP:
				getGroup().clear();
				return;
			case erdesignerschema30Package.RELATION_TYPE__PROPERTY:
				getProperty().clear();
				return;
			case erdesignerschema30Package.RELATION_TYPE__COMMENT:
				getComment().clear();
				return;
			case erdesignerschema30Package.RELATION_TYPE__MAPPING:
				getMapping().clear();
				return;
			case erdesignerschema30Package.RELATION_TYPE__EXPORTINGTABLEREFID:
				setExportingtablerefid(EXPORTINGTABLEREFID_EDEFAULT);
				return;
			case erdesignerschema30Package.RELATION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case erdesignerschema30Package.RELATION_TYPE__IMPORTINGTABLEREFID:
				setImportingtablerefid(IMPORTINGTABLEREFID_EDEFAULT);
				return;
			case erdesignerschema30Package.RELATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case erdesignerschema30Package.RELATION_TYPE__ONDELETE:
				setOndelete(ONDELETE_EDEFAULT);
				return;
			case erdesignerschema30Package.RELATION_TYPE__ONUPDATE:
				setOnupdate(ONUPDATE_EDEFAULT);
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
			case erdesignerschema30Package.RELATION_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case erdesignerschema30Package.RELATION_TYPE__PROPERTY:
				return !getProperty().isEmpty();
			case erdesignerschema30Package.RELATION_TYPE__COMMENT:
				return !getComment().isEmpty();
			case erdesignerschema30Package.RELATION_TYPE__MAPPING:
				return !getMapping().isEmpty();
			case erdesignerschema30Package.RELATION_TYPE__EXPORTINGTABLEREFID:
				return EXPORTINGTABLEREFID_EDEFAULT == null ? exportingtablerefid != null : !EXPORTINGTABLEREFID_EDEFAULT.equals(exportingtablerefid);
			case erdesignerschema30Package.RELATION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case erdesignerschema30Package.RELATION_TYPE__IMPORTINGTABLEREFID:
				return IMPORTINGTABLEREFID_EDEFAULT == null ? importingtablerefid != null : !IMPORTINGTABLEREFID_EDEFAULT.equals(importingtablerefid);
			case erdesignerschema30Package.RELATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case erdesignerschema30Package.RELATION_TYPE__ONDELETE:
				return ONDELETE_EDEFAULT == null ? ondelete != null : !ONDELETE_EDEFAULT.equals(ondelete);
			case erdesignerschema30Package.RELATION_TYPE__ONUPDATE:
				return ONUPDATE_EDEFAULT == null ? onupdate != null : !ONUPDATE_EDEFAULT.equals(onupdate);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", exportingtablerefid: ");
		result.append(exportingtablerefid);
		result.append(", id: ");
		result.append(id);
		result.append(", importingtablerefid: ");
		result.append(importingtablerefid);
		result.append(", name: ");
		result.append(name);
		result.append(", ondelete: ");
		result.append(ondelete);
		result.append(", onupdate: ");
		result.append(onupdate);
		result.append(')');
		return result.toString();
	}

} //RelationTypeImpl
