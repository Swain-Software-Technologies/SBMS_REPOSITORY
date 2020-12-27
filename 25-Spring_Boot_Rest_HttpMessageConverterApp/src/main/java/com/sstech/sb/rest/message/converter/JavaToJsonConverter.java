/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.message.converter;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sstech.sb.rest.model.Student;

/**
 * @author TRINATH, Sep 14, 2020
 *
 * @Description :
 */
public class JavaToJsonConverter {

	/**
	 * @param args
	 * @throws JsonProcessingException 
	 */
	public void convertJavaObjectToJson() throws Exception {
		
		Student student=new Student();
		student.setStdId(1001);student.setStdName("Charles");
		student.setStdAddrs("UK");
		student.setStdResult("PASS");
		
		Student student2=new Student();
		student2.setStdId(1002);student2.setStdName("Peter");
		student2.setStdAddrs("USA");
		student2.setStdResult("PASS");
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student);
		studentList.add(student2);
		
		ObjectMapper objectMapper=new ObjectMapper();
		
		/*String jsonString=objectMapper.writeValueAsString(student);
		System.out.println(jsonString); String
		jsonString1=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(
		student); System.out.println(jsonString1);*/
		 
		
		  String studentJson=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(
		  studentList); System.out.println(studentJson);
		 
	}

}
