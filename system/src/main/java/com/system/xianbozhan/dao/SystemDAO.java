package com.system.xianbozhan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized.Parameter;

import com.system.xianbozhan.entity.Company;
import com.system.xianbozhan.entity.Department;
import com.system.xianbozhan.entity.Picture;
import com.system.xianbozhan.entity.Role;
import com.system.xianbozhan.entity.Search;

public interface SystemDAO {

	/*
	 * 得到部门的全部列表
	 */
	public List<Department> getDepartmentName();
	
	/*
	 * 得到角色的全部列表
	 */
	public List<Role> getRoleName();
	
	/*
	 * 显示主页面的设备状态列表
	 */
	public List<Search> getSearchList();
	
	
	public List<Company> getCompany();
	
	
	/*
	 * 轮播图片
	 */
	public List<Picture> getPicture(@Param("startPage") int startPage,@Param("maxPage") int maxPage);
}
