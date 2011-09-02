/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.rst;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Segment#getDocument <em>Document</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Segment#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getSegment()
 * @model
 * @generated
 */
public interface Segment extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' container reference.
	 * @see #setDocument(RSTDocument)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getSegment_Document()
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument#getSegments
	 * @model opposite="segments" transient="false"
	 * @generated
	 */
	RSTDocument getDocument();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Segment#getDocument <em>Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' container reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(RSTDocument value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage#getSegment_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.Segment#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Segment
