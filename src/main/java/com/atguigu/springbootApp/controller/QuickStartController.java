package com.atguigu.springbootApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liu Ze min space
 * @create 2020-09-06 14:09
 */
@RestController
public class QuickStartController {
    @RequestMapping("/quick")
    public String quick(){
        return "springboot 访问成功!";
    }
}
