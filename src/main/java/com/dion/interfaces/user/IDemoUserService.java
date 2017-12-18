package com.dion.interfaces.user;

import com.dion.entity.user.DemoUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author dionli
 * @since 2017-12-15
 */
public interface IDemoUserService {

    void saveUser(DemoUser user);

    int getNumber();

    void saveUser() throws Exception;
}
