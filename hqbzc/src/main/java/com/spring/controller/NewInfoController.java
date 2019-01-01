package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.NewInfo;
import com.spring.service.NewInfoService;

/**
 * 新闻controller
 * @author Admin
 *
 */
@Controller
public class NewInfoController {
	
	@Autowired
	private NewInfoService newInfoService;

	/*
	 * 得到新闻信息
	 */
	@RequestMapping("getNewInfoList")
	@ResponseBody
	public List<NewInfo> getNewInfoList(HttpServletRequest request, int page){
		List<NewInfo> list = null;
		try {
			list = newInfoService.getNewInfoList(page);
			System.out.println(list);
			request.getSession().setAttribute("newInfo", list);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return list;
	}
}
