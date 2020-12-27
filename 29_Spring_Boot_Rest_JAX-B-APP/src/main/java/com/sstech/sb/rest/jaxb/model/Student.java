/*
 * @CopyRight to SSLab Pvt. Ltd. 2020. You should not disclose the information outside .
 * Otherwise Terms & Condition will be apply .
 */
package com.sstech.sb.rest.jaxb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

/**
 * @author TRINATH, Dec 25, 2020
 *
 * @Description : @XmlElement is used for giving element name and namespaces details. 
 * But we need to apply follwing annotation in class level i.e. @XmlAccessorType(XmlAccessType.FIELD)
 */
@Data
@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	
	@XmlAttribute(name = "standard") //type of student tag
	private String stdStandard;

	@XmlElement(name = "STD-ID")
	private Integer stdId;
	
	@XmlElement(name = "STD-NAME")
	private String stdName;
	
	@XmlElement(name = "STD-ADDRS")
	private String  stdAddress;
	
	@XmlElement(name = "STD-AVG")
	private Float stdAvg;
	
	@XmlElement(name = "STD-MARK")
	private Float stdMarks;
	
}
