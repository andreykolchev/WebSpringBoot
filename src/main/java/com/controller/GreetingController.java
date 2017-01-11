package com.controller;

import com.model.Greeting;
import com.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @RequestMapping("/greeting")
    public Greeting greeting() {
        Greeting greeting = greetingService.getById(1L);
        return greeting;
    }
}
