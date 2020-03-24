package com.hystrix.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting/{username}")
    public String greeting(@PathVariable("username") String username) throws InterruptedException {
        System.out.println("producer got TOKEN " + username);
        System.out.println("going to sleep");
        Thread.sleep(3000);
        return String.format("Hello, i got your username %s!\n", username);
    }
}
