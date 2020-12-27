/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.jaxp.dom.apps;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @author TRINATH, Dec 25, 2020
 *
 * @Description :
 */
public class CreateXMLUsingDom {

	/**
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws TransformerException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, TransformerException {
		 DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
		 DocumentBuilder documentBuilder=builderFactory.newDocumentBuilder();
		 Document document=documentBuilder.newDocument();
		 
		 //Create Root Element
		 Element rootElement=document.createElement("Employees");
		 document.appendChild(rootElement);
		 
//		 Create Employee Element under Employees tag
		 Element employee=document.createElement("Employee");
		 rootElement.appendChild(employee);
		 
//		 Setting attributes to Employee
		 Attr attr=document.createAttribute("id");
		 attr.setValue("1");
		 employee.setAttributeNode(attr);
		 
//		 Set Age Element
		 Element age=document.createElement("age");
		 age.appendChild(document.createTextNode("28"));
		 employee.appendChild(age);
		 
//		 Set First Name Element
		 Element fname=document.createElement("fname");
		 fname.appendChild(document.createTextNode("Trinath"));
		 employee.appendChild(fname);
		 
//		 Set Last Name Element
		 Element lname=document.createElement("lname");
		 lname.appendChild(document.createTextNode("Swain"));
		 employee.appendChild(lname);
		 
//		 Set Age Element
		 Element role=document.createElement("role");
		 role.appendChild(document.createTextNode("Develoder"));
		 employee.appendChild(role);
		 
		 Comment comment=document.createComment("This is a Comment .");
		 rootElement.appendChild(comment);
		 
//		 Write Content into XML.
//		 Create TransformerFactory
		 TransformerFactory transformerFactory=TransformerFactory.newInstance();
		 
//		 Cretate Transformer
		 Transformer transformer=transformerFactory.newTransformer();
		 
//		 Cretae DOMSource Object . DOMSource acts as a holder for tnsformation source tree in the form of a DOM tree
		 DOMSource source=new DOMSource(document);
		 
		 StreamResult streamResult=new StreamResult(new File("employee.xml"));
		 transformer.transform(source, streamResult);
		 
//		 Output to see in console
		 StreamResult consoleResult=new StreamResult(System.out);
		 transformer.transform(source, consoleResult);
		 
		 

	}

}
