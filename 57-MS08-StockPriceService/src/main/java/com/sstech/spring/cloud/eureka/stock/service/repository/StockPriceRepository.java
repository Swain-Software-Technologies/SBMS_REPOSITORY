/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.stock.service.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sstech.spring.cloud.eureka.stock.service.entity.StockPriceEntity;

/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
public interface StockPriceRepository extends  JpaRepository<StockPriceEntity,Serializable>{
	
	public StockPriceEntity findByCompanyName(String companyName);

}
