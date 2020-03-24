package com.hystrix.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "rest-producer",
        url = "http://localhost:9090",
        configuration = ClientConfig.class,
        fallback = GreetingClientFallback.class
)
public interface GreetingClient {

    @GetMapping("/greeting/{username}")
    String greeting2(@PathVariable("username") String username);

    @GetMapping("/greetings")
    String greetings();

}
