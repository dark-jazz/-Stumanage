package com.offcn.dao;

import com.offcn.po.UserMy;

public interface UserMyMapper {

    int deleteByPrimaryKey(String id);

    int insert(UserMy record);

    int insertSelective(UserMy record);

    UserMy selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserMy record);

    int updateByPrimaryKeyWithBLOBs(UserMy record);

    int updateByPrimaryKey(UserMy record);
}