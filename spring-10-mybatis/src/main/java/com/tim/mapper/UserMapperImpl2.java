package com.tim.mapper;

import com.tim.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{

    public List<User> getUser() {
        return getSqlSession().getMapper(UserMapper.class).getUser();
    }
}
