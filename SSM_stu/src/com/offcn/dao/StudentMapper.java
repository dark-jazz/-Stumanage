package com.offcn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.offcn.po.CtcKey;
import com.offcn.po.Grade;
import com.offcn.po.Login;
import com.offcn.po.Sc;
import com.offcn.po.StuExt;
import com.offcn.po.StuLoginExt;
import com.offcn.po.Student;
import com.offcn.po.StudentExample;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    List<StuExt> getStu(@Param("start") int start,@Param("size") int size);
    
    int getCount();
    
    StuLoginExt getStuAndLogin(int id);
    
    /*¸öÈËÄ£¿é*/
    public Student getMyInfo(int id);
    public void updatePwd(Login login);
    
    public int getMyCoursesCount(int id);
    public List<Student> getMyCourses(@Param("id") int id,@Param("pageNum") int pageNum,@Param("size") int size,@Param("type") String type);
    public List<CtcKey> selectCourse(int claid);
    public List<Grade> getGrade(int id);
    public void addcourse(List<Sc> ctclist);
    
}