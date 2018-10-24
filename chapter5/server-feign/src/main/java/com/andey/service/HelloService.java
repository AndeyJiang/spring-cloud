package com.andey.service;

import com.andey.service.impl.HelloServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jiangbin on 2018/10/19.
 */
@FeignClient(value = "eureka-client",fallback = HelloServiceHystric.class)
//@FeignClient(name="eureka-client",url="localhost:8761") 两种写法都可以的
public interface HelloService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
