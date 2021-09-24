package com.yuan.springbootstudy.controller;

import com.yuan.springbootstudy.model.vo.UserVO;
import com.yuan.springbootstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试
 */
@RestController
public class TestController {

    @Autowired
    UserService userService;
    /**
     * 程序测试
     * @return
     */
    @GetMapping("/test")
    public String getTest(){
        return "success";
    }

    /**
     * 获取所有用户信息
     * @return
     */
    @GetMapping("/user/list")
    public List<UserVO> getUserList(){
        return userService.findAllUser();
    }

}
