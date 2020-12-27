/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author TRINATH, Sep 14, 2020
 *
 * @Description :
 */
//@JsonIgnoreProperties(ignoreUnknown = true)
@JsonIgnoreProperties({"stdResult","stdAddrs"})
@JsonInclude(value = Include.NON_NULL)
public class Student {

	@JsonProperty("student-id")
	private Integer stdId;
	@JsonProperty("student-name")
	private String stdName;
	@JsonProperty("student-addrs")
	private String stdAddrs;
//	@JsonIgnore
	@JsonProperty("student-result")
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
