package com.system.xianbozhan.entity;
/*
 * 设备信息
 */
public class Device {

	private Integer id;
	private Line line;
	private Tower tower;
	private String phoneNumber;//电话号码
	private String iccId;//iccid号
	private String deviceNumber;//设备识别码, 设备编号
	private String model;//型号
	private String manufacturer;//生产厂家
	private String installDate;//安装日期
	private String viewAddress;//检测位置
	private String installPerson;//安装人
	private String dangerType;//隐患类型
	private String runType;//运行状态
	private String description;//设备描述
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Line getLine() {
		return line;
	}
	public void setLine(Line line) {
		this.line = line;
	}
	public Tower getTower() {
		return tower;
	}
	public void setTower(Tower tower) {
		this.tower = tower;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDeviceNumber() {
		return deviceNumber;
	}
	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getInstallDate() {
		return installDate;
	}
	public void setInstallDate(String installDate) {
		this.installDate = installDate;
	}
	public String getViewAddress() {
		return viewAddress;
	}
	public void setViewAddress(String viewAddress) {
		this.viewAddress = viewAddress;
	}
	public String getInstallPerson() {
		return installPerson;
	}
	public void setInstallPerson(String installPerson) {
		this.installPerson = installPerson;
	}
	public String getDangerType() {
		return dangerType;
	}
	public void setDangerType(String dangerType) {
		this.dangerType = dangerType;
	}
	public String getRunType() {
		return runType;
	}
	public void setRunType(String runType) {
		this.runType = runType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIccId() {
		return iccId;
	}
	public void setIccId(String iccId) {
		this.iccId = iccId;
	}
	@Override
	public String toString() {
		return "Device [id=" + id + ", line=" + line + ", tower=" + tower + ", phoneNumber=" + phoneNumber + ", iccId="
				+ iccId + ", deviceNumber=" + deviceNumber + ", model=" + model + ", manufacturer=" + manufacturer
				+ ", installDate=" + installDate + ", viewAddress=" + viewAddress + ", installPerson=" + installPerson
				+ ", dangerType=" + dangerType + ", runType=" + runType + ", description=" + description + "]";
	}

	
}
