/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.feign.client.service.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
@FeignClient(name = "HELLO-SERVICE")
public interface HelloRestConsumer {

	@GetMapping(value = "/hello/{name}")
	public String invokeHelloService(@PathVariable("name") String name);
}
