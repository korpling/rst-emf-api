/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.rst.impl;

import de.hu_berlin.german.korpling.saltnpepper.misc.rst.Group;
import de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument;
import de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTPackage;
import de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation;
import de.hu_berlin.german.korpling.saltnpepper.misc.rst.Segment;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.impl.RSTDocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.impl.RSTDocumentImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.impl.RSTDocumentImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.rst.impl.RSTDocumentImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RSTDocumentImpl extends EObjectImpl implements RSTDocument {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<Segment> segments;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RSTDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RSTPackage.Literals.RST_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RSTPackage.RST_DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Segment> getSegments() {
		if (segments == null) {
			segments = new EObjectContainmentWithInverseEList<Segment>(Segment.class, this, RSTPackage.RST_DOCUMENT__SEGMENTS, RSTPackage.SEGMENT__DOCUMENT);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentWithInverseEList<Group>(Group.class, this, RSTPackage.RST_DOCUMENT__GROUPS, RSTPackage.GROUP__DOCUMENT);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentWithInverseEList<Relation>(Relation.class, this, RSTPackage.RST_DOCUMENT__RELATIONS, RSTPackage.RELATION__DOCUMENTS);
		}
		return relations;
	}

	/**
	 * Returns all incoming relations to the AbstractNode-object corresponding to the given
	 * id.
	 * Note: very slow!!!
	 * @param id - id corresponding to the AbstractNode-object
	 * @return a list of incoming relations
	 */
	public EList<Relation> getIncomingRelations(String id) 
	{
		EList<Relation> retVal= null;
		if (this.getRelations()!= null)
		{
			for (Relation relation: this.getRelations())
			{
				if (relation.getParent().getId().equalsIgnoreCase(id))
				{
					if (retVal== null)
						retVal= new BasicEList<Relation>();
					retVal.add(relation);
				}
			}
		}
		return(retVal);
	}

	/**
	 * Returns all outgoing relations to the AbstractNode-object corresponding to the given
	 * id.
	 * Note: very slow!!!
	 * @param id - id corresponding to the AbstractNode-object
	 * @return a list of outgoing relations
	 */
	public Relation getOutgoingRelation(String id) 
	{
		Relation retVal= null;
		if (this.getRelations()!= null)
		{
			for (Relation relation: this.getRelations())
			{
				if (relation.getSource().getId().equalsIgnoreCase(id))
				{
					retVal= relation;
					break;
				}
			}
		}
		return(retVal);
	}

	/**
	 * Returns all outgoing relations to the AbstractNode-object corresponding to the given
	 * id.
	 * Note: very slow!!!
	 * @param id - id corresponding to the AbstractNode-object
	 * @return a list of outgoing relations
	 */
	public EList<Relation> getOutgoingRelations(String id) 
	{
		EList<Relation> retVal= null;
		if (this.getRelations()!= null)
		{
			for (Relation relation: this.getRelations())
			{
				if (relation.getSource().getId().equalsIgnoreCase(id))
				{
					if (retVal== null)
						retVal= new BasicEList<Relation>();
					retVal.add(relation);
				}
			}
		}
		return(retVal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSTPackage.RST_DOCUMENT__SEGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSegments()).basicAdd(otherEnd, msgs);
			case RSTPackage.RST_DOCUMENT__GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroups()).basicAdd(otherEnd, msgs);
			case RSTPackage.RST_DOCUMENT__RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RSTPackage.RST_DOCUMENT__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
			case RSTPackage.RST_DOCUMENT__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case RSTPackage.RST_DOCUMENT__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RSTPackage.RST_DOCUMENT__NAME:
				return getName();
			case RSTPackage.RST_DOCUMENT__SEGMENTS:
				return getSegments();
			case RSTPackage.RST_DOCUMENT__GROUPS:
				return getGroups();
			case RSTPackage.RST_DOCUMENT__RELATIONS:
				return getRelations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RSTPackage.RST_DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case RSTPackage.RST_DOCUMENT__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends Segment>)newValue);
				return;
			case RSTPackage.RST_DOCUMENT__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case RSTPackage.RST_DOCUMENT__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RSTPackage.RST_DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RSTPackage.RST_DOCUMENT__SEGMENTS:
				getSegments().clear();
				return;
			case RSTPackage.RST_DOCUMENT__GROUPS:
				getGroups().clear();
				return;
			case RSTPackage.RST_DOCUMENT__RELATIONS:
				getRelations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RSTPackage.RST_DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RSTPackage.RST_DOCUMENT__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case RSTPackage.RST_DOCUMENT__GROUPS:
				return groups != null && !groups.isEmpty();
			case RSTPackage.RST_DOCUMENT__RELATIONS:
				return relations != null && !relations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RSTDocumentImpl
