package com.banyechan.elasticsearch.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Poetry {

    private String id;
    private String title;
    private String author;
    private String content;

}
