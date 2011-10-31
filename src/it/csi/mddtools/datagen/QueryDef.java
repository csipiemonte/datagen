/**
 * Copyright 2011 CSI-PIEMONTE
 */
package it.csi.mddtools.datagen;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definizione della query da eseguire. Utilizzando questo tipo di modellazione 
 * &egrave; possibile modellare interamente la query senza limitazioni sulla struttura
 * dei campi in output, delle tabelle coinvolte, dei criteri di join.
 * L'utilizzo di questa modalit&agrave; inibisce la possibilit&agrave;/necessit&agrave;
 * di scrivere codice java per implementare la query.  
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.csi.mddtools.datagen.QueryDef#getSelectClause <em>Select Clause</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.QueryDef#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.QueryDef#getJoinClause <em>Join Clause</em>}</li>
 *   <li>{@link it.csi.mddtools.datagen.QueryDef#getWhereClause <em>Where Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.csi.mddtools.datagen.DatagenPackage#getQueryDef()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface QueryDef extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Select Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Select Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determina l'elenco delle colonne che costituiscono il risultato della query.
	 * Le colonne possono essere di due tipi: 
	 * <ul>
	 * <li>colonne appartenenti ad una qualsiasi delle tabelle coinvolte (ovvero quelle
	 * referenziate nella <b>FromClause</b></li>
	 * <li>colonne <i>calcolate</i>, ottenute ad esempio applicando funzioni di
	 * aggregazione a colonne effettive (es. somma), oppure applicando altri tipi di funzioni ad
	 * una o pi&ugrave; colonne effettive (es. concatenzaione)</li>
	 * </ul>
	 * Il DTO associato al <b>CustomFinder</b> che utlizza questo tipo di costrutto
	 * conterr&agrave; i campi necessari a contenenre adeguatamente i risultati della
	 * query e non sar&agrave; il DTO classico associato al DAO.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Select Clause</em>' containment reference.
	 * @see #setSelectClause(SelectClause)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQueryDef_SelectClause()
	 * @model containment="true"
	 * @generated
	 */
	SelectClause getSelectClause();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QueryDef#getSelectClause <em>Select Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select Clause</em>' containment reference.
	 * @see #getSelectClause()
	 * @generated
	 */
	void setSelectClause(SelectClause value);

	/**
	 * Returns the value of the '<em><b>From Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco delle tabelle incluse nella query. A ciascuna Tabella pu&ograve; essere associato un <i>alias</i>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Clause</em>' containment reference.
	 * @see #setFromClause(FromClause)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQueryDef_FromClause()
	 * @model containment="true"
	 * @generated
	 */
	FromClause getFromClause();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QueryDef#getFromClause <em>From Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Clause</em>' containment reference.
	 * @see #getFromClause()
	 * @generated
	 */
	void setFromClause(FromClause value);

	/**
	 * Returns the value of the '<em><b>Join Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elenco (opzionale) dei cirteri di <i>join</i> che devono essere applicati alle
	 * tabelle referenziate nella <b>FromClause</b>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Join Clause</em>' containment reference.
	 * @see #setJoinClause(JoinClause)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQueryDef_JoinClause()
	 * @model containment="true"
	 * @generated
	 */
	JoinClause getJoinClause();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QueryDef#getJoinClause <em>Join Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Clause</em>' containment reference.
	 * @see #getJoinClause()
	 * @generated
	 */
	void setJoinClause(JoinClause value);

	/**
	 * Returns the value of the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where Clause</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Clause</em>' containment reference.
	 * @see #setWhereClause(WhereClause)
	 * @see it.csi.mddtools.datagen.DatagenPackage#getQueryDef_WhereClause()
	 * @model containment="true"
	 * @generated
	 */
	WhereClause getWhereClause();

	/**
	 * Sets the value of the '{@link it.csi.mddtools.datagen.QueryDef#getWhereClause <em>Where Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Clause</em>' containment reference.
	 * @see #getWhereClause()
	 * @generated
	 */
	void setWhereClause(WhereClause value);

} // QueryDef
