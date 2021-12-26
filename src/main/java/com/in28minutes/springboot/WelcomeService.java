package com.in28minutes.springboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService{
    public String retrieveWelcome() {
        return "Good Morning";
    }
}