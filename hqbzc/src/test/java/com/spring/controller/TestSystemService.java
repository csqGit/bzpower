package com.spring.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.spring.service.SystemInfoService;
@RunWith(JUnit4.class)  
@Configuration("locations=classpath:applicationConfig.xml")  
public class TestSystemService {
	
	@Autowired
	private SystemInfoService system;
	
	@Test
	public void test() {
		List list = system.getApplyClass(1);
		System.out.println(1);
	}

}
