package com.lawans.pet.service.impl;

import com.lawans.pet.dao.UserMapper;
import com.lawans.pet.entity.BaseResult;
import com.lawans.pet.entity.UserEntity;
import com.lawans.pet.entity.UserLoginResult;
import com.lawans.pet.service.IUserService;
import com.lawans.pet.utils.ConstantUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用户相关接口实现类
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    //查找所有用户
    @Override
    public BaseResult<List<UserEntity>> allUsers() {
        List<UserEntity> list=userMapper.allUsers();
        if(list!=null && list.size()>0){
            return BaseResult.createByData(ConstantUtils.CODE_SUCCESS,list);
        }else{
            return BaseResult.createByError(ConstantUtils.CODE_ERROR,ConstantUtils.CODE_ERROR_String);
        }
    }

    //注册用户
    @Override
    public BaseResult register(Map<String, Object> parms) {
        int index=userMapper.register(parms);
        if(index>0){
            return BaseResult.createByData(ConstantUtils.CODE_SUCCESS,"");
        }else{
            return BaseResult.createByData(ConstantUtils.CODE_ERROR,ConstantUtils.CODE_ERROR_String);
        }
    }

    //用户登录
    @Override
    public BaseResult<UserLoginResult> login(Map<String, Object> parms) {
        UserLoginResult result=userMapper.login(parms);
        if(result==null){
            return BaseResult.createByError(ConstantUtils.CODE_ACCOUNT_ERROR,ConstantUtils.CODE_ACCOUNT_ERROR_String);
        }else{
            return BaseResult.createByData(ConstantUtils.CODE_SUCCESS,result);
        }
    }
}
