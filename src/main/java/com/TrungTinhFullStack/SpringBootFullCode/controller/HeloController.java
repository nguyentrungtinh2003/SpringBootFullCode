package com.TrungTinhFullStack.SpringBootFullCode.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloController {

   @GetMapping("/")
    public  String HelloWorld() {
        return "Welcome my website by Trung Tinh Fullstack";
    }
}
