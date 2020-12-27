/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.jaxp.dom.apps;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author TRINATH, Dec 24, 2020
 *
 * @Description :
 */
public class ParseItemsDataUsingDOM {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

//		Create DocumentBuilderFactory
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
//		Create Document Builder
		DocumentBuilder builder = builderFactory.newDocumentBuilder();

//		Create Document
		Document document=builder.parse(new File("Item.xml"));
		
//		Normalize the XML Structure
		document.getDocumentElement().normalize();
		
//		Comes to root node
		Element root=document.getDocumentElement();
		System.out.println(root.getNodeName());
		
		NodeList nodeList=document.getElementsByTagName("item");
		if(nodeList!=null) {
			for(int temp=0;temp<nodeList.getLength();temp++) {
				Node node=nodeList.item(temp);
				if(node.getNodeType()==Document.ELEMENT_NODE) {
					Element element=(Element) node;
					System.out.println("Item Code "+element.getElementsByTagName("itemCode").item(0).getTextContent());
					System.out.println("Item Code "+element.getElementsByTagName("itemName").item(0).getTextContent());
					System.out.println("Item Code "+element.getElementsByTagName("quantity").item(0).getTextContent());
				}
			}
		}
	}

}
