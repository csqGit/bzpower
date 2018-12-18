package com.spring.entity;
/**
 * 失物认领
 * 1、失物名称
 * 2、失物类型
 * 3、丢失时间
 * 4、认领时间
 * 5、认领状态
 * 
 */
public class GoodLost {
	private Integer id;
	private String name;
	private String type;
	private String lostTime;
	private String returnTime;
	private String getPerson;
	private String contact;//认领联系方式
	private Integer state;
	
	
	public GoodLost() {
		
	}

	public String getGetPerson() {
		return getPerson;
	}

	public void setGetPerson(String getPerson) {
		this.getPerson = getPerson;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLostTime() {
		return lostTime;
	}

	public void setLostTime(String lostTime) {
		this.lostTime = lostTime;
	}

	public String getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(String returnTime) {
		this.returnTime = returnTime;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "GoodLost [id=" + id + ", name=" + name + ", lostTime=" + lostTime + ", returnTime=" + returnTime
				+ ", state=" + state + "]";
	}
	

}
