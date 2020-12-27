/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.message.converter;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sstech.sb.rest.model.Student;

/**
 * @author TRINATH, Dec 23, 2020
 *
 * @Description :
 */
public class JsonArrayToJavaConverter {

	public void convertJsonArryToObjects() throws JsonParseException, JsonMappingException, IOException {
		File file = new File("students.json");
		ObjectMapper mapper = new ObjectMapper();
		Student[] students=mapper.readValue(file, Student[].class);
		System.out.println(students);
		for(Student s : students) {
			System.out.println(s);
		}
	}
}
