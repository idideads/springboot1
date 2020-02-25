package com.test.springboot.mapper;

import com.test.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Select("select NOW()")
    String checkTime();
}
