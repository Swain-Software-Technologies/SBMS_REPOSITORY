/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.sax.apps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * @author TRINATH, Dec 24, 2020
 *
 * @Description :
 */
public class ParseAccountXml {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
//		Creating SAXParserFactory using Factory Design Pattern
		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
		
//		Creating SAXParser From Factory
		SAXParser saxParser = parserFactory.newSAXParser();
		
//		Locating File Path
		File f = new File("Account.xml");
		FileInputStream inputStream = new FileInputStream(f);
		
		saxParser.parse(inputStream, new AccountHandler());
	}
}
