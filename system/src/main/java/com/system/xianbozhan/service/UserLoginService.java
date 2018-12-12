package com.system.xianbozhan.service;

import com.system.xianbozhan.entity.Admin;

public interface UserLoginService {

	public Admin login(String username, String password);
	
	public Admin getAdminByUserName(String username);
}
