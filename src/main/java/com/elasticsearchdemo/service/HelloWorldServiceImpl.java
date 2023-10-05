package com.elasticsearchdemo.service;

import com.elasticsearchdemo.entity.HelloWorld;
import com.elasticsearchdemo.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Autowired
    private HelloWorldRepository helloWorldRepository;

    public HelloWorld saveHelloWorld(String text) {
        return helloWorldRepository.save(new HelloWorld(UUID.randomUUID().toString(), text));
    }

    public List<HelloWorld> getAllHelloWorld(String searchText) {
        return helloWorldRepository.findAllByHelloText(searchText);
    }
}