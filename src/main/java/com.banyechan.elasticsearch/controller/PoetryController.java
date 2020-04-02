package com.banyechan.elasticsearch.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poetry")
public class PoetryController {


    @PostMapping("/add")
    public boolean addPoetry(){

        return true;
    }



}
