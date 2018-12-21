package com.system.xianbozhan.entity;

import java.util.List;

/*
 * 线路类
 */
public class Line {
	private Integer id;
	private String lineName;//线路名称
	private String companyName;//线路所属公司
	private String voltageGrade;//电压等级
	private String beginLine;//起始线路
	private String endLine;//结束线路
	private Integer towerNumber;//杆塔数量
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getVoltageGrade() {
		return voltageGrade;
	}
	public void setVoltageGrade(String voltageGrade) {
		this.voltageGrade = voltageGrade;
	}
	public String getBeginLine() {
		return beginLine;
	}
	public void setBeginLine(String beginLine) {
		this.beginLine = beginLine;
	}
	public String getEndLine() {
		return endLine;
	}
	public void setEndLine(String endLine) {
		this.endLine = endLine;
	}
	public Integer getTowerNumber() {
		return towerNumber;
	}
	public void setTowerNumber(Integer towerNumber) {
		if(towerNumber == null)
			towerNumber = 0;
		this.towerNumber = towerNumber;
	}
	
	@Override
	public String toString() {
		return "Line [id=" + id + ", lineName=" + lineName + ", companyName=" + companyName + ", voltageGrade="
				+ voltageGrade + ", beginLine=" + beginLine + ", endLine=" + endLine + ", towerNumber=" + towerNumber
				+ ", tower=" + "]";
	}


}
