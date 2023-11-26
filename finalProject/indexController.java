package com.example.proyectois.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class indexController {
    @RequestMapping("/home")
    public String index(){
        return "index";
    }
}
