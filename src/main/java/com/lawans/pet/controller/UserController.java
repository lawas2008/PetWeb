package com.lawans.pet.controller;

import com.lawans.pet.entity.BaseResult;
import com.lawans.pet.entity.UserLoginResult;
import com.lawans.pet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 用户相关接口
 */
@Controller
@RequestMapping(value = "user/")
public class UserController {
    @Autowired
    private IUserService userService;

    //获取所有用户
    @RequestMapping(value = "allUser", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public BaseResult getAllUsers() {
        return userService.allUsers();
    }

    //账号注册
    @RequestMapping(value = "register", method = RequestMethod.POST)
    @ResponseBody
    public BaseResult resgister(@RequestParam Map<String, Object> parms) throws Exception {
        return userService.register(parms);
    }

    //账号登录
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public BaseResult<UserLoginResult> login(@RequestParam Map<String, Object> parms) throws Exception {
        return userService.login(parms);
    }
}
