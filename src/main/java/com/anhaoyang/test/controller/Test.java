package com.anhaoyang.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/a")
public class Test {

    @RequestMapping("b")
    public String test(){
        return "Hello test1 ："+System.currentTimeMillis();
    }
}
