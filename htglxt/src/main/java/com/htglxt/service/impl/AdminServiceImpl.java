package com.htglxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htglxt.dao.AdminDAO;
import com.htglxt.entity.Admin;
import com.htglxt.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO adminDAO;

	public Admin login(Admin admin) {
		String name = admin.getName();
		String password = admin.getPassword();
		return adminDAO.login(name, password);
	}

}
