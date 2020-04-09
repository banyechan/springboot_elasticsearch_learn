package com.banyechan.elasticsearch.repository;

import com.banyechan.elasticsearch.entity.Poetry;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface PoetryRepository extends ElasticsearchRepository<Poetry, String> {

}
