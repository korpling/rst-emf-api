/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.rst;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation#getName <em>Name</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation#getDocuments <em>Documents</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation#getParent <em>Parent</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
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
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' container reference.
	 * @see #setDocuments(RSTDocument)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getRelation_Documents()
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument#getRelations
	 * @model opposite="relations" transient="false"
	 * @generated
	 */
	RSTDocument getDocuments();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation#getDocuments <em>Documents</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documents</em>' container reference.
	 * @see #getDocuments()
	 * @generated
	 */
	void setDocuments(RSTDocument value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(AbstractNode)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getRelation_Parent()
	 * @model
	 * @generated
	 */
	AbstractNode getParent();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractNode)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getRelation_Source()
	 * @model
	 * @generated
	 */
	AbstractNode getSource();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getRelation_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Relation
