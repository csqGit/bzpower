package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.NewInfoDAO;
import com.spring.entity.NewInfo;
import com.spring.entity.NewType;
import com.spring.service.NewInfoService;

@Service
public class NewInfoServiceImpl implements NewInfoService{
	
	private static int current = 5;
	
	@Autowired
	private NewInfoDAO newInfoDAOImpl;

	public List<NewInfo> getNewInfoList(int startPosition, String type) {
		
		return newInfoDAOImpl.getNewInfoList(startPosition, type);
	}

	public List<NewType> getNewTypeList() {
		
		return newInfoDAOImpl.getNewTypeList();
	}

	public List<NewInfo> getNewInfoList(int startPosition) {
		int start = (startPosition - 1) * current;
		return newInfoDAOImpl.getNewInfoList(start, current);
	}

	public int getPages() {
		int count = newInfoDAOImpl.getCount() / current;
		if(newInfoDAOImpl.getCount() % current != 0)
			count ++;
		return count;
	}

}
