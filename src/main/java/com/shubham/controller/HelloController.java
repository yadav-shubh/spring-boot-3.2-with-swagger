package com.shubham.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public Map<String, String> getMethodName(@PathVariable String name) {
        return Map.of("message", "Welcome " + name);
    }

}
