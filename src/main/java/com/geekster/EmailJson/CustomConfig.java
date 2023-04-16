package com.geekster.EmailJson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig{

    @Bean
    public Student getStudent()
    {

        System.out.println("Spring call .. in config bean of student");
        return new Student("Bhagat","1234567890","Software Engineer");
    }

}