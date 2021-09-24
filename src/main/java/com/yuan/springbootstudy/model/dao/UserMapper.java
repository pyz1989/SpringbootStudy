package com.yuan.springbootstudy.model.dao;

import com.yuan.springbootstudy.model.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    /**
     * 查询所有用户信息
     * @return
     */
    List<User> findAllUser();
}
