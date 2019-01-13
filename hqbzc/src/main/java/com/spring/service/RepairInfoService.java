package com.spring.service;

import java.util.List;

import com.spring.entity.RepairInfo;

public interface RepairInfoService {
	public List<RepairInfo> getRepairInfo(int page);
	
	//得到报修总数
	public int getCount();
	
	public int getPages();
	
	public boolean saveRepairInfo(RepairInfo repairInfo);
}
