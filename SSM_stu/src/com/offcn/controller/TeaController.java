package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.dao.LoginMapper;
import com.offcn.po.Login;
import com.offcn.po.LoginExample;
import com.offcn.po.LoginExample.Criteria;
import com.offcn.po.Student;
import com.offcn.po.Teacher;
import com.offcn.service.StuService;
import com.offcn.service.TeaService;

/**
 * @author: zzb
 * @date:2018年2月27日 上午9:57:51
 * @version :
 * @desc :
 */
@Controller
@RequestMapping("/tea")
public class TeaController {
	

	@Autowired
	private TeaService teaService;
	
	@Autowired
    private LoginMapper loginMapper;
  
    
	
	@RequestMapping("/showInfo/{idw}")
	public String showInfo(Model model,@PathVariable("idw") int id){
		Teacher  teacher= teaService.getMyInfo(id);
//	    jsonUtil.commonw(student);
		model.addAttribute("teacher",teacher);
		return "/teacher/person/list";
	}
	
	
	@RequestMapping("/updatePwd")
	public String updatePwd(Model model,int rid,String password){
		Teacher  teacher= teaService.getMyInfo(rid);
		teacher.setPassword(password);
		teaService.updatePwd(teacher);
		Login login=loginMapper.selectByPrimaryByrid(rid);
		login.setPassword(password);
		loginMapper.updateByPrimaryKey(login);
		return "redirect:showInfo/"+rid;
	}
	
	
	
	
	
	
	
}
