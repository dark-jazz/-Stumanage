package com.offcn.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.dao.LoginMapper;
import com.offcn.po.Login;
import com.offcn.service.LoginService;

/**
 * @author: zzb
 * @date:2018年2月25日 下午8:14:01
 * @version :
 * @desc :
 */
@Service
public class LoginServiceImp implements LoginService {

	@Autowired
	LoginMapper lMapper;
	@Override
	public Login login(Login login) {
		// TODO Auto-generated method stub
		
		 
		return lMapper.login(login);
	}

}
