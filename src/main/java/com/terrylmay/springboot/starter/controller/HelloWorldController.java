package com.terrylmay.springboot.starter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloWorldController {

    private final static Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping(value = "/hello/{userName}")
    public Object sayHello(@PathVariable(name = "userName") String userName) {
        LOGGER.info("user:{} access restful:{}", userName, HelloWorldController.class.getName());
        return new HashMap<String, String>() {{
            put("name", userName);
        }};
    }
}
