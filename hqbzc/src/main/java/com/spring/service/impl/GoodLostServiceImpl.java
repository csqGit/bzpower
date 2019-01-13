package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.GoodLostDAO;
import com.spring.entity.GoodLost;
import com.spring.service.GoodLostService;

@Service
public class GoodLostServiceImpl implements GoodLostService {
	// 规定每页显示10条
	private static int maxResult = 10; 

	@Autowired
	private GoodLostDAO goodLostDAO;
	
	public List<GoodLost> getGoodList(int start,String type, String name) {
		start = (start - 1 ) * maxResult;
		return goodLostDAO.getGoodList(start,maxResult, type, name);
	}

	public int getCount() {
		int page = goodLostDAO.getCount();
		int count = page / maxResult;
		if(page % maxResult == 0)
			return count;
		else
			return count + 1;
	}

}
