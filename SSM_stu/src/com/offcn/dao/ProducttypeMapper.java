package com.offcn.dao;

import com.offcn.po.Producttype;
import com.offcn.po.ProducttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProducttypeMapper {
    long countByExample(ProducttypeExample example);

    int deleteByExample(ProducttypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Producttype record);

    int insertSelective(Producttype record);

    List<Producttype> selectByExample(ProducttypeExample example);

    Producttype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Producttype record, @Param("example") ProducttypeExample example);

    int updateByExample(@Param("record") Producttype record, @Param("example") ProducttypeExample example);

    int updateByPrimaryKeySelective(Producttype record);

    int updateByPrimaryKey(Producttype record);
}