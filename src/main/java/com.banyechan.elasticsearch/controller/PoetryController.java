package com.banyechan.elasticsearch.controller;


import com.banyechan.elasticsearch.entity.Poetry;
import com.banyechan.elasticsearch.service.PoetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/poetry")
public class PoetryController {

    @Autowired
    private PoetryService poetryService;

    @GetMapping("/list")
    public List<Poetry> listPoetry(){
        List<Poetry> result = new ArrayList<>();
        result = poetryService.listAllPoetry();

        return result;
    }

    @PostMapping("/add")
    public boolean addPoetry(@RequestBody Poetry poetry){
        poetryService.savePoetry(poetry);
        return true;
    }

    @GetMapping("/get")
    public Poetry getPoetryById(String id){
        Poetry result = poetryService.getById(id);
        return result;
    }

    @GetMapping("/del")
    public boolean delPoetryById(String id){
        poetryService.deleteById(id);
        return true;
    }



}
