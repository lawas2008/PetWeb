package com.lawans.pet.dao;

import com.lawans.pet.entity.UserEntity;
import com.lawans.pet.entity.UserLoginResult;

import java.util.List;
import java.util.Map;

//用户相关的接口
public interface UserMapper {
    //查找所有用户
    List<UserEntity> allUsers();
    //注册用户，md5加密的密码
    int register(Map<String,Object> parms);
    //用户登录
    UserLoginResult login(Map<String,Object> parms);
}
