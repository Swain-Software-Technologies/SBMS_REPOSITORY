/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.jaxb.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.sstech.sb.rest.jaxb.model.Student;

/**
 * @author TRINATH, Dec 26, 2020
 *
 * @Description :
 */
public class XmlToJavaConverter {

	public static void xmlToJavaConverter() throws JAXBException {
		File file = new File("student-updated.xml");
		
		JAXBContext context=JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller=context.createUnmarshaller();
		Student student = (Student) unmarshaller.unmarshal(file);
		System.out.println(student);
	}
}
