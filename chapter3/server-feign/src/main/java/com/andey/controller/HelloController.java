package com.andey.controller;

import com.andey.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangbin on 2018/10/19.
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    //编译器报错可直接无视掉，因为这个bean是程序启动时注入的，编辑器感知不到。


    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return helloService.sayHiFromClientOne( name );
    }

}
