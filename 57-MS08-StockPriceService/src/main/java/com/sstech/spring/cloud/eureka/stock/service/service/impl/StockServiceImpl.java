/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.stock.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sstech.spring.cloud.eureka.stock.service.entity.StockPriceEntity;
import com.sstech.spring.cloud.eureka.stock.service.exception.CompanyNotFoundException;
import com.sstech.spring.cloud.eureka.stock.service.repository.StockPriceRepository;
import com.sstech.spring.cloud.eureka.stock.service.service.StockService;

/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
@Service
public class StockServiceImpl implements StockService{
	
	@Autowired
	private StockPriceRepository stockPriceRepository;

	@Override
	public Double getStockPrice(String companyName) {
		StockPriceEntity stockPrice = stockPriceRepository.findByCompanyName(companyName);
		if(stockPrice==null) {
			throw new  CompanyNotFoundException("Company Not Found");
		}
		return stockPrice.getStockPrice();
	}

}
