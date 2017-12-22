package com.dion.services.user;

import com.dion.entity.user.DemoUser;
import com.dion.interfaces.user.IDemoUserService;
import com.dion.mapper.user.DemoUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dionli
 * @since 2017-12-15
 */
@Service
public class DemoUserServiceImpl implements IDemoUserService {

    @Resource
    private DemoUserMapper demoUserMapper;

    @Override
    public void saveUser(DemoUser user) {

        int result = demoUserMapper.saveDemoUser(user);
        System.out.println();
        System.out.println("----------" + result + "----------");
        System.out.println();
    }

    @Override
    public void saveUser() throws Exception {
        DemoUser user1 = new DemoUser();
        user1.setUserid(100011L);
        user1.setName("张三");
        user1.setGender("male");
        user1.setAge(22);
        saveUser(user1);

        DemoUser user2 = new DemoUser();
        user2.setUserid(100012L);
        user2.setName("李四");
        user2.setGender("male");
        user2.setAge(24);
        saveUser(user2);

        DemoUser user3 = new DemoUser();
        user3.setUserid(100013L);
        user3.setName("王五");
        user3.setGender("female");
        user3.setAge(23);
        saveUser(user3);

        DemoUser user4 = new DemoUser();
        user4.setUserid(100014L);
        user4.setName("赵六");
        user4.setGender("female");
        user4.setAge(25);
        saveUser(user4);
//        throw new Exception("========== 抛出个异，测试下分库分表的回滚！ ========== ");
    }

    @Override
    public int getNumber() {
        return demoUserMapper.getNumber();
    }
}
