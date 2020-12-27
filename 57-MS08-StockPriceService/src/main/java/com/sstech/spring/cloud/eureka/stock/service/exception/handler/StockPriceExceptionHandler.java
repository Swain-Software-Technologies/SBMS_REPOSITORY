/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.stock.service.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sstech.spring.cloud.eureka.stock.service.exception.CompanyNotFoundException;

/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
@ControllerAdvice
public class StockPriceExceptionHandler {
	
	@ExceptionHandler(value = CompanyNotFoundException.class)
	public ResponseEntity<String> handleCompanyNotFoundException(){
		return new ResponseEntity<String>("Company Not Found",HttpStatus.BAD_REQUEST);
		
	}

}
