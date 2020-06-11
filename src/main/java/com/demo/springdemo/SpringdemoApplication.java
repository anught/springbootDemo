package com.demo.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(SpringdemoApplication.class);
		logger.debug("我们");
		logger.info("测试测999999");

		SpringApplication.run(SpringdemoApplication.class, args);
	}
}
