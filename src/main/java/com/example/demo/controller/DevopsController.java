package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {


    @GetMapping("hello")
    public String hello(){

        return "hello";

    }


    @GetMapping("helloDevOps")
    public String helloDevOps(){

        return "helloDevOps";

    }

}
