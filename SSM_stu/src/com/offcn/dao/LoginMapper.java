package com.offcn.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.offcn.po.Login;
import com.offcn.po.LoginExample;

public interface LoginMapper {
    long countByExample(LoginExample example);

    int deleteByExample(LoginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Login record);

    int insertSelective(Login record);

    List<Login> selectByExample(LoginExample example);

    Login selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByExample(@Param("record") Login record, @Param("example") LoginExample example);

    

    int updateByPrimaryKey(Login record);
    
    Login login(Login login);
    
    void deleteBySid(Map<String,Integer> map);
    Login selectByPrimaryByrid(int rid);
}