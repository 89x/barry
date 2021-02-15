package com.barry.server.service;


import com.barry.server.dao.Testbarry;
import com.barry.server.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;


    public List<Testbarry> list() {
        return testMapper.list();
    }
}
