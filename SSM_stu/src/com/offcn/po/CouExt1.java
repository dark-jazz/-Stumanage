package com.offcn.po;

import java.util.List;

public class CouExt1 extends Course{
   private String tid;
   private List<Integer> clids;
public String getTid() {
	return tid;
}
public void setTid(String tid) {
	this.tid = tid;
}
public List<Integer> getClids() {
	return clids;
}
public void setClids(List<Integer> clids) {
	this.clids = clids;
}

   
}
