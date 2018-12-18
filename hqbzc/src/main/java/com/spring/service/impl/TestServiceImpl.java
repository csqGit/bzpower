package com.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.TestDAO;
import com.spring.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDAO testDAO;
	
	public void test() {
		// TODO Auto-generated method stub
		testDAO.test();
	}
	
}
