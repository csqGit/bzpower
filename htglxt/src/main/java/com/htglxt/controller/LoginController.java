package com.htglxt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.htglxt.entity.Admin;
import com.htglxt.service.AdminService;

@Controller
public class LoginController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/login")
	public String login(Admin admin) {
		if(admin == null)
			return "users/login";
		admin = adminService.login(admin);
		if(admin!= null) {
			return "users/login_success";
		}else
			return "users/login";
	}

}
