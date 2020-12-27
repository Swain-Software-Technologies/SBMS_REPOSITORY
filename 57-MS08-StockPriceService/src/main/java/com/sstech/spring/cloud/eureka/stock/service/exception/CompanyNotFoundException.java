/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.cloud.eureka.stock.service.exception;

/**
 * @author TRINATH, Nov 14, 2020
 *
 * @Description :
 */
public class CompanyNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CompanyNotFoundException(String msg) {
		super(msg);
	}

}
