package com.yuan.springbootstudy.service.Impl;

import com.yuan.springbootstudy.SpringbootStudyApplicationTests;
import com.yuan.springbootstudy.model.vo.UserVO;
import com.yuan.springbootstudy.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceImplTest extends SpringbootStudyApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void findAllUser() {
        List<UserVO> userVOList = userService.findAllUser();
        System.out.println("获取数据：" + userVOList.size());
        for (UserVO userVO : userVOList) {
            System.out.println(userVO);
        }
    }
}