package com.htglxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.htglxt.dao.SystemDAO;
import com.htglxt.entity.PictureInfo;
import com.htglxt.service.SystemService;

@Service
public class SystemServiceImpl implements SystemService {

	@Autowired
	private SystemDAO systemDAO;
	
	public void addUploadUrl(PictureInfo picture) {
		systemDAO.addUploadUrl(picture);
	}

	public PictureInfo getById(int id) {
		
		return systemDAO.getById(id);
	}

}
