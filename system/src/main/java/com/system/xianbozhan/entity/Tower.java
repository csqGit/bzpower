package com.system.xianbozhan.entity;
/*
 * 杆塔类
 */
public class Tower {
	private Integer id;
	private String towerName;//杆塔名称
	private String towerType; //杆塔类型
	private String towerAddress;//杆塔位置
	private String installDate;//安装日期
	private String runDate;//投运日期
	private Line line_id;//线路编号
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTowerName() {
		return towerName;
	}
	public void setTowerName(String towerName) {
		this.towerName = towerName;
	}
	public String getTowerType() {
		return towerType;
	}
	public void setTowerType(String towerType) {
		this.towerType = towerType;
	}
	public String getTowerAddress() {
		return towerAddress;
	}
	public void setTowerAddress(String towerAddress) {
		this.towerAddress = towerAddress;
	}
	public String getInstallDate() {
		return installDate;
	}
	public void setInstallDate(String installDate) {
		this.installDate = installDate;
	}
	public String getRunDate() {
		return runDate;
	}
	public void setRunDate(String runDate) {
		this.runDate = runDate;
	}
	
	public Line getLine_id() {
		return line_id;
	}
	public void setLine_id(Line line_id) {
		this.line_id = line_id;
	}
	
	@Override
	public String toString() {
		return "Tower [id=" + id + ", towerName=" + towerName + ", towerType=" + towerType + ", towerAddress="
				+ towerAddress + ", installDate=" + installDate + ", runDate=" + runDate + ", line_id=" + line_id
				+ ", lineName=" +  "]";
	}
	
	

}
