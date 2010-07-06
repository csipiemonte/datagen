/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.csi.mddtools.datagen.Erdesignerschema30.impl;

import it.csi.mddtools.datagen.Erdesignerschema30.AttributeType;
import it.csi.mddtools.datagen.Erdesignerschema30.CommentsType;
import it.csi.mddtools.datagen.Erdesignerschema30.ConfigurationType;
import it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot;
import it.csi.mddtools.datagen.Erdesignerschema30.DomainType;
import it.csi.mddtools.datagen.Erdesignerschema30.DomainsType;
import it.csi.mddtools.datagen.Erdesignerschema30.IndexType;
import it.csi.mddtools.datagen.Erdesignerschema30.IndexattributeType;
import it.csi.mddtools.datagen.Erdesignerschema30.ItemType;
import it.csi.mddtools.datagen.Erdesignerschema30.MappingType;
import it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType;
import it.csi.mddtools.datagen.Erdesignerschema30.ModelType;
import it.csi.mddtools.datagen.Erdesignerschema30.PropertyType;
import it.csi.mddtools.datagen.Erdesignerschema30.RelationType;
import it.csi.mddtools.datagen.Erdesignerschema30.RelationsType;
import it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType;
import it.csi.mddtools.datagen.Erdesignerschema30.SubjectareasType;
import it.csi.mddtools.datagen.Erdesignerschema30.TableType;
import it.csi.mddtools.datagen.Erdesignerschema30.TablesType;
import it.csi.mddtools.datagen.Erdesignerschema30.ViewType;
import it.csi.mddtools.datagen.Erdesignerschema30.ViewsType;
import it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Factory;
import it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class erdesignerschema30PackageImpl extends EPackageImpl implements erdesignerschema30Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexattributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCommentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectareasTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectareaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tablesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType commentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType commentType1EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private erdesignerschema30PackageImpl() {
		super(eNS_URI, erdesignerschema30Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link erdesignerschema30Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static erdesignerschema30Package init() {
		if (isInited) return (erdesignerschema30Package)EPackage.Registry.INSTANCE.getEPackage(erdesignerschema30Package.eNS_URI);

		// Obtain or create and register package
		erdesignerschema30PackageImpl theerdesignerschema30Package = (erdesignerschema30PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof erdesignerschema30PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new erdesignerschema30PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theerdesignerschema30Package.createPackageContents();

		// Initialize created meta-data
		theerdesignerschema30Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theerdesignerschema30Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(erdesignerschema30Package.eNS_URI, theerdesignerschema30Package);
		return theerdesignerschema30Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Comment() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Datatype() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Defaultvalue() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Extra() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Fraction() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Id() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Name() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Nullable() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Scale() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Size() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommentsType() {
		return commentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommentsType_Group() {
		return (EAttribute)commentsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommentsType_ModelComment() {
		return (EReference)commentsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationType() {
		return configurationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurationType_Group() {
		return (EAttribute)configurationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationType_Property() {
		return (EReference)configurationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Model() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainsType() {
		return domainsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainsType_Group() {
		return (EAttribute)domainsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainsType_Domain() {
		return (EReference)domainsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainType() {
		return domainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainType_Datatype() {
		return (EAttribute)domainTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainType_Fraction() {
		return (EAttribute)domainTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainType_Id() {
		return (EAttribute)domainTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainType_Name() {
		return (EAttribute)domainTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainType_Nullable() {
		return (EAttribute)domainTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainType_Scale() {
		return (EAttribute)domainTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainType_Size() {
		return (EAttribute)domainTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexattributeType() {
		return indexattributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexattributeType_Attributerefid() {
		return (EAttribute)indexattributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexattributeType_Expression() {
		return (EAttribute)indexattributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexattributeType_Id() {
		return (EAttribute)indexattributeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexType() {
		return indexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexType_Group() {
		return (EAttribute)indexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexType_Indexattribute() {
		return (EReference)indexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexType_Id() {
		return (EAttribute)indexTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexType_Indextype() {
		return (EAttribute)indexTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndexType_Name() {
		return (EAttribute)indexTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemType() {
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Commentrefid() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Tablerefid() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Viewrefid() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingType() {
		return mappingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingType_Exportingexpressionrefid() {
		return (EAttribute)mappingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingType_Importingattributerefid() {
		return (EAttribute)mappingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelCommentType() {
		return modelCommentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelCommentType_Group() {
		return (EAttribute)modelCommentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelCommentType_Property() {
		return (EReference)modelCommentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelCommentType_Comment() {
		return (EAttribute)modelCommentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelCommentType_Id() {
		return (EAttribute)modelCommentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelCommentType_Name() {
		return (EAttribute)modelCommentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelType() {
		return modelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Configuration() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Domains() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Tables() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Relations() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Views() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Subjectareas() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Comments() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelType_Version() {
		return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyType() {
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Name() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Value() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationsType() {
		return relationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationsType_Group() {
		return (EAttribute)relationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationsType_Relation() {
		return (EReference)relationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationType() {
		return relationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationType_Group() {
		return (EAttribute)relationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationType_Property() {
		return (EReference)relationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationType_Comment() {
		return (EAttribute)relationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationType_Mapping() {
		return (EReference)relationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationType_Exportingtablerefid() {
		return (EAttribute)relationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationType_Id() {
		return (EAttribute)relationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationType_Importingtablerefid() {
		return (EAttribute)relationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationType_Name() {
		return (EAttribute)relationTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationType_Ondelete() {
		return (EAttribute)relationTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationType_Onupdate() {
		return (EAttribute)relationTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectareasType() {
		return subjectareasTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectareasType_Group() {
		return (EAttribute)subjectareasTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubjectareasType_Subjectarea() {
		return (EReference)subjectareasTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectareaType() {
		return subjectareaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectareaType_Group() {
		return (EAttribute)subjectareaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubjectareaType_Item() {
		return (EReference)subjectareaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectareaType_Color() {
		return (EAttribute)subjectareaTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectareaType_Id() {
		return (EAttribute)subjectareaTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectareaType_Name() {
		return (EAttribute)subjectareaTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectareaType_Visible() {
		return (EAttribute)subjectareaTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTablesType() {
		return tablesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTablesType_Group() {
		return (EAttribute)tablesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTablesType_Table() {
		return (EReference)tablesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableType() {
		return tableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Property() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Comment() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Attribute() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Index() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Id() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Name() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Schema() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewsType() {
		return viewsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewsType_Group() {
		return (EAttribute)viewsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewsType_View() {
		return (EReference)viewsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewType() {
		return viewTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewType_Group() {
		return (EAttribute)viewTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewType_Property() {
		return (EReference)viewTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewType_Comment() {
		return (EAttribute)viewTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewType_Sql() {
		return (EAttribute)viewTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewType_Id() {
		return (EAttribute)viewTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewType_Name() {
		return (EAttribute)viewTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewType_Schema() {
		return (EAttribute)viewTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommentType() {
		return commentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommentType1() {
		return commentType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public erdesignerschema30Factory geterdesignerschema30Factory() {
		return (erdesignerschema30Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__COMMENT);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__DATATYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__DEFAULTVALUE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__EXTRA);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__FRACTION);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__ID);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__NAME);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__NULLABLE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__SCALE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__SIZE);

		commentsTypeEClass = createEClass(COMMENTS_TYPE);
		createEAttribute(commentsTypeEClass, COMMENTS_TYPE__GROUP);
		createEReference(commentsTypeEClass, COMMENTS_TYPE__MODEL_COMMENT);

		configurationTypeEClass = createEClass(CONFIGURATION_TYPE);
		createEAttribute(configurationTypeEClass, CONFIGURATION_TYPE__GROUP);
		createEReference(configurationTypeEClass, CONFIGURATION_TYPE__PROPERTY);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODEL);

		domainsTypeEClass = createEClass(DOMAINS_TYPE);
		createEAttribute(domainsTypeEClass, DOMAINS_TYPE__GROUP);
		createEReference(domainsTypeEClass, DOMAINS_TYPE__DOMAIN);

		domainTypeEClass = createEClass(DOMAIN_TYPE);
		createEAttribute(domainTypeEClass, DOMAIN_TYPE__DATATYPE);
		createEAttribute(domainTypeEClass, DOMAIN_TYPE__FRACTION);
		createEAttribute(domainTypeEClass, DOMAIN_TYPE__ID);
		createEAttribute(domainTypeEClass, DOMAIN_TYPE__NAME);
		createEAttribute(domainTypeEClass, DOMAIN_TYPE__NULLABLE);
		createEAttribute(domainTypeEClass, DOMAIN_TYPE__SCALE);
		createEAttribute(domainTypeEClass, DOMAIN_TYPE__SIZE);

		indexattributeTypeEClass = createEClass(INDEXATTRIBUTE_TYPE);
		createEAttribute(indexattributeTypeEClass, INDEXATTRIBUTE_TYPE__ATTRIBUTEREFID);
		createEAttribute(indexattributeTypeEClass, INDEXATTRIBUTE_TYPE__EXPRESSION);
		createEAttribute(indexattributeTypeEClass, INDEXATTRIBUTE_TYPE__ID);

		indexTypeEClass = createEClass(INDEX_TYPE);
		createEAttribute(indexTypeEClass, INDEX_TYPE__GROUP);
		createEReference(indexTypeEClass, INDEX_TYPE__INDEXATTRIBUTE);
		createEAttribute(indexTypeEClass, INDEX_TYPE__ID);
		createEAttribute(indexTypeEClass, INDEX_TYPE__INDEXTYPE);
		createEAttribute(indexTypeEClass, INDEX_TYPE__NAME);

		itemTypeEClass = createEClass(ITEM_TYPE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__COMMENTREFID);
		createEAttribute(itemTypeEClass, ITEM_TYPE__TABLEREFID);
		createEAttribute(itemTypeEClass, ITEM_TYPE__VIEWREFID);

		mappingTypeEClass = createEClass(MAPPING_TYPE);
		createEAttribute(mappingTypeEClass, MAPPING_TYPE__EXPORTINGEXPRESSIONREFID);
		createEAttribute(mappingTypeEClass, MAPPING_TYPE__IMPORTINGATTRIBUTEREFID);

		modelCommentTypeEClass = createEClass(MODEL_COMMENT_TYPE);
		createEAttribute(modelCommentTypeEClass, MODEL_COMMENT_TYPE__GROUP);
		createEReference(modelCommentTypeEClass, MODEL_COMMENT_TYPE__PROPERTY);
		createEAttribute(modelCommentTypeEClass, MODEL_COMMENT_TYPE__COMMENT);
		createEAttribute(modelCommentTypeEClass, MODEL_COMMENT_TYPE__ID);
		createEAttribute(modelCommentTypeEClass, MODEL_COMMENT_TYPE__NAME);

		modelTypeEClass = createEClass(MODEL_TYPE);
		createEReference(modelTypeEClass, MODEL_TYPE__CONFIGURATION);
		createEReference(modelTypeEClass, MODEL_TYPE__DOMAINS);
		createEReference(modelTypeEClass, MODEL_TYPE__TABLES);
		createEReference(modelTypeEClass, MODEL_TYPE__RELATIONS);
		createEReference(modelTypeEClass, MODEL_TYPE__VIEWS);
		createEReference(modelTypeEClass, MODEL_TYPE__SUBJECTAREAS);
		createEReference(modelTypeEClass, MODEL_TYPE__COMMENTS);
		createEAttribute(modelTypeEClass, MODEL_TYPE__VERSION);

		propertyTypeEClass = createEClass(PROPERTY_TYPE);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__VALUE);

		relationsTypeEClass = createEClass(RELATIONS_TYPE);
		createEAttribute(relationsTypeEClass, RELATIONS_TYPE__GROUP);
		createEReference(relationsTypeEClass, RELATIONS_TYPE__RELATION);

		relationTypeEClass = createEClass(RELATION_TYPE);
		createEAttribute(relationTypeEClass, RELATION_TYPE__GROUP);
		createEReference(relationTypeEClass, RELATION_TYPE__PROPERTY);
		createEAttribute(relationTypeEClass, RELATION_TYPE__COMMENT);
		createEReference(relationTypeEClass, RELATION_TYPE__MAPPING);
		createEAttribute(relationTypeEClass, RELATION_TYPE__EXPORTINGTABLEREFID);
		createEAttribute(relationTypeEClass, RELATION_TYPE__ID);
		createEAttribute(relationTypeEClass, RELATION_TYPE__IMPORTINGTABLEREFID);
		createEAttribute(relationTypeEClass, RELATION_TYPE__NAME);
		createEAttribute(relationTypeEClass, RELATION_TYPE__ONDELETE);
		createEAttribute(relationTypeEClass, RELATION_TYPE__ONUPDATE);

		subjectareasTypeEClass = createEClass(SUBJECTAREAS_TYPE);
		createEAttribute(subjectareasTypeEClass, SUBJECTAREAS_TYPE__GROUP);
		createEReference(subjectareasTypeEClass, SUBJECTAREAS_TYPE__SUBJECTAREA);

		subjectareaTypeEClass = createEClass(SUBJECTAREA_TYPE);
		createEAttribute(subjectareaTypeEClass, SUBJECTAREA_TYPE__GROUP);
		createEReference(subjectareaTypeEClass, SUBJECTAREA_TYPE__ITEM);
		createEAttribute(subjectareaTypeEClass, SUBJECTAREA_TYPE__COLOR);
		createEAttribute(subjectareaTypeEClass, SUBJECTAREA_TYPE__ID);
		createEAttribute(subjectareaTypeEClass, SUBJECTAREA_TYPE__NAME);
		createEAttribute(subjectareaTypeEClass, SUBJECTAREA_TYPE__VISIBLE);

		tablesTypeEClass = createEClass(TABLES_TYPE);
		createEAttribute(tablesTypeEClass, TABLES_TYPE__GROUP);
		createEReference(tablesTypeEClass, TABLES_TYPE__TABLE);

		tableTypeEClass = createEClass(TABLE_TYPE);
		createEReference(tableTypeEClass, TABLE_TYPE__PROPERTY);
		createEAttribute(tableTypeEClass, TABLE_TYPE__COMMENT);
		createEReference(tableTypeEClass, TABLE_TYPE__ATTRIBUTE);
		createEReference(tableTypeEClass, TABLE_TYPE__INDEX);
		createEAttribute(tableTypeEClass, TABLE_TYPE__ID);
		createEAttribute(tableTypeEClass, TABLE_TYPE__NAME);
		createEAttribute(tableTypeEClass, TABLE_TYPE__SCHEMA);

		viewsTypeEClass = createEClass(VIEWS_TYPE);
		createEAttribute(viewsTypeEClass, VIEWS_TYPE__GROUP);
		createEReference(viewsTypeEClass, VIEWS_TYPE__VIEW);

		viewTypeEClass = createEClass(VIEW_TYPE);
		createEAttribute(viewTypeEClass, VIEW_TYPE__GROUP);
		createEReference(viewTypeEClass, VIEW_TYPE__PROPERTY);
		createEAttribute(viewTypeEClass, VIEW_TYPE__COMMENT);
		createEAttribute(viewTypeEClass, VIEW_TYPE__SQL);
		createEAttribute(viewTypeEClass, VIEW_TYPE__ID);
		createEAttribute(viewTypeEClass, VIEW_TYPE__NAME);
		createEAttribute(viewTypeEClass, VIEW_TYPE__SCHEMA);

		// Create data types
		commentTypeEDataType = createEDataType(COMMENT_TYPE);
		commentType1EDataType = createEDataType(COMMENT_TYPE1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeType_Comment(), this.getCommentType(), "comment", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Datatype(), theXMLTypePackage.getAnySimpleType(), "datatype", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Defaultvalue(), theXMLTypePackage.getAnySimpleType(), "defaultvalue", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Extra(), theXMLTypePackage.getAnySimpleType(), "extra", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Fraction(), theXMLTypePackage.getAnySimpleType(), "fraction", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Id(), theXMLTypePackage.getAnySimpleType(), "id", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Nullable(), theXMLTypePackage.getAnySimpleType(), "nullable", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Scale(), theXMLTypePackage.getAnySimpleType(), "scale", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeType_Size(), theXMLTypePackage.getAnySimpleType(), "size", null, 0, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentsTypeEClass, CommentsType.class, "CommentsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommentsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CommentsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommentsType_ModelComment(), this.getModelCommentType(), null, "modelComment", null, 0, -1, CommentsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(configurationTypeEClass, ConfigurationType.class, "ConfigurationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurationType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ConfigurationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationType_Property(), this.getPropertyType(), null, "property", null, 0, -1, ConfigurationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Model(), this.getModelType(), null, "model", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(domainsTypeEClass, DomainsType.class, "DomainsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DomainsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainsType_Domain(), this.getDomainType(), null, "domain", null, 0, -1, DomainsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(domainTypeEClass, DomainType.class, "DomainType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainType_Datatype(), theXMLTypePackage.getAnySimpleType(), "datatype", null, 1, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainType_Fraction(), theXMLTypePackage.getAnySimpleType(), "fraction", null, 1, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainType_Id(), theXMLTypePackage.getAnySimpleType(), "id", null, 1, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainType_Nullable(), theXMLTypePackage.getAnySimpleType(), "nullable", null, 0, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainType_Scale(), theXMLTypePackage.getAnySimpleType(), "scale", null, 1, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainType_Size(), theXMLTypePackage.getAnySimpleType(), "size", null, 1, 1, DomainType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexattributeTypeEClass, IndexattributeType.class, "IndexattributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexattributeType_Attributerefid(), theXMLTypePackage.getAnySimpleType(), "attributerefid", null, 0, 1, IndexattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexattributeType_Expression(), theXMLTypePackage.getAnySimpleType(), "expression", null, 0, 1, IndexattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexattributeType_Id(), theXMLTypePackage.getAnySimpleType(), "id", null, 1, 1, IndexattributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexTypeEClass, IndexType.class, "IndexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndexType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, IndexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndexType_Indexattribute(), this.getIndexattributeType(), null, "indexattribute", null, 0, -1, IndexType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexType_Id(), theXMLTypePackage.getAnySimpleType(), "id", null, 1, 1, IndexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexType_Indextype(), theXMLTypePackage.getAnySimpleType(), "indextype", null, 1, 1, IndexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndexType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, IndexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemTypeEClass, ItemType.class, "ItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemType_Commentrefid(), theXMLTypePackage.getAnySimpleType(), "commentrefid", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_Tablerefid(), theXMLTypePackage.getAnySimpleType(), "tablerefid", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemType_Viewrefid(), theXMLTypePackage.getAnySimpleType(), "viewrefid", null, 0, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingTypeEClass, MappingType.class, "MappingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappingType_Exportingexpressionrefid(), theXMLTypePackage.getAnySimpleType(), "exportingexpressionrefid", null, 1, 1, MappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMappingType_Importingattributerefid(), theXMLTypePackage.getAnySimpleType(), "importingattributerefid", null, 1, 1, MappingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelCommentTypeEClass, ModelCommentType.class, "ModelCommentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelCommentType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ModelCommentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelCommentType_Property(), this.getPropertyType(), null, "property", null, 0, -1, ModelCommentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelCommentType_Comment(), this.getCommentType1(), "comment", null, 0, -1, ModelCommentType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelCommentType_Id(), theXMLTypePackage.getAnySimpleType(), "id", null, 1, 1, ModelCommentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelCommentType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 0, 1, ModelCommentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelType_Configuration(), this.getConfigurationType(), null, "configuration", null, 1, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Domains(), this.getDomainsType(), null, "domains", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Tables(), this.getTablesType(), null, "tables", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Relations(), this.getRelationsType(), null, "relations", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Views(), this.getViewsType(), null, "views", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Subjectareas(), this.getSubjectareasType(), null, "subjectareas", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Comments(), this.getCommentsType(), null, "comments", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelType_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationsTypeEClass, RelationsType.class, "RelationsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RelationsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationsType_Relation(), this.getRelationType(), null, "relation", null, 0, -1, RelationsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(relationTypeEClass, RelationType.class, "RelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationType_Property(), this.getPropertyType(), null, "property", null, 0, -1, RelationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationType_Comment(), this.getCommentType1(), "comment", null, 0, -1, RelationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelationType_Mapping(), this.getMappingType(), null, "mapping", null, 0, -1, RelationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationType_Exportingtablerefid(), theXMLTypePackage.getAnySimpleType(), "exportingtablerefid", null, 1, 1, RelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationType_Id(), theXMLTypePackage.getAnySimpleType(), "id", null, 1, 1, RelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationType_Importingtablerefid(), theXMLTypePackage.getAnySimpleType(), "importingtablerefid", null, 1, 1, RelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, RelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationType_Ondelete(), theXMLTypePackage.getAnySimpleType(), "ondelete", null, 1, 1, RelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationType_Onupdate(), theXMLTypePackage.getAnySimpleType(), "onupdate", null, 1, 1, RelationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectareasTypeEClass, SubjectareasType.class, "SubjectareasType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubjectareasType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SubjectareasType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubjectareasType_Subjectarea(), this.getSubjectareaType(), null, "subjectarea", null, 0, -1, SubjectareasType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(subjectareaTypeEClass, SubjectareaType.class, "SubjectareaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubjectareaType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SubjectareaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubjectareaType_Item(), this.getItemType(), null, "item", null, 0, -1, SubjectareaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubjectareaType_Color(), theXMLTypePackage.getAnySimpleType(), "color", null, 1, 1, SubjectareaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubjectareaType_Id(), theXMLTypePackage.getAnySimpleType(), "id", null, 1, 1, SubjectareaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubjectareaType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, SubjectareaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubjectareaType_Visible(), theXMLTypePackage.getAnySimpleType(), "visible", null, 0, 1, SubjectareaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tablesTypeEClass, TablesType.class, "TablesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTablesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TablesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTablesType_Table(), this.getTableType(), null, "table", null, 0, -1, TablesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tableTypeEClass, TableType.class, "TableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableType_Property(), this.getPropertyType(), null, "property", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Comment(), this.getCommentType1(), "comment", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Attribute(), this.getAttributeType(), null, "attribute", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Index(), this.getIndexType(), null, "index", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Id(), theXMLTypePackage.getAnySimpleType(), "id", null, 1, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Schema(), theXMLTypePackage.getAnySimpleType(), "schema", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewsTypeEClass, ViewsType.class, "ViewsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewsType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ViewsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewsType_View(), this.getViewType(), null, "view", null, 0, -1, ViewsType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(viewTypeEClass, ViewType.class, "ViewType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewType_Property(), this.getPropertyType(), null, "property", null, 0, -1, ViewType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewType_Comment(), this.getCommentType1(), "comment", null, 0, -1, ViewType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewType_Sql(), theXMLTypePackage.getString(), "sql", null, 0, -1, ViewType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewType_Id(), theXMLTypePackage.getAnySimpleType(), "id", null, 1, 1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 1, 1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewType_Schema(), theXMLTypePackage.getAnySimpleType(), "schema", null, 0, 1, ViewType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(commentTypeEDataType, String.class, "CommentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(commentType1EDataType, String.class, "CommentType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (attributeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Attribute_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getAttributeType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeType_Datatype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "datatype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeType_Defaultvalue(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "defaultvalue",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeType_Extra(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "extra",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeType_Fraction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fraction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeType_Nullable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nullable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeType_Scale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAttributeType_Size(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "size",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (commentsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Comments_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCommentsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getCommentsType_ModelComment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ModelComment",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (commentTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "Comment_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (commentType1EDataType, 
		   source, 
		   new String[] {
			 "name", "CommentType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (configurationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Configuration_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfigurationType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getConfigurationType_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Property",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_Model(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Model",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (domainsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Domains_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDomainsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getDomainsType_Domain(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Domain",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (domainTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Domain_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDomainType_Datatype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "datatype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDomainType_Fraction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fraction",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDomainType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDomainType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDomainType_Nullable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nullable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDomainType_Scale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDomainType_Size(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "size",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (indexattributeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Indexattribute_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getIndexattributeType_Attributerefid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attributerefid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIndexattributeType_Expression(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "expression",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIndexattributeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (indexTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Index_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIndexType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getIndexType_Indexattribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Indexattribute",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getIndexType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIndexType_Indextype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "indextype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIndexType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itemTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Item_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getItemType_Commentrefid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "commentrefid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getItemType_Tablerefid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tablerefid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getItemType_Viewrefid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "viewrefid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (mappingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Mapping_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMappingType_Exportingexpressionrefid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "exportingexpressionrefid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMappingType_Importingattributerefid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "importingattributerefid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modelCommentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ModelComment_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModelCommentType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getModelCommentType_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Property",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getModelCommentType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getModelCommentType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelCommentType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (modelTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Model_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getModelType_Configuration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Configuration",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelType_Domains(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Domains",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelType_Tables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Tables",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelType_Relations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Relations",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelType_Views(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Views",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelType_Subjectareas(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Subjectareas",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getModelType_Comments(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comments",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (propertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PropertyType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPropertyType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPropertyType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (relationsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Relations_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRelationsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getRelationsType_Relation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Relation",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (relationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Relation_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRelationType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getRelationType_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Property",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getRelationType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });			
		addAnnotation
		  (getRelationType_Mapping(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Mapping",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getRelationType_Exportingtablerefid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "exportingtablerefid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRelationType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRelationType_Importingtablerefid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "importingtablerefid",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRelationType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRelationType_Ondelete(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ondelete",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRelationType_Onupdate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "onupdate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (subjectareasTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Subjectareas_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubjectareasType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getSubjectareasType_Subjectarea(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Subjectarea",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (subjectareaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Subjectarea_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubjectareaType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getSubjectareaType_Item(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Item",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSubjectareaType_Color(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubjectareaType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubjectareaType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSubjectareaType_Visible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visible",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tablesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Tables_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTablesType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getTablesType_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Table",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (tableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Table_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getTableType_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Property",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getTableType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getTableType_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Attribute",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getTableType_Index(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Index",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Schema(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "schema",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (viewsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Views_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getViewsType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getViewsType_View(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "View",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (viewTypeEClass, 
		   source, 
		   new String[] {
			 "name", "View_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getViewType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getViewType_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Property",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getViewType_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getViewType_Sql(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Sql",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getViewType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getViewType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getViewType_Schema(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "schema",
			 "namespace", "##targetNamespace"
		   });
	}

} //erdesignerschema30PackageImpl
