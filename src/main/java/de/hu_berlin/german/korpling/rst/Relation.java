/**
 * Copyright 2009 Humboldt University of Berlin, INRIA.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */
package de.hu_berlin.german.korpling.rst;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.rst.Relation#getDocuments <em>Documents</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.rst.Relation#getParent <em>Parent</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.rst.Relation#getChild <em>Child</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.rst.Relation#getName <em>Name</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.rst.Relation#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hu_berlin.german.korpling.rst.RSTPackage#getRelation()
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
	 * @see de.hu_berlin.german.korpling.rst.RSTPackage#getRelation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.rst.Relation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Documents</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hu_berlin.german.korpling.rst.RSTDocument#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documents</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' container reference.
	 * @see #setDocuments(RSTDocument)
	 * @see de.hu_berlin.german.korpling.rst.RSTPackage#getRelation_Documents()
	 * @see de.hu_berlin.german.korpling.rst.RSTDocument#getRelations
	 * @model opposite="relations" transient="false"
	 * @generated
	 */
	RSTDocument getDocuments();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.rst.Relation#getDocuments <em>Documents</em>}' container reference.
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
	 * @see de.hu_berlin.german.korpling.rst.RSTPackage#getRelation_Parent()
	 * @model
	 * @generated
	 */
	AbstractNode getParent();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.rst.Relation#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AbstractNode value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(AbstractNode)
	 * @see de.hu_berlin.german.korpling.rst.RSTPackage#getRelation_Child()
	 * @model
	 * @generated
	 */
	AbstractNode getChild();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.rst.Relation#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(AbstractNode value);

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
	 * @see de.hu_berlin.german.korpling.rst.RSTPackage#getRelation_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.rst.Relation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Relation
