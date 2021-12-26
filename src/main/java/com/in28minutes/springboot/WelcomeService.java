package com.in28minutes.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService{

    @Value("${welcome.message}")
    private String welcomeMessage;

    public String retrieveWelcome() {
        return welcomeMessage;
    }
}