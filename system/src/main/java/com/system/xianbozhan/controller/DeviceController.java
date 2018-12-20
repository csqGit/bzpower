package com.system.xianbozhan.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.system.xianbozhan.entity.Device;
import com.system.xianbozhan.entity.EntityPojo;
import com.system.xianbozhan.service.DeviceService;
import com.system.xianbozhan.service.impl.DeviceServiceImpl;

@Controller
public class DeviceController {

	@Autowired
	private DeviceService deviceService;
	
	@RequestMapping("getDeviceList")
	@ResponseBody
	public Object getDeviceList(int page) {
//		DeviceServiceImpl dsi = (DeviceServiceImpl) deviceService;
		EntityPojo entity = new EntityPojo();
		List<Device> device = null;
		int current ;//当前页数
		int pages; //总页数
		int count; //总条数
		int now ; //当前为第几条
		int size ;//至第几条
		try {
			device = deviceService.getDeviceList(page);
			current = page;
			pages = deviceService.getPages();
			count = deviceService.getCount();
			now = (page - 1) * DeviceServiceImpl.current + 1;
			size = device.size() + now - 1;
			entity.setCount(count);
			entity.setCurrent(current);
			entity.setList(device);
			entity.setNow(now);
			entity.setPages(pages);
			entity.setSize(size);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object obj = JSONObject.toJSON(entity);
		return obj;
	}
	
	@RequestMapping("getDeviceByDeviceNumber")
	@ResponseBody
	public Object getDeviceByDeviceNumber(String deviceNumber) {
		EntityPojo entity = new EntityPojo();
		List<Device> device = null;
		int current ;//当前页数
		int pages; //总页数
		int count; //总条数
		int now ; //当前为第几条
		int size ;//至第几条
		for(int i = 0; i < 10; i ++) {
			
		}
		try {
			device = deviceService.getDeviceByDeviceNumber( deviceNumber);
			current = 1;
			pages = deviceService.getPages();
			count = deviceService.getCount();
			now = 1 ;
			size = device.size();
			entity.setCount(count);
			entity.setCurrent(current);
			entity.setList(device);
			entity.setNow(now);
			entity.setPages(pages);
			entity.setSize(size);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Object obj = JSONObject.toJSON(entity);
		return obj;
		
	}
	
	@RequestMapping("getDeviceById")
	@ResponseBody
	public Object getDeviceById(int id) {

		Device device = null;
		try {
			device = deviceService.getDeviceById(id);
			System.out.println(device);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		Object obj = JSONObject.toJSON(device);
		return obj;
	}
	
	
	@RequestMapping("addDevice")
	public void addDevice(HttpServletResponse response, Device device) {
		try {
			//System.out.println(device);
			deviceService.addDevice(device);	
			response.sendRedirect("view/device_management.html");
		} catch (Exception e) {
			e.printStackTrace();	
		}
			
	}
	
	@RequestMapping("updateDevice")
	public void updateDevice(HttpServletResponse response, Device device) {
		try {
			deviceService.updateDevice(device);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				response.sendRedirect("view/device_management.html");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@RequestMapping("deleteDevice")
	public void deleteDevice(HttpServletResponse response, int id) {
		try {
			deviceService.deleteDevice(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			response.sendRedirect("view/device_management.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
