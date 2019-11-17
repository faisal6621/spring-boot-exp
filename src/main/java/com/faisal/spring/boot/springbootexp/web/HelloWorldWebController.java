package com.faisal.spring.boot.springbootexp.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class HelloWorldWebController {

	@GetMapping("/hellojsp")
	public String helloWorld(Map<String, Object> model) {
		model.put("msg", "Hello World from JSP!");
		return "helloWorld";
	}

	@GetMapping("/greetingjsp")
	public String greeting(Map<String, Object> model) {
		model.put("msg", "Greetings from JSP!");
		return "greeting";
	}
}
