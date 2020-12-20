package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengwei
 * @date 2020/12/11
 */
@RestController
@RefreshScope
@RequestMapping("/config")
public class NacosController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/get")
    public String get() {
        return serverPort;
    }
}
