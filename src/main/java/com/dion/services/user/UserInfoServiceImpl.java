package com.dion.services.user;

import com.dion.entity.user.UserInfo;
import com.dion.interfaces.user.IUserInfoService;
import com.dion.mapper.user.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dionli
 * @since 2017-12-22
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public void saveUserInfo(UserInfo userInfo) {
//        userInfoMapper.saveUserInfo(userInfo);
        userInfoMapper.saveUserInfoByXML(userInfo);
    }
}
