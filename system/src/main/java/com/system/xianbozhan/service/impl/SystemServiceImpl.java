package com.system.xianbozhan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.xianbozhan.dao.SystemDAO;
import com.system.xianbozhan.entity.Company;
import com.system.xianbozhan.entity.Department;
import com.system.xianbozhan.entity.Picture;
import com.system.xianbozhan.entity.Role;
import com.system.xianbozhan.entity.Search;
import com.system.xianbozhan.service.SystemService;

@Service
public class SystemServiceImpl implements SystemService{
	
	@Autowired
	private SystemDAO systemDAO;

	public List<Department> getDepartmentName() {
		// TODO Auto-generated method stub
		return systemDAO.getDepartmentName();
	}

	
	public List<Role> getRoleName() {
		// TODO Auto-generated method stub
		return systemDAO.getRoleName();
	}


	public List<Search> getSearchList() {
		// TODO Auto-generated method stub
		return systemDAO.getSearchList();
	}


	public List<Company> getCompany() {
		// TODO Auto-generated method stub
		return systemDAO.getCompany();
	}


	public List<Picture> getPicture(int page) {
		int current = 8;
		int maxPage = (2 - 1) * current;
		return systemDAO.getPicture(page, maxPage);
	}

	
}
