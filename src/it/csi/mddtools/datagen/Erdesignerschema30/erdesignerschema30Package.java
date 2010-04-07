/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.Erdesignerschema30;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Factory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface erdesignerschema30Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Erdesignerschema30";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/datagen/src/metamodel/erdesignerschema_3.0.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Erdesignerschema30";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	erdesignerschema30Package eINSTANCE = it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl.init();

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__DATATYPE = 1;

	/**
	 * The feature id for the '<em><b>Defaultvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__DEFAULTVALUE = 2;

	/**
	 * The feature id for the '<em><b>Extra</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__EXTRA = 3;

	/**
	 * The feature id for the '<em><b>Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__FRACTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__NULLABLE = 7;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__SCALE = 8;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__SIZE = 9;

	/**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.CommentsTypeImpl <em>Comments Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.CommentsTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getCommentsType()
	 * @generated
	 */
	int COMMENTS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Model Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS_TYPE__MODEL_COMMENT = 1;

	/**
	 * The number of structural features of the '<em>Comments Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ConfigurationTypeImpl <em>Configuration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.ConfigurationTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getConfigurationType()
	 * @generated
	 */
	int CONFIGURATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE__PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Configuration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.DocumentRootImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODEL = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.DomainsTypeImpl <em>Domains Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.DomainsTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getDomainsType()
	 * @generated
	 */
	int DOMAINS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINS_TYPE__DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Domains Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAINS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.DomainTypeImpl <em>Domain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.DomainTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getDomainType()
	 * @generated
	 */
	int DOMAIN_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__DATATYPE = 0;

	/**
	 * The feature id for the '<em><b>Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__FRACTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__NULLABLE = 4;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__SCALE = 5;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE__SIZE = 6;

	/**
	 * The number of structural features of the '<em>Domain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.IndexattributeTypeImpl <em>Indexattribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.IndexattributeTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getIndexattributeType()
	 * @generated
	 */
	int INDEXATTRIBUTE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Attributerefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXATTRIBUTE_TYPE__ATTRIBUTEREFID = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXATTRIBUTE_TYPE__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXATTRIBUTE_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Indexattribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXATTRIBUTE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.IndexTypeImpl <em>Index Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.IndexTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getIndexType()
	 * @generated
	 */
	int INDEX_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Indexattribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TYPE__INDEXATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Indextype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TYPE__INDEXTYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Index Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.ItemTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Commentrefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__COMMENTREFID = 0;

	/**
	 * The feature id for the '<em><b>Tablerefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__TABLEREFID = 1;

	/**
	 * The feature id for the '<em><b>Viewrefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__VIEWREFID = 2;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.MappingTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getMappingType()
	 * @generated
	 */
	int MAPPING_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Exportingexpressionrefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE__EXPORTINGEXPRESSIONREFID = 0;

	/**
	 * The feature id for the '<em><b>Importingattributerefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE__IMPORTINGATTRIBUTEREFID = 1;

	/**
	 * The number of structural features of the '<em>Mapping Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelCommentTypeImpl <em>Model Comment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelCommentTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getModelCommentType()
	 * @generated
	 */
	int MODEL_COMMENT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMMENT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMMENT_TYPE__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMMENT_TYPE__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMMENT_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMMENT_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Model Comment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_COMMENT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__DOMAINS = 1;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__TABLES = 2;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__RELATIONS = 3;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__VIEWS = 4;

	/**
	 * The feature id for the '<em><b>Subjectareas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__SUBJECTAREAS = 5;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__COMMENTS = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__VERSION = 7;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.PropertyTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationsTypeImpl <em>Relations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationsTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getRelationsType()
	 * @generated
	 */
	int RELATIONS_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_TYPE__RELATION = 1;

	/**
	 * The number of structural features of the '<em>Relations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl <em>Relation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getRelationType()
	 * @generated
	 */
	int RELATION_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Exportingtablerefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__EXPORTINGTABLEREFID = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Importingtablerefid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__IMPORTINGTABLEREFID = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Ondelete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__ONDELETE = 8;

	/**
	 * The feature id for the '<em><b>Onupdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE__ONUPDATE = 9;

	/**
	 * The number of structural features of the '<em>Relation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.SubjectareasTypeImpl <em>Subjectareas Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.SubjectareasTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getSubjectareasType()
	 * @generated
	 */
	int SUBJECTAREAS_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTAREAS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Subjectarea</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTAREAS_TYPE__SUBJECTAREA = 1;

	/**
	 * The number of structural features of the '<em>Subjectareas Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTAREAS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.SubjectareaTypeImpl <em>Subjectarea Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.SubjectareaTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getSubjectareaType()
	 * @generated
	 */
	int SUBJECTAREA_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTAREA_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTAREA_TYPE__ITEM = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTAREA_TYPE__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTAREA_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTAREA_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTAREA_TYPE__VISIBLE = 5;

	/**
	 * The number of structural features of the '<em>Subjectarea Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECTAREA_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.TablesTypeImpl <em>Tables Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.TablesTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getTablesType()
	 * @generated
	 */
	int TABLES_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLES_TYPE__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Tables Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.TableTypeImpl <em>Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.TableTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getTableType()
	 * @generated
	 */
	int TABLE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__INDEX = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SCHEMA = 6;

	/**
	 * The number of structural features of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewsTypeImpl <em>Views Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewsTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getViewsType()
	 * @generated
	 */
	int VIEWS_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_TYPE__VIEW = 1;

	/**
	 * The number of structural features of the '<em>Views Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewTypeImpl <em>View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewTypeImpl
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getViewType()
	 * @generated
	 */
	int VIEW_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Sql</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__SQL = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__NAME = 5;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE__SCHEMA = 6;

	/**
	 * The number of structural features of the '<em>View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '<em>Comment Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getCommentType()
	 * @generated
	 */
	int COMMENT_TYPE = 21;

	/**
	 * The meta object id for the '<em>Comment Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getCommentType1()
	 * @generated
	 */
	int COMMENT_TYPE1 = 22;


	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.AttributeType
	 * @generated
	 */
	EClass getAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getComment()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getDatatype()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getDefaultvalue <em>Defaultvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defaultvalue</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getDefaultvalue()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Defaultvalue();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getExtra <em>Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getExtra()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Extra();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getFraction <em>Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraction</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getFraction()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Fraction();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getId()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getName()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getNullable()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getScale()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.AttributeType#getSize()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Size();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.CommentsType <em>Comments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comments Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.CommentsType
	 * @generated
	 */
	EClass getCommentsType();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.CommentsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.CommentsType#getGroup()
	 * @see #getCommentsType()
	 * @generated
	 */
	EAttribute getCommentsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.CommentsType#getModelComment <em>Model Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Comment</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.CommentsType#getModelComment()
	 * @see #getCommentsType()
	 * @generated
	 */
	EReference getCommentsType_ModelComment();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.ConfigurationType <em>Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ConfigurationType
	 * @generated
	 */
	EClass getConfigurationType();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.ConfigurationType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ConfigurationType#getGroup()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EAttribute getConfigurationType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.ConfigurationType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ConfigurationType#getProperty()
	 * @see #getConfigurationType()
	 * @generated
	 */
	EReference getConfigurationType_Property();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot#getModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Model();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainsType <em>Domains Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domains Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainsType
	 * @generated
	 */
	EClass getDomainsType();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainsType#getGroup()
	 * @see #getDomainsType()
	 * @generated
	 */
	EAttribute getDomainsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainsType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainsType#getDomain()
	 * @see #getDomainsType()
	 * @generated
	 */
	EReference getDomainsType_Domain();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainType <em>Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainType
	 * @generated
	 */
	EClass getDomainType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getDatatype()
	 * @see #getDomainType()
	 * @generated
	 */
	EAttribute getDomainType_Datatype();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getFraction <em>Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fraction</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getFraction()
	 * @see #getDomainType()
	 * @generated
	 */
	EAttribute getDomainType_Fraction();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getId()
	 * @see #getDomainType()
	 * @generated
	 */
	EAttribute getDomainType_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getName()
	 * @see #getDomainType()
	 * @generated
	 */
	EAttribute getDomainType_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getNullable()
	 * @see #getDomainType()
	 * @generated
	 */
	EAttribute getDomainType_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getScale()
	 * @see #getDomainType()
	 * @generated
	 */
	EAttribute getDomainType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainType#getSize()
	 * @see #getDomainType()
	 * @generated
	 */
	EAttribute getDomainType_Size();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.IndexattributeType <em>Indexattribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indexattribute Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.IndexattributeType
	 * @generated
	 */
	EClass getIndexattributeType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.IndexattributeType#getAttributerefid <em>Attributerefid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attributerefid</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.IndexattributeType#getAttributerefid()
	 * @see #getIndexattributeType()
	 * @generated
	 */
	EAttribute getIndexattributeType_Attributerefid();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.IndexattributeType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.IndexattributeType#getExpression()
	 * @see #getIndexattributeType()
	 * @generated
	 */
	EAttribute getIndexattributeType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.IndexattributeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.IndexattributeType#getId()
	 * @see #getIndexattributeType()
	 * @generated
	 */
	EAttribute getIndexattributeType_Id();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.IndexType <em>Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.IndexType
	 * @generated
	 */
	EClass getIndexType();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.IndexType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.IndexType#getGroup()
	 * @see #getIndexType()
	 * @generated
	 */
	EAttribute getIndexType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.IndexType#getIndexattribute <em>Indexattribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexattribute</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.IndexType#getIndexattribute()
	 * @see #getIndexType()
	 * @generated
	 */
	EReference getIndexType_Indexattribute();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.IndexType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.IndexType#getId()
	 * @see #getIndexType()
	 * @generated
	 */
	EAttribute getIndexType_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.IndexType#getIndextype <em>Indextype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indextype</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.IndexType#getIndextype()
	 * @see #getIndexType()
	 * @generated
	 */
	EAttribute getIndexType_Indextype();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.IndexType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.IndexType#getName()
	 * @see #getIndexType()
	 * @generated
	 */
	EAttribute getIndexType_Name();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.ItemType#getCommentrefid <em>Commentrefid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commentrefid</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ItemType#getCommentrefid()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Commentrefid();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.ItemType#getTablerefid <em>Tablerefid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tablerefid</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ItemType#getTablerefid()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Tablerefid();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.ItemType#getViewrefid <em>Viewrefid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewrefid</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ItemType#getViewrefid()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Viewrefid();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.MappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.MappingType
	 * @generated
	 */
	EClass getMappingType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.MappingType#getExportingexpressionrefid <em>Exportingexpressionrefid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exportingexpressionrefid</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.MappingType#getExportingexpressionrefid()
	 * @see #getMappingType()
	 * @generated
	 */
	EAttribute getMappingType_Exportingexpressionrefid();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.MappingType#getImportingattributerefid <em>Importingattributerefid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importingattributerefid</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.MappingType#getImportingattributerefid()
	 * @see #getMappingType()
	 * @generated
	 */
	EAttribute getMappingType_Importingattributerefid();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType <em>Model Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Comment Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType
	 * @generated
	 */
	EClass getModelCommentType();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType#getGroup()
	 * @see #getModelCommentType()
	 * @generated
	 */
	EAttribute getModelCommentType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType#getProperty()
	 * @see #getModelCommentType()
	 * @generated
	 */
	EReference getModelCommentType_Property();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comment</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType#getComment()
	 * @see #getModelCommentType()
	 * @generated
	 */
	EAttribute getModelCommentType_Comment();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType#getId()
	 * @see #getModelCommentType()
	 * @generated
	 */
	EAttribute getModelCommentType_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType#getName()
	 * @see #getModelCommentType()
	 * @generated
	 */
	EAttribute getModelCommentType_Name();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getConfiguration()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Configuration();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domains</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getDomains()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Domains();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tables</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getTables()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Tables();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relations</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getRelations()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Relations();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Views</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getViews()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Views();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getSubjectareas <em>Subjectareas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subjectareas</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getSubjectareas()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Subjectareas();

	/**
	 * Returns the meta object for the containment reference '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comments</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getComments()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Comments();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelType#getVersion()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_Version();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationsType <em>Relations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relations Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationsType
	 * @generated
	 */
	EClass getRelationsType();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationsType#getGroup()
	 * @see #getRelationsType()
	 * @generated
	 */
	EAttribute getRelationsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationsType#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationsType#getRelation()
	 * @see #getRelationsType()
	 * @generated
	 */
	EReference getRelationsType_Relation();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationType
	 * @generated
	 */
	EClass getRelationType();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getGroup()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getProperty()
	 * @see #getRelationType()
	 * @generated
	 */
	EReference getRelationType_Property();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comment</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getComment()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getMapping()
	 * @see #getRelationType()
	 * @generated
	 */
	EReference getRelationType_Mapping();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getExportingtablerefid <em>Exportingtablerefid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exportingtablerefid</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getExportingtablerefid()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Exportingtablerefid();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getId()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getImportingtablerefid <em>Importingtablerefid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Importingtablerefid</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getImportingtablerefid()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Importingtablerefid();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getName()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getOndelete <em>Ondelete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ondelete</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getOndelete()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Ondelete();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getOnupdate <em>Onupdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Onupdate</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationType#getOnupdate()
	 * @see #getRelationType()
	 * @generated
	 */
	EAttribute getRelationType_Onupdate();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareasType <em>Subjectareas Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subjectareas Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.SubjectareasType
	 * @generated
	 */
	EClass getSubjectareasType();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareasType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.SubjectareasType#getGroup()
	 * @see #getSubjectareasType()
	 * @generated
	 */
	EAttribute getSubjectareasType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareasType#getSubjectarea <em>Subjectarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subjectarea</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.SubjectareasType#getSubjectarea()
	 * @see #getSubjectareasType()
	 * @generated
	 */
	EReference getSubjectareasType_Subjectarea();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType <em>Subjectarea Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subjectarea Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType
	 * @generated
	 */
	EClass getSubjectareaType();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType#getGroup()
	 * @see #getSubjectareaType()
	 * @generated
	 */
	EAttribute getSubjectareaType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType#getItem()
	 * @see #getSubjectareaType()
	 * @generated
	 */
	EReference getSubjectareaType_Item();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType#getColor()
	 * @see #getSubjectareaType()
	 * @generated
	 */
	EAttribute getSubjectareaType_Color();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType#getId()
	 * @see #getSubjectareaType()
	 * @generated
	 */
	EAttribute getSubjectareaType_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType#getName()
	 * @see #getSubjectareaType()
	 * @generated
	 */
	EAttribute getSubjectareaType_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType#getVisible()
	 * @see #getSubjectareaType()
	 * @generated
	 */
	EAttribute getSubjectareaType_Visible();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.TablesType <em>Tables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tables Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TablesType
	 * @generated
	 */
	EClass getTablesType();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.TablesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TablesType#getGroup()
	 * @see #getTablesType()
	 * @generated
	 */
	EAttribute getTablesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.TablesType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TablesType#getTable()
	 * @see #getTablesType()
	 * @generated
	 */
	EReference getTablesType_Table();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TableType
	 * @generated
	 */
	EClass getTableType();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TableType#getProperty()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Property();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TableType#getComment()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TableType#getAttribute()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TableType#getIndex()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Index();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TableType#getId()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TableType#getName()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TableType#getSchema()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Schema();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewsType <em>Views Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Views Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewsType
	 * @generated
	 */
	EClass getViewsType();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewsType#getGroup()
	 * @see #getViewsType()
	 * @generated
	 */
	EAttribute getViewsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewsType#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewsType#getView()
	 * @see #getViewsType()
	 * @generated
	 */
	EReference getViewsType_View();

	/**
	 * Returns the meta object for class '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Type</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewType
	 * @generated
	 */
	EClass getViewType();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getGroup()
	 * @see #getViewType()
	 * @generated
	 */
	EAttribute getViewType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getProperty()
	 * @see #getViewType()
	 * @generated
	 */
	EReference getViewType_Property();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comment</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getComment()
	 * @see #getViewType()
	 * @generated
	 */
	EAttribute getViewType_Comment();

	/**
	 * Returns the meta object for the attribute list '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getSql <em>Sql</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sql</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getSql()
	 * @see #getViewType()
	 * @generated
	 */
	EAttribute getViewType_Sql();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getId()
	 * @see #getViewType()
	 * @generated
	 */
	EAttribute getViewType_Id();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getName()
	 * @see #getViewType()
	 * @generated
	 */
	EAttribute getViewType_Name();

	/**
	 * Returns the meta object for the attribute '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema</em>'.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewType#getSchema()
	 * @see #getViewType()
	 * @generated
	 */
	EAttribute getViewType_Schema();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Comment Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Comment_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCommentType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Comment Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Comment Type1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CommentType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCommentType1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	erdesignerschema30Factory geterdesignerschema30Factory();

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
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.AttributeTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getAttributeType()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__COMMENT = eINSTANCE.getAttributeType_Comment();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__DATATYPE = eINSTANCE.getAttributeType_Datatype();

		/**
		 * The meta object literal for the '<em><b>Defaultvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__DEFAULTVALUE = eINSTANCE.getAttributeType_Defaultvalue();

		/**
		 * The meta object literal for the '<em><b>Extra</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__EXTRA = eINSTANCE.getAttributeType_Extra();

		/**
		 * The meta object literal for the '<em><b>Fraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__FRACTION = eINSTANCE.getAttributeType_Fraction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__ID = eINSTANCE.getAttributeType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__NAME = eINSTANCE.getAttributeType_Name();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__NULLABLE = eINSTANCE.getAttributeType_Nullable();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__SCALE = eINSTANCE.getAttributeType_Scale();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__SIZE = eINSTANCE.getAttributeType_Size();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.CommentsTypeImpl <em>Comments Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.CommentsTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getCommentsType()
		 * @generated
		 */
		EClass COMMENTS_TYPE = eINSTANCE.getCommentsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENTS_TYPE__GROUP = eINSTANCE.getCommentsType_Group();

		/**
		 * The meta object literal for the '<em><b>Model Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENTS_TYPE__MODEL_COMMENT = eINSTANCE.getCommentsType_ModelComment();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ConfigurationTypeImpl <em>Configuration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.ConfigurationTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getConfigurationType()
		 * @generated
		 */
		EClass CONFIGURATION_TYPE = eINSTANCE.getConfigurationType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION_TYPE__GROUP = eINSTANCE.getConfigurationType_Group();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_TYPE__PROPERTY = eINSTANCE.getConfigurationType_Property();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.DocumentRootImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODEL = eINSTANCE.getDocumentRoot_Model();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.DomainsTypeImpl <em>Domains Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.DomainsTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getDomainsType()
		 * @generated
		 */
		EClass DOMAINS_TYPE = eINSTANCE.getDomainsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAINS_TYPE__GROUP = eINSTANCE.getDomainsType_Group();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAINS_TYPE__DOMAIN = eINSTANCE.getDomainsType_Domain();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.DomainTypeImpl <em>Domain Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.DomainTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getDomainType()
		 * @generated
		 */
		EClass DOMAIN_TYPE = eINSTANCE.getDomainType();

		/**
		 * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPE__DATATYPE = eINSTANCE.getDomainType_Datatype();

		/**
		 * The meta object literal for the '<em><b>Fraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPE__FRACTION = eINSTANCE.getDomainType_Fraction();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPE__ID = eINSTANCE.getDomainType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPE__NAME = eINSTANCE.getDomainType_Name();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPE__NULLABLE = eINSTANCE.getDomainType_Nullable();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPE__SCALE = eINSTANCE.getDomainType_Scale();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_TYPE__SIZE = eINSTANCE.getDomainType_Size();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.IndexattributeTypeImpl <em>Indexattribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.IndexattributeTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getIndexattributeType()
		 * @generated
		 */
		EClass INDEXATTRIBUTE_TYPE = eINSTANCE.getIndexattributeType();

		/**
		 * The meta object literal for the '<em><b>Attributerefid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEXATTRIBUTE_TYPE__ATTRIBUTEREFID = eINSTANCE.getIndexattributeType_Attributerefid();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEXATTRIBUTE_TYPE__EXPRESSION = eINSTANCE.getIndexattributeType_Expression();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEXATTRIBUTE_TYPE__ID = eINSTANCE.getIndexattributeType_Id();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.IndexTypeImpl <em>Index Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.IndexTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getIndexType()
		 * @generated
		 */
		EClass INDEX_TYPE = eINSTANCE.getIndexType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_TYPE__GROUP = eINSTANCE.getIndexType_Group();

		/**
		 * The meta object literal for the '<em><b>Indexattribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX_TYPE__INDEXATTRIBUTE = eINSTANCE.getIndexType_Indexattribute();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_TYPE__ID = eINSTANCE.getIndexType_Id();

		/**
		 * The meta object literal for the '<em><b>Indextype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_TYPE__INDEXTYPE = eINSTANCE.getIndexType_Indextype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_TYPE__NAME = eINSTANCE.getIndexType_Name();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.ItemTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '<em><b>Commentrefid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__COMMENTREFID = eINSTANCE.getItemType_Commentrefid();

		/**
		 * The meta object literal for the '<em><b>Tablerefid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__TABLEREFID = eINSTANCE.getItemType_Tablerefid();

		/**
		 * The meta object literal for the '<em><b>Viewrefid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__VIEWREFID = eINSTANCE.getItemType_Viewrefid();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.MappingTypeImpl <em>Mapping Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.MappingTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getMappingType()
		 * @generated
		 */
		EClass MAPPING_TYPE = eINSTANCE.getMappingType();

		/**
		 * The meta object literal for the '<em><b>Exportingexpressionrefid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_TYPE__EXPORTINGEXPRESSIONREFID = eINSTANCE.getMappingType_Exportingexpressionrefid();

		/**
		 * The meta object literal for the '<em><b>Importingattributerefid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_TYPE__IMPORTINGATTRIBUTEREFID = eINSTANCE.getMappingType_Importingattributerefid();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelCommentTypeImpl <em>Model Comment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelCommentTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getModelCommentType()
		 * @generated
		 */
		EClass MODEL_COMMENT_TYPE = eINSTANCE.getModelCommentType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_COMMENT_TYPE__GROUP = eINSTANCE.getModelCommentType_Group();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_COMMENT_TYPE__PROPERTY = eINSTANCE.getModelCommentType_Property();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_COMMENT_TYPE__COMMENT = eINSTANCE.getModelCommentType_Comment();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_COMMENT_TYPE__ID = eINSTANCE.getModelCommentType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_COMMENT_TYPE__NAME = eINSTANCE.getModelCommentType_Name();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.ModelTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__CONFIGURATION = eINSTANCE.getModelType_Configuration();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__DOMAINS = eINSTANCE.getModelType_Domains();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__TABLES = eINSTANCE.getModelType_Tables();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__RELATIONS = eINSTANCE.getModelType_Relations();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__VIEWS = eINSTANCE.getModelType_Views();

		/**
		 * The meta object literal for the '<em><b>Subjectareas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__SUBJECTAREAS = eINSTANCE.getModelType_Subjectareas();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__COMMENTS = eINSTANCE.getModelType_Comments();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__VERSION = eINSTANCE.getModelType_Version();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.PropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.PropertyTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getPropertyType()
		 * @generated
		 */
		EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__NAME = eINSTANCE.getPropertyType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__VALUE = eINSTANCE.getPropertyType_Value();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationsTypeImpl <em>Relations Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationsTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getRelationsType()
		 * @generated
		 */
		EClass RELATIONS_TYPE = eINSTANCE.getRelationsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONS_TYPE__GROUP = eINSTANCE.getRelationsType_Group();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONS_TYPE__RELATION = eINSTANCE.getRelationsType_Relation();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl <em>Relation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.RelationTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getRelationType()
		 * @generated
		 */
		EClass RELATION_TYPE = eINSTANCE.getRelationType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__GROUP = eINSTANCE.getRelationType_Group();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TYPE__PROPERTY = eINSTANCE.getRelationType_Property();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__COMMENT = eINSTANCE.getRelationType_Comment();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_TYPE__MAPPING = eINSTANCE.getRelationType_Mapping();

		/**
		 * The meta object literal for the '<em><b>Exportingtablerefid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__EXPORTINGTABLEREFID = eINSTANCE.getRelationType_Exportingtablerefid();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__ID = eINSTANCE.getRelationType_Id();

		/**
		 * The meta object literal for the '<em><b>Importingtablerefid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__IMPORTINGTABLEREFID = eINSTANCE.getRelationType_Importingtablerefid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__NAME = eINSTANCE.getRelationType_Name();

		/**
		 * The meta object literal for the '<em><b>Ondelete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__ONDELETE = eINSTANCE.getRelationType_Ondelete();

		/**
		 * The meta object literal for the '<em><b>Onupdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_TYPE__ONUPDATE = eINSTANCE.getRelationType_Onupdate();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.SubjectareasTypeImpl <em>Subjectareas Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.SubjectareasTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getSubjectareasType()
		 * @generated
		 */
		EClass SUBJECTAREAS_TYPE = eINSTANCE.getSubjectareasType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECTAREAS_TYPE__GROUP = eINSTANCE.getSubjectareasType_Group();

		/**
		 * The meta object literal for the '<em><b>Subjectarea</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECTAREAS_TYPE__SUBJECTAREA = eINSTANCE.getSubjectareasType_Subjectarea();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.SubjectareaTypeImpl <em>Subjectarea Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.SubjectareaTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getSubjectareaType()
		 * @generated
		 */
		EClass SUBJECTAREA_TYPE = eINSTANCE.getSubjectareaType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECTAREA_TYPE__GROUP = eINSTANCE.getSubjectareaType_Group();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECTAREA_TYPE__ITEM = eINSTANCE.getSubjectareaType_Item();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECTAREA_TYPE__COLOR = eINSTANCE.getSubjectareaType_Color();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECTAREA_TYPE__ID = eINSTANCE.getSubjectareaType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECTAREA_TYPE__NAME = eINSTANCE.getSubjectareaType_Name();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECTAREA_TYPE__VISIBLE = eINSTANCE.getSubjectareaType_Visible();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.TablesTypeImpl <em>Tables Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.TablesTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getTablesType()
		 * @generated
		 */
		EClass TABLES_TYPE = eINSTANCE.getTablesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLES_TYPE__GROUP = eINSTANCE.getTablesType_Group();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLES_TYPE__TABLE = eINSTANCE.getTablesType_Table();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.TableTypeImpl <em>Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.TableTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getTableType()
		 * @generated
		 */
		EClass TABLE_TYPE = eINSTANCE.getTableType();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__PROPERTY = eINSTANCE.getTableType_Property();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__COMMENT = eINSTANCE.getTableType_Comment();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__ATTRIBUTE = eINSTANCE.getTableType_Attribute();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__INDEX = eINSTANCE.getTableType_Index();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__ID = eINSTANCE.getTableType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__NAME = eINSTANCE.getTableType_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__SCHEMA = eINSTANCE.getTableType_Schema();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewsTypeImpl <em>Views Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewsTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getViewsType()
		 * @generated
		 */
		EClass VIEWS_TYPE = eINSTANCE.getViewsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWS_TYPE__GROUP = eINSTANCE.getViewsType_Group();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS_TYPE__VIEW = eINSTANCE.getViewsType_View();

		/**
		 * The meta object literal for the '{@link it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewTypeImpl <em>View Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.ViewTypeImpl
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getViewType()
		 * @generated
		 */
		EClass VIEW_TYPE = eINSTANCE.getViewType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TYPE__GROUP = eINSTANCE.getViewType_Group();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_TYPE__PROPERTY = eINSTANCE.getViewType_Property();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TYPE__COMMENT = eINSTANCE.getViewType_Comment();

		/**
		 * The meta object literal for the '<em><b>Sql</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TYPE__SQL = eINSTANCE.getViewType_Sql();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TYPE__ID = eINSTANCE.getViewType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TYPE__NAME = eINSTANCE.getViewType_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_TYPE__SCHEMA = eINSTANCE.getViewType_Schema();

		/**
		 * The meta object literal for the '<em>Comment Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getCommentType()
		 * @generated
		 */
		EDataType COMMENT_TYPE = eINSTANCE.getCommentType();

		/**
		 * The meta object literal for the '<em>Comment Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see it.csi.mddtools.datagen.Erdesignerschema30.impl.erdesignerschema30PackageImpl#getCommentType1()
		 * @generated
		 */
		EDataType COMMENT_TYPE1 = eINSTANCE.getCommentType1();

	}

} //erdesignerschema30Package
