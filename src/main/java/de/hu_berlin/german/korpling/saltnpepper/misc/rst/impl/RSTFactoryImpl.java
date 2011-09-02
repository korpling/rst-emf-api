/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.rst.impl;

import de.hu_berlin.german.korpling.saltnpepper.misc.rst.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RSTFactoryImpl extends EFactoryImpl implements RSTFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RSTFactory init() {
		try {
			RSTFactory theRSTFactory = (RSTFactory)EPackage.Registry.INSTANCE.getEFactory("http://korpling.german.hu-berlin.de/saltnpepper/rst/"); 
			if (theRSTFactory != null) {
				return theRSTFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RSTFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSTFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RSTPackage.SEGMENT: return createSegment();
			case RSTPackage.RST_DOCUMENT: return createRSTDocument();
			case RSTPackage.RELATION: return createRelation();
			case RSTPackage.GROUP: return createGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSTDocument createRSTDocument() {
		RSTDocumentImpl rstDocument = new RSTDocumentImpl();
		return rstDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSTPackage getRSTPackage() {
		return (RSTPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RSTPackage getPackage() {
		return RSTPackage.eINSTANCE;
	}

} //RSTFactoryImpl
