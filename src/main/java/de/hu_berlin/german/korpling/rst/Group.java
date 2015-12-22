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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Group</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link de.hu_berlin.german.korpling.rst.Group#getDocument
 * <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hu_berlin.german.korpling.rst.RSTPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '
	 * {@link de.hu_berlin.german.korpling.rst.RSTDocument#getGroups
	 * <em>Groups</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Document</em>' container reference.
	 * @see #setDocument(RSTDocument)
	 * @see de.hu_berlin.german.korpling.rst.RSTPackage#getGroup_Document()
	 * @see de.hu_berlin.german.korpling.rst.RSTDocument#getGroups
	 * @model opposite="groups" transient="false"
	 * @generated
	 */
	RSTDocument getDocument();

	/**
	 * Sets the value of the '
	 * {@link de.hu_berlin.german.korpling.rst.Group#getDocument
	 * <em>Document</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Document</em>' container reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(RSTDocument value);

} // Group
