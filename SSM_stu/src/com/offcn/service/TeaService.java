package com.offcn.service;


import com.offcn.po.Teacher;

/**
 * @author: zzb
 * @date:2018��2��27�� ����10:16:39
 * @version :
 * @desc :
 */
public interface TeaService {

	public Teacher getMyInfo(int id);
	
	void updatePwd(Teacher record);

}
