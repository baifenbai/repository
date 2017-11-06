package com.zjq.service;

import com.zjq.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IT-03 on 2017/10/16.
 */
@Service
public class TestService {
    @Autowired
    public TestDao testDao;
    public String getString(){
        return testDao.getString();
    }
}
