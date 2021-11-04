package org.example.dal;

import org.example.entity.User;

/**
 * @author 85217
 */
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     */
    void insertUser(User user);

}
