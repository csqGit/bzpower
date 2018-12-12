package com.system.xianbozhan.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.system.xianbozhan.entity.Msg;
import com.system.xianbozhan.entity.User;
import com.system.xianbozhan.entity.EntityPojo;
import com.system.xianbozhan.service.UserService;
import com.system.xianbozhan.service.impl.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("addUser")
	public void addUser(HttpServletResponse response,  User user) {
		String msg = "添加成功！";
		Msg info = new Msg();
		try {
			userService.addUser(user);
		} catch (Exception e) {
			msg = "添加失败！";
			e.printStackTrace();
		}
		info.setMsg(msg);
		try {
			response.sendRedirect("view/user.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("getUserList")
	@ResponseBody
	public Object getUserList(int page, String username){
		UserServiceImpl userServiceImpl = (UserServiceImpl) userService;
		EntityPojo userPojo = new EntityPojo();
		if(!("".equals(username)) || (username == null)) {
			try {
				//将对象保存在实体类中
				userPojo.setList(getUserByUsername(username));
				userPojo.setCount(1);
				userPojo.setCount(1);
				userPojo.setPages(1);
				userPojo.setNow(1);
				userPojo.setSize(1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			try {
				/*
				 * 前台需要当前页数current，总页数pages，当前为第几条now结果至第几条结果，共有多少sum条结果，共需要5个参数
				 */
				int current ;//当前页数
				int pages; //总页数
				int count; //总条数
				int now ; //当前为第几条
				int size ;//至第几条
				List<User> list = userService.getUserList(page);//当前集合
				pages = userServiceImpl.getPages();
				count = userServiceImpl.getCount();
				current = page;
				now = (current - 1) * UserServiceImpl.current + 1;
				size = now + list.size() - 1;
				userPojo.setList(list);
				userPojo.setCurrent(current);
				userPojo.setPages(pages);
				userPojo.setCount(count);
				userPojo.setNow(now);
				userPojo.setSize(size);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		Object json = JSONObject.toJSON(userPojo);
		return json;
	}
	

	public List<User> getUserByUsername(String username) {
		List<User> list = new ArrayList<User>();
		try {
			User user = userService.getUserByUsername(username);
			if(user != null)
				list.add(user);
		} catch (Exception e) {
			e.printStackTrace();
			return list;
		}
		return list;
	}
	
	@RequestMapping("getUserById")
	@ResponseBody
	public EntityPojo getUserById(int id) {
		EntityPojo userPojo = new EntityPojo();
		try {
			User user = userService.getUserById(id);
			System.out.println(user);
			List<User> list = new ArrayList<User>();
			list.add(user);	
			userPojo.setList(list);
		} catch (Exception e) {
			e.printStackTrace();
			return userPojo;
		}
		return userPojo;
	}
	
	
	@RequestMapping("updateUser")
	public void updateUser(HttpServletResponse response , User user) {
		
		String msg = "更新成功！";
		try {
			userService.updateUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			msg = "更新失败！";
		}
		Msg info = new Msg();
		info.setMsg(msg);
		try {
			response.sendRedirect("view/user.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("deleteUserById")
	@ResponseBody
	public Object deleteUserById(int id) {
		String msg = "删除成功！";
		try {
			userService.deleteUserById(id);
		} catch (Exception e) {
			e.printStackTrace();
			msg = "删除失败！";
		}
		Msg msginfo = new Msg();
		msginfo.setId(0);
		msginfo.setMsg(msg);
		Object obj = JSONObject.toJSON(msginfo);
		return obj;
	}
	
	
	
}
