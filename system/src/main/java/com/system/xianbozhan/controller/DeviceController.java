package com.system.xianbozhan.controller;

import java.util.List;

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
			size = device.size() - 1;
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
	
}
