package com.htglxt.entity;

public class PictureInfo {
	private Integer id;
	private String picUrl;
	private Integer state;//1 为轮播   2为失物	3为报修
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	

}
