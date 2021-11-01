package com.zhou.blog.service;

import com.zhou.blog.vo.Result;
import com.zhou.blog.vo.params.LoginParam;

public interface LoginService {
    Result login(LoginParam loginParam);
}
