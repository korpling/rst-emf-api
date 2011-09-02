/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.rst;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument#getName <em>Name</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument#getGroups <em>Groups</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getRSTDocument()
 * @model
 * @generated
 */
public interface RSTDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getRSTDocument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Segment}.
	 * It is bidirectional and its opposite is '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Segment#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getRSTDocument_Segments()
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.Segment#getDocument
	 * @model opposite="document" containment="true"
	 * @generated
	 */
	EList<Segment> getSegments();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Group}.
	 * It is bidirectional and its opposite is '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Group#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getRSTDocument_Groups()
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.Group#getDocument
	 * @model opposite="document" containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation}.
	 * It is bidirectional and its opposite is '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getRSTDocument_Relations()
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation#getDocuments
	 * @model opposite="documents" containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Relation> getIncomingRelations(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Relation getOutgoingRelation(String id);

} // RSTDocument
