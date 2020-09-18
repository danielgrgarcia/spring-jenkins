package com.sample.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init () {
		logger.info("Empieza la aplicación...");
	}
	
	public static void main(String[] args) {
		logger.info("Aplicación ejecutada...");
		logger.info("Aplicación ejecutada segunda...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
