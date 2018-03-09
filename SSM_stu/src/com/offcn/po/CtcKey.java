package com.offcn.po;

public class CtcKey {
    private Integer couid;

    private Integer tid;

    private Integer claid;
    
    
   private Teacher teacher;
    
    private Classes cla;
    
    //private Integer[] claids;
    
    private Course course;

    public Integer getCouid() {
        return couid;
    }

    public void setCouid(Integer couid) {
        this.couid = couid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getClaid() {
        return claid;
    }

    public void setClaid(Integer claid) {
        this.claid = claid;
    }

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Classes getCla() {
		return cla;
	}

	public void setCla(Classes cla) {
		this.cla = cla;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
    
}