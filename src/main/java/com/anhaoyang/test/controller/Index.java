package com.anhaoyang.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class Index {

    @RequestMapping("1")
    public String index(){
        return "你好啊";
    }
}
