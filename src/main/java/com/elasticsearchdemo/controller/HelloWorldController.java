package com.elasticsearchdemo.controller;

import com.elasticsearchdemo.entity.HelloWorld;
import com.elasticsearchdemo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;

    @PostMapping("/{text}")
    public HelloWorld saveHelloWorld(@PathVariable String text) {
        return helloWorldService.saveHelloWorld(text);
    }

    @GetMapping("/{searchText}")
    public List<HelloWorld> getAllHelloWorld(@PathVariable String searchText) {
        return helloWorldService.getAllHelloWorld(searchText);
    }
}