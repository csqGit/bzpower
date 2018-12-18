package com.spring.entity;

public class SchoolBus {
	private Integer id;
	private String driverName;//校车司机姓名
	private String busNumber;//校车车牌号
	private String departureTime;//校车出发时间段
	private String outAddress;//出发地点
	private String arriveAddress;//到达地点
	private String wayStation;//途径站
	private String closeTime;//下班时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	public String getOutAddress() {
		return outAddress;
	}
	public void setOutAddress(String outAddress) {
		this.outAddress = outAddress;
	}
	public String getArriveAddress() {
		return arriveAddress;
	}
	public void setArriveAddress(String arriveAddress) {
		this.arriveAddress = arriveAddress;
	}
	public String getWayStation() {
		return wayStation;
	}
	public void setWayStation(String wayStation) {
		this.wayStation = wayStation;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	
	
	
}
