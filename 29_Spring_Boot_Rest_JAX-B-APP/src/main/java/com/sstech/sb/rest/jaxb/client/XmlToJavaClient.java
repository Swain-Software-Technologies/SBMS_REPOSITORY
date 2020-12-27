/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.jaxb.client;

import javax.xml.bind.JAXBException;

import com.sstech.sb.rest.jaxb.converter.XmlToJavaConverter;

/**
 * @author TRINATH, Dec 26, 2020
 *
 * @Description :
 */
public class XmlToJavaClient {

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException {

		XmlToJavaConverter.xmlToJavaConverter();
	}

}
