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
package de.hu_berlin.german.korpling.rst.resources;


import java.io.File;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;

import de.hu_berlin.german.korpling.rst.AbstractNode;
import de.hu_berlin.german.korpling.rst.Group;
import de.hu_berlin.german.korpling.rst.RSTDocument;
import de.hu_berlin.german.korpling.rst.RSTFactory;
import de.hu_berlin.german.korpling.rst.Relation;
import de.hu_berlin.german.korpling.rst.Segment;
import de.hu_berlin.german.korpling.rst.exceptions.RSTException;

public class RSTReader extends DefaultHandler2 
{
	public RSTReader()
	{
		this.init();
	}
	
	private void init()
	{
		this.idAbstractNodeTable= new Hashtable<String, AbstractNode>();
		this.idRelationTable= new Hashtable<String, Vector<Relation>>();
		this.rstElementStack= new Stack<RSTReader.RSTElements>();
	}
	
//========================= start: RSTFile	
	private File rstFile= null;
	/**
	 * Sets the file from which the RST Reader actually reads from.
	 * @param rstFile the rstFile to set
	 */
	public void setRstFile(File rstFile) {
		this.rstFile = rstFile;
	}

	/**
	 * Returns the file from which the RST Reader actually reads from.
	 * @return the rstFile
	 */
	public File getRstFile() {
		return rstFile;
	}
//========================= end: RSTFile
//========================= start: RSTDocument	
	private RSTDocument rstDocument= null;
	public void setRSTDocument(RSTDocument rstDocument) {
		this.rstDocument = rstDocument;
	}

	public RSTDocument getRSTDocument() {
		return rstDocument;
	}
//========================= end: RSTDocument	
	/**
	 * XML-element types for RST
	 */
	public enum RSTElements {RST, HEADER, ENCODING, RELATIONS, REL, BODY, SEGMENT, GROUP};
	
	/**
	 * Stores the last read RST-XML-Elements
	 */
	private Stack<RSTElements> rstElementStack= null; 
	
	public void startDocument() throws SAXException
    {
    }
    
    public void comment(char[] ch, int start, int length)
    {
    }
    
    /**
     * stores the read text inside an <segment> element
     */
    private StringBuffer currentText= null;
    /**
	 * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
	 */
	public void characters(	char[] ch,
            				int start,
            				int length) throws SAXException
    {
		if (this.rstElementStack.peek().equals(RSTElements.SEGMENT))
		{//current element is <segment/>
			if (this.currentSegment== null)
				throw new RSTException("Cannot add the found text node in file '"+this.getRstFile().getAbsolutePath()+"', because it is not contained in a <segment>-element.");
			if (this.currentText== null)
				this.currentText= new StringBuffer();
			for (int i= start; i< start+length; i++)
			{//creating the text
				if (ch[i]!= '\n')
					currentText.append(ch[i]);
			}//creating the text
		}//current element is <segment/>
    }
	
	/**
	 * Stores the AbstractNode object to its corresponding id.
	 */
	private Hashtable<String, AbstractNode> idAbstractNodeTable= null;
	
	/**
	 * Stores the ids to the AbtractNodes, which were already linked by a relation, but not seen
	 */
	private Hashtable<String, Vector<Relation>> idRelationTable= null;
	/**
	 * puts an id and a relation to the table
	 * @param id
	 * @param relation
	 */
	private void addRelation2Table(String id, Relation relation)
	{
		Vector<Relation> slot= this.idRelationTable.get(id); 
		if (slot== null)
		{
			slot= new Vector<Relation>();
			this.idRelationTable.put(id, slot);
		}
		slot.add(relation);
	}
	
	/**
	 * Storws the last read Sgement-object.
	 */
	private Segment currentSegment= null;
	
