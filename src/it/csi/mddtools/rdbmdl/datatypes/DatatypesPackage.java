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
package it.csi.mddtools.rdbmdl.datatypes;

import it.csi.mddtools.rdbmdl.RdbmdlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see it.csi.mddtools.rdbmdl.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.csi.it/mddtools/rdbmdl/datatypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesPackage eINSTANCE = it.csi.mddtools.rdbmdl.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.csi.mddtools.rdbmdl.datatypes.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.rdbmdl.datatypes.impl.DomainImpl
	 * @see it.csi.mddtools.rdbmdl.datatypes.impl.DatatypesPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PARENT = RdbmdlPackage.SCHEMA_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__UID = RdbmdlPackage.SCHEMA_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = RdbmdlPackage.SCHEMA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__OWNER = RdbmdlPackage.SCHEMA_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SIZE = RdbmdlPackage.SCHEMA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decimal Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DECIMAL_DIGITS = RdbmdlPackage.SCHEMA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NULLABLE = RdbmdlPackage.SCHEMA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DEFAULT = RdbmdlPackage.SCHEMA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CHECK = RdbmdlPackage.SCHEMA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VAR = RdbmdlPackage.SCHEMA_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TYPE = RdbmdlPackage.SCHEMA_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Parent Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PARENT_DOMAIN = RdbmdlPackage.SCHEMA_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = RdbmdlPackage.SCHEMA_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.rdbmdl.datatypes.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.rdbmdl.datatypes.impl.DataTypeImpl
	 * @see it.csi.mddtools.rdbmdl.datatypes.impl.DatatypesPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__PARENT = RdbmdlPackage.NAMED_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__UID = RdbmdlPackage.NAMED_ELEMENT__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = RdbmdlPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__SIZE = RdbmdlPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decimal Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DECIMAL_DIGITS = RdbmdlPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NULLABLE = RdbmdlPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DEFAULT = RdbmdlPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CHECK = RdbmdlPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__VAR = RdbmdlPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = RdbmdlPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.rdbmdl.datatypes.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.rdbmdl.datatypes.impl.PrimitiveDataTypeImpl
	 * @see it.csi.mddtools.rdbmdl.datatypes.impl.DatatypesPackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__PARENT = DATA_TYPE__PARENT;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__UID = DATA_TYPE__UID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__SIZE = DATA_TYPE__SIZE;

	/**
	 * The feature id for the '<em><b>Decimal Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__DECIMAL_DIGITS = DATA_TYPE__DECIMAL_DIGITS;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__NULLABLE = DATA_TYPE__NULLABLE;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__DEFAULT = DATA_TYPE__DEFAULT;

	/**
	 * The feature id for the '<em><b>Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__CHECK = DATA_TYPE__CHECK;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__VAR = DATA_TYPE__VAR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link it.csi.mddtools.rdbmdl.datatypes.PrimitiveTypeCodes <em>Primitive Type Codes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.rdbmdl.datatypes.PrimitiveTypeCodes
	 * @see it.csi.mddtools.rdbmdl.datatypes.impl.DatatypesPackageImpl#getPrimitiveTypeCodes()
	 * @generated
	 */
	int PRIMITIVE_TYPE_CODES = 3;


	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.rdbmdl.datatypes.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see it.csi.mddtools.rdbmdl.datatypes.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the reference '{@link it.csi.mddtools.rdbmdl.datatypes.Domain#getParentDomain <em>Parent Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Domain</em>'.
	 * @see it.csi.mddtools.rdbmdl.datatypes.Domain#getParentDomain()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ParentDomain();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.rdbmdl.datatypes.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see it.csi.mddtools.rdbmdl.datatypes.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see it.csi.mddtools.rdbmdl.datatypes.DataType#getSize()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Size();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getDecimalDigits <em>Decimal Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Digits</em>'.
	 * @see it.csi.mddtools.rdbmdl.datatypes.DataType#getDecimalDigits()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_DecimalDigits();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.rdbmdl.datatypes.DataType#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see it.csi.mddtools.rdbmdl.datatypes.DataType#isNullable()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see it.csi.mddtools.rdbmdl.datatypes.DataType#getDefault()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Default();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getCheck <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check</em>'.
	 * @see it.csi.mddtools.rdbmdl.datatypes.DataType#getCheck()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Check();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.rdbmdl.datatypes.DataType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var</em>'.
	 * @see it.csi.mddtools.rdbmdl.datatypes.DataType#getVar()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Var();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.rdbmdl.datatypes.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see it.csi.mddtools.rdbmdl.datatypes.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.rdbmdl.datatypes.PrimitiveDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see it.csi.mddtools.rdbmdl.datatypes.PrimitiveDataType#getType()
	 * @see #getPrimitiveDataType()
	 * @generated
	 */
	EAttribute getPrimitiveDataType_Type();

	/**
	 * Returns the meta object for enum '{@link it.csi.mddtools.rdbmdl.datatypes.PrimitiveTypeCodes <em>Primitive Type Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type Codes</em>'.
	 * @see it.csi.mddtools.rdbmdl.datatypes.PrimitiveTypeCodes
	 * @generated
	 */
	EEnum getPrimitiveTypeCodes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

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
		 * The meta object literal for the '{@link it.csi.mddtools.rdbmdl.datatypes.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.rdbmdl.datatypes.impl.DomainImpl
		 * @see it.csi.mddtools.rdbmdl.datatypes.impl.DatatypesPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Parent Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PARENT_DOMAIN = eINSTANCE.getDomain_ParentDomain();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.rdbmdl.datatypes.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.rdbmdl.datatypes.impl.DataTypeImpl
		 * @see it.csi.mddtools.rdbmdl.datatypes.impl.DatatypesPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__SIZE = eINSTANCE.getDataType_Size();

		/**
		 * The meta object literal for the '<em><b>Decimal Digits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__DECIMAL_DIGITS = eINSTANCE.getDataType_DecimalDigits();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__NULLABLE = eINSTANCE.getDataType_Nullable();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__DEFAULT = eINSTANCE.getDataType_Default();

		/**
		 * The meta object literal for the '<em><b>Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__CHECK = eINSTANCE.getDataType_Check();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__VAR = eINSTANCE.getDataType_Var();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.rdbmdl.datatypes.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.rdbmdl.datatypes.impl.PrimitiveDataTypeImpl
		 * @see it.csi.mddtools.rdbmdl.datatypes.impl.DatatypesPackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DATA_TYPE__TYPE = eINSTANCE.getPrimitiveDataType_Type();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.rdbmdl.datatypes.PrimitiveTypeCodes <em>Primitive Type Codes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.rdbmdl.datatypes.PrimitiveTypeCodes
		 * @see it.csi.mddtools.rdbmdl.datatypes.impl.DatatypesPackageImpl#getPrimitiveTypeCodes()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE_CODES = eINSTANCE.getPrimitiveTypeCodes();

	}

} //DatatypesPackage
