package com.banyechan.elasticsearch.serviceImpl;

import com.banyechan.elasticsearch.service.RemoteService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RemoteServiceImpl implements RemoteService {


    @Override
    public List<String> listByString() {
        List<String> result = new ArrayList<>();
        result.add("夜来风雨声,");
        result.add("花落知多少。");
        return result;
    }
}
