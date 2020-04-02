package com.banyechan.elasticsearch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {


    @RequestMapping("/index")
    public String getHome() {
        String result = "welcome to  elasticsearch home index";
        return result;
    }


}
