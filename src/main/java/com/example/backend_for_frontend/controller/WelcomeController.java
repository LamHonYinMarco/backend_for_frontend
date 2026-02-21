package com.example.backend_for_frontend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring";
    }
}
