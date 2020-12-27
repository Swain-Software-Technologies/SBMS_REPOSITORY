/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.sax.apps;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author TRINATH, Dec 24, 2020
 *
 * @Description :
 */
public class AccountHandler extends DefaultHandler{
	
	boolean bank=false;
	boolean account=false;
	boolean id=false;
	boolean name=false;
	boolean amount=false;
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("AccountHandler.startDocument()");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("AccountHandler.startElement()");
		if(qName.equals("Bank")) {
			bank=true;
		}else if(qName.equals("Account")) {
			account=true;
			System.out.println("Account Types is ::"+attributes.getValue("type"));
		}else if(qName.equals("id")) {
			id=true;
		}else if(qName.equals("name")) {
			name=true;
		}else if(qName.equals("Amount")) {
			amount=true;
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println("AccountHandler.characters()");
		if(id) {
			System.out.println("Account Id "+new String(ch,start,length));
			id=false;
		}
		if(name) {
			System.out.println("Account Holder Name "+new String(ch,start,length));
			name=false;
		}
		if(amount) {
			System.out.println("Amount is "+new String(ch,start,length));
			amount=false;
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("AccountHandler.endElement()");
	}
	@Override
	public void endDocument() throws SAXException {
		System.out.println("AccountHandler.endDocument()");
	}
}
