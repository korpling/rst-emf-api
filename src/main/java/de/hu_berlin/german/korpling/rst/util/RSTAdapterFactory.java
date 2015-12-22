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
package de.hu_berlin.german.korpling.rst.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.hu_berlin.german.korpling.rst.AbstractNode;
import de.hu_berlin.german.korpling.rst.Group;
import de.hu_berlin.german.korpling.rst.RSTDocument;
import de.hu_berlin.german.korpling.rst.RSTPackage;
import de.hu_berlin.german.korpling.rst.Relation;
import de.hu_berlin.german.korpling.rst.Segment;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see de.hu_berlin.german.korpling.rst.RSTPackage
 * @generated
 */
public class RSTAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static RSTPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public RSTAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RSTPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RSTSwitch<Adapter> modelSwitch = new RSTSwitch<Adapter>() {
		@Override
		public Adapter caseSegment(Segment object) {
			return createSegmentAdapter();
		}

		@Override
		public Adapter caseRSTDocument(RSTDocument object) {
			return createRSTDocumentAdapter();
		}

		@Override
		public Adapter caseRelation(Relation object) {
			return createRelationAdapter();
		}

		@Override
		public Adapter caseGroup(Group object) {
			return createGroupAdapter();
		}

		@Override
		public Adapter caseAbstractNode(AbstractNode object) {
			return createAbstractNodeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.hu_berlin.german.korpling.rst.Segment <em>Segment</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.rst.Segment
	 * @generated
	 */
	public Adapter createSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.hu_berlin.german.korpling.rst.RSTDocument <em>Document</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.rst.RSTDocument
	 * @generated
	 */
	public Adapter createRSTDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.hu_berlin.german.korpling.rst.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.rst.Relation
	 * @generated
	 */
	public Adapter createRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.hu_berlin.german.korpling.rst.Group <em>Group</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.rst.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.hu_berlin.german.korpling.rst.AbstractNode
	 * <em>Abstract Node</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.rst.AbstractNode
	 * @generated
	 */
	public Adapter createAbstractNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // RSTAdapterFactory
