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
package de.hu_berlin.german.korpling.saltnpepper.misc.rst.tests.resources;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.hu_berlin.german.korpling.rst.RSTDocument;
import de.hu_berlin.german.korpling.rst.exceptions.RSTException;
import de.hu_berlin.german.korpling.rst.resources.RSTResourceFactory;

public class StoringTest extends TestCase 
{
	private void loadSaveCompare(	String inputFileStr, 
									String outputFileStr,
									String expectedFileStr) throws IOException
	{
		File inputFile= new File(inputFileStr);
		if (!inputFile.exists())
			throw new RSTException("Cannot load file, because it is null ("+inputFileStr+").");
		
		File outputFile= new File(outputFileStr);
		outputFile.getParentFile().mkdirs();
		// create resource set and resource 
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("rs3",new RSTResourceFactory());

		//load resource 
		Resource resource = resourceSet.createResource(URI.createFileURI(inputFileStr));
		
		if (resource== null)
			throw new NullPointerException("The resource is null.");
		resource.load(null);
		
		{//save file
			RSTDocument basicTranscription= (RSTDocument) resource.getContents().get(0);
			
			Resource resourceOut = resourceSet.createResource(URI.createFileURI(outputFileStr));
			resourceOut.getContents().add(basicTranscription);
			resourceOut.save(null);
		}//save file
		
		FileComparator comparer= new FileComparator();
		assertTrue("Both files has to be the same ('"+expectedFileStr+"/ '"+outputFile+"'')", comparer.compareFiles(new File(expectedFileStr), outputFile));
	}
	
	public void testLoadSave1() throws IOException
	{
		String inputFile= "./src/test/resources/Case1/TestFile.rs3";
		String expectedFile= "./src/test/resources/Case1/TestFile.rs3";
		String outputFile= "./_TMP/TestFile.rs3";
		
		this.loadSaveCompare(inputFile, outputFile, expectedFile);
	}
	
	public void testLoadSave2() throws IOException
	{
		String inputFile= "./src/test/resources/Case2/Test_PCC.rs3";
		String expectedFile= "./src/test/resources/Case2/Test_PCC.rs3";
		String outputFile= "./_TMP/Test_PCC.rs3";
		
		this.loadSaveCompare(inputFile, outputFile, expectedFile);
	}
}
