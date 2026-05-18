package com.example.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {
	
    @GetMapping("/cars")
    public String CarPage() {
		return "Car";
    }
    
}
