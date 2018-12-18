package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.RepairInfoDAO;
import com.spring.entity.RepairInfo;
import com.spring.service.RepairInfoService;

@Service
public class RepairInfoServiceImpl implements RepairInfoService{

	@Autowired
	private RepairInfoDAO repairInfoDAO;
	
	
	public List<RepairInfo> getRepairInfo(int page, int maxResult) {
		int start = (page - 1) * maxResult;
		
		return repairInfoDAO.getRepairInfo(start, maxResult);
	}


	public int getCount() {
		
		return repairInfoDAO.getCount();
	}


	public boolean saveRepairInfo(RepairInfo repairInfo) {
		
		return repairInfoDAO.saveRepairInfo(repairInfo);
	}

}
