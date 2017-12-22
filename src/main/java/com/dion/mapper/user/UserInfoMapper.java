package com.dion.mapper.user;

import com.dion.entity.user.UserInfo;
import org.apache.ibatis.annotations.Insert;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author dionli
 * @since 2017-12-22
 */
public interface UserInfoMapper {

    @Insert("INSERT INTO `user_info` (`userid`, `phone`, `idcard`) VALUES (#{userid}, #{phone}, #{idcard})")
    void saveUserInfo(UserInfo userInfo);

    void saveUserInfoByXML(UserInfo userInfo);
}