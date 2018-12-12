package com.system.xianbozhan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.xianbozhan.dao.UserLoginDAO;
import com.system.xianbozhan.entity.Admin;
import com.system.xianbozhan.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService{

	@Autowired
	private UserLoginDAO userLoginDAO;
	
	public Admin login(String username, String password) {
		// TODO Auto-generated method stub
		return userLoginDAO.login(username, password);
	}

	public Admin getAdminByUserName(String username) {
		// TODO Auto-generated method stub
		return userLoginDAO.getAdminByUserName(username);
	}

}
