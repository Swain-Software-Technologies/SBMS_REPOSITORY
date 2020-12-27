/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.message.converter;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sstech.sb.rest.model.Student;

/**
 * @author TRINATH, Sep 14, 2020
 *
 * @Description :
 */
public class JsonToJavaConverter {

	public void convertJsonToJavaObject() throws JsonMappingException, IOException {

		File file = new File("student.json");
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(file, Student.class);
		System.out.println(student);
	}
}
