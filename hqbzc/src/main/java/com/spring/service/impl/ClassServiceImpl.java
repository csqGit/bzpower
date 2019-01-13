package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ClassDAO;
import com.spring.service.ClassService;

@Service
public class ClassServiceImpl implements ClassService{
	
	private static int current = 10;
	
	@Autowired
	private ClassDAO classDAO;

	public int getPages() {
		int count = classDAO.getCount();
		int page = count / current;
		if(count % current != 0)
			page ++;
		return page;
	}

}
