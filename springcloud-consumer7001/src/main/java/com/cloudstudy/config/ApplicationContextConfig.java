package com.cloudstudy.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author pengwei
 * @date 2020/11/30
 */

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  //负载均衡  -集群
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
