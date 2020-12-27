/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.stock.service.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sstech.spring.cloud.eureka.stock.service.service.StockService;

/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
@RestController
@RequestMapping(value = "/bse/stock/price")
public class StockPriceRestController {
	
	@Autowired
	private StockService stockService;
	
	@GetMapping(value = "/stockprice/{companyName}")
	public ResponseEntity<Double> getStockPrice(@PathVariable("companyName") String companyName){
		Double stockPrice = stockService.getStockPrice(companyName);
		return new ResponseEntity<Double>(stockPrice, HttpStatus.OK);
		
	}

}
