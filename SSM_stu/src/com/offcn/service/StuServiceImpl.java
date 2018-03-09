package com.offcn.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.ClassesMapper;
import com.offcn.dao.LoginMapper;
import com.offcn.dao.StudentMapper;
import com.offcn.po.Classes;
import com.offcn.po.CtcKey;
import com.offcn.po.Grade;
import com.offcn.po.Login;
import com.offcn.po.Sc;
import com.offcn.po.StuExt;
import com.offcn.po.StuLoginExt;
import com.offcn.po.Student;
import com.offcn.po.StudentExample;
import com.offcn.po.StudentExample.Criteria;

@Service
public class StuServiceImpl implements StuService {
	@Autowired
	StudentMapper sMapper;
	@Autowired
	ClassesMapper cMapper;
	@Autowired
	LoginMapper lMapper;
	
	@Override
	public List<StuExt> getList(int pageNO, int size) {
		// TODO Auto-generated method stub
		int start=(pageNO-1)*size;
		return sMapper.getStu(start,size);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return sMapper.getCount();
	}

	@Override
	public List<Classes> getAll() {
		// TODO Auto-generated method stub
		return cMapper.getAll();
	}

	@Override
	public void saveStu(StuLoginExt stulogin) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.setName(stulogin.getName());
		stu.setAddress(stulogin.getAddress());
		stu.setClassid(stulogin.getClasses().getId());
		stu.setSex(stulogin.getSex());
		stu.setTel(stulogin.getTel());
		sMapper.insert(stu);
		
		Login login=new Login();
		login.setLoginname(stulogin.getLoginname());
		login.setPassword(stulogin.getPassword());
		login.setRole(3);
		login.setRid(stu.getId());
		lMapper.insert(login);
	}

	@Override
	public void mutidel(int[] ids) {
		// TODO Auto-generated method stub
		for(int id:ids){
			sMapper.deleteByPrimaryKey(id);
			Map<String,Integer> map=new HashMap<String,Integer>();
			map.put("rid", id);
			map.put("role", 3);
			lMapper.deleteBySid(map);
		}
	}

	@Override
	public StuLoginExt getStuAndLogin(int id) {
		// TODO Auto-generated method stub
		StuLoginExt stu=sMapper.getStuAndLogin(id);
		return stu;
	}
	
	@Override
	public void updateStu(StuLoginExt stulogin) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.setId(stulogin.getId());
		stu.setName(stulogin.getName());
		stu.setAddress(stulogin.getAddress());
		stu.setClassid(stulogin.getClasses().getId());
		stu.setSex(stulogin.getSex());
		stu.setTel(stulogin.getTel());
		sMapper.updateByPrimaryKeySelective(stu);
		
		Login login=new Login();
		login.setLoginname(stulogin.getLoginname());
		login.setPassword(stulogin.getPassword());
		login.setRole(3);
		login.setRid(stulogin.getId());
	 //	lMapper.updateByPrimaryKeySelective(login);
	}
	
	/*个人模块*/
	@Override
	public Student getMyInfo(int id) {
		Student student = sMapper.getMyInfo(id);
		return student;
	}

	@Override
	public void updatePwd(Login login) {
		sMapper.updatePwd(login);
	}
	
	@Override
	public int getMyCoursesCount(int id) {
		int i=sMapper.getMyCoursesCount(id);
		return i;
	}

	@Override
	public List<Student> getMyCourses(int id, int pageNum, int size,String type) {
		int skip=(pageNum-1)*size;
		List<Student> stulist = sMapper.getMyCourses(id, skip, size,type);
		return stulist;
	}

	@Override
	public List<Grade> getGrade(int id) {
		return sMapper.getGrade(id);
	}

	@Override
	public List<CtcKey> selectCourse(int claid) {
		return sMapper.selectCourse(claid);
	}

	@Override
	public void addcourse(List<Sc> ctclist) {
		sMapper.addcourse(ctclist);
	}

	@Override
	public List<Student> getStudentByName(String name) {

//		Student student = sMapper.selectByPrimaryKey(123);
		
		
		StudentExample example = new StudentExample();
		Criteria criteria = example.createCriteria();
	    criteria.andNameEqualTo(name);
		List<Student> list = sMapper.selectByExample(example );
		return list;
	}

	@Override
	public void delete(int id) {  //按照id删除单个学生
		// TODO Auto-generated method stub
		Student s=new Student();
		sMapper.deleteByPrimaryKey(id);
	}


}
