package com.onlinestore.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/test")
public class TestController {

    @GetMapping("/main")
    public String getMainpage(){
        return "/test/main";
    }

    @GetMapping("/phones")
    public String getPhonespage(){
        return "/test/phones";
    }
}
