package com.barry.system.controller;


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

    @RequestMapping("/hello")
    public List<Testbarry> test(){
        return  testService.list();
    }

}
