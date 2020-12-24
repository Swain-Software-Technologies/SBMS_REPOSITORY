/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sstech.sb.rest.model.Student;
import com.sstech.sb.rest.model.Students;

/**
 * @author TRINATH, Sep 14, 2020
 *
 * @Description :
 */
@RestController
@RequestMapping(value = "/ssi", method = RequestMethod.GET)
public class StudentRestController {

	@RequestMapping(value = "/student/{stdId}", produces = "application/json")
	public Student getStudentDetails(@PathVariable("stdId") Integer studentId) {
		Student s = new Student();

		if (studentId == 101) {
			s.setStdName("Rajesh");
			s.setStdAddrs("India");
			s.setStdResult("Pass");
		} else if (studentId == 102) {
			s.setStdName("Peter");
			s.setStdAddrs("USA");
			s.setStdResult("Pass");
		}
		return s;
	}

	@GetMapping(value = "/students")
	public /*List<Student>*/Students getStudentDetails() {
		Student s = new Student();

		List<Student> slist = new ArrayList<Student>();

		Student s1 = new Student();
		s1.setStdId(101);
		s1.setStdName("Raju");
		s1.setStdAddrs("Khurda");
		s1.setStdResult("PASS");

		Student s2 = new Student();
		s2.setStdId(102);
		s2.setStdName("Rani");
		s2.setStdAddrs("BBSR");
		s2.setStdResult("PASS");

		slist.add(s1);
		slist.add(s2);
//		return slist;

		Students students = new Students();
		students.setStudents(slist);
		return students;
		
		
	}

}
