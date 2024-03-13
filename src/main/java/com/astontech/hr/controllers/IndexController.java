package com.astontech.hr.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index() {       //sets when you go localhost:8080 it shows you the index page
        return "index";
    }

    @RequestMapping(value="/login")
    public String login() { return "login";}

}
