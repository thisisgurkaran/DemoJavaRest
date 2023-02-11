package com.karan.rest.service.demojavarest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        // here you can do stuff easy bro
        return "this is test";
    }

    @RequestMapping("/test1")
    @ResponseBody
    public HelloWorldBean test1() {
        System.out.println("Boroo");
        return new HelloWorldBean("hello world");
        // return "This is Test1";
    }
}
