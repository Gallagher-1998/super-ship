package com.xiaoyun.service.impl;


import com.xiaoyun.mapper.UserMapper;
import com.xiaoyun.pojo.UserPojo;
import com.xiaoyun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    public String checkName(String vName) {
        return userMapper.checkName(vName);
    }

    public boolean register(UserPojo userPojo) {
        return userMapper.register(userPojo);
    }
}
