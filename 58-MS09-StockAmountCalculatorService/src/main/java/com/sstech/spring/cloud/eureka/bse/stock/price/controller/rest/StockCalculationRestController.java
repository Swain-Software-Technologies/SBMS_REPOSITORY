/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.bse.stock.price.controller.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sstech.spring.cloud.eureka.bse.stock.price.client.StockPriceClient;


/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
@RestController
@RequestMapping("/bse/stock/calc")
public class StockCalculationRestController {
	
	@Autowired
	private StockPriceClient stockPriceClient;
	
	Double totalPrice=null;
	
	@GetMapping("/calculate/{companyName}/{quantity}")
	public ResponseEntity<?> calcuLateStockAmount(@PathVariable("companyName") String companyName,
													   @PathVariable("quantity")Integer quantity){
		ResponseEntity<?> resEntity = null;
				
				try {
					resEntity = stockPriceClient.getStockPrice(companyName);
					int statuscode = resEntity.getStatusCode().value();
					if(statuscode==200) {
						Double stockPrice = (Double) resEntity.getBody();
						totalPrice=quantity*stockPrice;
						String response="Total Stock Price is :: "+totalPrice;
						return new ResponseEntity<String>(response,HttpStatus.OK);
					}
				} catch (Exception e) {
					return new ResponseEntity<String>("Company Name Not Found",HttpStatus.BAD_REQUEST);
				}
		return resEntity;
	}
}
