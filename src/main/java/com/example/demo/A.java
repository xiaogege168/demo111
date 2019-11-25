package com.example.demo;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller

public class A {
    @RequestMapping(value = "/aaa")
    public String test() {
        List list=new ArrayList();
        list.add(new User());
        list.add(new User());
        list.add(new User());
        return "ok" ;
    }
}
