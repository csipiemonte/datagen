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

import it.csi.mddtools.datagen.Erdesignerschema30.AttributeType;
import it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl#getDefaultvalue <em>Defaultvalue</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl#getFraction <em>Fraction</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl#getNullable <em>Nullable</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeTypeImpl extends EObjectImpl implements AttributeType {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected static final Object DATATYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected Object datatype = DATATYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultvalue() <em>Defaultvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultvalue()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEFAULTVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultvalue() <em>Defaultvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultvalue()
	 * @generated
	 * @ordered
	 */
	protected Object defaultvalue = DEFAULTVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtra() <em>Extra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtra()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXTRA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtra() <em>Extra</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtra()
	 * @generated
	 * @ordered
	 */
	protected Object extra = EXTRA_EDEFAULT;

	/**
	 * The default value of the '{@link #getFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected static final Object FRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected Object fraction = FRACTION_EDEFAULT;

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
	 * The default value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable()
	 * @generated
	 * @ordered
	 */
	protected static final Object NULLABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNullable() <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullable()
	 * @generated
	 * @ordered
	 */
	protected Object nullable = NULLABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final Object SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected Object scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Object SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Object size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return erdesignerschema30Package.Literals.ATTRIBUTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ATTRIBUTE_TYPE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(Object newDatatype) {
		Object oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ATTRIBUTE_TYPE__DATATYPE, oldDatatype, datatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDefaultvalue() {
		return defaultvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultvalue(Object newDefaultvalue) {
		Object oldDefaultvalue = defaultvalue;
		defaultvalue = newDefaultvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ATTRIBUTE_TYPE__DEFAULTVALUE, oldDefaultvalue, defaultvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExtra() {
		return extra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtra(Object newExtra) {
		Object oldExtra = extra;
		extra = newExtra;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ATTRIBUTE_TYPE__EXTRA, oldExtra, extra));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getFraction() {
		return fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFraction(Object newFraction) {
		Object oldFraction = fraction;
		fraction = newFraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ATTRIBUTE_TYPE__FRACTION, oldFraction, fraction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ATTRIBUTE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ATTRIBUTE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getNullable() {
		return nullable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullable(Object newNullable) {
		Object oldNullable = nullable;
		nullable = newNullable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ATTRIBUTE_TYPE__NULLABLE, oldNullable, nullable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(Object newScale) {
		Object oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ATTRIBUTE_TYPE__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Object newSize) {
		Object oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, erdesignerschema30Package.ATTRIBUTE_TYPE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case erdesignerschema30Package.ATTRIBUTE_TYPE__COMMENT:
				return getComment();
			case erdesignerschema30Package.ATTRIBUTE_TYPE__DATATYPE:
				return getDatatype();
			case erdesignerschema30Package.ATTRIBUTE_TYPE__DEFAULTVALUE:
				return getDefaultvalue();
			case erdesignerschema30Package.ATTRIBUTE_TYPE__EXTRA:
				return getExtra();
			case erdesignerschema30Package.ATTRIBUTE_TYPE__FRACTION:
				return getFraction();
			case erdesignerschema30Package.ATTRIBUTE_TYPE__ID:
				return getId();
			case erdesignerschema30Package.ATTRIBUTE_TYPE__NAME:
				return getName();
			case erdesignerschema30Package.ATTRIBUTE_TYPE__NULLABLE:
				return getNullable();
			case erdesignerschema30Package.ATTRIBUTE_TYPE__SCALE:
				return getScale();
			case erdesignerschema30Package.ATTRIBUTE_TYPE__SIZE:
				return getSize();
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
			case erdesignerschema30Package.ATTRIBUTE_TYPE__COMMENT:
				setComment((String)newValue);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__DATATYPE:
				setDatatype(newValue);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__DEFAULTVALUE:
				setDefaultvalue(newValue);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__EXTRA:
				setExtra(newValue);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__FRACTION:
				setFraction(newValue);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__ID:
				setId(newValue);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__NAME:
				setName(newValue);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__NULLABLE:
				setNullable(newValue);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__SCALE:
				setScale(newValue);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__SIZE:
				setSize(newValue);
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
			case erdesignerschema30Package.ATTRIBUTE_TYPE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__DATATYPE:
				setDatatype(DATATYPE_EDEFAULT);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__DEFAULTVALUE:
				setDefaultvalue(DEFAULTVALUE_EDEFAULT);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__EXTRA:
				setExtra(EXTRA_EDEFAULT);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__FRACTION:
				setFraction(FRACTION_EDEFAULT);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__NULLABLE:
				setNullable(NULLABLE_EDEFAULT);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case erdesignerschema30Package.ATTRIBUTE_TYPE__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case erdesignerschema30Package.ATTRIBUTE_TYPE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case erdesignerschema30Package.ATTRIBUTE_TYPE__DATATYPE:
				return DATATYPE_EDEFAULT == null ? datatype != null : !DATATYPE_EDEFAULT.equals(datatype);
			case erdesignerschema30Package.ATTRIBUTE_TYPE__DEFAULTVALUE:
				return DEFAULTVALUE_EDEFAULT == null ? defaultvalue != null : !DEFAULTVALUE_EDEFAULT.equals(defaultvalue);
			case erdesignerschema30Package.ATTRIBUTE_TYPE__EXTRA:
				return EXTRA_EDEFAULT == null ? extra != null : !EXTRA_EDEFAULT.equals(extra);
			case erdesignerschema30Package.ATTRIBUTE_TYPE__FRACTION:
				return FRACTION_EDEFAULT == null ? fraction != null : !FRACTION_EDEFAULT.equals(fraction);
			case erdesignerschema30Package.ATTRIBUTE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case erdesignerschema30Package.ATTRIBUTE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case erdesignerschema30Package.ATTRIBUTE_TYPE__NULLABLE:
				return NULLABLE_EDEFAULT == null ? nullable != null : !NULLABLE_EDEFAULT.equals(nullable);
			case erdesignerschema30Package.ATTRIBUTE_TYPE__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case erdesignerschema30Package.ATTRIBUTE_TYPE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", datatype: ");
		result.append(datatype);
		result.append(", defaultvalue: ");
		result.append(defaultvalue);
		result.append(", extra: ");
		result.append(extra);
		result.append(", fraction: ");
		result.append(fraction);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", nullable: ");
		result.append(nullable);
		result.append(", scale: ");
		result.append(scale);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //AttributeTypeImpl
