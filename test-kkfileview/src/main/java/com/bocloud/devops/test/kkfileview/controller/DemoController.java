package com.bocloud.devops.test.kkfileview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kelvin
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "hello " +name;
    }
}
