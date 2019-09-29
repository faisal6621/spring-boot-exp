package com.faisal.spring.boot.springbootexp.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ConfigurationProperties(prefix = "helloworld")
public class HelloWorldRestController {
	private String greeting;

	@RequestMapping("/")
	private String helloWorld() {
		return "Hello World!";

	}

	@RequestMapping("/hello")
	private String hello() {
		return this.greeting;
	}

	// setting this public so that spring can set configuration property here
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldRestController.class, args);
	}

}
