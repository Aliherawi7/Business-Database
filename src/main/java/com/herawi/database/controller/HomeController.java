package com.herawi.database.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class HomeController {

    @GetMapping
    String homePage(){
        return "index";
    }

    @GetMapping("/about")
    String getAbout(){
        return "about";
    }
}
