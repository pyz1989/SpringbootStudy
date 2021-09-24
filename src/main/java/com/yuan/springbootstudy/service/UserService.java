package com.yuan.springbootstudy.service;

import com.yuan.springbootstudy.model.vo.UserVO;

import java.util.List;

/**
 * 用户Service接口
 */
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<UserVO> findAllUser();
}
