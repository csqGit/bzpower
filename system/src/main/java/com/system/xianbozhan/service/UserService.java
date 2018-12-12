package com.system.xianbozhan.service;

import java.util.List;

import com.system.xianbozhan.entity.User;

public interface UserService {
	/*
	 * 查询用户
	 */
	public List<User> getUserList(int page);
	
	public User getUserByUsername(String username);
	
	public User getUserById(int id);

	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUserByUserName(String userName);
	
	public void deleteUserById(int id);
}
