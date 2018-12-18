package com.htglxt.dao;

import org.apache.ibatis.annotations.Param;

import com.htglxt.entity.Admin;

public interface AdminDAO {
	public Admin login(@Param("name") String name, @Param("password") String password);
	
	Admin select(@Param("name") String name, @Param("password") String password);

}
