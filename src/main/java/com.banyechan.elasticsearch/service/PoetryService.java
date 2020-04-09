package com.banyechan.elasticsearch.service;

import com.banyechan.elasticsearch.entity.Poetry;

import java.util.List;

public interface PoetryService {

    void savePoetry(Poetry record);

    List<Poetry> listAllPoetry();

    Poetry getById(String id);

    void deleteById(String id);




}
