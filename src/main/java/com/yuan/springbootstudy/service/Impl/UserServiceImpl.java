package com.yuan.springbootstudy.service.Impl;

import com.yuan.springbootstudy.model.dao.UserMapper;
import com.yuan.springbootstudy.model.pojo.User;
import com.yuan.springbootstudy.model.vo.UserVO;
import com.yuan.springbootstudy.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户Service实现
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    /**
     * 查询所有用户信息
     *
     * @return
     */
    @Override
    public List<UserVO> findAllUser() {
        List<User> userList = userMapper.findAllUser();
        List<UserVO> userVOList = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(user, userVO);
            userVOList.add(userVO);
        }

        return userVOList;
    }
}
