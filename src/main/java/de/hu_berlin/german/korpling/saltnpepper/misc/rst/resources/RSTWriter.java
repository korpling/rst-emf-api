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
package de.hu_berlin.german.korpling.saltnpepper.misc.rst.resources;

import java.io.FileOutputStream;
import java.io.PrintStream;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import de.hu_berlin.german.korpling.saltnpepper.misc.rst.Group;
import de.hu_berlin.german.korpling.saltnpepper.misc.rst.RSTDocument;
import de.hu_berlin.german.korpling.saltnpepper.misc.rst.Relation;
import de.hu_berlin.german.korpling.saltnpepper.misc.rst.Segment;


public class RSTWriter 
{
	/**
	 * Encoding in which file has to be written
	 */
	private String encoding= "UTF-8";
	
	/**
	 * Stream in which the file content is written.
	 */
	PrintStream fileWriter= null;
	
	/**
	 * Stores a RST-model into a .rs3 file.
	 */
	public void write(RSTDocument rstDocument, URI uri) throws java.io.IOException
	{
		if (rstDocument!= null)
		{	
			this.fileWriter= new PrintStream(new FileOutputStream(uri.toFileString()), true, this.encoding);
			try 
			{
				this.fileWriter.println("<rst>");
				{//print header
					this.fileWriter.println("<header>");
					this.fileWriter.println("<encoding name=\""+this.encoding+"\" />");
					{//relations
						this.fileWriter.println("<relations>");
						if (	(rstDocument.getRelations()!= null) &&
								(rstDocument.getRelations().size()> 0))
						{//compute header information for relations	(NOTE: just a heuristic and mostly incorrect)
							this.fileWriter.println("<!-- attention: this is done by a heuristic and can not be precisly computed. -->");
							EList<String> headerRelEntries= new BasicEList<String>();
							for (Relation relation: rstDocument.getRelations())
							{
								if (!headerRelEntries.contains(relation.getName()))
								{//if entry does not still exists create it
									headerRelEntries.add(relation.getName());
								}//if entry does not still exists create it
							}
							for (String relationName: headerRelEntries)
							{//write entries to header
								this.fileWriter.println("<rel name=\""+relationName+"\" type=\"rst\" />");
								this.fileWriter.println("<rel name=\""+relationName+"\" type=\"multinuc\" />");
							}//write entries to header
						}//compute header information for relations	(NOTE: just a heuristic and mostly incorrect)
						this.fileWriter.println("</relations>");
					}//relations
					this.fileWriter.println("</header>");
				}//print header
				{//print header
					this.fileWriter.println("<body>");
					{//segments
						if (rstDocument.getSegments()!= null)
						{	
							for (Segment segment: rstDocument.getSegments())
							{
								this.fileWriter.print("<segment id=\""+segment.getId()+"\"");
								Relation outgoingRelation= rstDocument.getOutgoingRelation(segment.getId());
								if (outgoingRelation!= null)
								{
									if (outgoingRelation.getParent()!= null)
										this.fileWriter.print(" parent=\""+outgoingRelation.getParent().getId()+"\"");
									if (outgoingRelation.getName()!= null)
										this.fileWriter.print(" relname=\""+this.getXMLEscaping(outgoingRelation.getName())+"\"");
								}
								this.fileWriter.print(">");
								this.fileWriter.print(this.getXMLEscaping(segment.getText()));
								this.fileWriter.println("</segment>");
							}
						}
					}//segments
					{//groups
						if (rstDocument.getGroups()!= null)
						{	
							for (Group group: rstDocument.getGroups())
							{
								this.fileWriter.print("<group id=\""+group.getId()+"\" ");
								
								Relation outgoingRelation= rstDocument.getOutgoingRelation(group.getId());
								if (outgoingRelation!= null)
								{
									if (outgoingRelation.getType()!= null)
										this.fileWriter.print("type=\""+this.getXMLEscaping(outgoingRelation.getType())+"\" ");
									if (outgoingRelation.getParent()!= null)
										this.fileWriter.print("parent=\""+outgoingRelation.getParent().getId()+"\" ");
									if (outgoingRelation.getName()!= null)
										this.fileWriter.print("relname=\""+this.getXMLEscaping(outgoingRelation.getName())+"\" ");
								}
								this.fileWriter.println("/>");
							}
						}
					}//groups
					this.fileWriter.println("</body>");
				}//print header
				this.fileWriter.println("</rst>");
			} 
			catch (RuntimeException e) {
				e.printStackTrace();
				throw e;
			}
			finally
			{
				fileWriter.flush();
				fileWriter.close();
			}
		}
	}
	
	/**
	 * Returns the given string with replaced escaping characters to the origin characters.
	 * For example returns given template:  "a &lt; b" returns "a < b"
	 * @param template
	 * @return
	 */
	private String getXMLEscaping(String template)
	{
		String retStr=template;
		retStr= retStr.replaceAll("&", "&amp;");
		retStr= retStr.replaceAll("'", "&apos;");
		retStr= retStr.replaceAll("<", "&lt;");
		retStr= retStr.replaceAll(">", "&gt;");
		retStr= retStr.replaceAll("\"", "&quot;");
		
		retStr= retStr.replaceAll("Ä", "&#196;");
		retStr= retStr.replaceAll("Ö", "&#214;");
		retStr= retStr.replaceAll("Ü", "&#220;");
		retStr= retStr.replaceAll("ä", "&#228;");
		retStr= retStr.replaceAll("ö", "&#246;");
		retStr= retStr.replaceAll("ü", "&#252;");
		retStr= retStr.replaceAll("ß", "&#223;");
		return(retStr);
	}
}
