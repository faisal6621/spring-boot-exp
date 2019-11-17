package com.faisal.spring.boot.springbootexp.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("greeting")
public class GreetingRestConfiguration {

    private String saying;
    private String backendServiceHost;
    private int backendServicePort;

    public String getSaying() {
        return saying;
    }

    public void setSaying(String saying) {
        this.saying = saying;
    }

    public String getBackendServiceHost() {
        return backendServiceHost;
    }

    public void setBackendServiceHost(String backendServiceHost) {
        this.backendServiceHost = backendServiceHost;
    }

    public int getBackendServicePort() {
        return backendServicePort;
    }

    public void setBackendServicePort(int backendServicePort) {
        this.backendServicePort = backendServicePort;
    }

    @Override
    public String toString() {
        return "GreetingRestConfiguration [saying=" + saying + ", backendServiceHost=" + backendServiceHost
                + ", backendServicePort=" + backendServicePort + "]";
    }

}
