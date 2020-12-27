/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.stock.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
@Entity
@Data
@Table(name = "COMPANY_STOCK")
public class StockPriceEntity {

	@Id
	@Column(name = "STOCK_ID")
	private Integer stockId;
	@Column(name = "COMPANY_NAME")
	private String companyName;
	@Column(name = "STOCK_PRICE")
	private Double stockPrice;
	
}
