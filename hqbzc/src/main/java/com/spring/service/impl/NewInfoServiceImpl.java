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
	
	@Autowired
	private NewInfoDAO NewInfoDAOImpl;

	public List<NewInfo> getNewInfoList(int startPosition, String type) {
		
		return NewInfoDAOImpl.getNewInfoList(startPosition, type);
	}

	public List<NewType> getNewTypeList() {
		
		return NewInfoDAOImpl.getNewTypeList();
	}

}
