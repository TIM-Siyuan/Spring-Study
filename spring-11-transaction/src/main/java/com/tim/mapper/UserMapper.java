package com.tim.mapper;

import com.tim.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUser();

    int deleteUser(int id);

    int addUser(User user);
}
