/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sstech.sb.rest.model.Student;

/**
 * @author TRINATH, Sep 14, 2020
 *
 * @Description :
 */
@RestController
@RequestMapping(value = "/ssi",method = RequestMethod.GET)
public class StudentRestController {

	@RequestMapping(value = "/student/{stdId}",produces = "application/json")
	public Student getStudentDetails(@PathVariable("stdId") Integer studentId) {
		Student s=new Student();
		
		if(studentId == 101) {
			s.setStdName("Rajesh");s.setStdAddrs("India");s.setStdResult("Pass");
		}else if(studentId == 102) {
			s.setStdName("Peter");s.setStdAddrs("USA");s.setStdResult("Pass");
		}
		return s;
		
	}
}
