package com.fankf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fan
 * @create 2020-05-16 12:43
 * @description
 * @see com.fankf.ServiceSayhelloApplication
 */
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello/{name}")
    public String sayhello(@PathVariable("name") String name) {
        return name + ",hello, i am from port " + port;
    }
}
