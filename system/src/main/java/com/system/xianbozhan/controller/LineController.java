package com.system.xianbozhan.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.system.xianbozhan.entity.EntityPojo;
import com.system.xianbozhan.entity.Line;
import com.system.xianbozhan.entity.LineName;
import com.system.xianbozhan.entity.Msg;
import com.system.xianbozhan.service.LineService;
import com.system.xianbozhan.service.impl.LineServiceImpl;

@Controller
public class LineController {
	
	@Autowired
	private LineService lineService;
	
	@RequestMapping("getLineList")
	@ResponseBody
	public Object getLineList(int startPage){
		List<Line> line = null;
		EntityPojo  entity = new EntityPojo();
		try {
			line = lineService.getLineList(startPage);
			entity.setList(line);
			entity.setCurrent(startPage);
			int pages = lineService.getPages();
			int now = (startPage - 1) * LineServiceImpl.current + 1;
			entity.setCount(lineService.getCount());
			entity.setNow(now);
			entity.setSize(line.size() + now - 1);
			entity.setPages(pages);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		//将集合转成对象输出
		return JSONObject.toJSON(entity);
	}
	
	
	/*
	 * 得到线路名称
	 */
	@RequestMapping("getLineName")
	@ResponseBody
	public Object getLineName() {
		Set<LineName> line = null;
		try {
			 line = lineService.getLineName();
			 System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object obj = JSONObject.toJSON(line);
		System.out.println(obj);
		return obj;
	}
	
	/*
	 * 根据编号搜索线路详细信息
	 */
	@RequestMapping("getLineById")
	@ResponseBody
	public Object getLineById(int id) {
		Line line = null;
		EntityPojo entity = new EntityPojo();
		List<Line> list = new ArrayList<Line>();
		try {
			line = lineService.getLineById(id);
			list.add(line);
			entity.setList(list);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return JSONObject.toJSON(line);
	}
	
	/*
	 * 查询线路信息
	 */
	@RequestMapping("getLineBylineNameAndOther")
	@ResponseBody
	public Object getLineBylineNameAndOther(String companyName, String lineName, String voltageGrade) {
		List<Line> line = null;
		EntityPojo  entity = new EntityPojo();
		try {
			line = lineService.getLineBylineNameAndOther(companyName, lineName, voltageGrade);
			System.out.println(line);
			if(line == null) {
				line = new ArrayList<Line>();
			}
			entity.setList(line);
			entity.setCurrent(1);
			entity.setCount(lineService.getCount());
			entity.setNow(lineService.getCount());
			entity.setSize(line.size());
			entity.setPages(lineService.getPages());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		System.out.println(entity);
		System.out.println(JSONObject.toJSON(entity));
		Object obj = JSONObject.toJSON(entity);
		//将集合转成对象输出
		return obj;
	}
	
	/*
	 * 新增线路信息
	 */
	@RequestMapping("addLine")
	public void addLine(HttpServletResponse response, Line line) {
		String msg = "新增成功！";
		
		try {
			lineService.addLine(line);
		} catch (Exception e) {
			msg = "新增失败！";
			e.printStackTrace();
		}
		try {
			response.sendRedirect("view/line_management.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Cookie cookie = new Cookie("msg", msg);
		response.addCookie(cookie);
	}
	
	/*
	 * 修改用户信息
	 */
	@RequestMapping("updateLine")
	public void updateLine(HttpServletResponse response, Line line) {
		String msg = "更新成功！";
		try {
			lineService.updateLine(line);
		} catch (Exception e) {
			msg = "更新失败！";
			e.printStackTrace();
		}
		try {
			response.sendRedirect("view/line_management.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Cookie cookie = new Cookie("msg", msg);
		response.addCookie(cookie);
	}
	
	/*
	 * 根据编号删除线路信息
	 */
	@RequestMapping("deleteLine")
	public void deleteLine(HttpServletResponse response, int id) {
		Msg msg = new Msg();
		msg.setId(1);
		msg.setMsg("删除成功！");
		try {
			lineService.deleteLine(id);
		} catch (Exception e) {
			e.printStackTrace();
			msg.setMsg("删除失败！");
		}
		try {
			response.sendRedirect("view/line_management.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
