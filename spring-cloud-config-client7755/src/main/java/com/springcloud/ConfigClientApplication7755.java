package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pengwei
 * @date 2020/12/9
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication7755 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication7755.class, args);
    }
}
