/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.bse.stock.price.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
/* @FeignClient(url = "http://localhost:8768",name = "STOCK-PRICE") */
@FeignClient(name = "STOCK-PRICE")
public interface StockPriceClient {

	@GetMapping("bse/stock/price/stockprice/{companyName}")
	public ResponseEntity<Double> getStockPrice(@PathVariable("companyName") String companyName);
}
