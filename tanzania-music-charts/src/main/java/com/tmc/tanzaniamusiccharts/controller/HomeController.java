package com.tmc.tanzaniamusiccharts.controller;

import org.springframework.stereotype.Controller;

@Controller 
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "index";
    }
}
