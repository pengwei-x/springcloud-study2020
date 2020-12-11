package com.sprincloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pengwei
 * @date 2020/12/8
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigCenterApplication7777 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApplication7777.class,args);
    }
}
