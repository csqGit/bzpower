package com.system.xianbozhan.service;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.system.xianbozhan.entity.Line;
import com.system.xianbozhan.entity.LineName;

public interface LineService {
	/*
	 * 查询全部线路信息
	 */
	public List<Line> getLineList(int startPage);
	
	/*
	 * 查询线路名称
	 */
	public Set<LineName> getLineName();
	
	/*
	 * 根据id查询线路信息
	 */
	public Line getLineById(int id);
	
	/*
	 * 根据公司名称，线路名称，电压等级查询线路信息
	 */
	public List<Line> getLineBylineNameAndOther(@Param("companyName")String companyName, 
			@Param("lineName")String lineName, @Param("voltageGrade") String voltageGrade);
	
	/*
	 * 添加线路信息
	 */
	public void addLine(Line line);
	
	/*
	 * 修改线路信息
	 */
	public void updateLine(Line line);
	
	/*
	 * 删除线路信息根据id
	 */
	public void deleteLine(int id);
	
	/*
	 * 得到线路的全部数量
	 */
	public int getCount();
	
	/*
	 * 得到线路的总页数
	 */
	public int getPages();

}
