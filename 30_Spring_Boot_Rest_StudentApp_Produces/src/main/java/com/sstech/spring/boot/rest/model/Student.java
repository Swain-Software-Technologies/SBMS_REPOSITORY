/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.spring.boot.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author TRINATH, Dec 26, 2020
 *
 * @Description :
 */
@JsonInclude(value = Include.NON_NULL)
@XmlRootElement(name = "Student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

	@JsonProperty("STD-ID")
	@XmlElement(name = "STDID")
	private Integer stdId;
	@JsonProperty("STD-NAME")
	@XmlElement(name = "STDNAME")
	private String stdName;
	@JsonProperty("ADDRESS")
	@XmlElement(name = "ADDRESS")
	private String stdAddrs;
	@JsonProperty("RESULT")
	@XmlElement(name = "RESULT")
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
