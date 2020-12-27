/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.jaxb.client;

import javax.xml.bind.JAXBException;

import com.sstech.sb.rest.jaxb.converter.JavaToXmlConverter;

/**
 * @author TRINATH, Dec 25, 2020
 *
 * @Description :
 */
public class JToXClient {

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException {
		
		JavaToXmlConverter.javaToXmlConverter();
	}

}
