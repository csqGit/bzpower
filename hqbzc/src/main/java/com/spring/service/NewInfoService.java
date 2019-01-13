package com.spring.service;

import java.util.List;

import com.spring.entity.NewInfo;
import com.spring.entity.NewType;

public interface NewInfoService {
	/*
	 * 分页，并进行条件查询
	 */
	public List<NewInfo> getNewInfoList(int startPosition, String type);
	
	/*
	 * 得到新闻类型列表信息
	 */
	public List<NewType> getNewTypeList();
	
	public List<NewInfo> getNewInfoList(int startPosition);
	
	public int getPages();
	
}
