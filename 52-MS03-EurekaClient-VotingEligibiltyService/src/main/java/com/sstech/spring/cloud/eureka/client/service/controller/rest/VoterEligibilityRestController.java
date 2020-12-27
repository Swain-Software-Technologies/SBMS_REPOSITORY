/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.client.service.controller.rest;

import java.util.Calendar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TRINATH, Nov 13, 2020
 *
 * @Description :
 */
@RestController
@RequestMapping(value = "/orissa/eci", method = RequestMethod.GET)
public class VoterEligibilityRestController {

	@RequestMapping("/{name}/{age}")
	public String calculateEligibility(@PathVariable("name") String name,
									   @PathVariable("age") Integer age) {
		
		Calendar calendar=null;
//		Get System Date And Time
		calendar=Calendar.getInstance();
//		Get Current Hour Of the Day
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		String msg=null;
		if(hour<12 && age > 18) {
			msg="Good Morning" ;
			return "Hi "+name+","+msg+" your age is "+ age +". You are eligible For giving vote";
		} else if(hour<16 && age > 18) {
			msg="Good Afternoon" ;
			return "Hi "+name+","+msg+" your age is "+ age +". you are eligible For giving vote";
		}else if(hour<20 && age > 18) {
			msg="Good Evening" ;
			return "Hi "+name+","+msg+" your age is "+ age +". You are eligible For giving vote";
		}else if(hour>20 && age > 18){
			msg="Good Night" ;
			return "Hi "+name+","+msg+" your age is "+ age +". You are eligible For giving vote";
		}else {
			return "Hi "+name+", your age is "+ age +". You are not eligible For giving vote";
		}
		
	}
	
}
