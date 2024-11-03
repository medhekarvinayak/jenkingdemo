package com.logginaapi.loggingapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logdemo {

    Logger log = LoggerFactory.getLogger(logdemo.class);

    @GetMapping("/log/{name}")
    public String getMethodName(@PathVariable String name) {
        log.debug("request {}", name);
        System.out.println(1/0);
        return "hellow " + name;
    }

}
