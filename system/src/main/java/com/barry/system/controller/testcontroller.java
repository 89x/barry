package com.barry.system.controller;


import com.barry.server.dao.User;
import com.barry.server.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.barry.server.dao.Testbarry;
import com.barry.server.service.TestService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class testcontroller {

    @Resource
    private TestService testService;
    @Resource
    private UserService userService;

    @RequestMapping("/hello")
    public List<Testbarry> test(){
        return  testService.list();
    }

    @RequestMapping("/user")
    public List<User> test1(){
        return  userService.list();
    }

}
