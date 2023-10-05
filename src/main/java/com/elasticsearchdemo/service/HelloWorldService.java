package com.elasticsearchdemo.service;

import com.elasticsearchdemo.entity.HelloWorld;

import java.util.List;

public interface HelloWorldService {
    HelloWorld saveHelloWorld(String text);

    List<HelloWorld> getAllHelloWorld(String searchText);
}