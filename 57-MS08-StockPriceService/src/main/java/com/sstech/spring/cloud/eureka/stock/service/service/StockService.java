/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.stock.service.service;

/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
public interface StockService {

	public Double getStockPrice(String companyName);
}
