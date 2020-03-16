package com.lawans.test.dao;

import com.lawans.test.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapperDao {
    User findUserByName(String name);
}
