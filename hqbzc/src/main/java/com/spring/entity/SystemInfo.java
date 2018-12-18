package com.spring.entity;
/**
 * 连接导航的标题以及连接地址
 * @author Admin
 *
 */
public class SystemInfo {
	private int id;
	private String system_name;
	private String url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSystem_name() {
		return system_name;
	}
	public void setSystem_name(String system_name) {
		this.system_name = system_name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

}
