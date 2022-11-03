package org.example.dao;

import org.apache.ibatis.annotations.*;
import org.example.pojo.User;

public interface UserDao {
    @Insert("insert into tb_user(`name`,age) values (#{name},#{age})")
    public void save(User user);
}
