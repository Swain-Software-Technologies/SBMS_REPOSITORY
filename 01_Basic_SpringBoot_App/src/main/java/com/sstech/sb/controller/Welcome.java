package com.sstech.sb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome To Spring Boot";
	}
}
