package com.jindalz.mySpring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mytest {
    @RequestMapping("/first")
    public String index(){
        return "Hello Jindal!!!";
    }
}
