package com.system.xianbozhan.dao;

import java.util.List;

import com.system.xianbozhan.entity.User;

public interface UserDAO {
	/*
	 * 查询用户
	 */
	public List<User> getUserList(int page, int currentPage);

	/*
	 * 新增用户
	 */
	public void addUser(User user);
	
	/*
	 * 根据用户名称查找用户
	 */
	public User getUserByUsername(String username);
	public User getUserById(int id);
	/*
	 * 修改用户信息
	 */
	public void updateUser(User user);
	
	/*
	 * 删除用户信息
	 */
	public void deleteUserByUserName(String userName);
	public void deleteUserById(int id);
	
	/*
	 * 得到数据库总数
	 */
	public int getCount();
	
	
	
}
