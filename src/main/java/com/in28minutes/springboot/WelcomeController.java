package com.in28minutes.springboot;

import com.in28minutes.springboot.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    private WelcomeService service;
    @RequestMapping("/welcome")
    public String welcome() {
        return service.retrieveWelcome();
    }
}

