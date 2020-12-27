/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.client.service.controller.rest;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TRINATH, Nov 12, 2020
 *
 * @Description :
 */
@RestController
@RequestMapping(value="/wish", method = RequestMethod.GET)
public class WishServiceRestController {
	
	@GetMapping("/Hi/{name}")
	public String generateWishMsg(@PathVariable("name") String name) {
		Calendar calendar=null;
//		Get System Date And Time
		calendar=Calendar.getInstance();
//		Get Current Hour Of the Day
		int hour=calendar.get(Calendar.HOUR_OF_DAY);
		String msg=null;
		if(hour<12) {
			msg="Good Morning" ;
			return "Hi "+name+","+msg+" How are you Buddy ?" ;
		} else if(hour<16) {
			msg="Good Afternoon" ;
			return "Hi "+name+","+msg+" How are you Buddy ?" ;
		}else if(hour<20) {
			msg="Good Evening" ;
			return "Hi "+name+","+msg+" How are you Buddy ??" ;
		}else {
			msg="Good Night" ;
			return "Hi "+name+","+msg+" How are you Buddy ??" ;
		} 
		
	}
	

}
