package com.andey.service.impl;

import com.andey.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jiangbin on 2018/10/23.
 */
@Component
public class HelloServiceHystric implements HelloService {
    @Override
    public String sayHiFromClientOne(@RequestParam(value = "name") String name) {
        return "sorry" +name;
    }
}
