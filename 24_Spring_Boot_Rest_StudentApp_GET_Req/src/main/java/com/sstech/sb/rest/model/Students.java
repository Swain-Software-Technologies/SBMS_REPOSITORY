/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.model;

import java.util.List;

/**
 * @author TRINATH, Dec 23, 2020
 *
 * @Description :
 */
public class Students {

	List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Students [students=" + students + "]";
	}
	
}
