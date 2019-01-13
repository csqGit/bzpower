package com.spring.dao;

import java.util.List;

import com.spring.entity.ApplyClass;
import com.spring.entity.FreeClass;
import com.spring.entity.InterIdea;
import com.spring.entity.PictureInfo;
import com.spring.entity.SystemInfo;

/**
 * 得到系统的url
 * @author Admin
 *
 */
public interface SystemInfoDAO {
	
	//得到系统的名称和url
	public List<SystemInfo> getSystemInfo(SystemInfo systemInfo);
	
	//得到网络的建议信息
	public List<InterIdea> getInterIdea(InterIdea interIdea);
	
	//保存图片信息
	public void savePicInfo(PictureInfo pictureInfo);
	
	//申请教室信息保存
	public boolean saveApplyClass(ApplyClass applyClass);
	
	//申请教室信息查询
	public List<ApplyClass> getApplyClass(int startPage, int maxPage);
	
	//教室状态查询
	public List<FreeClass> getFreeClass(int start, int maxResult, int classId);
	
	
	//得到轮播图片地址
	public List<PictureInfo> getPicUrl(PictureInfo pictureInfo);

}
