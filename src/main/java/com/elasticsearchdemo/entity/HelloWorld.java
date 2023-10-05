package com.elasticsearchdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "hello_world")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorld {

    @Id
    private String id;
    private String helloText;
}