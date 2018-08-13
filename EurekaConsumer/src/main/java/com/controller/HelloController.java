package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.HelloService;

@RestController
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@Value("${neo.hello}")
    private String hello;
	
	@RequestMapping(value="/hello/{name}", produces="application/json;charset=UTF-8")
    public String index(@PathVariable("name") String name) {
        return helloService.hello(name) + ":" + this.hello;
    }
}
