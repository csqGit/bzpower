package com.spring.controller;
/**
 * 课程表的查询，教室申请以及教室申请信息查询类
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.ApplyClass;
import com.spring.entity.ClassSchedule;
import com.spring.entity.ClassSchedulePojo;
import com.spring.service.ClassScheduleService;
import com.spring.service.ClassService;
import com.spring.service.SystemInfoService;


@Controller
public class ClassScheduleController {

	@Autowired
	private ClassScheduleService classScheduleService;
	
	@Autowired
	private SystemInfoService systemInfoService;
	
	@Autowired
	private ClassService classService;
	
	@RequestMapping("getClassSchedule")
	@ResponseBody
	public List<ClassSchedulePojo> getClassSchedule(HttpServletRequest request, String floor) {
		List<ClassSchedulePojo> pojoList = new ArrayList<ClassSchedulePojo>();	
		for(int i = 1; i < 4; i ++) {
			ClassSchedulePojo pojo = new ClassSchedulePojo();
			List<ClassSchedule> list = classScheduleService.getClassSchedule(i, floor);
			if(list.size() > 0) {
				pojo.setClassName(list.get(0).getClassName());
				pojo.setList(list);
			}
			pojoList.add(pojo);
		}
		return pojoList;
	}
	
	
	/*
	 * 申请教室
	 */
	@RequestMapping("/saveApplyClass")
	public String saveApplyClass(HttpServletRequest request, ApplyClass applyClass) {
		String msg = "";
		boolean flag = false;
		try {
			flag = systemInfoService.saveApplyClass(applyClass);
			if(flag) {
				msg =  "申请成功";
			}else 
				msg = "申请失败";
		} catch (Exception e) {
			e.printStackTrace();
			return "saveClass";
		}
		request.setAttribute("msg", msg);
		return "saveClass";
	}
	
	
	/*
	 * 申请教室信息查询
	 */
	@RequestMapping("/getApplyClass")
	public String getApplyClass(HttpServletRequest request, HttpServletResponse response, int page) {
		try {
			List<ApplyClass> list = systemInfoService.getApplyClass(page);
			request.setAttribute("applyClass", list);
			request.setAttribute("currentPage", page);
			request.setAttribute("pages", classService.getPages());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "page/showClass";
	}
	
}
