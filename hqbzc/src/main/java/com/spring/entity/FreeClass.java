package com.spring.entity;
/*
 * 空闲教室
 */
public class FreeClass {
	private Integer id;
	private Integer classId;//教室编号		逸夫楼1，电信楼2，第二教学楼3，第三教学楼4，能源楼5
	private String className;//教室名称
	private String classAddress;//教室地址
	private Integer classState;//教室空闲状态	1空闲，2，占用
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassAddress() {
		return classAddress;
	}
	public void setClassAddress(String classAddress) {
		this.classAddress = classAddress;
	}
	public Integer getClassState() {
		return classState;
	}
	public void setClassState(Integer classState) {
		this.classState = classState;
	}
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	@Override
	public String toString() {
		return "FreeClass [id=" + id + ", classId=" + classId + ", className=" + className + ", classAddress="
				+ classAddress + ", classState=" + classState + "]";
	}

}
