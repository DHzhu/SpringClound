package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/hello", produces="application/json;charset=UTF-8")
	public String index(@RequestParam String name) {
        return "hello "+name+"，this is first messge";
    }
}
