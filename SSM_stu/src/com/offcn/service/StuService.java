package com.offcn.service;

import java.util.List;

import com.offcn.po.Classes;
import com.offcn.po.CtcKey;
import com.offcn.po.Grade;
import com.offcn.po.Login;
import com.offcn.po.Sc;
import com.offcn.po.StuExt;
import com.offcn.po.StuLoginExt;
import com.offcn.po.Student;

public interface StuService {
	List<StuExt> getList(int pageNO,int size);
	int getCount();
	List<Classes> getAll();
	void saveStu(StuLoginExt stulogin);
	void mutidel(int[] id);
	
	void delete(int id); //删除单个学生
	StuLoginExt getStuAndLogin(int id);
	void updateStu(StuLoginExt stulogin);
	
	
	/*个人模块*/
	public Student getMyInfo(int id);
    public void updatePwd(Login login);
    public int getMyCoursesCount(int id);
    public List<Student> getMyCourses(int id,int pageNum,int size,String type);
    public List<Grade> getGrade(int id);
    
    public List<CtcKey> selectCourse(int claid);
    public void addcourse(List<Sc> ctclist);
	List<Student> getStudentByName(String name);
    
    
}
