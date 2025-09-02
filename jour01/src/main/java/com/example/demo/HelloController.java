package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {

    @Value("${greeting.message}")
    private String greetingMessage;

    @GetMapping("/")
    public String hello() {
        return greetingMessage;
    }
}