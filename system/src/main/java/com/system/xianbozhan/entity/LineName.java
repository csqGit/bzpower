package com.system.xianbozhan.entity;

public class LineName extends Line{
	private Integer id;
	private String lineName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLineName() {
		return lineName;
	}
	public void setLineName(String lineName) {
		this.lineName = lineName;
	}
	@Override
	public String toString() {
		return "LineName [id=" + id + ", lineName=" + lineName + "]";
	}
	

}