	/**
	 * 
	 * @param uri
	 * @param localName
	 * @param qName
	 * @param attributes
	 * @throws SAXException
	 */
	@Override
	public void startElement(	String uri,
            					String localName,
            					String qName,
            					Attributes attributes) throws SAXException
    {
		if (qName.equalsIgnoreCase("rst"))
		{//element <rst/> found
			this.rstElementStack.push(RSTElements.RST);
		}//element <rst/> found
		else if (qName.equalsIgnoreCase("header"))
		{//element <header/> found
			this.rstElementStack.push(RSTElements.HEADER);
		}//element <header/> found
		else if (qName.equalsIgnoreCase("encoding"))
		{//element <encoding/> found
			this.rstElementStack.push(RSTElements.ENCODING);
		}//element <encoding/> found
		else if (qName.equalsIgnoreCase("relations"))
		{//element <relations/> found
			this.rstElementStack.push(RSTElements.RELATIONS);
		}//element <relations/> found
		else if (qName.equalsIgnoreCase("rel"))
		{//element <rel/> found
			this.rstElementStack.push(RSTElements.REL);
		}//element <rel/> found
		else if (qName.equalsIgnoreCase("body"))
		{//element <body/> found
			this.rstElementStack.push(RSTElements.BODY);
		}//element <body/> found
		else if (qName.equalsIgnoreCase("segment"))
		{//element <segment/> found
			this.rstElementStack.push(RSTElements.SEGMENT);
			Segment segment= RSTFactory.eINSTANCE.createSegment();
			segment.setId(attributes.getValue("id"));
			this.getRSTDocument().getSegments().add(segment);
			
			this.idAbstractNodeTable.put(attributes.getValue("id"), segment);
			this.currentSegment= segment;
			{//check if there are relations waiting for this segment
				Vector<Relation> slot= this.idRelationTable.get(attributes.getValue("id"));
				if (slot!= null)
				{//there are relations waiting for this segment
					for (Relation relation: slot)
					{
						relation.setParent(segment);
					}
				}//there are relations waiting for this segment
			}//check if there are relations waiting for this segment
			{//creating relation
				if (attributes.getValue("parent")!= null)
				{
					Relation relation= RSTFactory.eINSTANCE.createRelation();
					relation.setSource(segment);
					this.getRSTDocument().getRelations().add(relation);
					if (attributes.getValue("relname")!= null)
						relation.setName(attributes.getValue("relname"));
					AbstractNode parent= this.idAbstractNodeTable.get(attributes.getValue("parent"));
					if (parent== null)
					{//parent does not exists so far
						this.addRelation2Table(attributes.getValue("parent"), relation);
					}//parent does not exists so far
					else
					{//parent already exists
						relation.setParent(parent);
					}//parent already exists
				}
			}//creating relation
		}//element <segment/> found
		else if (qName.equalsIgnoreCase("group"))
		{//element <group/> found
			this.rstElementStack.push(RSTElements.GROUP);
			Group group= RSTFactory.eINSTANCE.createGroup();
			group.setId(attributes.getValue("id"));
			this.getRSTDocument().getGroups().add(group);
			
			this.idAbstractNodeTable.put(attributes.getValue("id"), group);
			{//check if there are relations waiting for this segment
				Vector<Relation> slot= this.idRelationTable.get(attributes.getValue("id"));
				if (slot!= null)
				{//there are relations waiting for this segment
					for (Relation relation: slot)
					{
						relation.setParent(group);
					}
				}//there are relations waiting for this segment
			}//check if there are relations waiting for this segment
			{//creating relation
				if (attributes.getValue("parent")!= null)
				{
					Relation relation= RSTFactory.eINSTANCE.createRelation();
					this.getRSTDocument().getRelations().add(relation);
					relation.setSource(group);
					if (attributes.getValue("relname")!= null)
						relation.setName(attributes.getValue("relname"));
					if (attributes.getValue("type")!= null)
						relation.setType(attributes.getValue("type"));
					AbstractNode parent= this.idAbstractNodeTable.get(attributes.getValue("parent"));
					if (parent== null)
					{//parent does not exists so far
						this.addRelation2Table(attributes.getValue("parent"), relation);
					}//parent does not exists so far
					else
					{//parent already exists
						relation.setParent(parent);
					}//parent already exists
				}
			}//creating relation
		}//element <group/> found
    }
	
	/**
	 * 
	 * @param namespaceURI
	 * @param localName
	 * @param qName
	 * @throws SAXException
	 */
	@Override
	public void endElement(String namespaceURI, String localName, String qName) throws SAXException
	{
		this.rstElementStack.pop();
		if (qName.equalsIgnoreCase("body"))
		{//element <body/> found
			
		}//element <body/> found
		else if (qName.equalsIgnoreCase("segment"))
		{//element <segment/> found
			if (this.currentText!= null)
				this.currentSegment.setText(this.currentText.toString());
			this.currentText= null;
			this.currentSegment= null;
		}//element <segment/> found
		else if (qName.equalsIgnoreCase("group"))
		{//element <group/> found
			
		}//element <group/> found
	}
}
