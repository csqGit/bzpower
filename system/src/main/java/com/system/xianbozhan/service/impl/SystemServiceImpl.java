package com.system.xianbozhan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.xianbozhan.dao.SystemDAO;
import com.system.xianbozhan.entity.Department;
import com.system.xianbozhan.entity.Role;
import com.system.xianbozhan.entity.Search;
import com.system.xianbozhan.service.SystemService;

@Service
public class SystemServiceImpl implements SystemService{
	
	@Autowired
	private SystemDAO departmentDAO;

	public List<Department> getDepartmentName() {
		// TODO Auto-generated method stub
		return departmentDAO.getDepartmentName();
	}

	
	public List<Role> getRoleName() {
		// TODO Auto-generated method stub
		return departmentDAO.getRoleName();
	}


	public List<Search> getSearchList() {
		// TODO Auto-generated method stub
		return departmentDAO.getSearchList();
	}

	
}
