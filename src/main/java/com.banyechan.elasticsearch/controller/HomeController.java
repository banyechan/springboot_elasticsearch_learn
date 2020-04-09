package com.banyechan.elasticsearch.controller;

import com.banyechan.elasticsearch.service.RemoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private RemoteService remoteService;


    @RequestMapping("/index")
    public String getHome() {
        String result = "welcome to  elasticsearch home index";
        return result;
    }

    @RequestMapping("/debug")
    public List<String> remoteDebug() {
        log.info("-----  请求进入 ------");
        List<String> result = new ArrayList<>();
        result.add("《春晓》");
        result.add("春眠不觉晓");
        result.add("处处闻啼鸟");

        log.info("-----  调用service层 ------");
        List<String> tem = remoteService.listByString();
        result.addAll(tem);
        log.info("-----  请求结束，返回结果 ------");
        return result;
    }





}
