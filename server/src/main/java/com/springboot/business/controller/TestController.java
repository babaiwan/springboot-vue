package com.springboot.business.controller;


import com.springboot.business.impl.HelloWorldImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin            //支持跨域
@RestController         //json格式的response
@RequestMapping("test")
public class TestController {

    @Autowired
    private HelloWorldImpl helloWorld;

    @GetMapping("helloWorld")
    public String helloWorld(String message) throws Exception {
        System.out.println(message);
        String s = helloWorld.printHelloworld();
        return s;
    }

}
