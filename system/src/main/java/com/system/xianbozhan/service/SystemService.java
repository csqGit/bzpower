package com.system.xianbozhan.service;

import java.util.List;

import com.system.xianbozhan.entity.Company;
import com.system.xianbozhan.entity.Department;
import com.system.xianbozhan.entity.Picture;
import com.system.xianbozhan.entity.Role;
import com.system.xianbozhan.entity.Search;

public interface SystemService {

	public List<Department> getDepartmentName();
	
	
	public List<Role> getRoleName();
	
	
	public List<Search> getSearchList();
	
	public List<Company> getCompany();
	
	/*
	 * 轮播图片
	 */
	public List<Picture> getPicture(int page);
	
	/*
	 * 得到图片总数
	 */
	public int getPicturePage();
}
