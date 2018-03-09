package com.offcn.po;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

public class Student {
    private Integer id;

    @NotBlank(message="用户名不能为空")
    private String name;
    @NotBlank(message="性别不能为空")
    private String sex;
    @NotBlank(message="地址不能为空")
    private String address;
    @NotBlank(message="电话不能为空")
    private String tel;
    
    private Integer classid;

    private String files;
    
    private Login login;
    
	private Classes classes;
	private List<Sc> sc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files == null ? null : files.trim();
    }

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public List<Sc> getSc() {
		return sc;
	}

	public void setSc(List<Sc> sc) {
		this.sc = sc;
	}
    
    
    
}