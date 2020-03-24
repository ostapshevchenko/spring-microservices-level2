package com.hystrix.controller;

import com.hystrix.client.GreetingClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingClient greetingClient;

    public GreetingController(GreetingClient greetingClient) {
        this.greetingClient = greetingClient;
    }

//    @GetMapping("/get-greeting/{username}")
//    ResponseEntity<String> getGreeting(@PathVariable("username") String username) {
//        return greetingClient.greeting(username, "dwadkwanmdkwja");
//    }

    @GetMapping("/get-greeting2/{username}")
    String getGreeting2(@PathVariable("username") String username) {
        String greeting = greetingClient.greeting2(username);
        return greeting;
    }

    @GetMapping("/get-greetings")
    String getGreeting2() {
        String greeting = greetingClient.greetings();
        return greeting;
    }
}
