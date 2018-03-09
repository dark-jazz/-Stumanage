package com.offcn.dao;

import com.offcn.po.Sc;
import com.offcn.po.ScExample;
import com.offcn.po.ScKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScMapper {
    long countByExample(ScExample example);

    int deleteByExample(ScExample example);

    int deleteByPrimaryKey(ScKey key);

    int insert(Sc record);

    int insertSelective(Sc record);

    List<Sc> selectByExample(ScExample example);

    Sc selectByPrimaryKey(ScKey key);

    int updateByExampleSelective(@Param("record") Sc record, @Param("example") ScExample example);

    int updateByExample(@Param("record") Sc record, @Param("example") ScExample example);

    int updateByPrimaryKeySelective(Sc record);

    int updateByPrimaryKey(Sc record);
}