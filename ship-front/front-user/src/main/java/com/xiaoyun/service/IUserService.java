package com.xiaoyun.service;

import com.xiaoyun.pojo.UserPojo;

public interface IUserService {

    public String checkName(String vName);

    public boolean register(UserPojo userPojo);
}
