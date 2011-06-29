/**
 * <copyright>(C) Copyright 2011 CSI-PIEMONTE
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.rdbmdl.constraints;

import it.csi.mddtools.rdbmdl.RdbmdlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.rdbmdl.constraints.ConstraintsFactory
 * @model kind="package"
 * @generated
 */
public interface ConstraintsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constraints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.csi.it/mddtools/rdbmdl/constraints";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "constraints";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintsPackage eINSTANCE = it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintImpl
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__PARENT = RdbmdlPackage.NAMED_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__UID = RdbmdlPackage.NAMED_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = RdbmdlPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = RdbmdlPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.CheckConstraintImpl <em>Check Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.CheckConstraintImpl
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getCheckConstraint()
	 * @generated
	 */
	int CHECK_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__PARENT = CONSTRAINT__PARENT;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__UID = CONSTRAINT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT__EXPRESSION = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.ColumnRefConstraintImpl <em>Column Ref Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.ColumnRefConstraintImpl
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getColumnRefConstraint()
	 * @generated
	 */
	int COLUMN_REF_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REF_CONSTRAINT__PARENT = CONSTRAINT__PARENT;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REF_CONSTRAINT__UID = CONSTRAINT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REF_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Included Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REF_CONSTRAINT__INCLUDED_COLUMNS = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column Ref Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REF_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.UniqueConstraintImpl
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getUniqueConstraint()
	 * @generated
	 */
	int UNIQUE_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__PARENT = COLUMN_REF_CONSTRAINT__PARENT;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__UID = COLUMN_REF_CONSTRAINT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__NAME = COLUMN_REF_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Included Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT__INCLUDED_COLUMNS = COLUMN_REF_CONSTRAINT__INCLUDED_COLUMNS;

	/**
	 * The number of structural features of the '<em>Unique Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_CONSTRAINT_FEATURE_COUNT = COLUMN_REF_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.PrimaryKeyImpl
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__PARENT = UNIQUE_CONSTRAINT__PARENT;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__UID = UNIQUE_CONSTRAINT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = UNIQUE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Included Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__INCLUDED_COLUMNS = UNIQUE_CONSTRAINT__INCLUDED_COLUMNS;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = UNIQUE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.ForeignKeyImpl
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__PARENT = COLUMN_REF_CONSTRAINT__PARENT;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__UID = COLUMN_REF_CONSTRAINT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = COLUMN_REF_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Included Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__INCLUDED_COLUMNS = COLUMN_REF_CONSTRAINT__INCLUDED_COLUMNS;

	/**
	 * The feature id for the '<em><b>Referred UC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERRED_UC = COLUMN_REF_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = COLUMN_REF_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.IndexImpl
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__PARENT = CONSTRAINT__PARENT;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__UID = CONSTRAINT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Indexed Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__INDEXED_COLUMNS = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.IndexedColumnImpl <em>Indexed Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.IndexedColumnImpl
	 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getIndexedColumn()
	 * @generated
	 */
	int INDEXED_COLUMN = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_COLUMN__PARENT = RdbmdlPackage.NAMED_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_COLUMN__UID = RdbmdlPackage.NAMED_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_COLUMN__NAME = RdbmdlPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Ascending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_COLUMN__ASCENDING = RdbmdlPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_COLUMN__REF_COLUMN = RdbmdlPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Indexed Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_COLUMN_FEATURE_COUNT = RdbmdlPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.rdbmdl.constraints.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.rdbmdl.constraints.CheckConstraint <em>Check Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Constraint</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.CheckConstraint
	 * @generated
	 */
	EClass getCheckConstraint();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.rdbmdl.constraints.CheckConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.CheckConstraint#getExpression()
	 * @see #getCheckConstraint()
	 * @generated
	 */
	EAttribute getCheckConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.rdbmdl.constraints.ColumnRefConstraint <em>Column Ref Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Ref Constraint</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.ColumnRefConstraint
	 * @generated
	 */
	EClass getColumnRefConstraint();

	/**
	 * Returns the meta object for the reference list '{@link it.csi.mddtools.rdbmdl.constraints.ColumnRefConstraint#getIncludedColumns <em>Included Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Columns</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.ColumnRefConstraint#getIncludedColumns()
	 * @see #getColumnRefConstraint()
	 * @generated
	 */
	EReference getColumnRefConstraint_IncludedColumns();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.rdbmdl.constraints.UniqueConstraint <em>Unique Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Constraint</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.UniqueConstraint
	 * @generated
	 */
	EClass getUniqueConstraint();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.rdbmdl.constraints.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.rdbmdl.constraints.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.rdbmdl.constraints.ForeignKey#getReferredUC <em>Referred UC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred UC</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.ForeignKey#getReferredUC()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_ReferredUC();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.rdbmdl.constraints.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.rdbmdl.constraints.Index#getIndexedColumns <em>Indexed Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexed Columns</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.Index#getIndexedColumns()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_IndexedColumns();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn <em>Indexed Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indexed Column</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.IndexedColumn
	 * @generated
	 */
	EClass getIndexedColumn();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn#isAscending <em>Ascending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ascending</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.IndexedColumn#isAscending()
	 * @see #getIndexedColumn()
	 * @generated
	 */
	EAttribute getIndexedColumn_Ascending();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.rdbmdl.constraints.IndexedColumn#getRefColumn <em>Ref Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref Column</em>'.
	 * @see it.csi.mddtools.rdbmdl.constraints.IndexedColumn#getRefColumn()
	 * @see #getIndexedColumn()
	 * @generated
	 */
	EReference getIndexedColumn_RefColumn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintsFactory getConstraintsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintImpl
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.CheckConstraintImpl <em>Check Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.CheckConstraintImpl
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getCheckConstraint()
		 * @generated
		 */
		EClass CHECK_CONSTRAINT = eINSTANCE.getCheckConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK_CONSTRAINT__EXPRESSION = eINSTANCE.getCheckConstraint_Expression();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.ColumnRefConstraintImpl <em>Column Ref Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.ColumnRefConstraintImpl
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getColumnRefConstraint()
		 * @generated
		 */
		EClass COLUMN_REF_CONSTRAINT = eINSTANCE.getColumnRefConstraint();

		/**
		 * The meta object literal for the '<em><b>Included Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_REF_CONSTRAINT__INCLUDED_COLUMNS = eINSTANCE.getColumnRefConstraint_IncludedColumns();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.UniqueConstraintImpl
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getUniqueConstraint()
		 * @generated
		 */
		EClass UNIQUE_CONSTRAINT = eINSTANCE.getUniqueConstraint();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.PrimaryKeyImpl
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.ForeignKeyImpl
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Referred UC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFERRED_UC = eINSTANCE.getForeignKey_ReferredUC();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.IndexImpl
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Indexed Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__INDEXED_COLUMNS = eINSTANCE.getIndex_IndexedColumns();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.rdbmdl.constraints.impl.IndexedColumnImpl <em>Indexed Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.IndexedColumnImpl
		 * @see it.csi.mddtools.rdbmdl.constraints.impl.ConstraintsPackageImpl#getIndexedColumn()
		 * @generated
		 */
		EClass INDEXED_COLUMN = eINSTANCE.getIndexedColumn();

		/**
		 * The meta object literal for the '<em><b>Ascending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEXED_COLUMN__ASCENDING = eINSTANCE.getIndexedColumn_Ascending();

		/**
		 * The meta object literal for the '<em><b>Ref Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEXED_COLUMN__REF_COLUMN = eINSTANCE.getIndexedColumn_RefColumn();

	}

} //ConstraintsPackage
