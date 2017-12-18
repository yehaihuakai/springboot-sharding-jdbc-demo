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
//    void saveUser(DemoUser user);

    @Insert("INSERT INTO `demo_user` (`userid`, `name`, `age`, `gender`) VALUES (#{userid}, #{name}, #{age}, #{gender})")
    int saveUser(DemoUser user);
//    void saveUser(@Param("userid")Long userid , @Param("name") String name, @Param("age")Integer age, @Param("gender")String gender);

    @Select("select count(*) from `demo_user`")
    int getNumber();
}