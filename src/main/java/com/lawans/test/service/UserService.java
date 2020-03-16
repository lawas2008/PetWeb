package com.lawans.test.service;

import com.lawans.test.entity.User;

public interface UserService {
    User findUserByName(String name);
}
