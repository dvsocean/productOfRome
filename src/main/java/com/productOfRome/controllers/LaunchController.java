package com.productOfRome.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LaunchController {

    @RequestMapping("/")
    public String getWelcome(){
        return "welcome";
    }

    @RequestMapping("/selection")
    public String getInputPage(){
        return "selection";
    }
}
