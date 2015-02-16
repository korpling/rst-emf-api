# rst-emf-api

The project rst-emf-api offers a simple java api and model to access and describe RST data used by the RST tool (see: http://www.wagsoft.com/RSTTool/).
RST stands for rhetorical structure theory. The api provides methods to read and write rs3 files and manipulate the included data.

The RST model was deleoped with EMF, the Eclipse Modeling Framework (see: http://www.eclipse.org/modeling/emf/). EMF comes with the UML near syntax Ecore and provides methoides to automatically generate java code out of the model.

The following figure shows the RST model, provided by this api.

(./gh-site/img/rst.jpg)

The model was created following the restrictions of the following dtd.


```xml
<!ELEMENT rst (header,body)>
<!ELEMENT header (relations)>
<!ELEMENT relations (rel*)>
<!ELEMENT rel EMPTY>
<!ELEMENT body (segment*, group*)>
<!ELEMENT segment (#PCDATA)>
<!ELEMENT group EMPTY >
<!ATTLIST rel
name CDATA #REQUIRED
type CDATA #REQUIRED>
<!ATTLIST segment
id CDATA #REQUIRED
parent CDATA #IMPLIED
relname CDATA #IMPLIED>
<!ATTLIST group
id CDATA #REQUIRED
type CDATA #REQUIRED
parent CDATA #IMPLIED
relname CDATA #IMPLIED>
```

Here we give a brief excerpt, of how to create a simple RSTGraph:

```java
 String text1= "Jim went to Harvard,";
 String text2= "and John went to Yale.";
 String text3= "Therefore, both attended good schools.";

 RSTDocument rstDocument= RSTFactory.eINSTANCE.createRSTDocument();

 Group group1= RSTFactory.eINSTANCE.createGroup();
 group1.setType("span");
 group1.setId("grp1");
 rstDocument.getGroups().add(group1);

 Group group2= RSTFactory.eINSTANCE.createGroup();
 group2.setType("multinuc");
 group2.setId("grp2");
 rstDocument.getGroups().add(group2);

 rstDocument.createRelation(group1, group2, "span", null);

 EList<Segment> segments= new BasicEList<Segment>();
 Segment seg1= RSTFactory.eINSTANCE.createSegment();
 seg1.setText(text1);
 seg1.setId("seg1");
 segments.add(seg1);
 rstDocument.getSegments().add(seg1);

 rstDocument.createRelation(group2, seg1, "conjunction", "multinuc");

 Segment seg2= RSTFactory.eINSTANCE.createSegment();
 seg2.setText(text2);
 seg2.setId("seg2");
 segments.add(seg2);
 rstDocument.getSegments().add(seg2);

 rstDocument.createRelation(group2, seg2, "conjunction", "multinuc");

 Segment seg3= RSTFactory.eINSTANCE.createSegment();
 seg3.setText(text3);
 seg3.setId("seg3");
 segments.add(seg3);
 rstDocument.getSegments().add(seg3);
```
This excerpt creates the following rst graph:

(./gh-site/img/b1_sample.jpg)
