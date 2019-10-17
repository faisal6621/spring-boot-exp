package com.faisal.spring.boot.springbootexp.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("helloworld")
public class HelloWorldConfiguration {

    /**
     * configurable greeting
     */
    private String greeting = "Bonjour!";

    private String message = "Welcome!";

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
