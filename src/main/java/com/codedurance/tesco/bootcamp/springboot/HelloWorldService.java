package com.codedurance.tesco.bootcamp.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by maheshnakum on 03/01/2017.
 */

@Service
public class HelloWorldService {

    private final String helloWord;

    public String Hello (String name){
        return helloWord + name + (" from service");
    }

    @Autowired
    public HelloWorldService(@Qualifier("helloWord") String helloWord){
        this.helloWord = helloWord;
    }

}
