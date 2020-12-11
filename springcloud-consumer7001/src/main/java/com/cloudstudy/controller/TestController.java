package com.cloudstudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author pengwei
 * @date 2020/11/30
 */
//@Controller
@RestController
@Slf4j
public class TestController {

    //  eureka服务器注册的provider 实例名
    public static final String PAYMENT_URL = "http://CLOUD-PROVIDER-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/provider/get")
    public String create(){
        System.out.println("-====");
        return restTemplate.getForObject(PAYMENT_URL+"/provider/get",String.class);
    }
}
