package com.system.xianbozhan.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.system.xianbozhan.entity.Department;
import com.system.xianbozhan.entity.Role;
import com.system.xianbozhan.entity.Search;
import com.system.xianbozhan.service.SystemService;

/*
 * 系统类
 */
@Controller
public class SystemController {
	
	@Autowired
	private SystemService systemService;

	@RequestMapping("getDepartmentName")
	@ResponseBody
	public Object getDepartmentName(HttpServletResponse response){
		List<Department> department = null;
		try {
			department = systemService.getDepartmentName();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object json = JSONObject.toJSON(department);
		
		return json;
	}
	
	@RequestMapping("getRoleName")
	@ResponseBody
	public Object getRoleName(HttpServletResponse response){
		List<Role> role = null;
		try {
			role = systemService.getRoleName();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object json = JSONObject.toJSON(role);
		
		return json;
	}
	
	
	@RequestMapping("getSearchList")
	@ResponseBody
	public Object getSearchList() {

		List<Search> search = null;
		try {
			search = systemService.getSearchList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object json = JSONObject.toJSON(search);
		return json;
	}
}
