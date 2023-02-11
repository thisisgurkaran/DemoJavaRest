package com.karan.rest.service.demojavarest;

public class HelloWorldBean {
    private String message;
    private String testMessage;

    public HelloWorldBean(String message) {
        this.message = message;
        this.testMessage = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean [message=" + message + "]";
    }
}
