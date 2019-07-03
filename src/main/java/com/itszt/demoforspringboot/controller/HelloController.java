package com.itszt.demoforspringboot.controller;

import com.itszt.demoforspringboot.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private HelloDao helloDao;

    @GetMapping("hello")
    public List<String> sayHello() {
        System.out.println("HelloController.sayHello");
        List<String> name = helloDao.getName();
        return name;
    }
}
