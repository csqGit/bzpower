package com.system.xianbozhan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.system.xianbozhan.entity.Tower;

public interface TowerDAO {
	
	public List<Tower> getTowerList(@Param("startPage") int startPage, @Param("maxPage") int maxPage);
	
	public Tower getTowerById(int id);
	
	public List<Tower> getTowerByTowerAndOther(@Param("lineId") int lineId, 
			@Param("towerName") String towerName, @Param("towerType") String towerType);
	 
	public void addTower(Tower tower);
	
	public void updateTower (Tower tower);
	
	public void deleteTower(int id);
	
	public List<Tower> getCount();
	
	

}
