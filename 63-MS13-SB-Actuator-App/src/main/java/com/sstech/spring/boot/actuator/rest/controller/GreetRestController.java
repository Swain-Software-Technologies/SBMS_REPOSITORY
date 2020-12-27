/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.boot.actuator.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TRINATH, Nov 23, 2020
 *
 * @Description :
 */
@RestController
public class GreetRestController {

	
	@GetMapping("/greet")
	public String greetMsg() {
		String msg="Good Evening !!!";
		return msg;
	}
}
