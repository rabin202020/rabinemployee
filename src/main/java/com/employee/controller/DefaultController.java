package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DefaultController {

    @PostMapping("/home")
    public String home() {
        return "/home";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }
    
    /*@PostMapping("/findbyuserName")
    public String findbyuserName() {
        return "/home";
    }*/

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

}
