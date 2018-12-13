package com.system.xianbozhan.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.system.xianbozhan.entity.EntityPojo;
import com.system.xianbozhan.entity.LineName;
import com.system.xianbozhan.entity.Tower;
import com.system.xianbozhan.entity.User;
import com.system.xianbozhan.service.LineService;
import com.system.xianbozhan.service.TowerService;
import com.system.xianbozhan.service.impl.TowerServiceImpl;
import com.system.xianbozhan.service.impl.UserServiceImpl;

@Controller
public class TowerController {

	@Autowired
	private TowerService towerService;
	@Autowired
	private LineService lineService;
	
	@RequestMapping("getTower")
	@ResponseBody
	public Object getTower(int page) {
		EntityPojo entity = new EntityPojo();
		TowerServiceImpl towerServiceImpl = (TowerServiceImpl)towerService;
		try {
			/*
			 * 前台需要当前页数current，总页数pages，当前为第几条now结果至第几条结果，共有多少sum条结果，共需要5个参数
			 */
			int current ;//当前页数
			int pages; //总页数
			int count; //总条数
			int now ; //当前为第几条
			int size ;//至第几条
			List<Tower> list = towerService.getTowerList(page);
			System.out.println(list);
			current = page;
			now = (current - 1) * towerServiceImpl.current + 1;
			size = list.size();
			pages = towerServiceImpl.getPages();
			count = towerServiceImpl.getCount();
			entity.setList(list);
			entity.setCurrent(current);
			entity.setPages(pages);
			entity.setCount(count);
			entity.setNow(now);
			entity.setSize(size + now - 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object json = JSONObject.toJSON(entity);
		return json;
	}
	
	
	
	@RequestMapping("getTowerById")
	@ResponseBody
	public Object getTowerById(int id) {
		Tower tower = null;
		try {
			tower = towerService.getTowerById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object object = JSONObject.toJSON(tower);
		return object;
	}
	
	
	@RequestMapping("getTowerByTowerAndOther")
	@ResponseBody
	public Object getTowerByTowerAndOther(String lineName, String towerName, String towerType) {
		List<Tower> list = null;
		List<LineName> line = line = lineService.getLineName();
		int lineId = 0;
		for(int i = 0; i < line.size(); i ++) {
			if(lineName != null && !"".equals(lineName) && lineName.equals(line.get(i).getLineName())) {
				lineId = line.get(i).getId();
				break;
			}
		}
		list = towerService.getTowerByTowerAndOther(lineId, towerName, towerType);
		
		EntityPojo entity = new EntityPojo();
		try {
			/*
			 * 前台需要当前页数current，总页数pages，当前为第几条now结果至第几条结果，共有多少sum条结果，共需要5个参数
			 */
			int current ;//当前页数
			int pages; //总页数
			int count; //总条数
			int now ; //当前为第几条
			int size ;//至第几条
			entity.setList(list);
			entity.setCurrent(1);
			entity.setPages(1);
			entity.setCount(list.size());
			entity.setNow(1);
			entity.setSize(list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object json = JSONObject.toJSON(entity);
		return json;
	}
//	
//	
	@RequestMapping("addTower")
	public void addTower(HttpServletResponse response ,Tower tower) {
//		Tower tower = new Tower();
//		List<LineName> line = line = lineService.getLineName();
//		int lineId = 0;
//		for(int i = 0; i < line.size(); i ++) {
//			if(lineName != null && !"".equals(lineName) && lineName.equals(line.get(i).getLineName())) {
//				lineId = line.get(i).getId();
//			}
//		}
		
		try {
//			tower.setId(lineId);
//			tower.setTowerName(towerName);
//			tower.setTowerType(towerType);
//			tower.setTowerAddress(towerAddress);
//			tower.setInstallDate(installDate);
//			tower.setRunDate(runDate);
			towerService.addTower(tower);
			response.sendRedirect("view/tower_management.html");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//return "redirect:getTower(1)";
	}
//	
//	
	@RequestMapping("updateTower")
	public void updateTower(HttpServletResponse response , Tower tower) {
		try {
			towerService.updateTower(tower);
			response.sendRedirect("view/tower_management.html");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	
//	
	@RequestMapping("deleteTower")
	public void deleteTower(HttpServletResponse response , int id) {
		try {
			towerService.deleteTower(id);
			response.sendRedirect("view/tower_management.html");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	
}
