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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import de.hu_berlin.german.korpling.rst.RSTDocument;
import de.hu_berlin.german.korpling.rst.RSTFactory;
import de.hu_berlin.german.korpling.rst.exceptions.RSTException;

public class RSTResource extends ResourceImpl {
	/**
	 * Stores a a treetagger-model into tab-seperated file.
	 */
	public void save(java.util.Map<?, ?> options) throws java.io.IOException {
		// write all contents into file
		if (this.getContents().size() > 1)
			throw new RSTException("Cannot write more than one RSTDocument-object per file.");
		if (!(this.getContents().get(0) instanceof RSTDocument))
			throw new RSTException("The object to store is not of type RSTDocument.");
		RSTDocument rstDocument = (RSTDocument) this.getContents().get(0);
		RSTWriter writer = new RSTWriter();
		writer.write(rstDocument, this.getURI());
	}

	/**
	 * Loads a resource into treetagger-model from tab-seperated file.
	 */
	public void load(java.util.Map<?, ?> options) throws IOException {
		if (this.getURI() == null)
			throw new RSTException("Cannot load any resource, because no uri is given.");

		File rstFile = new File(this.getURI().toFileString());
		if (!rstFile.exists())
			throw new RSTException("Cannot load resource, because the file does not exist: " + rstFile);

		if (!rstFile.canRead())
			throw new RSTException("Cannot load resource, because the file can not be read: " + rstFile);
		RSTDocument rstDocument = null;
		{// create everything a valid exmaralda needs
			rstDocument = RSTFactory.eINSTANCE.createRSTDocument();
			this.getContents().add(rstDocument);
		}

		SAXParser parser;
		XMLReader xmlReader;
		RSTReader rstReader = new RSTReader();
		rstReader.setRstFile(rstFile);
		rstReader.setRSTDocument(rstDocument);

		SAXParserFactory factory = SAXParserFactory.newInstance();

		try {
			parser = factory.newSAXParser();
			xmlReader = parser.getXMLReader();
			// setting LexicalHandler to read DTD
			xmlReader.setProperty("http://xml.org/sax/properties/lexical-handler", rstReader);
			xmlReader.setContentHandler(rstReader);
		} catch (ParserConfigurationException e) {
			throw new RSTException("Cannot load exmaralda from resource '" + rstFile.getAbsolutePath() + "'.", e);
		} catch (Exception e) {
			throw new RSTException("Cannot load exmaralda from resource '" + rstFile.getAbsolutePath() + "'.", e);
		}
		try {
			InputStream inputStream = new FileInputStream(rstFile);
			Reader reader = new InputStreamReader(inputStream, "UTF-8");

			InputSource is = new InputSource(reader);
			is.setEncoding("UTF-8");

			xmlReader.parse(is);

		} catch (SAXException e) {

			try {
				parser = factory.newSAXParser();
				xmlReader = parser.getXMLReader();
				xmlReader.parse(rstFile.getAbsolutePath());
				// setting LexicalHandler to read DTD
				xmlReader.setProperty("http://xml.org/sax/properties/lexical-handler", rstReader);
				xmlReader.setContentHandler(rstReader);
			} catch (Exception e1) {
				throw new RSTException("Cannot load exmaralda from resource '" + rstFile.getAbsolutePath() + "'.", e1);
			}
		}

		// SAXParser parser;
		// XMLReader xmlReader;
		// try {
		// SAXParserFactory factory= SAXParserFactory.newInstance();
		//
		// parser= factory.newSAXParser();
		//
		// xmlReader= parser.getXMLReader();
		//
		// //create and set content handler
		// RSTReader rstReader= new RSTReader();
		// rstReader.setRstFile(rstFile);
		// rstReader.setRSTDocument(rstDocument);
		// xmlReader.setContentHandler(rstReader);
		//
		// //setting LexicalHandler to read DTD
		// xmlReader.setProperty("http://xml.org/sax/properties/lexical-handler",
		// rstReader);
		// xmlReader.setContentHandler(rstReader);
		//
		// xmlReader.parse(rstFile.getAbsolutePath());
		//
		// } catch (ParserConfigurationException e) {
		// throw new RSTException("Cannot load exmaralda from resource
		// '"+rstFile.getAbsolutePath()+"'.", e);
		// } catch (SAXException e) {
		// throw new RSTException("Cannot load exmaralda from resource
		// '"+rstFile.getAbsolutePath()+"'.", e);
		// }
	}
}
