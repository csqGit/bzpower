package com.spring.entity;
/*
 * 课程表
 */
public class ClassSchedule {
	
	private int id;
	private String className;//教室名称
	private String time;//课程对应的时间
	private String monday;//星期一
	private String tuesday;
	private String wednesday;
	private String thursday;
	private String friday;
	private String saturday;
	private String sunday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMonday() {
		return monday;
	}
	public void setMonday(String monday) {
		this.monday = monday;
	}
	public String getTuesday() {
		return tuesday;
	}
	public void setTuesday(String tuesday) {
		this.tuesday = tuesday;
	}
	public String getWednesday() {
		return wednesday;
	}
	public void setWednesday(String wednesday) {
		this.wednesday = wednesday;
	}
	public String getThursday() {
		return thursday;
	}
	public void setThursday(String thursday) {
		this.thursday = thursday;
	}
	public String getFriday() {
		return friday;
	}
	public void setFriday(String friday) {
		this.friday = friday;
	}
	public String getSaturday() {
		return saturday;
	}
	public void setSaturday(String saturday) {
		this.saturday = saturday;
	}
	public String getSunday() {
		return sunday;
	}
	public void setSunday(String sunday) {
		this.sunday = sunday;
	}
	@Override
	public String toString() {
		return "ClassSchedule [id=" + id + ", className=" + className + ", time=" + time + ", monday=" + monday
				+ ", tuesday=" + tuesday + ", wednesday=" + wednesday + ", thursday=" + thursday + ", friday=" + friday
				+ ", saturday=" + saturday + ", sunday=" + sunday + "]";
	}
	
	

}
