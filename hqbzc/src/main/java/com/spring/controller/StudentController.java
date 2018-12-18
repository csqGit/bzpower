package com.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.NewInfo;
import com.spring.pojo.NewVo;
import com.spring.service.StudentService;
import com.spring.util.FastJsonUtil;


@Controller("/studentController")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getNewInfo")
	@ResponseBody
	public void getNewInfo(HttpServletRequest req,HttpServletResponse response, int page, int limit) {
		
		List<NewInfo> list = studentService.getAll(page, limit);
		Map<String, Object> map = new HashMap<String, Object>();
		int count = studentService.getCount();
		map.put("code", 0);
		map.put("count", count);
		map.put("msg", "");
		map.put("data", list);
		String jsonString = FastJsonUtil.toJSONString(map);
		jsonString = FastJsonUtil.JsonFormatterAddPrefix(jsonString, "", null);
		FastJsonUtil.write_json(response, jsonString);
		HttpSession session = req.getSession();
		System.out.println(jsonString);
		session.setAttribute("newCount", count);
	}
	
	
	
	

}
