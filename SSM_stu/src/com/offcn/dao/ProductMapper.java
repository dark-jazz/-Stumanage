package com.offcn.dao;

import com.offcn.po.Product;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);


    Product selectByPrimaryKey(Integer id);


    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    
    List<Product> getplist(@Param("start") int start,@Param("size") int size);
    int getCount();
}