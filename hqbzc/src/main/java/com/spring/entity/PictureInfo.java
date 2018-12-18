package com.spring.entity;
/**
 * 轮播图片
 * @author Admin
 *
 */
public class PictureInfo {
	private int id;
	private String picUrl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	@Override
	public String toString() {
		return "PictureInfo [id=" + id + ", picUrl=" + picUrl + "]";
	}
	

}
