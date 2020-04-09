package com.banyechan.elasticsearch.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@ToString
@Document(indexName="poetry",type = "libai")
public class Poetry {

    private String id;
    private String title;
    private String author;
    private String content;

}
