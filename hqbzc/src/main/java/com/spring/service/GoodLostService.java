package com.spring.service;

import java.util.List;

import com.spring.entity.GoodLost;

public interface GoodLostService {
	
	
	/*
	 * 得到丢失物品的全部信息
	 */
	public List<GoodLost> getGoodList(int start, String type, String name);
	
	/*
	 * 得到欧总页数
	 */
	public int getCount();
	
}
