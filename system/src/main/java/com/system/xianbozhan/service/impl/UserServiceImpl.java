package com.system.xianbozhan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.xianbozhan.dao.UserDAO;
import com.system.xianbozhan.entity.User;
import com.system.xianbozhan.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	//定义每页显示条数
	public static int current = 10;
	@Autowired
	private UserDAO userDAO;

	public void addUser(User user) {
		userDAO.addUser(user);
	}

	public List<User> getUserList(int page) {
		int currentPage = (page - 1) * current;
		return userDAO.getUserList( currentPage, current);
	}

	public User getUserByUsername(String username) {
		return userDAO.getUserByUsername(username);
	}
	
	/*
	 * 计算总页数
	 */
	public int getPages() {
		int count = userDAO.getCount();
		int page = count / current;
		if(count % current != 0) 
			  page ++;
		return page ;
	}
	/*
	 * 计算总条数
	 */
	public int getCount() {
		return userDAO.getCount();
	}

	public void updateUser(User user) {
		userDAO.updateUser(user);
	}

	public void deleteUserByUserName(String userName) {
		userDAO.deleteUserByUserName(userName);
	}
	public void deleteUserById(int id) {
		userDAO.deleteUserById(id);
	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userDAO.getUserById(id);
	}
	
}
