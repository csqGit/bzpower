package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.StudentDAO;
import com.spring.entity.NewInfo;
import com.spring.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO studentDAO;
	
	
	public List<NewInfo> getAll(int page, int limit) {
		page = (page - 1 ) * limit;
		return studentDAO.getAll(page, limit);
	}

	public int getCount() {
		
		return studentDAO.getCount();
	}

}
