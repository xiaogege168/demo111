package com.example.controller;

import com.example.dao.userMapper;
import com.example.entity.country;
import com.example.entity.user;
import com.example.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {

    @Autowired
    private CountryService countryService;
    @RequestMapping("/go")
    public String go(Model model) {
        model.addAttribute( countryService.selectByPrimaryKey("1"));
        return "ok";
    }


}
