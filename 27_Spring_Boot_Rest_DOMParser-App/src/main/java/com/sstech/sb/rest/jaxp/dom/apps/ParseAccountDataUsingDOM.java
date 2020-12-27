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
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author TRINATH, Dec 24, 2020
 *
 * @Description :
 */
public class ParseAccountDataUsingDOM {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
//		Create DocumentBuilderFactory
		DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
//		Create Document Builder
		DocumentBuilder documentBuilder=builderFactory.newDocumentBuilder();
//		Build Document
		Document document=documentBuilder.parse(new File("Account.xml"));
		
//		Normalize the XML Structure
		document.getDocumentElement().normalize();
		
//		comes to root nodes
		Element root=document.getDocumentElement();
		System.out.println(root.getNodeName());
		
//		Get all Account Holders
		NodeList nList=document.getElementsByTagName("Account");
		System.out.println("================================");
		visitChildNodes(nList);
	}

	/**
	 * @param nList
	 */
	private static void visitChildNodes(NodeList nList) {
		
		for(int temp=0;temp<nList.getLength();temp++) {
			Node node=nList.item(temp);
			if(node.getNodeType()==Node.ELEMENT_NODE) {
				System.out.println("Node name :: "+node.getNodeName()+" & Value is :: "+node.getTextContent());
				//Chech all attriutes
				if(node.hasAttributes()) {
//					Get All Attributes name and values
					NamedNodeMap nodeMap=node.getAttributes();
					for(int i=0;i<nodeMap.getLength();i++) {
						Node tempNode=nodeMap.item(i);
						System.out.println("Attribute Name :: "+tempNode.getNodeName()+" & value is :: "+tempNode.getNodeValue());
					}
					if(node.hasChildNodes()) {
//						We get more childs Lets visit them as wel as
						visitChildNodes(node.getChildNodes());
					}
				}
			}
		}
		
	}
}
