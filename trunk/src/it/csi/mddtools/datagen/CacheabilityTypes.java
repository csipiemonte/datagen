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
package it.csi.mddtools.datagen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cacheability Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.csi.mddtools.datagen.DatagenPackage#getCacheabilityTypes()
 * @model
 * @generated
 */
public enum CacheabilityTypes implements Enumerator {
	/**
	 * The '<em><b>HIGHLY VARIABLE DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHLY_VARIABLE_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHLY_VARIABLE_DATA(0, "HIGHLY_VARIABLE_DATA", "HIGHLY_VARIABLE_DATA"),

	/**
	 * The '<em><b>ALMOST STABLE DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALMOST_STABLE_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	ALMOST_STABLE_DATA(1, "ALMOST_STABLE_DATA", "ALMOST_STABLE_DATA");

	/**
	 * The '<em><b>HIGHLY VARIABLE DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGHLY VARIABLE DATA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGHLY_VARIABLE_DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGHLY_VARIABLE_DATA_VALUE = 0;

	/**
	 * The '<em><b>ALMOST STABLE DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALMOST STABLE DATA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALMOST_STABLE_DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALMOST_STABLE_DATA_VALUE = 1;

	/**
	 * An array of all the '<em><b>Cacheability Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CacheabilityTypes[] VALUES_ARRAY =
		new CacheabilityTypes[] {
			HIGHLY_VARIABLE_DATA,
			ALMOST_STABLE_DATA,
		};

	/**
	 * A public read-only list of all the '<em><b>Cacheability Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CacheabilityTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cacheability Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CacheabilityTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheabilityTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cacheability Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CacheabilityTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheabilityTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cacheability Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CacheabilityTypes get(int value) {
		switch (value) {
			case HIGHLY_VARIABLE_DATA_VALUE: return HIGHLY_VARIABLE_DATA;
			case ALMOST_STABLE_DATA_VALUE: return ALMOST_STABLE_DATA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CacheabilityTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CacheabilityTypes
