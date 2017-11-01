package cn.summerwaves.util;

import cn.summerwaves.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
/*@ContextConfiguration(locations = {"classpath:client-servlet.xml"})
@RunWith(SpringJUnit4ClassRunner.class)*/
public class SelectRMIUtilTest {
    @Test
    public void getUserService() throws Exception {
        IUserService userService = SelectRMIUtil.getUserService();
        System.out.println(userService.selectAllUser());
    }

}