package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam; 

@Controller
public class MainController {
	
    @Value("${spring.application.name}")
    String appName;
 
    @GetMapping("/home")
    public String home(@RequestParam(name="name", required=false, defaultValue="PassaggioParametroGet") String name, Model model) {

        model.addAttribute("appName", appName);
        model.addAttribute("name",name);
        
        System.out.println("Main Controller - go to greeting: " + name);
        return "greeting";
    }
  
}