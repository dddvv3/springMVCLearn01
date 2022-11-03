package org.example.service;

import org.example.pojo.User;

public class UserServiceImpl implements UserService{
    @Override
    public void save(User user) {
        System.out.println("user service ...");
    }
}
