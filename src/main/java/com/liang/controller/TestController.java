package com.liang.controller;

import com.liang.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/testInitializer/{key}")
    public String testInitializer(@PathVariable("key") String key){
        return testService.testInitializer(key);
    }
}
