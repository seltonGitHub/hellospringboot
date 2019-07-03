package com.itszt.demoforspringboot.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HelloDao {

    @Select("select username from user")
    List<String> getName();
}
