package com.elasticsearchdemo.repository;

import com.elasticsearchdemo.entity.HelloWorld;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelloWorldRepository extends ElasticsearchRepository<HelloWorld, String> {
    List<HelloWorld> findAllByHelloText(String helloText);
}