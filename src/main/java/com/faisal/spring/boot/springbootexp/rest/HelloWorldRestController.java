package com.faisal.spring.boot.springbootexp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.faisal.spring.boot.springbootexp.configuration.HelloWorldConfiguration;

@RestController
@RequestMapping("/rest")
@EnableConfigurationProperties(HelloWorldConfiguration.class)
public class HelloWorldRestController {

	@Autowired
	private HelloWorldConfiguration configuration;

	@RequestMapping(method = RequestMethod.GET)
	private String helloWorld() {
		return "Hello World!";

	}

	@RequestMapping("/hello")
	private String hello() {
		return configuration.getGreeting();
	}

}
