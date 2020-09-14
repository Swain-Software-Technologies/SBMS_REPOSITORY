/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TRINATH, Sep 14, 2020
 *
 * @Description :
 */
@RestController
@RequestMapping(value = "/ssi", method = RequestMethod.GET)
public class CourseRestController {

	@RequestMapping(value = "/course/{cname}", method = RequestMethod.GET)
	public String getCourseDuration(@PathVariable("cname") String courseName) {
		if("JRTP".equals(courseName))
			return "Duration id 3 Months";
		else if("SPRING BOOT".equals(courseName))
			return "Duration is 6 Months";
		return "Go through our websites for more course details";
	}
	@RequestMapping(value = "/course/{cname}/{tname}")
	public String getCourseDetails(@PathVariable("cname") String courseName,@PathVariable("tname") String trainerName) {
		if("JRTP".equals(courseName)&&"Ashok".equals(trainerName))
			return "Good Trainer";
		else if("SPRING".equals(courseName)&&"Nataraz".equals(trainerName))
			return "Best Trainer";
		else
			return "Contact Working Employee";
	}
	@RequestMapping(value = "/course/{cname}/fasttrack/{tname}")
	public String getDetails(@PathVariable("cname") String courseName,@PathVariable("tname") String trainerName) {
		return "Registration is under Process";
	}
}
