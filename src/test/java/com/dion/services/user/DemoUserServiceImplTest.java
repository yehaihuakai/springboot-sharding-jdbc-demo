package com.dion.services.user;

import com.dion.Application;
import com.dion.entity.user.UserInfo;
import com.dion.interfaces.user.IDemoUserService;
import com.dion.interfaces.user.IUserInfoService;
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

    @Resource
    private IUserInfoService userInfoService;

    /**
     * 测试分库分表存储多条数据
     */
    @Test
//    @Transactional
    public void testSaveUser() throws Exception {
        demoUserService.saveUser();
    }

    /**
     * 测试未设置分表策略的存储，默认数据库
     */
    @Test
    public void testDefault() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserid(1000124L);
        userInfo.setPhone("13756888270");
        userInfo.setIdcard("412326199103052637");
        userInfoService.saveUserInfo(userInfo);
    }

    /**
     * 测试数据库是否连通
     */
    @Test
    public void testSelect() {
        int result = demoUserService.getNumber();
        System.out.println();
        System.out.println();
        System.out.println("--------" + result + "----------------");
        System.out.println();
        System.out.println();
    }
}