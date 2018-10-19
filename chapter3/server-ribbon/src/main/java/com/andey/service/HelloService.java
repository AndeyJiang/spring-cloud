package com.andey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jiangbin on 2018/10/19.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
        /**
         * 可以将一个项目启动开多个端口，测试负载均衡，如erueka-client 启动开两个端口8762和8763，这样刷新请求可
         * 看出ribbion作为客户端负载均衡的作用
         */
    }

}
