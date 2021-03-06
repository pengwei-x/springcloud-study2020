package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author pengwei
 * @date 2020/11/29
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication6001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication6001.class, args);
    }
}
