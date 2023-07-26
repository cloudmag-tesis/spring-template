package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    public DemoController() {
    }

    @GetMapping("/hello-world")
    public String hello() {
        return "Hello World!";
    }
}
