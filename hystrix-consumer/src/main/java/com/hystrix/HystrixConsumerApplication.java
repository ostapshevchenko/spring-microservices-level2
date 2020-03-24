package com.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients
public class HystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixConsumerApplication.class, args);
    }

}
