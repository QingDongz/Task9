package cn.summerwaves.service.impl;

import cn.summerwaves.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@ContextConfiguration(locations = {"classpath:server.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceImplTest {

    @Autowired
    private IUserService userService;
    @Test
    public void selectAllUser() throws Exception {
        System.out.println(userService.selectAllUser());

    }

}