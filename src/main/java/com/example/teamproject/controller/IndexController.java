package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {
    
    @GetMapping("/")
    public String index(@RequestParam String param) {
        return "Hello World";
    }

}
