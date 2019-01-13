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
	private static int current = 5;
	
	
	public List<RepairInfo> getRepairInfo(int page) {
		int start = (page - 1) * current;
		
		return repairInfoDAO.getRepairInfo(start, current);
	}

	public int getPages() {
		int count = getCount();
		int pages = count / current;
		if(count % current != 0)
			pages ++;
		return pages;
	}

	public int getCount() {
		
		return repairInfoDAO.getCount();
	}


	public boolean saveRepairInfo(RepairInfo repairInfo) {
		
		return repairInfoDAO.saveRepairInfo(repairInfo);
	}

}
