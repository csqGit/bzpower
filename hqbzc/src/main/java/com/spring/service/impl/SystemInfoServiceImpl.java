package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.SystemInfoDAO;
import com.spring.entity.ApplyClass;
import com.spring.entity.FreeClass;
import com.spring.entity.InterIdea;
import com.spring.entity.PictureInfo;
import com.spring.entity.SystemInfo;
import com.spring.service.SystemInfoService;

@Service
public class SystemInfoServiceImpl implements SystemInfoService{
	
	private static int current = 10;

	@Autowired
	private SystemInfoDAO systemInfoDAO;
	
	public List<SystemInfo> getSystemInfo() {
		SystemInfo sys = new SystemInfo();
		
		return systemInfoDAO.getSystemInfo(sys);
	}

	public List<InterIdea> getInterIdea() {
		InterIdea interIdea = new InterIdea();
		return systemInfoDAO.getInterIdea(interIdea);
	}

	public void savePicInfo(List<String> picUrl) {
		PictureInfo picture = null;
		for(int i = 0; i < picUrl.size(); i ++) {
			picture = new PictureInfo();
			picture.setPicUrl(picUrl.get(i));
			systemInfoDAO.savePicInfo(picture);
		}
	}

	public List<PictureInfo> getPicUrl() {
		PictureInfo pictureInfo = new PictureInfo();
		return systemInfoDAO.getPicUrl(pictureInfo);
	}

	public List<ApplyClass> getApplyClass(int page) {
		int startPage = (page - 1) * current;
		int maxPage = current;
		return systemInfoDAO.getApplyClass(startPage, maxPage);
	}

	public boolean saveApplyClass(ApplyClass applyClass) {
		
		return systemInfoDAO.saveApplyClass(applyClass);
	}

	public List<FreeClass> getFreeClass(int page, int classId) {
		int current = 9;
		int start = (page - 1) * current;
		return systemInfoDAO.getFreeClass( start,  current,  classId);
	}

}
