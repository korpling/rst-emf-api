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

/**
 * This class provides the rst xml vocabulary.
 * 
 * @author Florian Zipser
 *
 */
public abstract class RSTVocabulary {
	// tags and attributes for files of type TEXT(text.dtd)
	public static final String TAG_RST = "rst";
	public static final String TAG_HEADER = "header";
	public static final String TAG_ENCODING = "encoding";
	public static final String TAG_RELATIONS = "relations";
	public static final String TAG_REL = "rel";
	public static final String TAG_BODY = "body";
	public static final String TAG_SEGMENT = "segment";
	public static final String TAG_GROUP = "group";

	public static final String ATT_NAME = "name";
	public static final String ATT_PARENT = "parent";
	public static final String ATT_TYPE = "type";
	public static final String ATT_ID = "id";
	public static final String ATT_RELNAME = "relname";

}
