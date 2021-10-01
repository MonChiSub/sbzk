package com.softwareinstitute.filmLibrary.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

    @RequestMapping(path="/testGreeting", method=RequestMethod.POST)
    public String getGreeting() {
        return "Hi, this is a test";
    }

}
