package com.hystrix.client;

import org.springframework.stereotype.Component;

@Component
public class GreetingClientFallback implements GreetingClient {

    @Override
    public String greeting2(String username) {
        return "shit";
    }

    @Override
    public String greetings() {
        return "greetings";
    }
}

