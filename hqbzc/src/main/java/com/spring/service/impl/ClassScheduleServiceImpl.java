package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ClassScheduleDAO;
import com.spring.entity.ClassSchedule;
import com.spring.service.ClassScheduleService;

@Service
public class ClassScheduleServiceImpl implements ClassScheduleService{

	@Autowired
	private ClassScheduleDAO classScheduleDAO;
	
	private static int current = 7;
	public List<ClassSchedule> getClassSchedule(int page, String className) {
		int startPosition = (page - 1) * current;
		return classScheduleDAO.getClassSchedule(startPosition, current, className);
	}

}
