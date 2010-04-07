/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.constraints.impl;

import it.csi.mddtools.rdbmdl.constraints.ConstraintsPackage;
import it.csi.mddtools.rdbmdl.constraints.ForeignKey;
import it.csi.mddtools.rdbmdl.constraints.UniqueConstraint;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.constraints.impl.ForeignKeyImpl#getReferredUC <em>Referred UC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends ColumnRefConstraintImpl implements ForeignKey {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueConstraint getReferredUC() {
		return (UniqueConstraint)eGet(ConstraintsPackage.Literals.FOREIGN_KEY__REFERRED_UC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredUC(UniqueConstraint newReferredUC) {
		eSet(ConstraintsPackage.Literals.FOREIGN_KEY__REFERRED_UC, newReferredUC);
	}

} //ForeignKeyImpl
