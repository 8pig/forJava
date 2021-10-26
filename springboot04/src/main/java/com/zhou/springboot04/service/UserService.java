package com.zhou.springboot04.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhou.springboot04.mapper.UserMapper;
import com.zhou.springboot04.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private  UserMapper userMapper;


    /*
    *  查询所有
    * */
    public  List<User> findAll() {
        return userMapper.selectList(new LambdaQueryWrapper<User>());
    }

    /*
    * 分页
    * */
    public  List<User> findPage(int current, int pageSize) {
        Page<User> page = new Page<>(current, pageSize);
        Page<User> userPage = userMapper.selectPage(page, new LambdaQueryWrapper<User>());

        return userPage.getRecords();
    }

    /*
        查询单个
    * */
    public User findUserById (int id){
        return userMapper.selectById(id);
    }

    public List<User> findAge (int age) {
        return userMapper.findUserGtAge(age);

    }

    public Long save(String name) {
        User user = new User();
        user.setAge(20);
        user.setEmail("zhou773@foxmail.com");
        user.setName(name);
        userMapper.insert(user);
        return user.getId();
    }
}
