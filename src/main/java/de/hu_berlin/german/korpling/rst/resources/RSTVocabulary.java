package de.hu_berlin.german.korpling.rst.resources;

/**
 * This class provides the rst xml vocabulary.
 * @author Florian Zipser
 *
 */
public abstract class RSTVocabulary {
	//tags and attributes for files of type TEXT(text.dtd)
	public static final String TAG_RST= "rst";
	public static final String TAG_HEADER= "header";		
	public static final String TAG_ENCODING= "encoding";
	public static final String TAG_RELATIONS= "relations";		
	public static final String TAG_REL= "rel";
	public static final String TAG_BODY= "body";
	public static final String TAG_SEGMENT= "segment";
	public static final String TAG_GROUP= "group";
	
	public static final String ATT_NAME= "name";
	public static final String ATT_PARENT= "parent";
	public static final String ATT_TYPE= "type";
	public static final String ATT_ID= "id";
	public static final String ATT_RELNAME= "relname";
	
}
