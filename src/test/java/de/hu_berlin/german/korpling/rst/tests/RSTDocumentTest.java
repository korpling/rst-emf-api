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
package de.hu_berlin.german.korpling.rst.tests;

import de.hu_berlin.german.korpling.rst.Group;
import de.hu_berlin.german.korpling.rst.RSTDocument;
import de.hu_berlin.german.korpling.rst.RSTFactory;
import de.hu_berlin.german.korpling.rst.Relation;
import de.hu_berlin.german.korpling.rst.Segment;
import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Document</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>
 * {@link de.hu_berlin.german.korpling.rst.RSTDocument#getIncomingRelations(java.lang.String)
 * <em>Get Incoming Relations</em>}</li>
 * <li>
 * {@link de.hu_berlin.german.korpling.rst.RSTDocument#getOutgoingRelation(java.lang.String)
 * <em>Get Outgoing Relation</em>}</li>
 * <li>
 * {@link de.hu_berlin.german.korpling.rst.RSTDocument#getOutgoingRelations(java.lang.String)
 * <em>Get Outgoing Relations</em>}</li>
 * <li>
 * {@link de.hu_berlin.german.korpling.rst.RSTDocument#createRelation(de.hu_berlin.german.korpling.rst.AbstractNode, de.hu_berlin.german.korpling.rst.AbstractNode, java.lang.String, java.lang.String)
 * <em>Create Relation</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RSTDocumentTest extends TestCase {

	/**
	 * The fixture for this Document test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected RSTDocument fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RSTDocumentTest.class);
	}

	/**
	 * Constructs a new Document test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RSTDocumentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Document test case. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(RSTDocument fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Document test case. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RSTDocument getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RSTFactory.eINSTANCE.createRSTDocument());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '
	 * {@link de.hu_berlin.german.korpling.rst.RSTDocument#getIncomingRelations(java.lang.String)
	 * <em>Get Incoming Relations</em>}' operation. <!-- begin-user-doc -->
	 * sgmt2 -> sgmt1 sgmt1 -> sgmt1 sgmt1 -> grp1 sgmt1 -> grp2 <!--
	 * end-user-doc -->
	 * 
	 * @see de.hu_berlin.german.korpling.rst.RSTDocument#getIncomingRelations(java.lang.String)
	 */
	public void testGetIncomingRelations__String() {
		Group grp1 = RSTFactory.eINSTANCE.createGroup();
		String grp1_id = "grp1";
		grp1.setId(grp1_id);
		Group grp2 = RSTFactory.eINSTANCE.createGroup();
		String grp2_id = "grp2";
		grp2.setId(grp2_id);
		Segment sgmt1 = RSTFactory.eINSTANCE.createSegment();
		String sgmt1_id = "sgmt1";
		sgmt1.setId(sgmt1_id);
		Segment sgmt2 = RSTFactory.eINSTANCE.createSegment();
		String sgmt2_id = "sgmt2";
		sgmt2.setId(sgmt2_id);

		assertNull(this.getFixture().getIncomingRelations(grp1.getId()));
		assertNull(this.getFixture().getIncomingRelations(grp2.getId()));
		assertNull(this.getFixture().getIncomingRelations(sgmt1.getId()));
		assertNull(this.getFixture().getIncomingRelations(sgmt2.getId()));

		Relation rel = null;

		rel = RSTFactory.eINSTANCE.createRelation();
		rel.setParent(sgmt2);
		rel.setChild(sgmt1);
		this.getFixture().getRelations().add(rel);

		rel = RSTFactory.eINSTANCE.createRelation();
		rel.setParent(sgmt1);
		rel.setChild(sgmt1);
		this.getFixture().getRelations().add(rel);

		rel = RSTFactory.eINSTANCE.createRelation();
		rel.setParent(sgmt1);
		rel.setChild(grp1);
		this.getFixture().getRelations().add(rel);

		rel = RSTFactory.eINSTANCE.createRelation();
		rel.setParent(sgmt1);
		rel.setChild(grp2);
		this.getFixture().getRelations().add(rel);

		assertEquals(1, this.getFixture().getIncomingRelations(grp1_id).size());
		assertEquals(1, this.getFixture().getIncomingRelations(grp2_id).size());
		assertEquals(2, this.getFixture().getIncomingRelations(sgmt1_id).size());
		assertNull(this.getFixture().getIncomingRelations(sgmt2_id));
	}

	/**
	 * Tests the '
	 * {@link de.hu_berlin.german.korpling.rst.RSTDocument#getOutgoingRelation(java.lang.String)
	 * <em>Get Outgoing Relation</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.hu_berlin.german.korpling.rst.RSTDocument#getOutgoingRelation(java.lang.String)
	 */
	public void testGetOutgoingRelation__String() {

	}

	/**
	 * Tests the '
	 * {@link de.hu_berlin.german.korpling.rst.RSTDocument#getOutgoingRelations(java.lang.String)
	 * <em>Get Outgoing Relations</em>}' operation. <!-- begin-user-doc -->
	 * sgmt2 -> sgmt1 sgmt1 -> sgmt1 sgmt1 -> grp1 sgmt1 -> grp2 <!--
	 * end-user-doc -->
	 * 
	 * @see de.hu_berlin.german.korpling.rst.RSTDocument#getOutgoingRelations(java.lang.String)
	 */
	public void testGetOutgoingRelations__String() {
		Group grp1 = RSTFactory.eINSTANCE.createGroup();
		String grp1_id = "grp1";
		grp1.setId(grp1_id);
		Group grp2 = RSTFactory.eINSTANCE.createGroup();
		String grp2_id = "grp2";
		grp2.setId(grp2_id);
		Segment sgmt1 = RSTFactory.eINSTANCE.createSegment();
		String sgmt1_id = "sgmt1";
		sgmt1.setId(sgmt1_id);
		Segment sgmt2 = RSTFactory.eINSTANCE.createSegment();
		String sgmt2_id = "sgmt2";
		sgmt2.setId(sgmt2_id);

		assertNull(this.getFixture().getOutgoingRelations(grp1.getId()));
		assertNull(this.getFixture().getOutgoingRelations(grp2.getId()));
		assertNull(this.getFixture().getIncomingRelations(sgmt1.getId()));
		assertNull(this.getFixture().getIncomingRelations(sgmt2.getId()));

		Relation rel = null;

		rel = RSTFactory.eINSTANCE.createRelation();
		rel.setParent(sgmt2);
		rel.setChild(sgmt1);
		this.getFixture().getRelations().add(rel);

		rel = RSTFactory.eINSTANCE.createRelation();
		rel.setParent(sgmt1);
		rel.setChild(sgmt1);
		this.getFixture().getRelations().add(rel);

		rel = RSTFactory.eINSTANCE.createRelation();
		rel.setParent(sgmt1);
		rel.setChild(grp1);
		this.getFixture().getRelations().add(rel);

		rel = RSTFactory.eINSTANCE.createRelation();
		rel.setParent(sgmt1);
		rel.setChild(grp2);
		this.getFixture().getRelations().add(rel);

		assertNull(this.getFixture().getOutgoingRelations(grp1_id));
		assertNull(this.getFixture().getOutgoingRelations(grp2_id));
		assertEquals(3, this.getFixture().getOutgoingRelations(sgmt1_id).size());
		assertEquals(1, this.getFixture().getOutgoingRelations(sgmt2_id).size());
	}

	/**
	 * Tests the '
	 * {@link de.hu_berlin.german.korpling.rst.RSTDocument#createRelation(de.hu_berlin.german.korpling.rst.AbstractNode, de.hu_berlin.german.korpling.rst.AbstractNode, java.lang.String, java.lang.String)
	 * <em>Create Relation</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see de.hu_berlin.german.korpling.rst.RSTDocument#createRelation(de.hu_berlin.german.korpling.rst.AbstractNode,
	 *      de.hu_berlin.german.korpling.rst.AbstractNode, java.lang.String,
	 *      java.lang.String)
	 */
	public void testCreateRelation__AbstractNode_AbstractNode_String_String() {
		Group grp1 = RSTFactory.eINSTANCE.createGroup();
		Group grp2 = RSTFactory.eINSTANCE.createGroup();
		String name = "name";
		String type = "type";

		this.getFixture().createRelation(grp1, grp2, name, type);

		assertNotNull(this.getFixture().getRelations());
		assertEquals(1, this.getFixture().getRelations().size());
		assertNotNull(this.getFixture().getRelations().get(0));

		assertEquals(grp1, this.getFixture().getRelations().get(0).getParent());
		assertEquals(grp2, this.getFixture().getRelations().get(0).getChild());
		assertEquals(name, this.getFixture().getRelations().get(0).getName());
		assertEquals(type, this.getFixture().getRelations().get(0).getType());
	}

} // RSTDocumentTest
