package com.offcn.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.dao.LoginMapper;
import com.offcn.po.Login;
import com.offcn.service.LoginService;

@Controller
public class LoginController {
    @Autowired
	LoginService service;
	
	@RequestMapping("/login")
	public String login(Model model,Login login,HttpServletRequest req){
	  int role=login.getRole();	
	  Login suclogin=service.login(login);
	  if(suclogin!=null){
		  req.getSession().setAttribute("user", suclogin);
		  return "homepage/index";
	  }else{
		  model.addAttribute("msg", "µÇÂ¼Ê§°Ü");
		  return "login";
	  }
	}
	
	@RequestMapping("/exit")
	public String exit(HttpServletRequest request){
		request.getSession().removeAttribute("user");
		return "login";
	}
	
}
