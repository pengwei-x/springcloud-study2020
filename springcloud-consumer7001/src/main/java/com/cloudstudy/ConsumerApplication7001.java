package com.cloudstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author pengwei
 * @date 2020/11/30
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication7001 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication7001.class,args);
    }
}
