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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hu_berlin.german.korpling.rst.RSTFactory
 * @model kind="package"
 * @generated
 */
public interface RSTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rst";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://korpling.german.hu-berlin.de/saltnpepper/rst/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rst";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RSTPackage eINSTANCE = de.hu_berlin.german.korpling.rst.impl.RSTPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.rst.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.rst.impl.AbstractNodeImpl
	 * @see de.hu_berlin.german.korpling.rst.impl.RSTPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.rst.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.rst.impl.SegmentImpl
	 * @see de.hu_berlin.german.korpling.rst.impl.RSTPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__ID = ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__TYPE = ABSTRACT_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__DOCUMENT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__TEXT = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.rst.impl.RSTDocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.rst.impl.RSTDocumentImpl
	 * @see de.hu_berlin.german.korpling.rst.impl.RSTPackageImpl#getRSTDocument()
	 * @generated
	 */
	int RST_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RST_DOCUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RST_DOCUMENT__SEGMENTS = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RST_DOCUMENT__GROUPS = 2;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RST_DOCUMENT__RELATIONS = 3;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RST_DOCUMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.rst.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.rst.impl.RelationImpl
	 * @see de.hu_berlin.german.korpling.rst.impl.RSTPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 2;

	/**
	 * The feature id for the '<em><b>Documents</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DOCUMENTS = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CHILD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.rst.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.rst.impl.GroupImpl
	 * @see de.hu_berlin.german.korpling.rst.impl.RSTPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = ABSTRACT_NODE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__TYPE = ABSTRACT_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DOCUMENT = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.rst.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see de.hu_berlin.german.korpling.rst.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the container reference '{@link de.hu_berlin.german.korpling.rst.Segment#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document</em>'.
	 * @see de.hu_berlin.german.korpling.rst.Segment#getDocument()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Document();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.rst.Segment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.hu_berlin.german.korpling.rst.Segment#getText()
	 * @see #getSegment()
	 * @generated
	 */
	EAttribute getSegment_Text();

	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.rst.RSTDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see de.hu_berlin.german.korpling.rst.RSTDocument
	 * @generated
	 */
	EClass getRSTDocument();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.rst.RSTDocument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hu_berlin.german.korpling.rst.RSTDocument#getName()
	 * @see #getRSTDocument()
	 * @generated
	 */
	EAttribute getRSTDocument_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hu_berlin.german.korpling.rst.RSTDocument#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see de.hu_berlin.german.korpling.rst.RSTDocument#getSegments()
	 * @see #getRSTDocument()
	 * @generated
	 */
	EReference getRSTDocument_Segments();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hu_berlin.german.korpling.rst.RSTDocument#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see de.hu_berlin.german.korpling.rst.RSTDocument#getGroups()
	 * @see #getRSTDocument()
	 * @generated
	 */
	EReference getRSTDocument_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hu_berlin.german.korpling.rst.RSTDocument#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see de.hu_berlin.german.korpling.rst.RSTDocument#getRelations()
	 * @see #getRSTDocument()
	 * @generated
	 */
	EReference getRSTDocument_Relations();

	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.rst.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see de.hu_berlin.german.korpling.rst.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.rst.Relation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.hu_berlin.german.korpling.rst.Relation#getName()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.hu_berlin.german.korpling.rst.Relation#getDocuments <em>Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Documents</em>'.
	 * @see de.hu_berlin.german.korpling.rst.Relation#getDocuments()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Documents();

	/**
	 * Returns the meta object for the reference '{@link de.hu_berlin.german.korpling.rst.Relation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see de.hu_berlin.german.korpling.rst.Relation#getParent()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Parent();

	/**
	 * Returns the meta object for the reference '{@link de.hu_berlin.german.korpling.rst.Relation#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see de.hu_berlin.german.korpling.rst.Relation#getChild()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Child();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.rst.Relation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.hu_berlin.german.korpling.rst.Relation#getType()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_Type();

	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.rst.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see de.hu_berlin.german.korpling.rst.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the container reference '{@link de.hu_berlin.german.korpling.rst.Group#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Document</em>'.
	 * @see de.hu_berlin.german.korpling.rst.Group#getDocument()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Document();

	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.rst.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see de.hu_berlin.german.korpling.rst.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.rst.AbstractNode#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hu_berlin.german.korpling.rst.AbstractNode#getId()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.rst.AbstractNode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.hu_berlin.german.korpling.rst.AbstractNode#getType()
	 * @see #getAbstractNode()
	 * @generated
	 */
	EAttribute getAbstractNode_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RSTFactory getRSTFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.rst.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.rst.impl.SegmentImpl
		 * @see de.hu_berlin.german.korpling.rst.impl.RSTPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__DOCUMENT = eINSTANCE.getSegment_Document();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENT__TEXT = eINSTANCE.getSegment_Text();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.rst.impl.RSTDocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.rst.impl.RSTDocumentImpl
		 * @see de.hu_berlin.german.korpling.rst.impl.RSTPackageImpl#getRSTDocument()
		 * @generated
		 */
		EClass RST_DOCUMENT = eINSTANCE.getRSTDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RST_DOCUMENT__NAME = eINSTANCE.getRSTDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RST_DOCUMENT__SEGMENTS = eINSTANCE.getRSTDocument_Segments();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RST_DOCUMENT__GROUPS = eINSTANCE.getRSTDocument_Groups();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RST_DOCUMENT__RELATIONS = eINSTANCE.getRSTDocument_Relations();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.rst.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.rst.impl.RelationImpl
		 * @see de.hu_berlin.german.korpling.rst.impl.RSTPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__NAME = eINSTANCE.getRelation_Name();

		/**
		 * The meta object literal for the '<em><b>Documents</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__DOCUMENTS = eINSTANCE.getRelation_Documents();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__PARENT = eINSTANCE.getRelation_Parent();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__CHILD = eINSTANCE.getRelation_Child();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__TYPE = eINSTANCE.getRelation_Type();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.rst.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.rst.impl.GroupImpl
		 * @see de.hu_berlin.german.korpling.rst.impl.RSTPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__DOCUMENT = eINSTANCE.getGroup_Document();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.rst.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.rst.impl.AbstractNodeImpl
		 * @see de.hu_berlin.german.korpling.rst.impl.RSTPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__ID = eINSTANCE.getAbstractNode_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_NODE__TYPE = eINSTANCE.getAbstractNode_Type();

	}

} //RSTPackage
