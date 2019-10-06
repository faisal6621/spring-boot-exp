package com.faisal.spring.boot.springbootexp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faisal.spring.boot.springbootexp.web.configuration.HelloWorldConfiguration;

@RestController
@EnableConfigurationProperties(HelloWorldConfiguration.class)
public class HelloWorldRestController {

	@Autowired
	private HelloWorldConfiguration configuration;

	@RequestMapping("/")
	private String helloWorld() {
		return "Hello World!";

	}

	@RequestMapping("/hello")
	private String hello() {
		return configuration.getGreeting();
	}

}
