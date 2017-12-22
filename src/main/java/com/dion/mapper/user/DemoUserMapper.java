package com.dion.mapper.user;

import com.dion.entity.user.DemoUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author dionli
 * @since 2017-12-15
 */
//public interface DemoUserMapper extends BaseMapper<DemoUser> {
public interface DemoUserMapper{

    @Insert("INSERT INTO `demo_user` (`userid`, `name`, `age`, `gender`) VALUES (#{userid}, #{name}, #{age}, #{gender})")
    int saveDemoUser(DemoUser user);

    @Select("select count(*) from `demo_user`")
    int getNumber();
}