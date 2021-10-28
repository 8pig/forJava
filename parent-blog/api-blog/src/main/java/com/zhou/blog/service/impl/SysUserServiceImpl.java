package com.zhou.blog.service.impl;

import com.zhou.blog.dao.mapper.SysUserMapper;
import com.zhou.blog.dao.pojo.SysUser;
import com.zhou.blog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser findUserById(Long id) {
        SysUser sysUser = sysUserMapper.selectById(id);
        if(sysUser == null) {
            sysUser = new SysUser();
            sysUser.setNickname("匿名");
        }
        return sysUserMapper.selectById(id);
    }
}
