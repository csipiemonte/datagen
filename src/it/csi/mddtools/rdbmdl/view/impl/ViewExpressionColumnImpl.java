/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.view.impl;

import it.csi.mddtools.rdbmdl.view.ViewExpressionColumn;
import it.csi.mddtools.rdbmdl.view.ViewPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.csi.mddtools.rdbmdl.view.impl.ViewExpressionColumnImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewExpressionColumnImpl extends ViewColumnImpl implements ViewExpressionColumn {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewExpressionColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.VIEW_EXPRESSION_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return (String)eGet(ViewPackage.Literals.VIEW_EXPRESSION_COLUMN__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		eSet(ViewPackage.Literals.VIEW_EXPRESSION_COLUMN__EXPRESSION, newExpression);
	}

} //ViewExpressionColumnImpl