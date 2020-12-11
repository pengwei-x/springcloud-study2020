package com.cloudstudy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengwei
 * @date 2020/11/30
 */
@RestController
@Slf4j
public class ProviderController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/provider/get")
    public String get() {
        System.out.println(serverPort + ":");
        return serverPort + "----端口号" ;
    }

}
