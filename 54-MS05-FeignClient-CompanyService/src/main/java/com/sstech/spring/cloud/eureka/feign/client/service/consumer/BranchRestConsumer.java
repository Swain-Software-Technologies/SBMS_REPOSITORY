/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.feign.client.service.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author TRINATH, Nov 13, 2020
 *
 * @Description :
 */
@FeignClient("BRANCH-SERVICE")
public interface BranchRestConsumer {

	@GetMapping("/branch/info")
	public String getBranchInfo();
}
