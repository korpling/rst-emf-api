package de.hu_berlin.german.korpling.saltnpepper.misc.rst.resources;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;


public class RSTResourceFactory extends ResourceFactoryImpl 
{
	public Resource createResource(URI uri)
	{
		Resource resource=new RSTResource();
		resource.setURI(uri);
		return(resource);
	}
}
