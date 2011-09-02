/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.rst.tests;

import de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTFactory;
import de.hu_berlin.german.korpling.saltnpepper.misc.rst.Segment;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SegmentTest extends AbstractNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SegmentTest.class);
	}

	/**
	 * Constructs a new Segment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Segment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Segment getFixture() {
		return (Segment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RSTFactory.eINSTANCE.createSegment());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	public void testAlibi()
	{}
} //SegmentTest
