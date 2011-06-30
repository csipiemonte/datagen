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
package it.csi.mddtools.datagen.Erdesignerschema30.util;

import it.csi.mddtools.datagen.Erdesignerschema30.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.datagen.Erdesignerschema30.erdesignerschema30Package
 * @generated
 */
public class erdesignerschema30AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static erdesignerschema30Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public erdesignerschema30AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = erdesignerschema30Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected erdesignerschema30Switch<Adapter> modelSwitch =
		new erdesignerschema30Switch<Adapter>() {
			@Override
			public Adapter caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			@Override
			public Adapter caseCommentsType(CommentsType object) {
				return createCommentsTypeAdapter();
			}
			@Override
			public Adapter caseConfigurationType(ConfigurationType object) {
				return createConfigurationTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDomainsType(DomainsType object) {
				return createDomainsTypeAdapter();
			}
			@Override
			public Adapter caseDomainType(DomainType object) {
				return createDomainTypeAdapter();
			}
			@Override
			public Adapter caseIndexattributeType(IndexattributeType object) {
				return createIndexattributeTypeAdapter();
			}
			@Override
			public Adapter caseIndexType(IndexType object) {
				return createIndexTypeAdapter();
			}
			@Override
			public Adapter caseItemType(ItemType object) {
				return createItemTypeAdapter();
			}
			@Override
			public Adapter caseMappingType(MappingType object) {
				return createMappingTypeAdapter();
			}
			@Override
			public Adapter caseModelCommentType(ModelCommentType object) {
				return createModelCommentTypeAdapter();
			}
			@Override
			public Adapter caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRelationsType(RelationsType object) {
				return createRelationsTypeAdapter();
			}
			@Override
			public Adapter caseRelationType(RelationType object) {
				return createRelationTypeAdapter();
			}
			@Override
			public Adapter caseSubjectareasType(SubjectareasType object) {
				return createSubjectareasTypeAdapter();
			}
			@Override
			public Adapter caseSubjectareaType(SubjectareaType object) {
				return createSubjectareaTypeAdapter();
			}
			@Override
			public Adapter caseTablesType(TablesType object) {
				return createTablesTypeAdapter();
			}
			@Override
			public Adapter caseTableType(TableType object) {
				return createTableTypeAdapter();
			}
			@Override
			public Adapter caseViewsType(ViewsType object) {
				return createViewsTypeAdapter();
			}
			@Override
			public Adapter caseViewType(ViewType object) {
				return createViewTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.CommentsType <em>Comments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.CommentsType
	 * @generated
	 */
	public Adapter createCommentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.ConfigurationType <em>Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ConfigurationType
	 * @generated
	 */
	public Adapter createConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainsType <em>Domains Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainsType
	 * @generated
	 */
	public Adapter createDomainsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.DomainType <em>Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.DomainType
	 * @generated
	 */
	public Adapter createDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.IndexattributeType <em>Indexattribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.IndexattributeType
	 * @generated
	 */
	public Adapter createIndexattributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.IndexType <em>Index Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.IndexType
	 * @generated
	 */
	public Adapter createIndexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ItemType
	 * @generated
	 */
	public Adapter createItemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.MappingType <em>Mapping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.MappingType
	 * @generated
	 */
	public Adapter createMappingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType <em>Model Comment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelCommentType
	 * @generated
	 */
	public Adapter createModelCommentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationsType <em>Relations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationsType
	 * @generated
	 */
	public Adapter createRelationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.RelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.RelationType
	 * @generated
	 */
	public Adapter createRelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareasType <em>Subjectareas Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.SubjectareasType
	 * @generated
	 */
	public Adapter createSubjectareasTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType <em>Subjectarea Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.SubjectareaType
	 * @generated
	 */
	public Adapter createSubjectareaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.TablesType <em>Tables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TablesType
	 * @generated
	 */
	public Adapter createTablesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.TableType
	 * @generated
	 */
	public Adapter createTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewsType <em>Views Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewsType
	 * @generated
	 */
	public Adapter createViewsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link it.csi.mddtools.datagen.Erdesignerschema30.ViewType <em>View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see it.csi.mddtools.datagen.Erdesignerschema30.ViewType
	 * @generated
	 */
	public Adapter createViewTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //erdesignerschema30AdapterFactory
