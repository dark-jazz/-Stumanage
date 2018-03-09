package com.offcn.po;

public class Teacher {
    private Integer id;

    private String name;

    private Integer type;
    
    private String password;
    
    private String workid;

   
   
    private String loginname;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
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