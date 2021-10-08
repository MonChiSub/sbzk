package com.softwareinstitute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

    @GetMapping("/testGreeting")
    public String getGreeting() {
        return "Hi, this is a test";
    }

}
