/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.feign.client.service.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TRINATH, Nov 13, 2020
 *
 * @Description :
 */
@RestController
@RequestMapping(value="/branch",method=RequestMethod.GET)
public class BranchRestController {

	@GetMapping("/info")
	public String getBranchInfo() {
		return "FROM BRANCH";
	}
}
