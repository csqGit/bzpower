package com.spring.service;

import java.util.List;

import com.spring.entity.NewInfo;

public interface StudentService {
	// 得到新闻的信息
	public List<NewInfo> getAll(int page, int limit);

	// 得到报修总数
	public int getCount();
}
