package com.example.cicd.controllers;

import com.example.cicd.services.MyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class IndexController {

    @Autowired
    MyService myService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Index(){
        return "hello world!!!";
    }
    
}