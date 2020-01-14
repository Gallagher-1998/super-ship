package com.xiaoyun.mapper;

import com.xiaoyun.pojo.UserPojo;

public interface UserMapper {

    public String checkName(String vName);

    public boolean register(UserPojo userPojo);
}
