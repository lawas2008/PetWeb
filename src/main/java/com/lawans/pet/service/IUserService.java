package com.lawans.pet.service;

import com.lawans.pet.entity.BaseResult;
import com.lawans.pet.entity.UserEntity;
import com.lawans.pet.entity.UserLoginResult;

import java.util.List;
import java.util.Map;

/**
 * 用户相关的接口
 */
public interface IUserService {
    //查找所有用户
    BaseResult<List<UserEntity>> allUsers();
    //注册用户，md5加密的密码
    BaseResult register(Map<String,Object> parms);
    //用户登录
    BaseResult<UserLoginResult> login(Map<String,Object> parms);
}
