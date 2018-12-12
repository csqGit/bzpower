package com.system.xianbozhan.dao;

import org.apache.ibatis.annotations.Param;

import com.system.xianbozhan.entity.Admin;

public interface UserLoginDAO {

	public Admin login(@Param("username") String username, @Param("password") String password);
	
	public Admin getAdminByUserName(String username);
}
