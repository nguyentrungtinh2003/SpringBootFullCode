package com.TrungTinhFullStack.SpringBootFullCode.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HeloController.class);

    @Value("${welcome.message}")
    private String welcomeMessage;

    @GetMapping("/")
    public String helloWorld() {
        LOGGER.info("Received request to / endpoint");
        return welcomeMessage;
    }
}
