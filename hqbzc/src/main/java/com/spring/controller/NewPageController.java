package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.NewInfo;
import com.spring.entity.NewType;
import com.spring.service.NewInfoService;

/**
 * 新闻信息展示
 * @author Admin
 *
 */
@Controller
public class NewPageController {
	
	@Autowired
	private NewInfoService newInfoService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int id = 1;
		return "";
	}
	
	@RequestMapping("getList")
	@ResponseBody
	public String getList(HttpServletRequest request, int startPosition, String type) {
		List<NewInfo> newList = newInfoService.getNewInfoList(startPosition, type);
		System.out.println(newList);
//		model.addAttribute("newList", newList);
		request.getSession().setAttribute("newList", newList);
		return "newPageShow.jsp";
	}
	
	
	/*
	 *  新闻页面左边的列表信息
	 */
	@RequestMapping("/getNewType")
	public String getNewType(Model model) {
		List<NewType> list = newInfoService.getNewTypeList();
		model.addAttribute("newType", list);
		return "page/newPage";
	}

}
