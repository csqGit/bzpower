package com.system.xianbozhan.service;

import java.util.List;

import com.system.xianbozhan.entity.Tower;

public interface TowerService {

	public List<Tower> getTowerList(int startPage);
	
	public List<Tower> getTowerName();
	
	public Tower getTowerById(int id);
	
	public List<Tower> getTowerByTowerAndOther(int lineName, String  towerName, String towerType);
	
	public void addTower(Tower tower);
	
	public void updateTower (Tower tower);
	
	public void deleteTower(int id);
	
	
}
