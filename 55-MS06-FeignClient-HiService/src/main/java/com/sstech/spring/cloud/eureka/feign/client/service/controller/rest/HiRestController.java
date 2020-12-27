/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.feign.client.service.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sstech.spring.cloud.eureka.feign.client.service.consumer.HelloRestConsumer;
/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
@RestController
public class HiRestController {
	@Autowired
	private HelloRestConsumer restConsumer;
	
	@GetMapping(value = "/hi/{name}")
	public String sayHi(@PathVariable("name") String name) {
		String hiMsg="Hi";
		String helloMsg=restConsumer.invokeHelloService(name);
		
		return hiMsg+"==========="+helloMsg;
	}

}
