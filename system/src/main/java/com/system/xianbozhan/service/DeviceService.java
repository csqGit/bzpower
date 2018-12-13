package com.system.xianbozhan.service;

import java.util.List;

import com.system.xianbozhan.entity.Device;

public interface DeviceService {

	public List<Device> getDeviceList(int startPage);
	
	public Device getDeviceById(int id);
	
	public List<Device> getDeviceByDeviceNumberAndOther(String towerName, String deviceNumber, String lineName);
	
	public void addDevice(Device device);
	
	public void updateDevice (Device device);
	
	public void deleteDevice(int id);
	
	public int getCount();
	
	public int getPages();
	
	
}
