package com.faisal.spring.boot.springbootexp.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.faisal.spring.boot.springbootexp.configuration.GreetingRestConfiguration;
import com.faisal.spring.boot.springbootexp.dto.BackendDTO;

@RestController
@RequestMapping("/api")
@EnableConfigurationProperties(GreetingRestConfiguration.class)
public class GreetingRestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingRestController.class);
    @Autowired
    private GreetingRestConfiguration greeting;

    private RestTemplate template = new RestTemplate();

    @GetMapping(value = "/greeting", produces = "text/plain")
    public String greeting() {
        String backendServiceURL = String.format("http://%s:%d/api/backend?greeting={greeting}",
                greeting.getBackendServiceHost(), greeting.getBackendServicePort());
        LOGGER.info("sending request to:: {}", backendServiceURL);
        BackendDTO response = template.getForObject(backendServiceURL, BackendDTO.class, greeting.getSaying());
        return response.getGreeting() + " @ " + response.getIp();
    }
}
