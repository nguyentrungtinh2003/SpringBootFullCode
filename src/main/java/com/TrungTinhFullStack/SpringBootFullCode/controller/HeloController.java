package com.TrungTinhFullStack.SpringBootFullCode.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public  String HelloWorld() {
        return "Welcome my website by Trung Tinh Fullstack";
    }
}
