package com.spring.service;

import java.util.List;

import com.spring.entity.ApplyClass;
import com.spring.entity.FreeClass;
import com.spring.entity.InterIdea;
import com.spring.entity.PictureInfo;
import com.spring.entity.SystemInfo;

public interface SystemInfoService {

	public List<SystemInfo> getSystemInfo();

	// 得到网络建议的信息
	public List<InterIdea> getInterIdea();

	// 保存图片信息
	public void savePicInfo(List<String> picUrl);
	
	//保存申请信息
	public boolean saveApplyClass(ApplyClass applyClass);

	// 得到申请教室信息
	public List<ApplyClass> getApplyClass(int page);
	
	//空闲教室查询
	public List<FreeClass> getFreeClass(int start,  int classId);

	// 得到轮播图片地址
	public List<PictureInfo> getPicUrl();

}
