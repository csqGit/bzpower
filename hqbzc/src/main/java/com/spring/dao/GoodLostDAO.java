package com.spring.dao;

import java.util.List;

import com.spring.entity.GoodLost;

/**
 * 失物招领
 * @author Admin
 *
 */
public interface GoodLostDAO {
	/*
	 * 得到丢失物品的全部信息   根据物品类型查询丢失物品,根据物品名称查询丢失物品
	 */
	public List<GoodLost> getGoodList(int start, int page, String type, String name);
	
	/*
	 * 查询数据库总条数
	 */
	public int getCount();
	

}
