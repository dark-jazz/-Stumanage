package com.offcn.po;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

public class StuLoginExt extends Student{
   @Valid
   private Classes classes;
   @NotBlank(message="登录名不能为空")
   private String loginname;
   @NotBlank(message="密码不能为空")
   private String password;
public Classes getClasses() {
	return classes;
}
public void setClasses(Classes classes) {
	this.classes = classes;
}
public String getLoginname() {
	return loginname;
}
public void setLoginname(String loginname) {
	this.loginname = loginname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
   
}
