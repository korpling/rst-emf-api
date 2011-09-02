package de.hu_berlin.german.korpling.saltnpepper.misc.rst.tests.resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileComparator 
{
	public boolean compareFiles(File file1, File file2) throws IOException
	{
		boolean retVal= false;
		
		if ((file1== null) || (file2== null))
			throw new NullPointerException("One of the files to compare are null.");
		
		StringBuffer contentFile1= new StringBuffer();
		StringBuffer contentFile2= new StringBuffer();
		BufferedReader brFile1= null;
		BufferedReader brFile2= null;
		try 
		{
			brFile1=  new BufferedReader(new FileReader(file1));
			String line= null;
			while (( line = brFile1.readLine()) != null)
			{
		          contentFile1.append(line);
		    }
			brFile2=  new BufferedReader(new FileReader(file2));
			line= null;
			while (( line = brFile2.readLine()) != null)
			{
		          contentFile2.append(line);
		    }
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally 
		{
			brFile1.close();
			brFile2.close();
		} 
		if (contentFile1.toString().equals(contentFile2.toString()))
			retVal= true;
		return(retVal);
	}
}
