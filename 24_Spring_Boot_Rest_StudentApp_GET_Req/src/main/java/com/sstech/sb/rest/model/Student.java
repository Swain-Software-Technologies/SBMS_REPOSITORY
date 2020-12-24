/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author TRINATH, Sep 14, 2020
 *
 * @Description :
 */
@JsonInclude(value = Include.NON_NULL)
public class Student {

	private Integer stdId;
	private String stdName;
	private String stdAddrs;
	private String stdResult;
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdAddrs() {
		return stdAddrs;
	}
	public void setStdAddrs(String stdAddrs) {
		this.stdAddrs = stdAddrs;
	}
	public String getStdResult() {
		return stdResult;
	}
	public void setStdResult(String stdResult) {
		this.stdResult = stdResult;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAddrs=" + stdAddrs + ", stdResult="
				+ stdResult + "]";
	}
	
}
