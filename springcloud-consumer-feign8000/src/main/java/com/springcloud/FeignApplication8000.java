package com.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author pengwei
 * @date 2020/12/19
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignApplication8000 {
}
