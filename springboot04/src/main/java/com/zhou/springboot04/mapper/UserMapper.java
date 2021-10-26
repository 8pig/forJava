package com.zhou.springboot04.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhou.springboot04.pojo.User;

import java.util.List;


public interface UserMapper extends BaseMapper<User> {


    public List<User> findUserGtAge (int age);

    List<User> selectList(LambdaQueryWrapper<Object> objectLambdaQueryWrapper);
}
