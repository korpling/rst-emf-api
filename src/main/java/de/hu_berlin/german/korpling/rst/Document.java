/**
 * Copyright 2009 Humboldt-Universität zu Berlin, INRIA.
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Document</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link de.hu_berlin.german.korpling.rst.Document#getName <em>Name</em>}
 * </li>
 * <li>{@link de.hu_berlin.german.korpling.rst.Document#getSegments
 * <em>Segments</em>}</li>
 * <li>{@link de.hu_berlin.german.korpling.rst.Document#getGroups
 * <em>Groups</em>}</li>
 * <li>{@link de.hu_berlin.german.korpling.rst.Document#getRelations
 * <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.german.korpling.saltnpepper.rst.RSTModelPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.hub.german.korpling.saltnpepper.rst.RSTModelPackage#getDocument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link de.hu_berlin.german.korpling.rst.Document#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link de.hu_berlin.german.korpling.rst.Segment}. It is bidirectional and
	 * its opposite is '
	 * {@link de.hu_berlin.german.korpling.rst.Segment#getDocument
	 * <em>Document</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see de.hub.german.korpling.saltnpepper.rst.RSTModelPackage#getDocument_Segments()
	 * @see de.hu_berlin.german.korpling.rst.Segment#getDocument
	 * @model opposite="document" containment="true"
	 * @generated
	 */
	EList<Segment> getSegments();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link de.hu_berlin.german.korpling.rst.Group}. It is bidirectional and
	 * its opposite is '
	 * {@link de.hu_berlin.german.korpling.rst.Group#getDocument
	 * <em>Document</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see de.hub.german.korpling.saltnpepper.rst.RSTModelPackage#getDocument_Groups()
	 * @see de.hu_berlin.german.korpling.rst.Group#getDocument
	 * @model opposite="document" containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link de.hu_berlin.german.korpling.rst.Relation}. It is bidirectional
	 * and its opposite is '
	 * {@link de.hu_berlin.german.korpling.rst.Relation#getDocuments
	 * <em>Documents</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see de.hub.german.korpling.saltnpepper.rst.RSTModelPackage#getDocument_Relations()
	 * @see de.hu_berlin.german.korpling.rst.Relation#getDocuments
	 * @model opposite="documents" containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

} // Document
