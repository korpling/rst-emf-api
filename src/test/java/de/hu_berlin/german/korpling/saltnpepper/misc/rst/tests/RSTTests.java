/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.rst.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>rst</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RSTTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new RSTTests("rst Tests");
		suite.addTestSuite(RSTDocumentTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSTTests(String name) {
		super(name);
	}

} //RSTTests
