/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.bse.stock.ui.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
@Service
public class StockUiService {

	public String getTotalStockPrice(String companyName,Integer quantity) {
		
		String REST_ENDPOINI_URL="http://localhost:8771/api/bse/stock/calc/bse/stock/calc/calculate/{companyName}/{quantity}";
		String response=null;
		WebClient webClient = WebClient.create();
	    try {
			response = webClient.get()
								         .uri(REST_ENDPOINI_URL,companyName,quantity)
										 .retrieve()
										 .bodyToMono(String.class)
										 .block();
		} catch (Exception e) {
			e.printStackTrace();
			response="Company Name Not Found";
		}
		return response;
		
	}
}
