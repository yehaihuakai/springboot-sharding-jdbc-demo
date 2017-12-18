package com.dion.services.user;

import com.dion.Application;
import com.dion.interfaces.user.IDemoUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by liyang on 2017/12/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)             //指定Junit
@SpringBootTest(classes = Application.class)
public class DemoUserServiceImplTest {

    @Resource
    private IDemoUserService demoUserService;

    @Test
//    @Transactional
    public void testSaveUser() throws Exception {
        demoUserService.saveUser();
    }


    @Test
    public void testSelect(){
        int result = demoUserService.getNumber();
        System.out.println();
        System.out.println();
        System.out.println("--------" + result + "----------------");
        System.out.println();
        System.out.println();
    }
}