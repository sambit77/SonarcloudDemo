package com.example.SonarcloudDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/message")
    public String getMessage()
    {
        return "Hello world";

    }
}
