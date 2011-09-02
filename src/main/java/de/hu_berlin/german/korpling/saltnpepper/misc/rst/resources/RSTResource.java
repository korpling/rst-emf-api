package de.hu_berlin.german.korpling.saltnpepper.misc.rst.resources;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument;
import de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTFactory;
import de.hu_berlin.german.korpling.saltnpepper.misc.rst.exceptions.RSTException;

public class RSTResource extends ResourceImpl
{	
	/**
	 * Stores a a treetagger-model into tab-seperated file.
	 */
	public void save(java.util.Map<?,?> options) throws java.io.IOException
	{
		//write all contents into file
		if (this.getContents().size()>1)
			throw new RSTException("Cannot write more than one RSTDocument-object per file.");
		if (!(this.getContents().get(0) instanceof RSTDocument))
			throw new RSTException("The object to store is not of type RSTDocument.");
		RSTDocument rstDocument= (RSTDocument) this.getContents().get(0);
		RSTWriter writer= new RSTWriter();
		writer.write(rstDocument, this.getURI());
	}
	
	
	/**
	 * Loads a resource into treetagger-model from tab-seperated file.
	 */
	public void load(java.util.Map<?,?> options) throws IOException
	{
		if (this.getURI()== null)
			throw new RSTException("Cannot load any resource, because no uri is given.");
		
		File rstFile= new File(this.getURI().toFileString());
		if (!rstFile.exists()) 
			throw new RSTException("Cannot load resource, because the file does not exists: " + rstFile);
		
		if (!rstFile.canRead())
			throw new RSTException("Cannot load resource, because the file can not be read: " + rstFile);
		RSTDocument rstDocument= null;
		{//create everything a valid exmaralda needs
			rstDocument= RSTFactory.eINSTANCE.createRSTDocument();
			this.getContents().add(rstDocument);
		}
		
		SAXParser parser;
        XMLReader xmlReader;
        try {
        	SAXParserFactory factory= SAXParserFactory.newInstance();
        
			parser= factory.newSAXParser();
		
	        xmlReader= parser.getXMLReader();

	        //create and set content handler
	        RSTReader rstReader= new RSTReader();
	        rstReader.setRstFile(rstFile);
	        rstReader.setRSTDocument(rstDocument);
	        xmlReader.setContentHandler(rstReader);
	        
	        //setting LexicalHandler to read DTD
	        xmlReader.setProperty("http://xml.org/sax/properties/lexical-handler", rstReader);
	        xmlReader.setContentHandler(rstReader);
	        
	        xmlReader.parse(rstFile.getAbsolutePath());
	        
	    } catch (ParserConfigurationException e) {
        	throw new RSTException("Cannot load exmaralda from resource '"+rstFile.getAbsolutePath()+"'.", e);
        } catch (SAXException e) {
        	throw new RSTException("Cannot load exmaralda from resource '"+rstFile.getAbsolutePath()+"'.", e);
		}
	}
}