package com.system.xianbozhan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.xianbozhan.dao.TowerDAO;
import com.system.xianbozhan.entity.Tower;
import com.system.xianbozhan.service.TowerService;

@Service
public class TowerServiceImpl implements TowerService{
	
	@Autowired
	private TowerDAO towerDAO;
	public static int current = 10;//定义每页显示10条
//
	

	public Tower getTowerById(int id) {
		return towerDAO.getTowerById(id);
	}

	public void addTower(Tower tower) {
		towerDAO.addTower(tower);
	}

	public void updateTower(Tower tower) {
		towerDAO.updateTower(tower);
	}

	public void deleteTower(int id) {
		towerDAO.deleteTower(id);
	}

	public List<Tower> getTowerList(int startPage) {
		int currentPage = (startPage - 1) * current;
		return towerDAO.getTowerList(currentPage, current);
	}
	
	public int getCount() {
		int count = towerDAO.getCount().size();
		return count;
	}
	
	public int getPages() {
		int count = getCount();
		int page = count / current;
		if(count % current != 0)
			page ++;
		return page;
	}

	public List<Tower> getTowerByTowerAndOther(int lineId, String towerName, String towerType) {
		// TODO Auto-generated method stub
		return towerDAO.getTowerByTowerAndOther(lineId, towerName, towerType);
	}
	

}
