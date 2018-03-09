package com.offcn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.offcn.po.CouExt1;
import com.offcn.po.CtcExample;
import com.offcn.po.CtcKey;

public interface CtcMapper {
    long countByExample(CtcExample example);

    int deleteByExample(CtcExample example);

    int deleteByPrimaryKey(CtcKey key);

    int insert(CtcKey record);

    int insertSelective(CtcKey record);

    List<CtcKey> selectByExample(CtcExample example);

    int updateByExampleSelective(@Param("record") CtcKey record, @Param("example") CtcExample example);

    int updateByExample(@Param("record") CtcKey record, @Param("example") CtcExample example);
    
    void multiInsert(List<CtcKey> ctclist);
    void multiInsert1(CouExt1 couext1);
}