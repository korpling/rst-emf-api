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
package de.hu_berlin.german.korpling.rst.resources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import de.hu_berlin.german.korpling.rst.Group;
import de.hu_berlin.german.korpling.rst.RSTDocument;
import de.hu_berlin.german.korpling.rst.Relation;
import de.hu_berlin.german.korpling.rst.Segment;
import de.hu_berlin.german.korpling.rst.exceptions.RSTException;

public class RSTWriter {
	/**
	 * Sets encoding for output stream
	 */
	public static final String encoding = "UTF-8";

	/**
	 * Stores a RST-model into a .rs3 file.
	 */
	public void write(RSTDocument rstDocument, URI uri) {
		XMLOutputFactory xof = null;
		XMLStreamWriter xmlWriter = null;

		try {
			if (rstDocument != null) {
				// write doc1
				xof = XMLOutputFactory.newInstance();
				xmlWriter = null;
				OutputStreamWriter outStream = new OutputStreamWriter(new FileOutputStream(uri.toFileString()), "UTF-8");
				xmlWriter = xof.createXMLStreamWriter(outStream);
				xmlWriter.writeStartDocument(encoding, "1.0");

				xmlWriter.writeStartElement(RSTVocabulary.TAG_RST);
				// print header
				xmlWriter.writeStartElement(RSTVocabulary.TAG_HEADER);
				xmlWriter.writeStartElement(RSTVocabulary.TAG_ENCODING);
				xmlWriter.writeAttribute(RSTVocabulary.ATT_NAME, encoding);
				xmlWriter.writeEndElement();
				// relations
				xmlWriter.writeStartElement(RSTVocabulary.TAG_RELATIONS);
				if ((rstDocument.getRelations() != null) && (rstDocument.getRelations().size() > 0)) {// compute
																										// header
																										// information
																										// for
																										// relations
																										// (NOTE:
																										// just
																										// a
																										// heuristic
																										// and
																										// mostly
																										// incorrect)
					HashSet<String> nameTypeHash = new HashSet<String>();
					EList<String[]> headerRelEntries = new BasicEList<String[]>();
					for (Relation relation : rstDocument.getRelations()) {
						String[] nameType = new String[2];
						nameType[0] = relation.getName();
						nameType[1] = relation.getType();
						if (!nameTypeHash.contains(nameType[0])) {// if entry
																	// does not
																	// still
																	// exists
																	// create it
							nameTypeHash.add(nameType[0]);
							headerRelEntries.add(nameType);
						} // if entry does not still exists create it
					}

					for (String[] relationName : headerRelEntries) {// write
																	// entries
																	// to header
						xmlWriter.writeStartElement(RSTVocabulary.TAG_REL);
						xmlWriter.writeAttribute(RSTVocabulary.ATT_NAME, relationName[0]);
						if (relationName[1] != null)
							xmlWriter.writeAttribute(RSTVocabulary.ATT_TYPE, relationName[1]);
						xmlWriter.writeEndElement();
					} // write entries to header
				} // compute header information for relations (NOTE: just a
					// heuristic and mostly incorrect)
				xmlWriter.writeEndElement();
				// relations
				xmlWriter.writeEndElement();
				// print header
				// print header
				xmlWriter.writeStartElement(RSTVocabulary.TAG_BODY);
				// segments
				if (rstDocument.getSegments() != null) {
					for (Segment segment : rstDocument.getSegments()) {
						xmlWriter.writeStartElement(RSTVocabulary.TAG_SEGMENT);
						xmlWriter.writeAttribute(RSTVocabulary.ATT_ID, segment.getId());
						if (segment.getType() != null)
							xmlWriter.writeAttribute(RSTVocabulary.ATT_TYPE, segment.getType());

						EList<Relation> incomingRelations = rstDocument.getIncomingRelations(segment.getId());
						if (incomingRelations != null) {
							Relation incomingRelation = incomingRelations.get(0);
							if (incomingRelation.getParent() != null)
								xmlWriter.writeAttribute(RSTVocabulary.ATT_PARENT, incomingRelation.getParent().getId());
							if (incomingRelation.getName() != null)
								xmlWriter.writeAttribute(RSTVocabulary.ATT_RELNAME, incomingRelation.getName());
						}

						xmlWriter.writeCharacters(segment.getText());
						xmlWriter.writeEndElement();
					}
				}
				// segments
				// groups
				if (rstDocument.getGroups() != null) {
					for (Group group : rstDocument.getGroups()) {
						xmlWriter.writeStartElement(RSTVocabulary.TAG_GROUP);
						xmlWriter.writeAttribute(RSTVocabulary.ATT_ID, group.getId());
						if (group.getType() != null)
							xmlWriter.writeAttribute(RSTVocabulary.ATT_TYPE, group.getType());

						EList<Relation> incomingRelations = rstDocument.getIncomingRelations(group.getId());
						if (incomingRelations != null) {
							Relation incomingRelation = incomingRelations.get(0);
							if (incomingRelation.getParent() != null)
								xmlWriter.writeAttribute(RSTVocabulary.ATT_PARENT, incomingRelation.getParent().getId());
							if (incomingRelation.getName() != null)
								xmlWriter.writeAttribute(RSTVocabulary.ATT_RELNAME, incomingRelation.getName());
						}
						xmlWriter.writeEndElement();
					}
				}
				// end: group
				xmlWriter.writeEndElement();
				// print header
				xmlWriter.writeEndElement();
				xmlWriter.writeEndDocument();
			}
		} catch (XMLStreamException e) {
			throw new RSTException("Cannot store data to file '" + uri + "'. ", e);
		} catch (UnsupportedEncodingException e) {
			throw new RSTException("Cannot store data to file '" + uri + "'. ", e);
		} catch (FileNotFoundException e) {
			throw new RSTException("Cannot store data to file '" + uri + "'. ", e);
		} finally {
			try {
				xmlWriter.flush();
				xmlWriter.close();
			} catch (Exception e) {
				throw new RSTException("Cannot close stream '" + uri + "'. ", e);
			}
		}
	}
}
