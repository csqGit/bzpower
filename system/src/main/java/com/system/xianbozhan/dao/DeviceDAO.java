package com.system.xianbozhan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.system.xianbozhan.entity.Device;
import com.system.xianbozhan.entity.Line;

public interface DeviceDAO {
	/*
	 * 查询全部线路信息
	 */
	public List<Device> getDeviceList(@Param("startPage") int startPage, @Param("maxPage") int maxPage);
	
	/*
	 * 查询线路名称
	 */
	
	
	/*
	 * 根据id查询线路信息
	 */
	public Line getDeviceById(int id);
	
	/*
	 * 根据公司名称，线路名称，电压等级查询线路信息
	 */
	public List<Line> getDeviceByDeviceNumberAndOther(@Param("lineName")String lineName, 
			@Param("towerName")String towerName, @Param("deviceNumber") String deviceNumber);
	
	/*961386256
	 * 添加线路信息
	 */
	public void addDevice(Device device);
	
	/*
	 * 修改线路信息
	 */
	public void updateDevice(Device device);
	
	/*
	 * 删除线路信息根据id
	 */
	public void deleteDevice(int id);
	
	/*
	 * 得到线路的全部数量
	 */
	public List getCount();

}
