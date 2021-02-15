package com.barry.server.service;

import com.barry.server.dao.User;
import com.barry.server.dao.UserExample;
import com.barry.server.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> list(){
        UserExample userExample =new UserExample();
        userExample.setOrderByClause("id desc ");
        return userMapper.selectByExample(userExample);
    }

}
