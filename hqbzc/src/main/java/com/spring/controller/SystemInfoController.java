package com.spring.controller;

/**
 * 所有的方法都以getXXX开头get+保存数据对应的实体类名称
 * 所有的保存方法都以saveXXX开头
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.ApplyClass;
import com.spring.entity.FreeClass;
import com.spring.service.ClassService;
import com.spring.service.NewInfoService;
import com.spring.service.SystemInfoService;

@Controller
public class SystemInfoController {
	@Autowired
	private SystemInfoService systemInfoService;
	

	/*
	 * 空闲教室查询
	 */
	@RequestMapping("/getFreeClass")
	public ModelAndView getFreeClass(int page, String classid) {
		if(classid==null) {
			classid="1";
		}
		int classId = Integer.parseInt(classid);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("page/freeClass");
		List<FreeClass> freeClass = systemInfoService.getFreeClass(page, classId);
		mav.addObject("freeClass", freeClass);
		return mav;
	}
	
	

	// 遍历文件夹，得到轮播图片的相对地址
	public void save(String path) {
		File file = new File(path);
		File[] files = file.listFiles();// 遍历该目录所有文件和文件夹
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < files.length; i++) {
			// 判断是否是文件夹
			if (files[i].isDirectory()) {
				save(files[i].toString());
			} else {
				if (!files[i].isDirectory()) {// 是文件
					String fileName = files[i].getName();
					fileName = "images" + File.separator + "lbimages" + File.separator + fileName;
					list.add(fileName);
				}
			}
		}
		// 保存图片路径
		systemInfoService.savePicInfo(list);
	}

}
