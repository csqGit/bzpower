package com.spring.dao;

import java.util.List;

import com.spring.entity.RepairInfo;

public interface RepairInfoDAO {

	public List<RepairInfo> getRepairInfo(int first, int maxResult);
	
	//得到报修内容总数
	public int getCount();
	
	//保存报修信息
	public boolean saveRepairInfo(RepairInfo repairInfo);
}
