package com.spring.dao;

import java.util.List;

import com.spring.entity.NewInfo;
import com.spring.entity.NewType;

public interface NewInfoDAO {
	
	/*
	 * 分页，并进行条件查询
	 */
	public List<NewInfo> getNewInfoList(int startPosition, String type);
	
	public List<NewInfo> getNewInfoList(int startPosition, int maxPosition);
	
	/*
	 * 得到新闻类型列表信息
	 */
	public List<NewType> getNewTypeList();
	
	public int getCount();

}
