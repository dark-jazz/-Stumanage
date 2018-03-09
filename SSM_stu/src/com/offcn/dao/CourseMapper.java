package com.offcn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.offcn.po.CouExt;
import com.offcn.po.Course;
import com.offcn.po.CourseExample;

public interface CourseMapper {
    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
    
    List<Course> getlist();
    
    CouExt getById(int id);
}