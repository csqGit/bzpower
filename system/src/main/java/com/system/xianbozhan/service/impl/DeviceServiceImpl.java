package com.system.xianbozhan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.xianbozhan.dao.DeviceDAO;
import com.system.xianbozhan.entity.Device;
import com.system.xianbozhan.service.DeviceService;

@Service
public class DeviceServiceImpl implements DeviceService {
	
	public static int current = 2;

	@Autowired
	private DeviceDAO deviceDAO;
	
	public List<Device> getDeviceList(int startPage) {
		int currentPage = (startPage - 1) * current;
		return deviceDAO.getDeviceList(currentPage, current);
	}

	public Device getDeviceById(int id) {
		
		return deviceDAO.getDeviceById(id);
	}

	public List<Device> getDeviceByDeviceNumber(String deviceNumber) {
		
		return deviceDAO.getDeviceByDeviceNumber(deviceNumber);
	}

	public void addDevice(Device device) {
		// TODO Auto-generated method stub
		deviceDAO.addDevice(device);
	}

	public void updateDevice(Device device) {
		// TODO Auto-generated method stub
		deviceDAO.updateDevice(device);
	}

	public void deleteDevice(int id) {
		// TODO Auto-generated method stub
		deviceDAO.deleteDevice(id);
	}

	public int getCount() {
		int count = deviceDAO.getCount();
		return count;
	}

	public int getPages() {
		int count = this.getCount();
		int pages = count / current;
		if(count % current != 0)
			pages ++;
		return pages;
	}
	
	

}
