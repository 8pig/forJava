package com.zhou.blog.service;

import com.zhou.blog.dao.pojo.SysUser;
import com.zhou.blog.vo.Result;

public interface SysUserService {
    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);
    Result findUserByToken(String token);
}
