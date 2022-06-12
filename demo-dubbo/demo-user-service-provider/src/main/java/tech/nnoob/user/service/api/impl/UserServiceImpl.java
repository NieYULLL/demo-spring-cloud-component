package tech.nnoob.user.service.api.impl;

import tech.nnoob.user.service.api.UserService;

/**
 * @CreateTime: 2022/6/12 11:23 上午
 * @Author: nnoobnie
 * @Description: UserServiceImpl
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getUserNameById(Long id) {
        return "hello user:" + id;
    }
}
