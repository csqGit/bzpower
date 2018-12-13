package com.system.xianbozhan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.xianbozhan.dao.DeviceDAO;
import com.system.xianbozhan.entity.Device;
import com.system.xianbozhan.service.DeviceService;

@Service
public class DeviceServiceImpl implements DeviceService {
	
	public static int current = 10;

	@Autowired
	private DeviceDAO deviceDAO;
	
	public List<Device> getDeviceList(int startPage) {
		int currentPage = (startPage - 1) * current;
		return deviceDAO.getDeviceList(currentPage, current);
	}

	public Device getDeviceById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Device> getDeviceByDeviceNumberAndOther(String towerName, String deviceNumber, String lineName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addDevice(Device device) {
		// TODO Auto-generated method stub

	}

	public void updateDevice(Device device) {
		// TODO Auto-generated method stub

	}

	public void deleteDevice(int id) {
		// TODO Auto-generated method stub

	}

	public int getCount() {
		
		return 0;
	}

	public int getPages() {
		
		return 0;
	}
	
	

}
