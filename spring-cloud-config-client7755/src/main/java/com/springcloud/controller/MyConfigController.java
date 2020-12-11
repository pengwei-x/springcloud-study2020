package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengwei
 * @date 2020/12/9
 */
@RestController
@RefreshScope //实时更新  命令 ：curl -X POST http://localhost:7755/actuator/refresh
public class MyConfigController {
    /**
    git SpringCloud-dev.yml 内容
    */
    @Value("${config}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo()
    {
        return configInfo;
    }
}
