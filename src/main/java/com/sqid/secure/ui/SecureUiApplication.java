package com.sqid.secure.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureUiApplication {

	
	/*
	 * enable implementation 'org.springframework.cloud:spring-cloud-starter-oauth2'
			  implementation 'org.springframework.cloud:spring-cloud-starter-security'
	   will automatically generated password for you as bleow from log
	 * Using generated security password: 5e73992a-efce-4200-a751-5aefad23563f
	 */
	public static void main(String[] args) {
		SpringApplication.run(SecureUiApplication.class, args);
	}

}
