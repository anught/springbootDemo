package com.demo.springdemo.Contrller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldContrller {
	Logger logger = LoggerFactory.getLogger(HelloWorldContrller.class);

	@Value("${server.port}")
	private String port;

	@RequestMapping("/h")
	public String hello() {

		logger.debug("我们是一个测试的");
		logger.info("测试测试9999999999999999999999");
		return "hello world 0" + port;
	}

	@RequestMapping("/c")
	public String hello1() {
		return "hello world 1";
	}
}
