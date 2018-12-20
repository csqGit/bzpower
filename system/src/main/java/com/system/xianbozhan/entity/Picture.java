package com.system.xianbozhan.entity;

/*
 * 图片地址类
 */
public class Picture extends Tower{
	private Integer id;
	private String pictureUrl;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	@Override
	public String toString() {
		return "Picture [id=" + id + ", pictureUrl=" + pictureUrl + "]";
	}
	
	
}
