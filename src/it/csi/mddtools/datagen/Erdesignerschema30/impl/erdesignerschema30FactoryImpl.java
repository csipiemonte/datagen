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

import it.csi.mddtools.datagen.Erdesignerschema30.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class erdesignerschema30FactoryImpl extends EFactoryImpl implements erdesignerschema30Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static erdesignerschema30Factory init() {
		try {
			erdesignerschema30Factory theerdesignerschema30Factory = (erdesignerschema30Factory)EPackage.Registry.INSTANCE.getEFactory("platform:/resource/datagen/src/metamodel/erdesignerschema_3.0.xsd"); 
			if (theerdesignerschema30Factory != null) {
				return theerdesignerschema30Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new erdesignerschema30FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public erdesignerschema30FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case erdesignerschema30Package.ATTRIBUTE_TYPE: return createAttributeType();
			case erdesignerschema30Package.COMMENTS_TYPE: return createCommentsType();
			case erdesignerschema30Package.CONFIGURATION_TYPE: return createConfigurationType();
			case erdesignerschema30Package.DOCUMENT_ROOT: return createDocumentRoot();
			case erdesignerschema30Package.DOMAINS_TYPE: return createDomainsType();
			case erdesignerschema30Package.DOMAIN_TYPE: return createDomainType();
			case erdesignerschema30Package.INDEXATTRIBUTE_TYPE: return createIndexattributeType();
			case erdesignerschema30Package.INDEX_TYPE: return createIndexType();
			case erdesignerschema30Package.ITEM_TYPE: return createItemType();
			case erdesignerschema30Package.MAPPING_TYPE: return createMappingType();
			case erdesignerschema30Package.MODEL_COMMENT_TYPE: return createModelCommentType();
			case erdesignerschema30Package.MODEL_TYPE: return createModelType();
			case erdesignerschema30Package.PROPERTY_TYPE: return createPropertyType();
			case erdesignerschema30Package.RELATIONS_TYPE: return createRelationsType();
			case erdesignerschema30Package.RELATION_TYPE: return createRelationType();
			case erdesignerschema30Package.SUBJECTAREAS_TYPE: return createSubjectareasType();
			case erdesignerschema30Package.SUBJECTAREA_TYPE: return createSubjectareaType();
			case erdesignerschema30Package.TABLES_TYPE: return createTablesType();
			case erdesignerschema30Package.TABLE_TYPE: return createTableType();
			case erdesignerschema30Package.VIEWS_TYPE: return createViewsType();
			case erdesignerschema30Package.VIEW_TYPE: return createViewType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case erdesignerschema30Package.COMMENT_TYPE:
				return createCommentTypeFromString(eDataType, initialValue);
			case erdesignerschema30Package.COMMENT_TYPE1:
				return createCommentType1FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case erdesignerschema30Package.COMMENT_TYPE:
				return convertCommentTypeToString(eDataType, instanceValue);
			case erdesignerschema30Package.COMMENT_TYPE1:
				return convertCommentType1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommentsType createCommentsType() {
		CommentsTypeImpl commentsType = new CommentsTypeImpl();
		return commentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationType createConfigurationType() {
		ConfigurationTypeImpl configurationType = new ConfigurationTypeImpl();
		return configurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainsType createDomainsType() {
		DomainsTypeImpl domainsType = new DomainsTypeImpl();
		return domainsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainType createDomainType() {
		DomainTypeImpl domainType = new DomainTypeImpl();
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexattributeType createIndexattributeType() {
		IndexattributeTypeImpl indexattributeType = new IndexattributeTypeImpl();
		return indexattributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexType createIndexType() {
		IndexTypeImpl indexType = new IndexTypeImpl();
		return indexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemType createItemType() {
		ItemTypeImpl itemType = new ItemTypeImpl();
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingType createMappingType() {
		MappingTypeImpl mappingType = new MappingTypeImpl();
		return mappingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelCommentType createModelCommentType() {
		ModelCommentTypeImpl modelCommentType = new ModelCommentTypeImpl();
		return modelCommentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationsType createRelationsType() {
		RelationsTypeImpl relationsType = new RelationsTypeImpl();
		return relationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationType createRelationType() {
		RelationTypeImpl relationType = new RelationTypeImpl();
		return relationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectareasType createSubjectareasType() {
		SubjectareasTypeImpl subjectareasType = new SubjectareasTypeImpl();
		return subjectareasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectareaType createSubjectareaType() {
		SubjectareaTypeImpl subjectareaType = new SubjectareaTypeImpl();
		return subjectareaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablesType createTablesType() {
		TablesTypeImpl tablesType = new TablesTypeImpl();
		return tablesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType createTableType() {
		TableTypeImpl tableType = new TableTypeImpl();
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsType createViewsType() {
		ViewsTypeImpl viewsType = new ViewsTypeImpl();
		return viewsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewType createViewType() {
		ViewTypeImpl viewType = new ViewTypeImpl();
		return viewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCommentTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommentTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCommentType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommentType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public erdesignerschema30Package geterdesignerschema30Package() {
		return (erdesignerschema30Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static erdesignerschema30Package getPackage() {
		return erdesignerschema30Package.eINSTANCE;
	}

} //erdesignerschema30FactoryImpl
