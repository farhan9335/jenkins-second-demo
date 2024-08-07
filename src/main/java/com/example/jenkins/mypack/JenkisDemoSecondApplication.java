package com.example.jenkins.mypack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JenkisDemoSecondApplication {
	
	public static Logger logger = LoggerFactory.getLogger(JenkisDemoSecondApplication.class);

	public static void main(String[] args) {
		logger.info("<=================Starting to execute main method======================>");
		SpringApplication.run(JenkisDemoSecondApplication.class, args);
		logger.info("<=================main method executed Successfully======================>");
	}
	
	@PostConstruct
	public void initialization() {
		logger.info("<===================Started to execute initialization()=========================>");
	}

}
