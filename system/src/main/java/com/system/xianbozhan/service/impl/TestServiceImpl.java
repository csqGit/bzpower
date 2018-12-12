package com.system.xianbozhan.service.impl;

import org.springframework.stereotype.Service;

import com.system.xianbozhan.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	public int getById(int id) {
		System.out.println(1);
		return 0;
	}
	

}
