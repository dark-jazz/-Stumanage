package com.offcn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.offcn.dao.StudentMapper;
import com.offcn.dao.TeacherMapper;
import com.offcn.po.Student;
import com.offcn.po.Teacher;


/**
 * @author: zzb
 * @date:2018年2月27日 上午10:22:57
 * @version :
 * @desc :
 */
@Service
public class TeaServiceImpl implements TeaService {
	
	@Autowired
	private TeacherMapper teacherMapper;
	

	@Override
	public Teacher getMyInfo(int id) {  
		// TODO Auto-generated method stub
		Teacher teacher=teacherMapper.selectByPrimaryKey(id);
		
		return teacher;
	}


	@Override
	public void updatePwd(Teacher record) {
		// TODO Auto-generated method stub
		int flag=teacherMapper.updateByPrimaryKey(record);
		
		
	}

}
