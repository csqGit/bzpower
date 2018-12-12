package com.system.xianbozhan.entity;
/*
 * 显示首页搜索框信息
 */
public class Search {
	private Integer id;
	private String searchName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSearchName() {
		return searchName;
	}
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}
	@Override
	public String toString() {
		return "Search [id=" + id + ", searchName=" + searchName + "]";
	}
	

}
