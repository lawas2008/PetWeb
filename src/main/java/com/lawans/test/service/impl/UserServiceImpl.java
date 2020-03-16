package com.lawans.test.service.impl;

import com.lawans.test.dao.UserMapperDao;
import com.lawans.test.entity.User;
import com.lawans.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapperDao userDao;

    @Override
    public User findUserByName(String name) {
        return userDao.findUserByName(name);
    }
}
