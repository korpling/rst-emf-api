/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.rst;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Group#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' container reference.
	 * @see #setDocument(RSTDocument)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getGroup_Document()
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument#getGroups
	 * @model opposite="groups" transient="false"
	 * @generated
	 */
	RSTDocument getDocument();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Group#getDocument <em>Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' container reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(RSTDocument value);

} // Group
