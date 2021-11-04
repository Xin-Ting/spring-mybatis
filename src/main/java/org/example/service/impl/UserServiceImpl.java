package org.example.service.impl;

import org.example.dal.UserMapper;
import org.example.entity.User;
import org.example.service.UserService;

/**
 * @author 85217
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public void save(User user) {
        userMapper.insertUser(user);
    }
}
