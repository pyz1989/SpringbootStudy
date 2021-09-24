package com.yuan.springbootstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 */
@RestController
public class TestController {

    /**
     * 程序测试
     * @return
     */
    @GetMapping("/test")
    public String getTest(){
        return "success";
    }
}
