package com.poc.demoazure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/example")
    public String getExample() {
        return "This is an example GET request hello";
    }
}
