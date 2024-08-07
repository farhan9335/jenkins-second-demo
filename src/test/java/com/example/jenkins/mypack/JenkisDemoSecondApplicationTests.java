package com.example.jenkins.mypack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkisDemoSecondApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkisDemoSecondApplicationTests.class);

	@Test
	public contextLoads() {
		logger.info("<================ starting to contextLoads() method=============>");
		assertEquals(true, true);
		logger.info("<================ Successfully executed contextLoads() method=============>");
	}

}
