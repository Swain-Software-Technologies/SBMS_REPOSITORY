package com.sstech.sb.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sstech.sb.rest.message.converter.JavaToJsonConverter;
import com.sstech.sb.rest.message.converter.JsonArrayToJavaConverter;
import com.sstech.sb.rest.message.converter.JsonToJavaConverter;

//@SpringBootApplication
public class Application {

	public static void main(String[] args) throws Exception {
//		SpringApplication.run(Application.class, args);
		JavaToJsonConverter jsonConverter=new JavaToJsonConverter();
		jsonConverter.convertJavaObjectToJson();
		JsonToJavaConverter javaConverter = new JsonToJavaConverter();
		javaConverter.convertJsonToJavaObject();
		JsonArrayToJavaConverter arrayToJavaConverter=new JsonArrayToJavaConverter();
		arrayToJavaConverter.convertJsonArryToObjects();
	}

}
