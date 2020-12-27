/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.jaxb.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sstech.sb.rest.jaxb.model.Student;

/**
 * @author TRINATH, Dec 25, 2020
 *
 * @Description :ctrl+1 is shortcut for return type ..Marshalling
 */
public class JavaToXmlConverter {

	public static void javaToXmlConverter() throws JAXBException {
		
		Student student = new Student();
		student.setStdId(101);
		student.setStdName("Trinath");
		student.setStdAddress("Khurda");
		student.setStdMarks(360f);
		student.setStdAvg(60.0f);
		student.setStdStandard("5th");
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
		Marshaller createMarshaller = jaxbContext.createMarshaller();  
		createMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		createMarshaller.marshal(student,System.out); //Print in console
		createMarshaller.marshal(student, new File("student-updated.xml")); //Print in File
	}
}
