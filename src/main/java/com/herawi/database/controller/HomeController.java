package com.herawi.database.controller;


import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String getHome(){
        return "index.html";
    }
}
