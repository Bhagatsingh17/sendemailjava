package com.geekster.EmailJson.controller;

import com.geekster.EmailJson.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudenControl {

    @Autowired
    Student s1;

    @GetMapping("/student")
    public Student getStudent()
    {
        return s1;
    }
}