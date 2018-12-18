package com.spring.dao;

import java.util.List;

import com.spring.entity.NewInfo;

public interface StudentDAO {

	//得到新闻的信息
	public List<NewInfo> getAll(int page, int limit);
	
	//得到所有新闻总数
	public int getCount();
}
