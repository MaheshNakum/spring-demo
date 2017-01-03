package com.codedurance.tesco.bootcamp.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by maheshnakum on 03/01/2017.
 */
@Configuration
public class MyApplicationConfiguration {

   @Value("${hello.word}")
    private String helloWord;

    @Bean(name = "helloWord")
    public String helloWord(){
        return helloWord;
    }



}
