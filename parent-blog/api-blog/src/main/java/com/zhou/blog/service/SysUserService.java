package com.zhou.blog.service;

import com.zhou.blog.dao.pojo.SysUser;

public interface SysUserService {
    SysUser findUserById(Long id);

    void findUser(String account, String password);
}
