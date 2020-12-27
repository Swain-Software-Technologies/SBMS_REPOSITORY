/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.feign.client.service.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
@RestController
public class HelloRestController {
	
	@GetMapping(value = "/hello/{name}")
	public String invokeHelloService(@PathVariable("name") String name) {
		return "Hello "+name;
		
	}
}
