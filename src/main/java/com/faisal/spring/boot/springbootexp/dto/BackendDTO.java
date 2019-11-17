package com.faisal.spring.boot.springbootexp.dto;

import java.io.Serializable;

public class BackendDTO implements Serializable {

    private static final long serialVersionUID = -1483040717400174057L;

    private String greeting;
    private long time;
    private String ip;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "BackendDTO [greeting=" + greeting + ", time=" + time + ", ip=" + ip + "]";
    }

}
