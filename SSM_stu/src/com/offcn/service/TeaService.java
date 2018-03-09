package com.offcn.service;


import com.offcn.po.Teacher;

/**
 * @author: zzb
 * @date:2018年2月27日 上午10:16:39
 * @version :
 * @desc :
 */
public interface TeaService {

	public Teacher getMyInfo(int id);
	
	void updatePwd(Teacher record);

}
