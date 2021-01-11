package com.springboot.business.impl;

import com.springboot.business.service.HelloWorldService;
import org.springframework.stereotype.Service;


//对接口的实现
@Service("HelloWorld")
public class HelloWorldImpl implements HelloWorldService {

    @Override
    public String printHelloworld() {
        String s = "helloworld!!!";
        return s;
    }


}
