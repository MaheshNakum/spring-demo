package com.codedurance.tesco.bootcamp.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maheshnakum on 03/01/2017.
 */
@RestController
@EnableAutoConfiguration
public class EndPoints {

    private final HelloWorldService helloWorldService;


    @Autowired
    public EndPoints(HelloWorldService helloWorldService){

        this.helloWorldService = helloWorldService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String helloWorld(){
        return helloWorldService.Hello(" World");
    }

    @RequestMapping(
            value = "/helloworld.json",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Message HelloworldMessage(@RequestParam(value = "name", required = false, defaultValue = "World") String name)
            {
        return new Message (helloWorldService.Hello(name));
    }


}
